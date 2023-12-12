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
public class tdcprdpController {
	@Autowired
	BptparmService bptparmService;
	@Autowired
	BptpdmeService bptpdmeService;
	@Autowired
	BptpdcdService bptpdcdService;
	private final  String TD = " ";
	@RequestMapping("/tdcprdp")
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
		for (int i = 3; i < lists.size(); i++) {
			List<Object> list = lists.get(i);
			Tdcprdp tdcprdp = new Tdcprdp();
			tdcprdp.setPRDMO_CODE((String) list.get(0));
			tdcprdp.setPRDMO_CDESC((String) list.get(1));
			tdcprdp.setPRDMO_CUST_TYPE( list.get(4).toString().substring(0,1));
			System.out.println(tdcprdp.getPRDMO_CUST_TYPE());
			tdcprdp.setPRDMO_ACCUNT_TYPE(list.get(5).toString().substring(0,3));
			tdcprdp.setPRDMO_CD("MMDP");
			//tdcprdp.setPART_NUM((String) list.get(6));
			tdcprdp.setPART_NUM("0");
			//tdcprdp.setCASH_FLG((String) list.get(7));
			tdcprdp.setCASH_FLG("Y");
			//可用凭证类型
			tdcprdp.setBV_TYP_DESC("NYNNNNNNY");
			tdcprdp.setDRAW_MTH_DESC("NYNN");
			tdcprdp.setCROS_CR_LMT("1");
			tdcprdp.setCROS_DR_LMT("1");
			tdcprdp.setSTAFF_LMT("0");
			tdcprdp.setRESID_LMT("0");
			tdcprdp.setCUST_TRANS_CTRL("3");
			tdcprdp.setNON_ORG_CTRL("3");
			tdcprdp.setBUD_FLG("0");
			tdcprdp.setIRAT_CD((String) list.get(17));
			tdcprdp.setIRAT_TYP("0");
			tdcprdp.setTAX_WAV_FLG("Y");
			tdcprdp.setOVERDUE_INT_FLG("Y");
			tdcprdp.setHOLID_RUL("0");
			tdcprdp.setMDF_FLG("Y");
			tdcprdp.setINSTR_MTH_DESC("YYYYNNY");
			//可中途提取
			tdcprdp.setMID_FLG("Y");
//			if (((String)list.get(31)).length() == 3){
//				tdcprdp.setMIN_TERM("M00"+((String)list.get(31)).substring(0,1));
//			}else if(((String)list.get(31)).length() == 4){
//				tdcprdp.setMIN_TERM("M0"+((String)list.get(31)).substring(0,2));
//			}

			tdcprdp.setMIN_TERM("M0"+list.get(31).toString().substring(0,2));
//			if (((String)list.get(32)).length() == 3){
//				tdcprdp.setMAX_TERM("M00"+((String)list.get(32)).substring(0,1));
//			}else if(((String)list.get(32)).length() == 4){
//				tdcprdp.setMAX_TERM("M0"+((String)list.get(32)).substring(0,2));
//			}
			tdcprdp.setMAX_TERM("M0"+list.get(32).toString().substring(0,2));
			if(list.get(33).toString().equals("N/A")){
				tdcprdp.setINT_PERD("NNNNN");
			}else{
				String[] perds = list.get(33).toString().replaceAll(" ","").split("-");
				System.out.println("preds:"+perds[0]);
				if (perds[0].equals("1")){
					tdcprdp.setINT_PERD("YNNNN");
				}else if (perds[0].equals("3")){
					tdcprdp.setINT_PERD("NYNNN");
				}else if (perds[0].equals("6")){
					tdcprdp.setINT_PERD("NNYNN");
				}else if (perds[0].equals("12")){
					tdcprdp.setINT_PERD("NNNYN");
				}else if (perds[0].equals("0")){
					tdcprdp.setINT_PERD("NNNNY");
				}
			}


			tdcprdp.setCCY_TYP("M");
			tdcprdp.setTERM_T("M");
			if(list.get(40) != null){
				String str = list.get(40).toString().substring(0,2);
//				if (((String)list.get(40)).length() == 3){
//					tdcprdp.setTERM1("M00"+((String)list.get(32)).substring(0,1));
//				}else if(((String)list.get(40)).length() == 4){
//					tdcprdp.setTERM1("M0"+((String)list.get(32)).substring(0,2));
//				}

					tdcprdp.setTERM1("M0"+str);
				System.out.println(tdcprdp.getTERM1());
			}

			tdcprdp.setCALD_FLG("1");
			System.out.println("第"+ i + "条数据");
			saveParm(tdcprdp);
			saveBptpdme(tdcprdp);
			saveBptpdcd(tdcprdp);
		}
		return "success";
	}
	public void saveBptpdme(Tdcprdp tdcprdp){
		Bptpdme bptpdme = new Bptpdme();
		bptpdme.setPRDT_CODE(tdcprdp.getPRDMO_CODE());
		bptpdme.setPRDT_NAME(tdcprdp.getPRDMO_CDESC());
		bptpdme.setBUSI_TYPE("TDP");
		bptpdme.setPRDT_MODEL(tdcprdp.getPRDMO_CD());
		bptpdme.setPRDT_IND("0");
		bptpdme.setEFF_DATE(new BigDecimal("20000101"));
		bptpdme.setEXP_DATE(new BigDecimal("99991231"));
		bptpdme.setSTOP_SOLD_DATE(new BigDecimal("99991231"));
		bptpdme.setPARM_CODE(tdcprdp.getPRDMO_CODE());
		bptpdme.setAC_RULE(tdcprdp.getPRDMO_ACCUNT_TYPE().substring(0,3));
		bptpdme.setLAST_TLT("BCELTD2");
		Bptpdme bptpdme2 = bptpdmeService.find(bptpdme.getPRDT_CODE());
		if(bptpdme2 == null){
			bptpdmeService.add(bptpdme);
		}else{
			bptpdmeService.update(bptpdme);
		}
	}
	public void saveBptpdcd(Tdcprdp tdcprdp){
		Bptpdcd bptpdcd = new Bptpdcd();
		bptpdcd.setPRDT_CODE(tdcprdp.getPRDMO_CODE());
		//	if(lnrctlpm.getPROD_CLASS().substring(0,1).equals("2")){
		if(tdcprdp.getPRDMO_CUST_TYPE().substring(0,1).equals("P")){
			bptpdcd.setCUS_PER_FLG("1");
			bptpdcd.setCUS_COM_FLG("0");
			bptpdcd.setCUS_FIN_FLG("0");
		}else if(tdcprdp.getPRDMO_CUST_TYPE().substring(0,1).equals("C")){
			bptpdcd.setCUS_PER_FLG("0");
			bptpdcd.setCUS_COM_FLG("1");
			bptpdcd.setCUS_FIN_FLG("0");
		}else if(tdcprdp.getPRDMO_CUST_TYPE().substring(0,1).equals("F")){
			bptpdcd.setCUS_PER_FLG("0");
			bptpdcd.setCUS_COM_FLG("0");
			bptpdcd.setCUS_FIN_FLG("1");
		}

		Bptpdcd bptpdcd2 = bptpdcdService.find(bptpdcd.getPRDT_CODE());
		if (bptpdcd2 == null){
			bptpdcdService.add(bptpdcd);
		}else{
			bptpdcdService.update(bptpdcd);
		}
	}
	public void saveParm(Tdcprdp tdcprdp){
		Bptparm bptparm = new Bptparm();
		BptparmKey bptparmKey = new BptparmKey();
		bptparm.setTYPE("PRDPR");
		bptparm.setCODE("999999"+tdcprdp.getPRDMO_CODE());
		System.out.println(tdcprdp.getPRDMO_CDESC().length());
		bptparm.setCDESC(tdcprdp.getPRDMO_CDESC());
		//bptparm.setDESC(lnrctlpm.getDESC());
		bptparm.setEFF_DATE(20000101);
		bptparm.setEXP_DATE(99991231);
		bptparm.setVAL(objectToByte(3003,tdcprdp));
		bptparm.setUPD_DATE(20200506);
		bptparm.setUPD_BR(888010);
		bptparm.setUPD_TLR("BCELTD2");
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


	public byte[] objectToByte(int size,Tdcprdp tdcprdp) {
		byte[] bytes = new byte[size];
		System.arraycopy(FormatUtils.getForStr(tdcprdp.getPRDMO_CD(),4), 0, bytes, 0, FormatUtils.getForStr(tdcprdp.getPRDMO_CD(),4).length);
		int index = FormatUtils.getForStr(tdcprdp.getPRDMO_CD(),4).length;
		System.arraycopy(FormatUtils.getForStr(tdcprdp.getPART_NUM(),4), 0, bytes, index, FormatUtils.getForStr(tdcprdp.getPART_NUM(),4).length);
		index += FormatUtils.getForStr(tdcprdp.getPART_NUM(),4).length;
		System.arraycopy(FormatUtils.getForStr(tdcprdp.getCASH_FLG(),1), 0, bytes, index, FormatUtils.getForStr(tdcprdp.getCASH_FLG(),1).length);
		index += FormatUtils.getForStr(tdcprdp.getCASH_FLG(),1).length;
		System.arraycopy(FormatUtils.getForStr(tdcprdp.getOTH_FLG(),2), 0, bytes, index, FormatUtils.getForStr(tdcprdp.getOTH_FLG(),2).length);
		index += FormatUtils.getForStr(tdcprdp.getOTH_FLG(),2).length;
		System.arraycopy(FormatUtils.getForStr(tdcprdp.getBV_TYP_DESC(),20), 0, bytes, index, FormatUtils.getForStr(tdcprdp.getBV_TYP_DESC(),20).length);
		index += FormatUtils.getForStr(tdcprdp.getBV_TYP_DESC(),20).length;
		System.arraycopy(FormatUtils.getForStr(tdcprdp.getDRAW_MTH_DESC(),20), 0, bytes, index, FormatUtils.getForStr(tdcprdp.getDRAW_MTH_DESC(),20).length);
		index += FormatUtils.getForStr(tdcprdp.getDRAW_MTH_DESC(),20).length;
		System.arraycopy(FormatUtils.getForStr(tdcprdp.getCROS_CR_LMT(),1), 0, bytes, index, FormatUtils.getForStr(tdcprdp.getCROS_CR_LMT(),1).length);
		index += FormatUtils.getForStr(tdcprdp.getCROS_CR_LMT(),1).length;
		System.arraycopy(FormatUtils.getForStr(tdcprdp.getCROS_DR_LMT(),1), 0, bytes, index, FormatUtils.getForStr(tdcprdp.getCROS_DR_LMT(),1).length);
		index += FormatUtils.getForStr(tdcprdp.getCROS_DR_LMT(),1).length;
		System.arraycopy(FormatUtils.getForStr(tdcprdp.getSTAFF_LMT(),1), 0, bytes, index, FormatUtils.getForStr(tdcprdp.getSTAFF_LMT(),1).length);
		index += FormatUtils.getForStr(tdcprdp.getSTAFF_LMT(),1).length;
		System.arraycopy(FormatUtils.getForStr(tdcprdp.getRESID_LMT(),1), 0, bytes, index, FormatUtils.getForStr(tdcprdp.getRESID_LMT(),1).length);
		index += FormatUtils.getForStr(tdcprdp.getRESID_LMT(),1).length;
		System.arraycopy(FormatUtils.getForStr(tdcprdp.getCUST_TRANS_CTRL(),1), 0, bytes, index, FormatUtils.getForStr(tdcprdp.getCUST_TRANS_CTRL(),1).length);
		index += FormatUtils.getForStr(tdcprdp.getCUST_TRANS_CTRL(),1).length;
		System.arraycopy(FormatUtils.getForStr(tdcprdp.getNON_ORG_CTRL(),1), 0, bytes, index, FormatUtils.getForStr(tdcprdp.getNON_ORG_CTRL(),1).length);
		index += FormatUtils.getForStr(tdcprdp.getNON_ORG_CTRL(),1).length;
		System.arraycopy(FormatUtils.getForStr(tdcprdp.getBUD_FLG(),1), 0, bytes, index, FormatUtils.getForStr(tdcprdp.getBUD_FLG(),1).length);
		index += FormatUtils.getForStr(tdcprdp.getBUD_FLG(),1).length;
		System.arraycopy(FormatUtils.getForStr(tdcprdp.getBUD_PERD(),4), 0, bytes, index, FormatUtils.getForStr(tdcprdp.getBUD_PERD(),4).length);
		index += FormatUtils.getForStr(tdcprdp.getBUD_PERD(),4).length;
		System.arraycopy(FormatUtils.getForStr(tdcprdp.getBUD_DATE(),2), 0, bytes, index, FormatUtils.getForStr(tdcprdp.getBUD_DATE(),2).length);
		index += FormatUtils.getForStr(tdcprdp.getBUD_DATE(),2).length;
		System.arraycopy(FormatUtils.getForStr(tdcprdp.getIRAT_CD(),10), 0, bytes, index, FormatUtils.getForStr(tdcprdp.getIRAT_CD(),10).length);
		index += FormatUtils.getForStr(tdcprdp.getIRAT_CD(),10).length;
		System.arraycopy(FormatUtils.getForStr(TD,2), 0, bytes, index, FormatUtils.getForStr(TD,2).length);
		index += FormatUtils.getForStr(TD,2).length;
		System.arraycopy(FormatUtils.getForStr(tdcprdp.getIRAT_TYP(),1), 0, bytes, index, FormatUtils.getForStr(tdcprdp.getIRAT_TYP(),1).length);
		index += FormatUtils.getForStr(tdcprdp.getIRAT_TYP(),1).length;
		System.arraycopy(FormatUtils.getForStr(TD,12), 0, bytes, index, FormatUtils.getForStr(TD,12).length);
		index += FormatUtils.getForStr(TD,12).length;

		System.arraycopy(FormatUtils.getForStr(tdcprdp.getTAX_WAV_FLG(),1), 0, bytes, index, FormatUtils.getForStr(tdcprdp.getTAX_WAV_FLG(),1).length);
		index += FormatUtils.getForStr(tdcprdp.getTAX_WAV_FLG(),1).length;
		System.arraycopy(FormatUtils.getForStr(tdcprdp.getOVERDUE_INT_FLG(),1), 0, bytes, index, FormatUtils.getForStr(tdcprdp.getOVERDUE_INT_FLG(),1).length);
		index += FormatUtils.getForStr(tdcprdp.getOVERDUE_INT_FLG(),1).length;
		System.arraycopy(FormatUtils.getForStr(tdcprdp.getOFD_IRAT_CD(),10), 0, bytes, index, FormatUtils.getForStr(tdcprdp.getOFD_IRAT_CD(),10).length);
		index += FormatUtils.getForStr(tdcprdp.getOFD_IRAT_CD(),10).length;
		System.arraycopy(FormatUtils.getForStr(tdcprdp.getOFD_IRAT_TYP(),1), 0, bytes, index, FormatUtils.getForStr(tdcprdp.getOFD_IRAT_TYP(),1).length);
		index += FormatUtils.getForStr(tdcprdp.getOFD_IRAT_TYP(),1).length;
		System.arraycopy(FormatUtils.getForStr(tdcprdp.getHOLID_RUL(),1), 0, bytes, index, FormatUtils.getForStr(tdcprdp.getHOLID_RUL(),1).length);
		index += FormatUtils.getForStr(tdcprdp.getHOLID_RUL(),1).length;
		System.arraycopy(FormatUtils.getForStr(tdcprdp.getINSTR_MTH_DESC(),20), 0, bytes, index, FormatUtils.getForStr(tdcprdp.getINSTR_MTH_DESC(),20).length);
		index += FormatUtils.getForStr(tdcprdp.getINSTR_MTH_DESC(),20).length;
		System.arraycopy(FormatUtils.getForStr(tdcprdp.getMDF_FLG(),1), 0, bytes, index, FormatUtils.getForStr(tdcprdp.getMDF_FLG(),1).length);
		index += FormatUtils.getForStr(tdcprdp.getMDF_FLG(),1).length;
		System.arraycopy(FormatUtils.getForStr(TD,35), 0, bytes, index, FormatUtils.getForStr(TD,35).length);
		index += FormatUtils.getForStr(TD,35).length;

		System.arraycopy(FormatUtils.getForStr(tdcprdp.getMIN_TERM(),4), 0, bytes, index, FormatUtils.getForStr(tdcprdp.getMIN_TERM(),4).length);
		index += FormatUtils.getForStr(tdcprdp.getMIN_TERM(),4).length;
		System.arraycopy(FormatUtils.getForStr(tdcprdp.getMAX_TERM(),4), 0, bytes, index, FormatUtils.getForStr(tdcprdp.getMAX_TERM(),4).length);
		index += FormatUtils.getForStr(tdcprdp.getMAX_TERM(),4).length;
		System.arraycopy(FormatUtils.getForStr(TD,8), 0, bytes, index, FormatUtils.getForStr(TD,8).length);
		index += FormatUtils.getForStr(TD,8).length;

		System.arraycopy(FormatUtils.getForStr(tdcprdp.getINT_PERD(),5), 0, bytes, index, FormatUtils.getForStr(tdcprdp.getINT_PERD(),5).length);
		index += FormatUtils.getForStr(tdcprdp.getINT_PERD(),5).length;
		System.arraycopy(FormatUtils.getForStr(tdcprdp.getCCY_TYP(),1), 0, bytes, index, FormatUtils.getForStr(tdcprdp.getCCY_TYP(),1).length);
		index += FormatUtils.getForStr(tdcprdp.getCCY_TYP(),1).length;


		System.arraycopy(FormatUtils.getForStr("LAK",3), 0, bytes, index, FormatUtils.getForStr("LAK",3).length);
		index += FormatUtils.getForStr("LAK",3).length;
		System.arraycopy(FormatUtils.getForStr("0000000100000000",16), 0, bytes, index, FormatUtils.getForStr("0000000100000000",16).length);
		index += FormatUtils.getForStr("0000000100000000",16).length;
		System.arraycopy(FormatUtils.getForStr("0000000100000000",16), 0, bytes, index, FormatUtils.getForStr("0000000100000000",16).length);
		index += FormatUtils.getForStr("0000000100000000",16).length;
		System.arraycopy(FormatUtils.getForStr("00000000000000000000000000000000",32), 0, bytes, index, FormatUtils.getForStr("00000000000000000000000000000000",32).length);
		index += FormatUtils.getForStr("00000000000000000000000000000000",32).length;
		System.arraycopy(FormatUtils.getForStr("       N         Y         ",27), 0, bytes, index, FormatUtils.getForStr("       N         Y         ",27).length);
		index += FormatUtils.getForStr("       N         Y         ",27).length;
		System.arraycopy(FormatUtils.getForStr(tdcprdp.getTERM_T(),1), 0, bytes, index, FormatUtils.getForStr(tdcprdp.getTERM_T(),1).length);
		index += FormatUtils.getForStr(tdcprdp.getTERM_T(),1).length;
		System.arraycopy(FormatUtils.getForStr(tdcprdp.getTERM1(),4), 0, bytes, index, FormatUtils.getForStr(tdcprdp.getTERM1(),4).length);
		index += FormatUtils.getForStr(tdcprdp.getTERM1(),4).length;
		System.arraycopy(FormatUtils.getForStr(TD,25), 0, bytes, index, FormatUtils.getForStr(TD,25).length);
		index += FormatUtils.getForStr(TD,25).length;
		System.arraycopy(FormatUtils.getForStr(tdcprdp.getCALD_FLG(),1), 0, bytes, index, FormatUtils.getForStr(tdcprdp.getCALD_FLG(),1).length);
		index += FormatUtils.getForStr(tdcprdp.getCALD_FLG(),1).length;
		System.arraycopy(FormatUtils.getForStr(TD,16), 0, bytes, index, FormatUtils.getForStr(TD,16).length);
		index += FormatUtils.getForStr(TD,16).length;

		System.arraycopy(FormatUtils.getForStr("USD",3), 0, bytes, index, FormatUtils.getForStr("USD",3).length);
		index += FormatUtils.getForStr("USD",3).length;
		System.arraycopy(FormatUtils.getForStr("0000000000020000",16), 0, bytes, index, FormatUtils.getForStr("0000000000020000",16).length);
		index += FormatUtils.getForStr("0000000000020000",16).length;
		System.arraycopy(FormatUtils.getForStr("0000000000020000",16), 0, bytes, index, FormatUtils.getForStr("0000000000020000",16).length);
		index += FormatUtils.getForStr("0000000000020000",16).length;
		System.arraycopy(FormatUtils.getForStr("00000000000000000000000000000000",32), 0, bytes, index, FormatUtils.getForStr("00000000000000000000000000000000",32).length);
		index += FormatUtils.getForStr("00000000000000000000000000000000",32).length;
		System.arraycopy(FormatUtils.getForStr("       N         Y         ",27), 0, bytes, index, FormatUtils.getForStr("       N         Y         ",27).length);
		index += FormatUtils.getForStr("       N         Y         ",27).length;
		System.arraycopy(FormatUtils.getForStr(tdcprdp.getTERM_T(),1), 0, bytes, index, FormatUtils.getForStr(tdcprdp.getTERM_T(),1).length);
		index += FormatUtils.getForStr(tdcprdp.getTERM_T(),1).length;
		System.arraycopy(FormatUtils.getForStr(tdcprdp.getTERM1(),4), 0, bytes, index, FormatUtils.getForStr(tdcprdp.getTERM1(),4).length);
		index += FormatUtils.getForStr(tdcprdp.getTERM1(),4).length;
		System.arraycopy(FormatUtils.getForStr(TD,25), 0, bytes, index, FormatUtils.getForStr(TD,25).length);
		index += FormatUtils.getForStr(TD,25).length;
		System.arraycopy(FormatUtils.getForStr(tdcprdp.getCALD_FLG(),1), 0, bytes, index, FormatUtils.getForStr(tdcprdp.getCALD_FLG(),1).length);
		index += FormatUtils.getForStr(tdcprdp.getCALD_FLG(),1).length;
		System.arraycopy(FormatUtils.getForStr(TD,16), 0, bytes, index, FormatUtils.getForStr(TD,16).length);
		index += FormatUtils.getForStr(TD,16).length;

		System.arraycopy(FormatUtils.getForStr("THB",3), 0, bytes, index, FormatUtils.getForStr("THB",3).length);
		index += FormatUtils.getForStr("THB",3).length;
		System.arraycopy(FormatUtils.getForStr("0000000000500000",16), 0, bytes, index, FormatUtils.getForStr("0000000000500000",16).length);
		index += FormatUtils.getForStr("0000000000500000",16).length;
		System.arraycopy(FormatUtils.getForStr("0000000000500000",16), 0, bytes, index, FormatUtils.getForStr("0000000000500000",16).length);
		index += FormatUtils.getForStr("0000000000500000",16).length;
		System.arraycopy(FormatUtils.getForStr("00000000000000000000000000000000",32), 0, bytes, index, FormatUtils.getForStr("00000000000000000000000000000000",32).length);
		index += FormatUtils.getForStr("00000000000000000000000000000000",32).length;
		System.arraycopy(FormatUtils.getForStr("       N         Y         ",27), 0, bytes, index, FormatUtils.getForStr("       N         Y         ",27 ).length);
		index += FormatUtils.getForStr("       N         Y         ",27).length;
		System.arraycopy(FormatUtils.getForStr(tdcprdp.getTERM_T(),1), 0, bytes, index, FormatUtils.getForStr(tdcprdp.getTERM_T(),1).length);
		index += FormatUtils.getForStr(tdcprdp.getTERM_T(),1).length;
		System.arraycopy(FormatUtils.getForStr(tdcprdp.getTERM1(),4), 0, bytes, index, FormatUtils.getForStr(tdcprdp.getTERM1(),4).length);
		index += FormatUtils.getForStr(tdcprdp.getTERM1(),4).length;
		System.arraycopy(FormatUtils.getForStr(TD,25), 0, bytes, index, FormatUtils.getForStr(TD,25).length);
		index += FormatUtils.getForStr(TD,25).length;
		System.arraycopy(FormatUtils.getForStr(tdcprdp.getCALD_FLG(),1), 0, bytes, index, FormatUtils.getForStr(tdcprdp.getCALD_FLG(),1).length);
		index += FormatUtils.getForStr(tdcprdp.getCALD_FLG(),1).length;
		System.arraycopy(FormatUtils.getForStr(TD,16), 0, bytes, index, FormatUtils.getForStr(TD,16).length);
		index += FormatUtils.getForStr(TD,16).length;

		System.arraycopy(FormatUtils.getForStr(TD,2397), 0, bytes, index, FormatUtils.getForStr(TD,2397).length);
		index += FormatUtils.getForStr(TD,2397).length;
		System.arraycopy(FormatUtils.getForStr(tdcprdp.getMID_FLG(),1), 0, bytes, index, FormatUtils.getForStr(tdcprdp.getMID_FLG(),1).length);
		index += FormatUtils.getForStr(tdcprdp.getMID_FLG(),1).length;
		System.arraycopy(FormatUtils.getForStr(tdcprdp.getDELA_FLG(),1), 0, bytes, index, FormatUtils.getForStr(tdcprdp.getDELA_FLG(),1).length);
		index += FormatUtils.getForStr(tdcprdp.getDELA_FLG(),1).length;
		System.out.println("总长度：" +index);
		return bytes;
	}
}
