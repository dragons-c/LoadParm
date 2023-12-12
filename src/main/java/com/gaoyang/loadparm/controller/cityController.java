package com.gaoyang.loadparm.controller;

        import com.gaoyang.loadparm.entity.*;
        import com.gaoyang.loadparm.service.BptparmService;
        import com.gaoyang.loadparm.utils.ExcelUtils;
        import com.gaoyang.loadparm.utils.FormatUtils;
        import org.omg.CORBA.PUBLIC_MEMBER;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Controller;
        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.multipart.MultipartFile;

        import javax.servlet.http.HttpServletRequest;
        import java.io.File;
        import java.math.BigDecimal;
        import java.util.List;
@Controller
@RequestMapping("/upload")
public class cityController {


    @Autowired
    BptparmService bptparmService;
    private final  String CODE = " ";
    @RequestMapping("/cityCode")
    public String uploadExcel(MultipartFile fileTest, HttpServletRequest request) throws Exception {
        String fileName = fileTest.getOriginalFilename();
        System.out.println(fileName);
        String[] str = fileName.split("\\.");
        System.out.println(str[0]);
        String realPath = request.getSession().getServletContext().getRealPath("/upload");
        System.out.println(realPath);
        fileTest.transferTo(new File(realPath, fileName));
        //		FileInputStream is = (FileInputStream) fileTest.getInputStream();
        File file = new File(realPath + "/" + fileName);
        List<List<Object>> lists = ExcelUtils.readExcel(file);
        if (lists == null) {
            System.out.println("不存在该文件");
            return null;
        }
        for (int i = 0; i < lists.size(); i++) {
            List<Object> list = lists.get(i);
            CityCode cityCode = new CityCode();

            cityCode.setCityName(list.get(1).toString());
            System.out.println(list.get(1));

            System.out.println(list.get(0));
            cityCode.setDetails(list.get(0).toString());
            saveParm(cityCode);

        }


        return "success";
    }
    public void saveParm(CityCode cityCode){
        Bptparm bptparm = new Bptparm();
        BptparmKey bptparmKey = new BptparmKey();
        bptparm.setTYPE("CITY");
//        if(publicCode.getFileName().length() == 4){
//            bptparm.setCODE(publicCode.getFileName()+" "+publicCode.getDetails());
//        }else{
//            bptparm.setCODE(publicCode.getFileName()+publicCode.getDetails());
//        }
        bptparm.setCODE("LA"+"  "+cityCode.getDetails());
        System.out.println(bptparm.getCODE());
//		bptparm.setCdesc(tdcprdp.getPRDMO_CDESC());
        //bptparm.setDESC(lnrctlpm.getDESC());
        if(cityCode.getCityName().length() > 20){
            if(cityCode.getCityName().replace("DISTRICT" , "").length() > 20) {
                bptparm.setDESC(cityCode.getCityName().replace("DISTRICT", "").substring(0, 19));
            }else{
                bptparm.setDESC(cityCode.getCityName().replace("DISTRICT", ""));
            }

        }else{
            bptparm.setDESC(cityCode.getCityName());
        }

        bptparm.setCDESC(cityCode.getCityName());
        bptparm.setEFF_DATE(20000101);
        bptparm.setEXP_DATE(99991231);
        bptparm.setVAL(objectToByte(52,cityCode));
        bptparm.setUPD_DATE(20200506);
        bptparm.setUPD_BR(800001);
        bptparm.setUPD_TLR("UPLOAD");
        bptparmKey.setTYPE(bptparm.getTYPE());
        bptparmKey.setCODE(bptparm.getCODE());
        Bptparm bptparm2 = bptparmService.find(bptparmKey);
        if (bptparm2 == null){
            System.out.println("新增:"+bptparm.getCODE());
            bptparmService.add(bptparm);
        }else{
            System.out.println("更新:"+bptparm.getCODE());
            bptparmService.update(bptparm);
        }
        System.out.println("保存成功");
    }
    public byte[] objectToByte(int size,CityCode cityCode) {
        byte[] bytes = new byte[size];
        int index = 0;

        System.arraycopy(FormatUtils.getForStr("000000000000000       ",22), 0, bytes, 0, FormatUtils.getForStr("000000000000000       ",22).length);
        index = FormatUtils.getForStr("000000000000000       ",22).length;
        System.arraycopy(FormatUtils.getForStr(cityCode.getCityName(),30), 0, bytes, index, FormatUtils.getForStr(cityCode.getCityName(),30).length);
        index += FormatUtils.getForStr(cityCode.getCityName(),30).length;

        System.out.println("总长度：" + index);
        return bytes;
    }
}
