package com.gaoyang.loadparm.controller;

import com.fasterxml.jackson.databind.jsontype.BasicPolymorphicTypeValidator;
import com.gaoyang.loadparm.entity.Bptparm;
import com.gaoyang.loadparm.entity.BptparmKey;
import com.gaoyang.loadparm.entity.Bptporgm;


import com.gaoyang.loadparm.service.BptparmService;
import com.gaoyang.loadparm.service.BptporgmService;
import com.gaoyang.loadparm.utils.ExcelUtils;
import com.gaoyang.loadparm.utils.FormatUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/upload")
public class uploadController {
	@Autowired
	Bptporgm bptporgm;
	@Autowired
	BptporgmService bptporgmService;
	@Autowired
	BptparmService bptparmService;
	@RequestMapping("/test")
	public String upload(MultipartFile fileTest, HttpServletRequest request)throws IOException{
		String fileName = fileTest.getOriginalFilename();
		System.out.println(fileName);
		String realPath = request.getSession().getServletContext().getRealPath("/upload");
		System.out.println(realPath);
		fileTest.transferTo(new File(realPath,fileName));
		try {
			File file=new File(realPath+"/"+fileName);
			if(file.isFile() && file.exists()){ //判断文件是否存在
				InputStreamReader read = new InputStreamReader(
						new FileInputStream(file));//考虑到编码格式
				BufferedReader bufferedReader = new BufferedReader(read);
				String lineTxt = null;
				while((lineTxt = bufferedReader.readLine()) != null){
					System.out.println(lineTxt);
				}
				read.close();
			}else{
				System.out.println("找不到指定的文件");
			}
		} catch (Exception e) {
			System.out.println("读取文件内容出错");
			e.printStackTrace();
		}
		return "success";
	}
	@RequestMapping("/excel")
	public String uploadExcel(MultipartFile fileTest, HttpServletRequest request)throws IOException{
		try {
			String fileName = fileTest.getOriginalFilename();
			System.out.println(fileName);
			String realPath = request.getSession().getServletContext().getRealPath("/upload");
			System.out.println(realPath);
			fileTest.transferTo(new File(realPath,fileName));
	//		FileInputStream is = (FileInputStream) fileTest.getInputStream();
			File file=new File(realPath+"/"+fileName);
			List<List<Object>> lists = ExcelUtils.readExcel(file);
			if (lists == null) {
				System.out.println("不存在该文件");
				return null;
			}
			for (int i = 5; i < lists.size(); i++){
				List<Object> list = lists.get(i);
				Bptporgm bptporgm = new Bptporgm();

						bptporgm.setTYPE((String) list.get(0));
						bptporgm.setCODE((String) list.get(2));
	//					System.out.println(Integer.parseInt((String)list.get(3)));
						bptporgm.setEFF_DATE(new BigDecimal("20000101"));
						bptporgm.setEXP_DATE(new BigDecimal("99991231"));
						if (list.get(5) != null){
							bptporgm.setBRANCH_BR(new BigDecimal((String)list.get(5)));
						}
						if(list.get(6) != null){
							bptporgm.setSUPR_BR(new BigDecimal((String)list.get(6)));
						}

						bptporgm.setATTR((String) list.get(7));
						bptporgm.setLVL((String) list.get(8));
						bptporgm.setTYP((String) list.get(9));
						bptporgm.setEFF_DT(new BigDecimal("20000101"));
						bptporgm.setEXP_DT(new BigDecimal("99991231"));
						bptporgm.setCHN_NM((String) list.get(10));
						bptporgm.setCHN_ADDR((String) list.get(11));
						bptporgm.setENG_NM((String) list.get(12));
						bptporgm.setENG_ADDR((String) list.get(13));
						bptporgm.setLINK_MAN((String) list.get(14));
						bptporgm.setLINK_TEL((String) list.get(15));
						bptporgm.setPOST((String) list.get(16));
						bptporgm.setTLR_MAX((String) list.get(17));
						bptporgm.setATH_MAX((String) list.get(18));
						//bptporgm.setFX_BUSI();
						if (list.get(19) != null){
							bptporgm.setCNAP_NO(new BigDecimal((String)list.get(19)));
						}

						//bptporgm.setACCT_FLG();
						if (list.get(20) != null){
							bptporgm.setOPN_DT(new BigDecimal((String)list.get(20)));
						}else{
							bptporgm.setOPN_DT(new BigDecimal(20000101));
						}
						if (list.get(21) != null){
							bptporgm.setRUN_HDAY((String) list.get(21));
						}

						//bptporgm.setRUN_MODE();
						if (list.get(22) != null){
							bptporgm.setCALD_CD((String) list.get(22));
						}
						if (list.get(23) != null){
							bptporgm.setBOP_CD((String) list.get(23));
						}
						if (list.get(24) != null){
							bptporgm.setCIC_CD((String) list.get(24));
						}


						bptporgm.setSWF_ID((String) list.get(25));
						bptporgm.setCOUN_CD((String) list.get(26));
						bptporgm.setCITY_CD((String) list.get(27));
				       if (list.get(28) != null){
						   bptporgm.setOPN_CHECK_FLG((String) list.get(28));
				        }
				       if (list.get(30) != null){
						   bptporgm.setIBAN_NO((String) list.get(30));
				       }

				       if (list.get(31) != null){
						   bptporgm.setFII_CD((String) list.get(31));
				       }
				    if (list.get(32) != null){
					    bptporgm.setCD_FLG((String) list.get(32));
				     }


//						bptporgm.setOPN_TM();
//						bptporgm.setCLS_TM();
//						bptporgm.setHOPN_TM();
//						bptporgm.setHCLS_TM();
//						bptporgm.setUPT_DT();
//						bptporgm.setUPT_TLR();
//						bptporgm.setFAX();
//						bptporgm.setTELEX();
//						bptporgm.setPRO_FLG();
//						bptporgm.setCOST_FLG();
//						bptporgm.setGL_MST();
//						bptporgm.setDEF_PTR();
//						bptporgm.setPAY_PTR();
//						bptporgm.setCFM_PTR();
//
//						bptporgm.setBIC_NO();
//						bptporgm.setIBAN_NO();
//						bptporgm.setCI_LEN();
//
//						bptporgm.setUNSCH_HOL();
//						bptporgm.setUNSCH_HOL_TM();
//						bptporgm.setOPN_CHECK_FLG();
//						bptporgm.setVOU_CHECK_FLG();
//						bptporgm.setINT_TAX_FLG();
//						bptporgm.setERP_BRAN();
//						bptporgm.setORG_FLG();
//						bptporgm.setFTZ_CD();
//						bptporgm.setBOP_CD();
						bptporgm.setFTZ_CD("00");
//
//						bptporgm.setFII_CD();

        //          bptporgmService.add(bptporgm);
                  saveParm(bptporgm);

			}
//			FileInputStream is = new FileInputStream(file);
//			List<Bptporgm> bptporgms = new ArrayList<Bptporgm>();
			// 编写解析代码逻辑
			// 基于.xls 格式解析 HSSF
			// 1、 加载Excel文件对象
//			XSSFWorkbook xssfWorkbook = new XSSFWorkbook(is);
//			// 2、 读取一个sheet
//			XSSFSheet xssfSheet = xssfWorkbook.getSheetAt(0);//获取第一个sheet对象


		} catch (Exception e) {
			System.out.println(new Date());
			System.out.println(e.getMessage());
		}



		return "success";
	}
      public void saveParm(Bptporgm bptporgm){
		     Bptparm bptparm = new Bptparm();
		     BptparmKey bptparmKey = new BptparmKey();
		     bptparm.setTYPE(bptporgm.getTYPE());
		     bptparm.setCODE("001"+bptporgm.getCODE());
		     bptparm.setEFF_DATE(20000101);
		     bptparm.setEXP_DATE(99991231);
		     bptparm.setVAL(objectToByte(1171,bptporgm));
		      bptparm.setUPD_DATE(20200506);
		      bptparm.setUPD_BR(400100);
		      bptparm.setUPD_TLR("MIGZM");
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
	public byte[] objectToByte(int size,Bptporgm bptporgm){
		byte[] bytes = new byte[size];
		//转换成byte[]
		if (bptporgm.getSUPR_BR() == null){
			bptporgm.setSUPR_BR(BigDecimal.ZERO) ;
		}

		if (bptporgm.getSUPR_BR() == null){bptporgm.setSUPR_BR(BigDecimal.ZERO) ;}
		if (bptporgm.getATTR() == null){               bptporgm.setATTR(" ") ;}
		if (bptporgm.getLVL() == null){                bptporgm.setLVL(" ") ;}
		if (bptporgm.getTYP() == null){                bptporgm.setTYP(" ") ;}
		if (bptporgm.getEFF_DT() == null){             bptporgm.setEFF_DT(BigDecimal.ZERO) ;}
		if (bptporgm.getEXP_DT() == null){             bptporgm.setEXP_DT(BigDecimal.ZERO) ;}
		if (bptporgm.getCHN_NM() == null){             bptporgm.setCHN_NM(" ") ;}
		if (bptporgm.getCHN_ADDR() == null){           bptporgm.setCHN_ADDR(" ") ;}
		if (bptporgm.getENG_NM() == null){             bptporgm.setENG_NM(" ") ;}
		if (bptporgm.getENG_ADDR() == null){           bptporgm.setENG_ADDR(" ") ;}
		if (bptporgm.getABBR() == null){               bptporgm.setABBR(" ") ;}
		if (bptporgm.getLINK_MAN() == null){           bptporgm.setLINK_MAN(" ") ;}
		if (bptporgm.getLINK_TEL() == null){           bptporgm.setLINK_TEL(" ") ;}
		if (bptporgm.getPOST() == null){               bptporgm.setPOST(" ") ;}
		if (bptporgm.getTLR_MAX() == null){            bptporgm.setTLR_MAX(" ") ;}
		if (bptporgm.getATH_MAX() == null){            bptporgm.setATH_MAX(" ") ;}
		if (bptporgm.getFX_BUSI() == null){            bptporgm.setFX_BUSI(" ") ;}
		if (bptporgm.getCNAP_NO() == null){            bptporgm.setCNAP_NO(BigDecimal.ZERO) ;}
		if (bptporgm.getACCT_FLG() == null){           bptporgm.setACCT_FLG(" ") ;}
		if (bptporgm.getOPN_DT() == null){             bptporgm.setOPN_DT(BigDecimal.ZERO) ;}
		if (bptporgm.getRUN_HDAY() == null){           bptporgm.setRUN_HDAY(" ") ;}
		if (bptporgm.getRUN_MODE() == null){           bptporgm.setRUN_MODE(" ") ;}
		if (bptporgm.getCALD_CD() == null){            bptporgm.setCALD_CD(" ") ;}
		if (bptporgm.getOPN_TM() == null){             bptporgm.setOPN_TM(BigDecimal.ZERO) ;}
		if (bptporgm.getCLS_TM() == null){             bptporgm.setCLS_TM(BigDecimal.ZERO) ;}
		if (bptporgm.getHOPN_TM() == null){            bptporgm.setHOPN_TM(BigDecimal.ZERO) ;}
		if (bptporgm.getHCLS_TM() == null){            bptporgm.setHCLS_TM(BigDecimal.ZERO) ;}
		if (bptporgm.getUPT_DT() == null){             bptporgm.setUPT_DT(BigDecimal.ZERO) ;}
		if (bptporgm.getUPT_TLR() == null){            bptporgm.setUPT_TLR(" ") ;}
		if (bptporgm.getFAX() == null){                bptporgm.setFAX(" ") ;}
		if (bptporgm.getTELEX() == null){              bptporgm.setTELEX(" ") ;}
		if (bptporgm.getPRO_FLG() == null){            bptporgm.setPRO_FLG(" ") ;}
		if (bptporgm.getCOST_FLG() == null){           bptporgm.setCOST_FLG(" ") ;}
		if (bptporgm.getGL_MST() == null){             bptporgm.setGL_MST(BigDecimal.ZERO) ;}
		if (bptporgm.getDEF_PTR() == null){            bptporgm.setDEF_PTR(" ") ;}
		if (bptporgm.getPAY_PTR() == null){            bptporgm.setPAY_PTR(" ") ;}
		if (bptporgm.getCFM_PTR() == null){            bptporgm.setCFM_PTR(" ") ;}
		if (bptporgm.getSWF_ID() == null){             bptporgm.setSWF_ID(" ") ;}
		if (bptporgm.getBIC_NO() == null){             bptporgm.setBIC_NO(" ") ;}
		if (bptporgm.getIBAN_NO() == null){            bptporgm.setIBAN_NO(" ") ;}
		if (bptporgm.getCI_LEN() == null){             bptporgm.setCI_LEN(BigDecimal.ZERO) ;}
		if (bptporgm.getCOUN_CD() == null){            bptporgm.setCOUN_CD(" ") ;}
		if (bptporgm.getCITY_CD() == null){            bptporgm.setCITY_CD(" ") ;}
		if (bptporgm.getUNSCH_HOL() == null){          bptporgm.setUNSCH_HOL(" ") ;}
		if (bptporgm.getUNSCH_HOL_TM() == null){       bptporgm.setUNSCH_HOL_TM(BigDecimal.ZERO) ;}
		if (bptporgm.getOPN_CHECK_FLG() == null){      bptporgm.setOPN_CHECK_FLG(" ") ;}
		if (bptporgm.getVOU_CHECK_FLG() == null){      bptporgm.setVOU_CHECK_FLG(" ") ;}
		if (bptporgm.getINT_TAX_FLG() == null){        bptporgm.setINT_TAX_FLG(" ") ;}
		if (bptporgm.getERP_BRAN() == null){           bptporgm.setERP_BRAN(BigDecimal.ZERO) ;}
		if (bptporgm.getORG_FLG() == null){            bptporgm.setORG_FLG(" ") ;}
		if (bptporgm.getBRANCH_BR() == null){          bptporgm.setBRANCH_BR(BigDecimal.ZERO) ;}
		if (bptporgm.getFTZ_CD() == null){             bptporgm.setFTZ_CD(" ") ;}
		if (bptporgm.getBOP_CD() == null){             bptporgm.setBOP_CD(" ") ;}
		if (bptporgm.getCIC_CD() == null){             bptporgm.setCIC_CD(" ") ;}
		if (bptporgm.getFII_CD() == null){             bptporgm.setFII_CD(" ") ;}

		System.arraycopy(FormatUtils.intToStr(bptporgm.getSUPR_BR(),6), 0, bytes, 0, FormatUtils.intToStr(bptporgm.getSUPR_BR(),6).length);
		int index = FormatUtils.intToStr(bptporgm.getSUPR_BR(),6).length;
		System.arraycopy(FormatUtils.getForStr(bptporgm.getATTR(),1), 0, bytes, index, FormatUtils.getForStr(bptporgm.getATTR(),1).length);
		index += FormatUtils.getForStr(bptporgm.getATTR(),1).length;

		System.arraycopy(FormatUtils.getForStr(bptporgm.getLVL(),1), 0, bytes, index, FormatUtils.getForStr(bptporgm.getLVL(),1).length);
		index += FormatUtils.getForStr(bptporgm.getLVL(),1).length;
		System.arraycopy(FormatUtils.getForStr(bptporgm.getTYP(),2), 0, bytes, index, FormatUtils.getForStr(bptporgm.getTYP(),2).length);
		index += FormatUtils.getForStr(bptporgm.getTYP(),2).length;
		System.arraycopy(FormatUtils.intToStr(bptporgm.getEFF_DT(),8), 0, bytes, index, FormatUtils.intToStr(bptporgm.getEFF_DT(),8).length);
		index += FormatUtils.intToStr(bptporgm.getEFF_DT(),8).length;
		System.arraycopy(FormatUtils.intToStr(bptporgm.getEXP_DT(),8), 0, bytes, index, FormatUtils.intToStr(bptporgm.getEXP_DT(),8).length);
		index += FormatUtils.intToStr(bptporgm.getEXP_DT(),8).length;
		System.arraycopy(FormatUtils.getForStr(bptporgm.getCHN_NM(),120), 0, bytes, index, FormatUtils.getForStr(bptporgm.getCHN_NM(),120).length);
		index += FormatUtils.getForStr(bptporgm.getCHN_NM(),120).length;
		System.arraycopy(FormatUtils.getForStr(bptporgm.getCHN_ADDR(),200), 0, bytes, index, FormatUtils.getForStr(bptporgm.getCHN_ADDR(),200).length);
		index += FormatUtils.getForStr(bptporgm.getCHN_ADDR(),200).length;
		System.arraycopy(FormatUtils.getForStr(bptporgm.getENG_NM(),70), 0, bytes, index, FormatUtils.getForStr(bptporgm.getENG_NM(),70).length);
		index += FormatUtils.getForStr(bptporgm.getENG_NM(),70).length;
		System.arraycopy(FormatUtils.getForStr(bptporgm.getENG_ADDR(),100), 0, bytes, index, FormatUtils.getForStr(bptporgm.getENG_ADDR(),100).length);
		index += FormatUtils.getForStr(bptporgm.getENG_ADDR(),100).length;
		System.arraycopy(FormatUtils.getForStr(bptporgm.getABBR(),2), 0, bytes, index, FormatUtils.getForStr(bptporgm.getABBR(),2).length);
		index += FormatUtils.getForStr(bptporgm.getABBR(),2).length;
		System.arraycopy(FormatUtils.getForStr(bptporgm.getLINK_MAN(),140), 0, bytes, index, FormatUtils.getForStr(bptporgm.getLINK_MAN(),140).length);
		index += FormatUtils.getForStr(bptporgm.getLINK_MAN(),140).length;
		System.arraycopy(FormatUtils.getForStr(bptporgm.getLINK_TEL(),18), 0, bytes, index, FormatUtils.getForStr(bptporgm.getLINK_TEL(),18).length);
		index += FormatUtils.getForStr(bptporgm.getLINK_TEL(),18).length;
		System.arraycopy(FormatUtils.getForStr(bptporgm.getPOST(),6), 0, bytes, index, FormatUtils.getForStr(bptporgm.getPOST(),6).length);
		index += FormatUtils.getForStr(bptporgm.getPOST(),6).length;
		System.arraycopy(FormatUtils.getForStr(bptporgm.getTLR_MAX(),1), 0, bytes, index, FormatUtils.getForStr(bptporgm.getTLR_MAX(),1).length);
		index += FormatUtils.getForStr(bptporgm.getTLR_MAX(),1).length;
		System.arraycopy(FormatUtils.getForStr(bptporgm.getATH_MAX(),1), 0, bytes, index, FormatUtils.getForStr(bptporgm.getATH_MAX(),1).length);
		index += FormatUtils.getForStr(bptporgm.getATH_MAX(),1).length;
		System.arraycopy(FormatUtils.getForStr(bptporgm.getFX_BUSI(),2), 0, bytes, index, FormatUtils.getForStr(bptporgm.getFX_BUSI(),2).length);
		index += FormatUtils.getForStr(bptporgm.getFX_BUSI(),2).length;
		System.arraycopy(FormatUtils.intToStr(bptporgm.getCNAP_NO(),12), 0, bytes, index, FormatUtils.intToStr(bptporgm.getCNAP_NO(),12).length);
		index += FormatUtils.intToStr(bptporgm.getCNAP_NO(),12).length;
		System.arraycopy(FormatUtils.getForStr(bptporgm.getACCT_FLG(),1), 0, bytes, index, FormatUtils.getForStr(bptporgm.getACCT_FLG(),1).length);
		index += FormatUtils.getForStr(bptporgm.getACCT_FLG(),1).length;
		System.arraycopy(FormatUtils.intToStr(bptporgm.getOPN_DT(),8), 0, bytes, index, FormatUtils.intToStr(bptporgm.getOPN_DT(),8).length);
		index += FormatUtils.intToStr(bptporgm.getOPN_DT(),8).length;
		System.arraycopy(FormatUtils.getForStr(bptporgm.getRUN_HDAY(),1), 0, bytes, index, FormatUtils.getForStr(bptporgm.getRUN_HDAY(),1).length);
		index += FormatUtils.getForStr(bptporgm.getRUN_HDAY(),1).length;
		System.arraycopy(FormatUtils.getForStr(bptporgm.getRUN_MODE(),1), 0, bytes, index, FormatUtils.getForStr(bptporgm.getRUN_MODE(),1).length);
		index += FormatUtils.getForStr(bptporgm.getRUN_MODE(),1).length;
		System.arraycopy(FormatUtils.getForStr(bptporgm.getCALD_CD(),4), 0, bytes, index, FormatUtils.getForStr(bptporgm.getCALD_CD(),4).length);
		index += FormatUtils.getForStr(bptporgm.getCALD_CD(),4).length;
		System.arraycopy(FormatUtils.intToStr(bptporgm.getOPN_TM(),6), 0, bytes, index, FormatUtils.intToStr(bptporgm.getOPN_TM(),6).length);
		index += FormatUtils.intToStr(bptporgm.getOPN_TM(),6).length;
		System.arraycopy(FormatUtils.intToStr(bptporgm.getCLS_TM(),6), 0, bytes, index, FormatUtils.intToStr(bptporgm.getCLS_TM(),6).length);
		index += FormatUtils.intToStr(bptporgm.getOPN_TM(),6).length;
		System.arraycopy(FormatUtils.intToStr(bptporgm.getHOPN_TM(),6), 0, bytes, index, FormatUtils.intToStr(bptporgm.getHOPN_TM(),6).length);
		index += FormatUtils.intToStr(bptporgm.getCLS_TM(),6).length;
		System.arraycopy(FormatUtils.intToStr(bptporgm.getHCLS_TM(),6), 0, bytes, index, FormatUtils.intToStr(bptporgm.getHCLS_TM(),6).length);
		index += FormatUtils.intToStr(bptporgm.getHOPN_TM(),6).length;
		System.arraycopy(FormatUtils.intToStr(bptporgm.getUPT_DT(),8), 0, bytes, index, FormatUtils.intToStr(bptporgm.getUPT_DT(),8).length);
		index += FormatUtils.intToStr(bptporgm.getUPT_DT(),8).length;
		System.arraycopy(FormatUtils.getForStr(bptporgm.getUPT_TLR(),8), 0, bytes, index, FormatUtils.getForStr(bptporgm.getUPT_TLR(),8).length);
		index += FormatUtils.getForStr(bptporgm.getUPT_TLR(),8).length;
		System.arraycopy(FormatUtils.getForStr(bptporgm.getFAX(),18), 0, bytes, index, FormatUtils.getForStr(bptporgm.getFAX(),18).length);
		index += FormatUtils.getForStr(bptporgm.getFAX(),18).length;
		System.arraycopy(FormatUtils.getForStr(bptporgm.getTELEX(),18), 0, bytes, index, FormatUtils.getForStr(bptporgm.getTELEX(),18).length);
		index += FormatUtils.getForStr(bptporgm.getTELEX(),18).length;
		System.arraycopy(FormatUtils.getForStr(bptporgm.getPRO_FLG(),1), 0, bytes, index, FormatUtils.getForStr(bptporgm.getPRO_FLG(),1).length);
		index += FormatUtils.getForStr(bptporgm.getPRO_FLG(),1).length;
		System.arraycopy(FormatUtils.getForStr(bptporgm.getCOST_FLG(),1), 0, bytes, index, FormatUtils.getForStr(bptporgm.getCOST_FLG(),1).length);
		index += FormatUtils.getForStr(bptporgm.getCOST_FLG(),1).length;
		System.arraycopy(FormatUtils.intToStr(bptporgm.getGL_MST(),6), 0, bytes, index, FormatUtils.intToStr(bptporgm.getGL_MST(),6).length);
		index += FormatUtils.intToStr(bptporgm.getGL_MST(),6).length;
		System.arraycopy(FormatUtils.getForStr(bptporgm.getDEF_PTR(),80), 0, bytes, index, FormatUtils.getForStr(bptporgm.getDEF_PTR(),80).length);
		index += FormatUtils.getForStr(bptporgm.getDEF_PTR(),80).length;
		System.arraycopy(FormatUtils.getForStr(bptporgm.getPAY_PTR(),80), 0, bytes, index, FormatUtils.getForStr(bptporgm.getPAY_PTR(),80).length);
		index += FormatUtils.getForStr(bptporgm.getPAY_PTR(),80).length;
		System.arraycopy(FormatUtils.getForStr(bptporgm.getCFM_PTR(),80), 0, bytes, index, FormatUtils.getForStr(bptporgm.getCFM_PTR(),80).length);
		index += FormatUtils.getForStr(bptporgm.getCFM_PTR(),80).length;
		System.arraycopy(FormatUtils.getForStr(bptporgm.getSWF_ID(),9), 0, bytes, index, FormatUtils.getForStr(bptporgm.getSWF_ID(),9).length);
		index += FormatUtils.getForStr(bptporgm.getSWF_ID(),9).length;
		System.arraycopy(FormatUtils.getForStr(bptporgm.getBIC_NO(),3), 0, bytes, index, FormatUtils.getForStr(bptporgm.getBIC_NO(),3).length);
		index += FormatUtils.getForStr(bptporgm.getBIC_NO(),3).length;
		System.arraycopy(FormatUtils.getForStr(bptporgm.getIBAN_NO(),34), 0, bytes, index, FormatUtils.getForStr(bptporgm.getIBAN_NO(),34).length);
		index += FormatUtils.getForStr(bptporgm.getIBAN_NO(),34).length;
		System.arraycopy(FormatUtils.intToStr(bptporgm.getCI_LEN(),9), 0, bytes, index, FormatUtils.intToStr(bptporgm.getCI_LEN(),9).length);
		index += FormatUtils.intToStr(bptporgm.getCI_LEN(),9).length;
		System.arraycopy(FormatUtils.getForStr(bptporgm.getCOUN_CD(),4), 0, bytes, index, FormatUtils.getForStr(bptporgm.getCOUN_CD(),4).length);
		index += FormatUtils.getForStr(bptporgm.getCOUN_CD(),4).length;
		System.arraycopy(FormatUtils.getForStr(bptporgm.getCITY_CD(),6), 0, bytes, index, FormatUtils.getForStr(bptporgm.getCITY_CD(),6).length);
		index += FormatUtils.getForStr(bptporgm.getCITY_CD(),6).length;
		System.arraycopy(FormatUtils.getForStr(bptporgm.getUNSCH_HOL(),1), 0, bytes, index, FormatUtils.getForStr(bptporgm.getUNSCH_HOL(),1).length);
		index += FormatUtils.getForStr(bptporgm.getUNSCH_HOL(),1).length;
		System.arraycopy(FormatUtils.intToStr(bptporgm.getUNSCH_HOL_TM(),6), 0, bytes, index, FormatUtils.intToStr(bptporgm.getUNSCH_HOL_TM(),6).length);
		index += FormatUtils.intToStr(bptporgm.getUNSCH_HOL_TM(),6).length;
		System.arraycopy(FormatUtils.getForStr(bptporgm.getOPN_CHECK_FLG(),1), 0, bytes, index, FormatUtils.getForStr(bptporgm.getOPN_CHECK_FLG(),1).length);
		index += FormatUtils.getForStr(bptporgm.getOPN_CHECK_FLG(),1).length;
		System.arraycopy(FormatUtils.getForStr(bptporgm.getVOU_CHECK_FLG(),1), 0, bytes, index, FormatUtils.getForStr(bptporgm.getVOU_CHECK_FLG(),1).length);
		index += FormatUtils.getForStr(bptporgm.getVOU_CHECK_FLG(),1).length;
		System.arraycopy(FormatUtils.getForStr(bptporgm.getINT_TAX_FLG(),1), 0, bytes, index, FormatUtils.getForStr(bptporgm.getINT_TAX_FLG(),1).length);
		index += FormatUtils.getForStr(bptporgm.getINT_TAX_FLG(),1).length;
		System.arraycopy(FormatUtils.intToStr(bptporgm.getERP_BRAN(),9), 0, bytes, index, FormatUtils.intToStr(bptporgm.getERP_BRAN(),9).length);
		index += FormatUtils.intToStr(bptporgm.getERP_BRAN(),9).length;
		System.arraycopy(FormatUtils.getForStr(bptporgm.getORG_FLG(),1), 0, bytes, index, FormatUtils.getForStr(bptporgm.getORG_FLG(),1).length);
		index += FormatUtils.getForStr(bptporgm.getORG_FLG(),1).length;
		System.arraycopy(FormatUtils.intToStr(bptporgm.getBRANCH_BR(),6), 0, bytes, index, FormatUtils.intToStr(bptporgm.getBRANCH_BR(),6).length);
		index += FormatUtils.intToStr(bptporgm.getBRANCH_BR(),6).length;
		System.arraycopy(FormatUtils.getForStr(bptporgm.getFTZ_CD(),2), 0, bytes, index, FormatUtils.getForStr(bptporgm.getFTZ_CD(),2).length);
		index += FormatUtils.getForStr(bptporgm.getFTZ_CD(),2).length;
		System.arraycopy(FormatUtils.getForStr(bptporgm.getBOP_CD(),12), 0, bytes, index, FormatUtils.getForStr(bptporgm.getBOP_CD(),12).length);
		index += FormatUtils.getForStr(bptporgm.getBOP_CD(),12).length;
		System.arraycopy(FormatUtils.getForStr(bptporgm.getCIC_CD(),11), 0, bytes, index, FormatUtils.getForStr(bptporgm.getCIC_CD(),11).length);
		index += FormatUtils.getForStr(bptporgm.getCIC_CD(),11).length;
		System.arraycopy(FormatUtils.getForStr(bptporgm.getFII_CD(),15), 0, bytes, index, FormatUtils.getForStr(bptporgm.getFII_CD(),15).length);
		index += FormatUtils.getForStr(bptporgm.getFII_CD(),15).length;
		System.arraycopy(FormatUtils.getForStr(bptporgm.getCD_FLG(),1), 0, bytes, index, FormatUtils.getForStr(bptporgm.getCD_FLG(),1).length);
		index += FormatUtils.getForStr(bptporgm.getCD_FLG(),1).length;
		System.arraycopy(FormatUtils.getForStr("  ",2), 0, bytes, index, FormatUtils.getForStr("  ",2).length);
		index += FormatUtils.getForStr("  ",2).length;
		return bytes;
	}
}
