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
public class publicCodeController {


		@Autowired
		BptparmService bptparmService;
		private final  String CODE = " ";
		@RequestMapping("/publicCode")
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
				PublicCode publicCode = new PublicCode();
				    publicCode.setOpenDate("20000101");
				    publicCode.setLstTlt("BCEL34M");
				    publicCode.setFileName(str[0]);
				     System.out.println(list.get(1));
				    publicCode.setEnglishName(list.get(1).toString());
				    publicCode.setLocalName(list.get(2).toString());
				    publicCode.setDetails(list.get(0).toString());
				System.out.println(list.get(0));
				    if(list.get(5) != null){
				    	publicCode.setRemarks(list.get(5).toString());
					}
					saveParm(publicCode);

			}


			return "success";
		}
	public void saveParm(PublicCode publicCode){
		Bptparm bptparm = new Bptparm();
		BptparmKey bptparmKey = new BptparmKey();
		bptparm.setTYPE("PARMC");
		if(publicCode.getFileName().length() == 4){
			bptparm.setCODE(publicCode.getFileName()+" "+publicCode.getDetails());
		}else{
			bptparm.setCODE(publicCode.getFileName()+publicCode.getDetails());
		}

		System.out.println(bptparm.getCODE());
//		bptparm.setCdesc(tdcprdp.getPRDMO_CDESC());
		//bptparm.setDESC(lnrctlpm.getDESC());
		bptparm.setEFF_DATE(20000101);
		bptparm.setEXP_DATE(99991231);
		bptparm.setVAL(objectToByte(672,publicCode));
		bptparm.setUPD_DATE(20200506);
		bptparm.setUPD_BR(888010);
		bptparm.setUPD_TLR("BCEL34M");
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
	public byte[] objectToByte(int size,PublicCode publicCode) {
		byte[] bytes = new byte[size];
		int index = 0;
		if(publicCode.getRemarks() == null){
			System.arraycopy(FormatUtils.getForStr(CODE,400), 0, bytes, 0, FormatUtils.getForStr(CODE,400).length);
			 index = FormatUtils.getForStr(CODE,400).length;
		}else{
			System.arraycopy(FormatUtils.getForStr("1"+publicCode.getRemarks(),400), 0, bytes, 0, FormatUtils.getForStr("1" +publicCode.getRemarks(),400).length);
			 index = FormatUtils.getForStr("1"+publicCode.getRemarks(),400).length;
		}

		System.arraycopy(FormatUtils.getForStr(publicCode.getOpenDate(),8), 0, bytes, index, FormatUtils.getForStr(publicCode.getOpenDate(),8).length);
		index += FormatUtils.getForStr(publicCode.getOpenDate(),8).length;
		System.arraycopy(FormatUtils.getForStr(publicCode.getOpenDate(),8), 0, bytes, index, FormatUtils.getForStr(publicCode.getOpenDate(),8).length);
		index += FormatUtils.getForStr(publicCode.getOpenDate(),8).length;
		System.arraycopy(FormatUtils.getForStr(publicCode.getLstTlt(),8), 0, bytes, index, FormatUtils.getForStr(publicCode.getLstTlt(),8).length);
		index += FormatUtils.getForStr(publicCode.getLstTlt(),8).length;
		System.arraycopy(FormatUtils.getForStr(CODE,1), 0, bytes, 0, FormatUtils.getForStr(CODE,1).length);
		index += FormatUtils.getForStr(CODE,1).length;
		System.arraycopy(FormatUtils.getForStr(publicCode.getLocalName(),120), 0, bytes, index, FormatUtils.getForStr(publicCode.getLocalName(),120).length);
		 index += FormatUtils.getForStr(publicCode.getLocalName(),120).length;
		System.arraycopy(FormatUtils.getForStr(publicCode.getEnglishName(),120), 0, bytes, index, FormatUtils.getForStr(publicCode.getEnglishName(),120).length);
		 index += FormatUtils.getForStr(publicCode.getEnglishName(),120).length;
		System.arraycopy(FormatUtils.getForStr(CODE,7), 0, bytes, index, FormatUtils.getForStr(CODE,7).length);
		index += FormatUtils.getForStr(CODE,7).length;
		System.out.println("总长度：" + index);
		return bytes;
	}
}
