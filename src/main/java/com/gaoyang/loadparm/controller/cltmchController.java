package com.gaoyang.loadparm.controller;

import com.gaoyang.loadparm.entity.BpttltWithBLOBs;
import com.gaoyang.loadparm.entity.Cltmch;
import com.gaoyang.loadparm.entity.CltmchKey;
import com.gaoyang.loadparm.service.CltmchService;
import com.gaoyang.loadparm.utils.ExcelUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.List;

@Controller
@RequestMapping("/upload")

public class cltmchController {
    @Autowired
    CltmchService cltmchService;

    @RequestMapping("/cltmch")
    @Transactional(rollbackFor = Exception.class)
    public String uploadCltmch(MultipartFile fileTest, HttpServletRequest request) throws Exception {
//	try {
        String fileName = fileTest.getOriginalFilename();
        System.out.println(fileName);
        String realPath = request.getSession().getServletContext().getRealPath("/upload");
        System.out.println(realPath);
        fileTest.transferTo(new File(realPath, fileName));
        File file = new File(realPath + "/" + fileName);
        List<List<Object>> lists = ExcelUtils.readExcel(file);
        if (lists == null) {
            System.out.println("不存在该文件");
            return null;
        }
        for (int i = 2; i < lists.size(); i++) {
            List<Object> list = lists.get(i);             
            BpttltWithBLOBs bpttltWithBLOBs = new BpttltWithBLOBs();
            Cltmch cltmch = new Cltmch();
            CltmchKey cltmchKey = new CltmchKey();
            cltmch.setR_TYPE("N");
            cltmchKey.setR_TYPE("N");
            if (list.get(0) != null){
                System.out.println((list.get(0)).toString());
                cltmch.setSEQ_NO(Integer.parseInt(list.get(0).toString()));
                cltmchKey.setSEQ_NO(Integer.parseInt(list.get(0).toString()));
            }
            cltmch.setTYPE("G");
            cltmch.setPROD_CODE(list.get(1).toString());
            cltmch.setLMT_CODE(list.get(2).toString());
            cltmch.setREC_STATUS("A");
            cltmch.setCREATE_DATE(20000101);
            cltmch.setCREATE_UNIT(400100);
            cltmch.setCREATE_TL("MIG");
            cltmch.setVER_NO((short) 1);

            Cltmch cltmch2  =   cltmchService.select(cltmchKey);
            if (cltmch2 != null){
                System.out.println("更新数据："+cltmch.getSEQ_NO());
                cltmchService.update(cltmch);
            }else{
                System.out.println("增加数据："+cltmch.getSEQ_NO());
                cltmchService.add(cltmch);
            }



        }
        return "success";
    }
}
