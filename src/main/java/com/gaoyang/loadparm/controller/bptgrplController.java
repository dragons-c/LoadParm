//compackage com.gaoyang.loadparm.controller;
//
//import com.gaoyang.loadparm.entity.*;
//import com.gaoyang.loadparm.service.BptgrpService;::
//import com.gaoyang.loadparm.service.BptgrplService;
//import com.gaoyang.loadparm.service.CitoicService;
//import com.gaoyang.loadparm.service.CitteamService;
//import com.gaoyang.loadparm.utils.ExcelUtils;
//import com.gaoyang.loadparm.utils.FormatUtils;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.multipart.MultipartFile;
//
//import javax.servlet.http.HttpServletRequest;
//import java.io.File;
//import java.util.Date;
//import java.util.List;
//
//@Controller
//@RequestMapping("/upload")
//public class bptgrplController {
//    @Autowired
//	BptgrplService bptgrplService;
//	@Autowired
//	BptgrpService bptgrpService;
//	@RequestMapping("/bptgrpl")
//	public String uploadExcel(MultipartFile fileTest, HttpServletRequest request) throws Exception {
//		String fileName = fileTest.getOriginalFilename();
//		System.out.println(fileName);
//		String[] str = fileName.split("\\.");
//		String realPath = request.getSession().getServletContext().getRealPath("/upload");
//		System.out.println(realPath);
//		fileTest.transferTo(new File(realPath, fileName));
//		//		FileInputStream is = (FileInputStream) fileTest.getInputStream();
//		File file = new File(realPath + "/" + fileName);
//		List<List<Object>> lists = ExcelUtils.readExcel(file);
//		if (lists == null) {
//			System.out.println("不存在该文件");
//			return null;
//		}
//		for (int i = 0; i < lists.size(); i++) {
//			List<Object> list = lists.get(i);
//			Bptgrpl bptgrpl = new Bptgrpl();
//			bptgrpl.setASS_TYP((String) list.get(0));
//		    bptgrpl.setASS_ID((String) list.get(1));
//			//bptgrpl.setATH_TYP("0");
//            for(int j = 2 ; j <= 30 ; j++ ){
//            //   if (list.get());
//				int num = 0;
//				Bprole bprole = new Bprole();
//				if(list.get(j) != null){
//					Bptgrp bptgrp = bptgrpService.selectByPrimaryKey(list.get(j).toString());
//					if(bptgrp != null){
//						if(bptgrp.getROLE_ENMS() == "MAKER"){
//							bptgrpl.setATH_TYP("0");
//
//							num = num + 1;
//						}
//					}
//				}
//			}
//			bptgrplService.add(bptgrpl);
//		}
//		return "success";
//	}
//	public byte[] objectToByte(int size,Ddvmprd ddvmprd) {
//		byte[] bytes = new byte[size];
//		System.arraycopy(FormatUtils.getForStr(ddvmprd.getPRDMO_CD(),4), 0, bytes, 0, FormatUtils.getForStr(ddvmprd.getPRDMO_CD(),4).length);
//		int index = FormatUtils.getForStr(ddvmprd.getPRDMO_CD(),4).length;
//		System.arraycopy(FormatUtils.getForStr(ddvmprd.getPARM_CODE(),8), 0, bytes, index, FormatUtils.getForStr(ddvmprd.getPARM_CODE(),8).length);
//
//		index += FormatUtils.getForStr(ddvmprd.getREMARK(),240).length;
//		System.arraycopy(FormatUtils.getForStr(DD,1), 0, bytes, index, FormatUtils.getForStr(DD,1).length);
//		index += FormatUtils.getForStr(DD,1).length;
//		System.out.println("总长度：" +index);
//		return bytes;
//	}
//}
