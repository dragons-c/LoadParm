package com.gaoyang.loadparm.controller;

import com.gaoyang.loadparm.entity.Citoic;
import com.gaoyang.loadparm.entity.Citteam;
import com.gaoyang.loadparm.service.CitoicService;
import com.gaoyang.loadparm.service.CitteamService;
import com.gaoyang.loadparm.utils.ExcelUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/upload")
public class oicController {
    @Autowired
	CitoicService citoicService;
    @Autowired
	CitteamService citteamService;
	@RequestMapping("/oicTable")
	public String uploadExcel(MultipartFile fileTest, HttpServletRequest request) throws Exception {
		String fileName = fileTest.getOriginalFilename();
		System.out.println(fileName);
		String[] str = fileName.split("\\.");
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
			Citoic citoic = new Citoic();
			Citteam citteam = new Citteam();
			List<Object> list = lists.get(i);
            citoic.setOIC_NO(list.get(0).toString());
            citoic.setTEAM_NO(list.get(0).toString());
            citoic.setNAME(list.get(0).toString());
            citoic.setLEADER_FLG("N");
            citoic.setCREATE_UNIT(888010);
            citoic.setCREATE_TLR("BCEL34M");
            citoic.setCREATE_DATE(20200101);
            citoic.setTS(new Date());
            citoicService.add(citoic);
            citteam.setTEAM_NO(list.get(0).toString());
            citteam.setTEAM_NM(list.get(0).toString());
            citteam.setBRANCH(Integer.parseInt(list.get(0).toString()));
            citteam.setCREATE_UNIT(888010);
            citteam.setCREATE_TLR("BCEL34M");
            citteam.setCREATE_DATE(20200101);
            citteam.setTS(new Date());
            citteamService.add(citteam);
		}
		return "success";
	}
}
