package com.gaoyang.loadparm.controller;

import com.gaoyang.loadparm.entity.*;
import com.gaoyang.loadparm.service.BptparmService;
import com.gaoyang.loadparm.service.BptpdcdService;
import com.gaoyang.loadparm.service.BptpdmeService;
import com.gaoyang.loadparm.utils.ExcelUtils;
import com.gaoyang.loadparm.utils.FormatUtils;
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
public class IlparmController {
	@Autowired
	BptparmService bptparmService;
	@Autowired
	BptpdmeService bptpdmeService;
	@Autowired
	BptpdcdService bptpdcdService;
	private final  String IL = " ";
	@RequestMapping("/ilparm")
	public String uploadExcel(MultipartFile fileTest, HttpServletRequest request) throws Exception {
		String fileName = fileTest.getOriginalFilename();
		System.out.println(fileName);
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
		for (int i = 2; i < lists.size(); i++) {
			List<Object> list = lists.get(i);
			Ilparm ilparm = new Ilparm();
			ilparm.setPROD_MOD("IL");
			ilparm.setPROD_CODE((String) list.get(0));
			ilparm.setCHN_NAME((String) list.get(1));
			//ilparm.setCUR_TYPE((String) list.get(4));
			ilparm.setCUR_TYPE("A");
			ilparm.setTR_TYP((String) list.get(3));
			ilparm.setADV_FLG((String) list.get(4));
			saveParm(ilparm);
			saveBptpdme(ilparm);
			saveBptpdcd(ilparm);
		}

		return "success";
	}
	public void saveBptpdme(Ilparm ilparm){
		Bptpdme bptpdme = new Bptpdme();
		bptpdme.setPRDT_CODE(ilparm.getPROD_CODE());
		bptpdme.setPRDT_NAME(ilparm.getCHN_NAME());
		bptpdme.setBUSI_TYPE("IL");
		bptpdme.setPRDT_MODEL("IL");
		bptpdme.setPRDT_IND("0");
		bptpdme.setEFF_DATE(new BigDecimal("20000101"));
		bptpdme.setEXP_DATE(new BigDecimal("99991231"));
		bptpdme.setSTOP_SOLD_DATE(new BigDecimal("99991231"));
		bptpdme.setPARM_CODE(ilparm.getPROD_CODE());
		bptpdme.setLAST_TLT("BCELIL");
		bptpdmeService.add(bptpdme);
	}
	public void saveBptpdcd(Ilparm ilparm){
		Bptpdcd bptpdcd = new Bptpdcd();
		bptpdcd.setPRDT_CODE(ilparm.getPROD_CODE());
		//	if(lnrctlpm.getPROD_CLASS().substring(0,1).equals("2")){
			bptpdcd.setCUS_PER_FLG("1");
			bptpdcd.setCUS_COM_FLG("1");
			bptpdcd.setCUS_FIN_FLG("1");
		    bptpdcdService.add(bptpdcd);
	}
	public void saveParm(Ilparm ilparm){
		Bptparm bptparm = new Bptparm();
		bptparm.setTYPE("PRDPR");
		bptparm.setCODE("999999"+ilparm.getPROD_CODE());
		bptparm.setCDESC(ilparm.getCHN_NAME());
		//bptparm.setDESC(lnrctlpm.getDESC());
		bptparm.setEFF_DATE(20000101);
		bptparm.setEXP_DATE(99991231);
		bptparm.setVAL(objectToByte(268,ilparm));
		bptparm.setUPD_DATE(20200506);
		bptparm.setUPD_BR(888010);
		bptparm.setUPD_TLR("BCELIL");
		bptparmService.add(bptparm);
		System.out.println("保存成功");
	}
	public byte[] objectToByte(int size,Ilparm ilparm) {
		byte[] bytes = new byte[size];
		System.arraycopy(FormatUtils.getForStr(ilparm.getPROD_MOD(),4), 0, bytes, 0, FormatUtils.getForStr(ilparm.getPROD_MOD(),4).length);
		int index = FormatUtils.getForStr(ilparm.getPROD_MOD(),4).length;
		System.arraycopy(FormatUtils.getForStr(IL,20), 0, bytes, index, FormatUtils.getForStr(IL,20).length);
		index += FormatUtils.getForStr(IL,20).length;
		System.arraycopy(FormatUtils.getForStr(ilparm.getCHN_NAME(),60), 0, bytes, index, FormatUtils.getForStr(ilparm.getCHN_NAME(),60).length);
		index += FormatUtils.getForStr(ilparm.getCHN_NAME(),60).length;
		System.arraycopy(FormatUtils.getForStr(IL,120), 0, bytes, index, FormatUtils.getForStr(IL,120).length);
		index += FormatUtils.getForStr(IL,120).length;
		System.arraycopy(FormatUtils.getForStr(ilparm.getTR_TYP(),1), 0, bytes, index, FormatUtils.getForStr(ilparm.getTR_TYP(),1).length);
		index += FormatUtils.getForStr(ilparm.getTR_TYP(),1).length;
		System.arraycopy(FormatUtils.getForStr(ilparm.getADV_FLG(),1), 0, bytes, index, FormatUtils.getForStr(ilparm.getADV_FLG(),1).length);
		index += FormatUtils.getForStr(ilparm.getADV_FLG(),1).length;
		System.arraycopy(FormatUtils.getForStr(ilparm.getCUR_TYPE(),1), 0, bytes, index, FormatUtils.getForStr(ilparm.getCUR_TYPE(),1).length);
		index += FormatUtils.getForStr(ilparm.getCUR_TYPE(),1).length;
		System.arraycopy(FormatUtils.getForStr(IL,61), 0, bytes, index, FormatUtils.getForStr(IL,61).length);
		index += FormatUtils.getForStr(IL,61).length;
		System.out.println("总长度：" +index);
		return bytes;
	}
}
