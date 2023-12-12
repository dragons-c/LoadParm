package com.gaoyang.loadparm.controller;

import com.gaoyang.loadparm.entity.*;
import com.gaoyang.loadparm.service.BptparmService;
import com.gaoyang.loadparm.service.BptpdcdService;
import com.gaoyang.loadparm.service.BptpdmeService;
import com.gaoyang.loadparm.utils.ExcelUtils;
import com.gaoyang.loadparm.utils.FormatUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;

@Controller
@RequestMapping("/upload")
public class lnparmController {
	@Autowired
	BptparmService bptparmService;
	@Autowired
	BptpdmeService bptpdmeService;
	@Autowired
	BptpdcdService bptpdcdService;
	private  String LN = " ";
	@RequestMapping("/lnparm")
	@Transactional(rollbackFor = Exception.class)
	public String uploadExcel(MultipartFile fileTest, HttpServletRequest request) throws Exception {
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
		for (int i = 0; i < lists.size(); i++){
			List<Object> list = lists.get(i);
			Lnrctlpm lnrctlpm = new Lnrctlpm();
			if(list.get(0) != null){
				lnrctlpm.setPRODMO((String) list.get(0));
			//	lnrctlpm.setPRODMO("CLDD");
			}
			if(list.get(1) != null){
				lnrctlpm.setDESC((String) list.get(1));
				lnrctlpm.setCDESC((String) list.get(1));
			}
			if(list.get(2) != null){
				if(list.get(2).toString().equals("1") && list.get(2).toString().equals("2") ){
					throw new Exception("产品类型错误");
				}
				lnrctlpm.setPROD_CLASS((String) list.get(2));

			}
			if(list.get(3) != null){
				if(list.get(3).toString().equals("1") && list.get(3).toString().equals("2") && list.get(3).toString().equals("3")){
					throw new Exception("产品分类错误");
				}
				String classed = list.get(3).toString();
				lnrctlpm.setCLASSED((String) list.get(3));
				if(classed.equals("1")) {
					lnrctlpm.setPROJECT_MODEL("CLDD");
					lnrctlpm.setBUSI_TYPE("CLD");
					System.out.println("CLDD");
				}else if (classed.equals("2")){
					lnrctlpm.setPROJECT_MODEL("CLGU");
					lnrctlpm.setBUSI_TYPE("CLM");
					System.out.println("CLGU");
				}else if (classed.equals("3")){
					lnrctlpm.setPROJECT_MODEL("CLDL");
					lnrctlpm.setBUSI_TYPE("CLM");
					System.out.println("CLDL");
				}
			}
			if(list.get(4) != null){
				lnrctlpm.setSUBS_FLG((String) list.get(4));
			}
			if(list.get(5) != null){
				lnrctlpm.setSRC_FLG((String) list.get(5));
			}
			if(list.get(6) != null){
				String str = (String) list.get(6);
				String[] str2 = str.split("&");
				if(str2.length == 1){
					lnrctlpm.setPAY_MTH(str2[0]);
				}else if(str2.length == 2){
					lnrctlpm.setPAY_MTH(str2[0]);
					lnrctlpm.setSCP_PAY_SCH2(str2[1]);
				}else if (str2.length == 3){
					lnrctlpm.setPAY_MTH(str2[0]);
					lnrctlpm.setSCP_PAY_SCH2(str2[1]);
					lnrctlpm.setSCP_PAY_SCH3(str2[2]);
				}else if (str2.length == 4){
					lnrctlpm.setPAY_MTH(str2[0]);
					lnrctlpm.setSCP_PAY_SCH2(str2[1]);
					lnrctlpm.setSCP_PAY_SCH3(str2[2]);
					lnrctlpm.setSCP_PAY_SCH4(str2[3]);
				}
			}
			if(list.get(7) != null){
				lnrctlpm.setINST_MTH((String) list.get(7));
			}
			if(list.get(8) != null){
				lnrctlpm.setPAY_PSEQ_CD1((String) list.get(8));
			}

			if(list.get(9) != null && list.get(9).toString() !=" "){
				lnrctlpm.setCAL_PERD(new BigDecimal((String)list.get(9)) );
			}
			if(list.get(10) != null){
				lnrctlpm.setCAL_PERD_UNIT((String) list.get(10));
			}
			if(list.get(11) != null&& list.get(11) !=" "){
				lnrctlpm.setPRIN_DOG_MTH(new BigDecimal((String)list.get(11)) );
			}
			if(list.get(12) != null){
				lnrctlpm.setPRIN_DOG((String) list.get(12));
			}
			if(list.get(13) != null && list.get(13) !=" "){
				lnrctlpm.setLNDUE_DAY_CNT(new BigDecimal((String)list.get(13)) );
			}
			if(list.get(14) != null){
				lnrctlpm.setAccrual_Type((String) list.get(14));
			}
			if(list.get(15) != null){
				lnrctlpm.setHoliday_Method((String) list.get(15));
			}
			if(list.get(16) != null){
				lnrctlpm.setHoliday_Override((String) list.get(16));
			}
			if(list.get(18) != null){
				lnrctlpm.setPART_PAY_FLG((String) list.get(18));
			}
			if(list.get(23) != null){
				lnrctlpm.setLIMIT_CODE((String) list.get(23));
			}
			if(list.get(24) != null){
				lnrctlpm.setTABLE_FLG((String) list.get(24));
			}
			if(list.get(25) != null){
				lnrctlpm.setCIRCLE_FLG((String) list.get(25));
			}
			if(list.get(26) != null){
				//lnrctlpm.setDICT_TYP((String) list.get(26));
				lnrctlpm.setDICT_TYP("2");
			}
//			if(list.get(27) != null){
//				lnrctlpm.setPROJECT_MODEL((String) list.get(27));
//			}
//			if(list.get(28) != null){
//				lnrctlpm.setBUSI_TYPE((String) list.get(28));
//			}

			lnrctlpm.setSPLT_FLG("Y");
			lnrctlpm.setMRG_FLG("Y");
			lnrctlpm.setRNTL_FLG("N");
			lnrctlpm.setSUBS_FLG("N");
			lnrctlpm.setDEFER_FLG("N");
			lnrctlpm.setCTRT_FLG("N");
			lnrctlpm.setAUTGEN_LMT_FLG("N");
			lnrctlpm.setLMT_FLG("Y");
			if(lnrctlpm.getPROJECT_MODEL().equals("CLDD") || lnrctlpm.getPROJECT_MODEL().equals("CLDL")){
				lnrctlpm.setDRAW_SCHD_FLG("N");
				lnrctlpm.setDRAW_SCHD_MTH("1");
				lnrctlpm.setPART_DRAW_FLG("Y");
				lnrctlpm.setPART_MRG_FLG("Y");
				lnrctlpm.setCMB_INT_MTH("0");
				lnrctlpm.setCMB_PLN_MTH("3");
				lnrctlpm.setMIN_WHD_AMT(new BigDecimal("0000000000000000"));
				lnrctlpm.setDUE_WHD_MTH("2");
				lnrctlpm.setAUTO_WHD_PERD(new BigDecimal("0000"));
				lnrctlpm.setAUTO_WHD_MTH("0");
				lnrctlpm.setPAY_SEQ_MSK1("100000000");
				lnrctlpm.setPAY_SEQ_MSK2("000000000");
				lnrctlpm.setPAY_SEQ_MSK3("000000000");
				lnrctlpm.setREPY_PRTY(new BigDecimal("1"));
				lnrctlpm.setSPRD_REPY_FLG("N");
				lnrctlpm.setRMI_INT_FLG("Y");
				lnrctlpm.setPI_RMI_MTH("Y");
				lnrctlpm.setSTRK_BAL_MTH("1");
				lnrctlpm.setPRE_PAY_FLG("Y");
				lnrctlpm.setMIN_PRPY_AMT(new BigDecimal("0000000000000000"));
				lnrctlpm.setMAX_PRPY_CNT(new BigDecimal("0000"));
				lnrctlpm.setFST_PRPY_TERM(new BigDecimal("0000"));
				lnrctlpm.setPRPY_PTPL_MTH("1");
				lnrctlpm.setPRPY_INT_MTH("3");
				lnrctlpm.setFUL_PAY_FLG("Y");
				lnrctlpm.setFULPAY_INT_MTH("1");
				lnrctlpm.setPEN_RUL_FLG("Y");
				lnrctlpm.setPEN_FLG("Y");
				lnrctlpm.setINST_RBD_MTH("1");
				lnrctlpm.setCPT_PLN_MTH("1");
				lnrctlpm.setINST_RST_RUL("1");
				lnrctlpm.setFST_INST_MTH("1");
				lnrctlpm.setINST_CEL_RAT(new BigDecimal("000000000000"));
				lnrctlpm.setINST_FLR_RAT(new BigDecimal("000000000000"));
				lnrctlpm.setLOAN_CAL_PERD_FLG("Y");
				lnrctlpm.setCAL_PERD(new BigDecimal("00001"));
				lnrctlpm.setCAL_PERD_UNIT("M");
				lnrctlpm.setINCR_PERD(new BigDecimal("0000"));
				lnrctlpm.setCINT_RUL("TERMLON");
				lnrctlpm.setMTR_INT_MTH("Y");
				lnrctlpm.setRND_MTH("2");
				lnrctlpm.setP_HOL_MTH("1");
				lnrctlpm.setI_HOL_MTH("1");
				lnrctlpm.setPRIN_DOG_MTH(new BigDecimal("1"));
				lnrctlpm.setPRIN_DOG("00029");
				lnrctlpm.setINT_DOG_MTH("1");
				lnrctlpm.setINT_DOG(new BigDecimal("00000"));
				lnrctlpm.setIRAT_SET_FLG("Y");
				lnrctlpm.setIRAT_VALDT_ID("1");
				lnrctlpm.setIRAT_RLT_MTH("A");
				lnrctlpm.setFLT_PERD(new BigDecimal("0000"));
				lnrctlpm.setCAPT_FLG("Y");
				lnrctlpm.setCAP_FLG("Y");
				lnrctlpm.setCAP_PERD(new BigDecimal("0000"));
				lnrctlpm.setBUD_FLG("Y");
				lnrctlpm.setBUD_PERD("D");
				lnrctlpm.setBUD_MTH("1");
				lnrctlpm.setINT_DAYS(new BigDecimal("360"));
				lnrctlpm.setRLT_FLG("N");
				lnrctlpm.setDRAW_DAY_CNT(new BigDecimal("000000"));
				lnrctlpm.setLNDUE_DAY_CNT(new BigDecimal("000007"));
				lnrctlpm.setAccrual_Type("F");
				lnrctlpm.setHoliday_Method("N");
				lnrctlpm.setHoliday_Override("Y");
				lnrctlpm.setPROD_CLASS("1");
				lnrctlpm.setCOMMIT_FLG("N");
				lnrctlpm.setSRC_FLG("N");
				lnrctlpm.setPART_PAY_FLG("Y");
				lnrctlpm.setTAX_PCT(new BigDecimal("00000"));
				lnrctlpm.setADVANCE_DAY(new BigDecimal("000"));
                lnrctlpm.setIOVD_TYP("2");
//                if(lnrctlpm.getPROJECT_MODEL().equals("CLDD")){
//                	lnrctlpm.setSC_INS_METH2("2");
//                	lnrctlpm.setSC_INS_METH3("3");
//				}
			}
			System.out.println("第"+ i + "条数据");
			saveParm(lnrctlpm);
			saveBptpdme(lnrctlpm);
			saveBptpdcd(lnrctlpm);
		}

		return "success";
	}
	public void saveBptpdme(Lnrctlpm lnrctlpm){
         Bptpdme bptpdme = new Bptpdme();
         bptpdme.setPRDT_CODE(lnrctlpm.getPRODMO());
         bptpdme.setPRDT_NAME(lnrctlpm.getCDESC());
         bptpdme.setBUSI_TYPE(lnrctlpm.getBUSI_TYPE());
         bptpdme.setPRDT_MODEL(lnrctlpm.getPROJECT_MODEL());
	    	bptpdme.setPRDT_IND("0");
         bptpdme.setEFF_DATE(new BigDecimal("20000101"));
         bptpdme.setEXP_DATE(new BigDecimal("99991231"));
         bptpdme.setSTOP_SOLD_DATE(new BigDecimal("99991231"));
         bptpdme.setPARM_CODE(lnrctlpm.getPRODMO());
         bptpdme.setLAST_TLT("BCELLN2");
		Bptpdme bptpdme2 = bptpdmeService.find(bptpdme.getPRDT_CODE());
		if(bptpdme2 == null){
			bptpdmeService.add(bptpdme);
		}else{
			bptpdmeService.update(bptpdme);
		}
	}
	public void saveBptpdcd(Lnrctlpm lnrctlpm){
		Bptpdcd bptpdcd = new Bptpdcd();
		bptpdcd.setPRDT_CODE(lnrctlpm.getPRODMO());
	//	if(lnrctlpm.getPROD_CLASS().substring(0,1).equals("2")){
			bptpdcd.setCUS_PER_FLG("1");
	//	}else{
			bptpdcd.setCUS_COM_FLG("1");
			bptpdcd.setCUS_FIN_FLG("1");
	//	}
		Bptpdcd bptpdcd2 = bptpdcdService.find(bptpdcd.getPRDT_CODE());
		if (bptpdcd2 == null){
			bptpdcdService.add(bptpdcd);
		}else{
			bptpdcdService.update(bptpdcd);
		}
	}
	public void saveParm(Lnrctlpm lnrctlpm){
		Bptparm bptparm = new Bptparm();
		BptparmKey bptparmKey = new BptparmKey();
		bptparm.setTYPE("PRDPR");
		bptparm.setCODE("999999"+lnrctlpm.getPRODMO());
		bptparm.setCDESC(lnrctlpm.getCDESC());
		//bptparm.setDESC(lnrctlpm.getDESC());
		bptparm.setEFF_DATE(20000101);
		bptparm.setEXP_DATE(99991231);
		bptparm.setVAL(objectToByte(637,lnrctlpm));
		bptparm.setUPD_DATE(20200506);
		bptparm.setUPD_BR(888010);
		bptparm.setUPD_TLR("BCELLN2");
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

	public byte[] objectToByte(int size,Lnrctlpm lnrctlpm){
		byte[] bytes = new byte[size];
		if(lnrctlpm.getPRODMO() == null){ lnrctlpm.setPRODMO(" "); }
	//	if(lnrctlpm.getCCY() == null){ lnrctlpm.setCCY(" "); }
		if(lnrctlpm.getHOL_TBL_NO() == null){ lnrctlpm.setHOL_TBL_NO(" "); }
		if(lnrctlpm.getSPLT_FLG() == null){ lnrctlpm.setSPLT_FLG(" "); }
		if(lnrctlpm.getMRG_FLG() == null){ lnrctlpm.setMRG_FLG(" "); }
		if(lnrctlpm.getRNTL_FLG() == null){ lnrctlpm.setRNTL_FLG(" "); }
		if(lnrctlpm.getSUBS_FLG() == null){ lnrctlpm.setSUBS_FLG(" "); }
		if(lnrctlpm.getREDRW_FLG() == null){ lnrctlpm.setREDRW_FLG(" "); }
		if(lnrctlpm.getDEFER_FLG() == null){ lnrctlpm.setDEFER_FLG(" "); }
		if(lnrctlpm.getCTRT_FLG() == null){ lnrctlpm.setCTRT_FLG(" "); }
		if(lnrctlpm.getAUTGEN_LMT_FLG() == null){ lnrctlpm.setAUTGEN_LMT_FLG(" "); }
		if(lnrctlpm.getLMT_FLG() == null){ lnrctlpm.setLMT_FLG(" "); }
		if(lnrctlpm.getITM_IDX_CD1() == null){ lnrctlpm.setITM_IDX_CD1(" "); }
		if(lnrctlpm.getITM_IDX_MSK1() == null){ lnrctlpm.setITM_IDX_MSK1(" "); }
		if(lnrctlpm.getITM_IDX_CD2() == null){ lnrctlpm.setITM_IDX_CD2(" "); }
		if(lnrctlpm.getITM_IDX_MSK2() == null){ lnrctlpm.setITM_IDX_MSK2(" "); }
		if(lnrctlpm.getITM_IDX_CD3() == null){ lnrctlpm.setITM_IDX_CD3(" "); }
		if(lnrctlpm.getITM_IDX_MSK3() == null){ lnrctlpm.setITM_IDX_MSK3(" "); }
		if(lnrctlpm.getITM_IDX_CD4() == null){ lnrctlpm.setITM_IDX_CD4(" "); }
		if(lnrctlpm.getITM_IDX_MSK4() == null){ lnrctlpm.setITM_IDX_MSK4(" "); }
		if(lnrctlpm.getITM_IDX_CD5() == null){ lnrctlpm.setITM_IDX_CD5(" "); }
		if(lnrctlpm.getITM_IDX_MSK5() == null){ lnrctlpm.setITM_IDX_MSK5(" "); }
		if(lnrctlpm.getDRAW_SCHD_FLG() == null){ lnrctlpm.setDRAW_SCHD_FLG(" "); }
		if(lnrctlpm.getDRAW_SCHD_MTH() == null){ lnrctlpm.setDRAW_SCHD_MTH(" "); }
		if(lnrctlpm.getPART_DRAW_FLG() == null){ lnrctlpm.setPART_DRAW_FLG(" "); }
		if(lnrctlpm.getPART_MRG_FLG() == null){ lnrctlpm.setPART_MRG_FLG(" "); }
		if(lnrctlpm.getCMB_INT_MTH() == null){ lnrctlpm.setCMB_INT_MTH(" "); }
		if(lnrctlpm.getCMB_PLN_MTH() == null){ lnrctlpm.setCMB_PLN_MTH(" "); }
		if(lnrctlpm.getMIN_WHD_AMT() == null){ lnrctlpm.setMIN_WHD_AMT(BigDecimal.ZERO); }
		if(lnrctlpm.getDUE_WHD_MTH() == null){ lnrctlpm.setDUE_WHD_MTH(" "); }
		if(lnrctlpm.getAUTO_WHD_PERD() == null){ lnrctlpm.setAUTO_WHD_PERD(BigDecimal.ZERO); }
		if(lnrctlpm.getAUTO_WHD_MTH() == null){ lnrctlpm.setAUTO_WHD_MTH(" "); }
		if(lnrctlpm.getPAY_MTH() == null){ lnrctlpm.setPAY_MTH(" "); }
		if(lnrctlpm.getINST_MTH() == null){ lnrctlpm.setINST_MTH(" "); }
		if(lnrctlpm.getPAY_PSEQ_CD1() == null){ lnrctlpm.setPAY_PSEQ_CD1(" "); }
		if(lnrctlpm.getPAY_SEQ_MSK1() == null){ lnrctlpm.setPAY_SEQ_MSK1(" "); }
		if(lnrctlpm.getPAY_PSEQ_CD2() == null){ lnrctlpm.setPAY_PSEQ_CD2(" "); }
		if(lnrctlpm.getPAY_SEQ_MSK2() == null){ lnrctlpm.setPAY_SEQ_MSK2(" "); }
		if(lnrctlpm.getPAY_PSEQ_CD3() == null){ lnrctlpm.setPAY_PSEQ_CD3(" "); }
		if(lnrctlpm.getPAY_SEQ_MSK3() == null){ lnrctlpm.setPAY_SEQ_MSK3(" "); }
		if(lnrctlpm.getREPY_PRTY() == null){ lnrctlpm.setREPY_PRTY(BigDecimal.ZERO); }
		if(lnrctlpm.getSPRD_REPY_FLG() == null){ lnrctlpm.setSPRD_REPY_FLG(" "); }
		if(lnrctlpm.getRMI_INT_FLG() == null){ lnrctlpm.setRMI_INT_FLG(" "); }
		if(lnrctlpm.getPI_RMI_MTH() == null){ lnrctlpm.setPI_RMI_MTH(" "); }
		if(lnrctlpm.getSTRK_BAL_MTH() == null){ lnrctlpm.setSTRK_BAL_MTH(" "); }
		if(lnrctlpm.getPRE_PAY_FLG() == null){ lnrctlpm.setPRE_PAY_FLG(" "); }
		if(lnrctlpm.getMIN_PRPY_AMT() == null){ lnrctlpm.setMIN_PRPY_AMT(BigDecimal.ZERO); }
		if(lnrctlpm.getMAX_PRPY_CNT() == null){ lnrctlpm.setMAX_PRPY_CNT(BigDecimal.ZERO); }
		if(lnrctlpm.getFST_PRPY_TERM() == null){ lnrctlpm.setFST_PRPY_TERM(BigDecimal.ZERO); }
		if(lnrctlpm.getIOVD_TYP() == null){ lnrctlpm.setIOVD_TYP(" "); }
		if(lnrctlpm.getPRPY_PTPL_MTH() == null){ lnrctlpm.setPRPY_PTPL_MTH(" "); }
		if(lnrctlpm.getPRPY_INT_MTH() == null){ lnrctlpm.setPRPY_INT_MTH(" "); }
		if(lnrctlpm.getFUL_PAY_FLG() == null){ lnrctlpm.setFUL_PAY_FLG(" "); }
		if(lnrctlpm.getFULPAY_INT_MTH() == null){ lnrctlpm.setFULPAY_INT_MTH(" "); }
		if(lnrctlpm.getPEN_RUL_FLG() == null){ lnrctlpm.setPEN_RUL_FLG(" "); }
		if(lnrctlpm.getPEN_FLG() == null){ lnrctlpm.setPEN_FLG(" "); }
		if(lnrctlpm.getPEN_RUL() == null){ lnrctlpm.setPEN_RUL(" "); }
		if(lnrctlpm.getINST_RBD_MTH() == null){ lnrctlpm.setINST_RBD_MTH(" "); }
		if(lnrctlpm.getCPT_PLN_MTH() == null){ lnrctlpm.setCPT_PLN_MTH(" "); }
		if(lnrctlpm.getINST_RST_RUL() == null){ lnrctlpm.setINST_RST_RUL(" "); }
		if(lnrctlpm.getFST_INST_MTH() == null){ lnrctlpm.setFST_INST_MTH(" "); }
		if(lnrctlpm.getINST_CEL_RAT() == null){ lnrctlpm.setINST_CEL_RAT(BigDecimal.ZERO); }
		if(lnrctlpm.getINST_FLR_RAT() == null){ lnrctlpm.setINST_FLR_RAT(BigDecimal.ZERO); }
		if(lnrctlpm.getLOAN_CAL_PERD_FLG() == null){ lnrctlpm.setLOAN_CAL_PERD_FLG(" "); }
		if(lnrctlpm.getCAL_PERD() == null){ lnrctlpm.setCAL_PERD(BigDecimal.ZERO); }
		if(lnrctlpm.getCAL_PERD_UNIT() == null){ lnrctlpm.setCAL_PERD_UNIT(" "); }
		if(lnrctlpm.getINCR_PERD() == null){ lnrctlpm.setINCR_PERD(BigDecimal.ZERO); }
		if(lnrctlpm.getCINT_RUL() == null){ lnrctlpm.setCINT_RUL(" "); }
		if(lnrctlpm.getMTR_INT_MTH() == null){ lnrctlpm.setMTR_INT_MTH(" "); }
		if(lnrctlpm.getRND_MTH() == null){ lnrctlpm.setRND_MTH(" "); }
		if(lnrctlpm.getP_HOL_MTH() == null){ lnrctlpm.setP_HOL_MTH(" "); }
		if(lnrctlpm.getI_HOL_MTH() == null){ lnrctlpm.setI_HOL_MTH(" "); }
		if(lnrctlpm.getPRIN_DOG_MTH() == null){ lnrctlpm.setPRIN_DOG_MTH(BigDecimal.ZERO); }
		if(lnrctlpm.getPRIN_DOG() == null){ lnrctlpm.setPRIN_DOG(" "); }
		if(lnrctlpm.getINT_DOG_MTH() == null){ lnrctlpm.setINT_DOG_MTH(" "); }
		if(lnrctlpm.getINT_DOG() == null){ lnrctlpm.setINT_DOG(BigDecimal.ZERO); }
		if(lnrctlpm.getIRAT_SET_FLG() == null){ lnrctlpm.setIRAT_SET_FLG(" "); }
		if(lnrctlpm.getIRAT_CD() == null){ lnrctlpm.setIRAT_CD(" "); }
		if(lnrctlpm.getIRAT_VALDT_ID() == null){ lnrctlpm.setIRAT_VALDT_ID(" "); }
		if(lnrctlpm.getIRAT_RLT_MTH() == null){ lnrctlpm.setIRAT_RLT_MTH(" "); }
		if(lnrctlpm.getFLT_MTH() == null){ lnrctlpm.setFLT_MTH(" "); }
		if(lnrctlpm.getFLT_PERD() == null){ lnrctlpm.setFLT_PERD(BigDecimal.ZERO); }
		if(lnrctlpm.getFLT_PERD_UNIT() == null){ lnrctlpm.setFLT_PERD_UNIT(" "); }
		if(lnrctlpm.getCAPT_FLG() == null){ lnrctlpm.setCAPT_FLG(" "); }
		if(lnrctlpm.getCAP_FLG() == null){ lnrctlpm.setCAP_FLG(" "); }
		if(lnrctlpm.getCAP_PERD() == null){ lnrctlpm.setCAP_PERD(BigDecimal.ZERO); }
		if(lnrctlpm.getBUD_FLG() == null){ lnrctlpm.setBUD_FLG(" "); }
		if(lnrctlpm.getBUD_PERD() == null){ lnrctlpm.setBUD_PERD(" "); }
		if(lnrctlpm.getBUD_MTH() == null){ lnrctlpm.setBUD_MTH(" "); }
		if(lnrctlpm.getINT_DAYS() == null){ lnrctlpm.setINT_DAYS(BigDecimal.ZERO); }
		if(lnrctlpm.getRLT_FLG() == null){ lnrctlpm.setRLT_FLG(" "); }
		if(lnrctlpm.getDRAW_DAY_CNT() == null){ lnrctlpm.setDRAW_DAY_CNT(BigDecimal.ZERO); }
		if(lnrctlpm.getLNDUE_DAY_CNT() == null){ lnrctlpm.setLNDUE_DAY_CNT(BigDecimal.ZERO); }
		if(lnrctlpm.getCLASSED() == null){ lnrctlpm.setCLASSED(" "); }
		if(lnrctlpm.getCommit_Flag() == null){ lnrctlpm.setCommit_Flag(" "); }
		if(lnrctlpm.getCommit_Type() == null){ lnrctlpm.setCommit_Type(" "); }
		if(lnrctlpm.getAccrual_Type() == null){ lnrctlpm.setAccrual_Type(" "); }
		if(lnrctlpm.getHoliday_Method() == null){ lnrctlpm.setHoliday_Method(" "); }
		if(lnrctlpm.getHoliday_Override() == null){ lnrctlpm.setHoliday_Override(" "); }
		if(lnrctlpm.getPROD_CLASS() == null){ lnrctlpm.setPROD_CLASS(" "); }
		if(lnrctlpm.getCOMMIT_FLG() == null){ lnrctlpm.setCOMMIT_FLG(" "); }
		if(lnrctlpm.getSCP_PAY_SCH2() == null){ lnrctlpm.setSCP_PAY_SCH2(" "); }
		if(lnrctlpm.getSCP_PAY_SCH3() == null){ lnrctlpm.setSCP_PAY_SCH3(" "); }
		if(lnrctlpm.getSCP_PAY_SCH4() == null){ lnrctlpm.setSCP_PAY_SCH4(" "); }
		if(lnrctlpm.getSC_INS_METH2() == null){ lnrctlpm.setSC_INS_METH2(" "); }
		if(lnrctlpm.getSC_INS_METH3() == null){ lnrctlpm.setSC_INS_METH3(" "); }
		if(lnrctlpm.getSRC_FLG() == null){ lnrctlpm.setSRC_FLG(" "); }
		if(lnrctlpm.getLNAC_FLG() == null){ lnrctlpm.setLNAC_FLG(" "); }
		if(lnrctlpm.getPART_PAY_FLG() == null){ lnrctlpm.setPART_PAY_FLG(" "); }
		if(lnrctlpm.getOD_PAY_FLG() == null){ lnrctlpm.setOD_PAY_FLG(" "); }
		if(lnrctlpm.getPENALTY_FLG() == null){ lnrctlpm.setPENALTY_FLG(" "); }
		if(lnrctlpm.getCALR_STD() == null){ lnrctlpm.setCALR_STD(" "); }
		if(lnrctlpm.getREF_CTY_CODE_INF() == null){ lnrctlpm.setREF_CTY_CODE_INF(" "); }
		if(lnrctlpm.getCARRY_FLAG() == null){ lnrctlpm.setCARRY_FLAG(" "); }
		if(lnrctlpm.getDEC_DIGITS() == null){ lnrctlpm.setDEC_DIGITS(" "); }
		if(lnrctlpm.getTR_FLG() == null){ lnrctlpm.setTR_FLG(" "); }
		if(lnrctlpm.getTAX_PCT() == null){ lnrctlpm.setTAX_PCT(BigDecimal.ZERO); }
		if(lnrctlpm.getADVANCE_DAY() == null){ lnrctlpm.setADVANCE_DAY(BigDecimal.ZERO); }
		if(lnrctlpm.getHOL_CAL_MTH() == null){ lnrctlpm.setHOL_CAL_MTH(" "); }
		if(lnrctlpm.getAC_TYPE() == null){ lnrctlpm.setAC_TYPE(" "); }
		if(lnrctlpm.getDICT_TYP() == null){ lnrctlpm.setDICT_TYP(" "); }
		if(lnrctlpm.getGROUP_TYP() == null){ lnrctlpm.setGROUP_TYP(" "); }
//		if(lnrctlpm.getGROUP() == null){ lnrctlpm.setGROUP(" "); }
//		if(lnrctlpm.getCI_BASE() == null){ lnrctlpm.setCI_BASE(" "); }
//		if(lnrctlpm.getFLOAT_MTH() == null){ lnrctlpm.setFLOAT_MTH(" "); }
//		if(lnrctlpm.getADD_RAT() == null){ lnrctlpm.setADD_RAT(" "); }
//		if(lnrctlpm.getINT_PER() == null){ lnrctlpm.setINT_PER(" "); }

		System.arraycopy(FormatUtils.getForStr(lnrctlpm.getPROJECT_MODEL(),4), 0, bytes, 0, FormatUtils.getForStr(lnrctlpm.getPROJECT_MODEL(),4).length);
		int index = FormatUtils.getForStr(lnrctlpm.getPROJECT_MODEL(),4).length;
		System.arraycopy(FormatUtils.getForStr("999",3), 0, bytes, index, FormatUtils.getForStr("999",3).length);
		index += FormatUtils.getForStr("999",3).length;
		System.arraycopy(FormatUtils.formatBytes(lnrctlpm.getCCY(),27), 0, bytes, index, FormatUtils.formatBytes(lnrctlpm.getCCY(),27).length);
		index += FormatUtils.formatBytes(lnrctlpm.getCCY(),27).length;

		System.arraycopy(FormatUtils.getForStr(lnrctlpm.getHOL_TBL_NO(),4), 0, bytes, index, FormatUtils.getForStr(lnrctlpm.getHOL_TBL_NO(),4).length);
		index += FormatUtils.getForStr(lnrctlpm.getHOL_TBL_NO(),4).length;
		System.arraycopy(FormatUtils.getForStr(lnrctlpm.getSPLT_FLG(),1), 0, bytes, index, FormatUtils.getForStr(lnrctlpm.getSPLT_FLG(),1).length);
		index += FormatUtils.getForStr(lnrctlpm.getSPLT_FLG(),1).length;
		System.arraycopy(FormatUtils.getForStr(lnrctlpm.getMRG_FLG(),1), 0, bytes, index, FormatUtils.getForStr(lnrctlpm.getMRG_FLG(),1).length);
		index += FormatUtils.getForStr(lnrctlpm.getMRG_FLG(),1).length;
		System.arraycopy(FormatUtils.getForStr(lnrctlpm.getRNTL_FLG(),1), 0, bytes, index, FormatUtils.getForStr(lnrctlpm.getRNTL_FLG(),1).length);
		index += FormatUtils.getForStr(lnrctlpm.getRNTL_FLG(),1).length;
		System.arraycopy(FormatUtils.getForStr(lnrctlpm.getSUBS_FLG(),1), 0, bytes, index, FormatUtils.getForStr(lnrctlpm.getSUBS_FLG(),1).length);
		index += FormatUtils.getForStr(lnrctlpm.getSUBS_FLG(),1).length;
		System.arraycopy(FormatUtils.getForStr(lnrctlpm.getREDRW_FLG(),1), 0, bytes, index, FormatUtils.getForStr(lnrctlpm.getREDRW_FLG(),1).length);
		index += FormatUtils.getForStr(lnrctlpm.getREDRW_FLG(),1).length;
		System.arraycopy(FormatUtils.getForStr(lnrctlpm.getDEFER_FLG(),1), 0, bytes, index, FormatUtils.getForStr(lnrctlpm.getDEFER_FLG(),1).length);
		index += FormatUtils.getForStr(lnrctlpm.getDEFER_FLG(),1).length;
		System.arraycopy(FormatUtils.getForStr(lnrctlpm.getCTRT_FLG(),1), 0, bytes, index, FormatUtils.getForStr(lnrctlpm.getCTRT_FLG(),1).length);
		index += FormatUtils.getForStr(lnrctlpm.getCTRT_FLG(),1).length;
		System.arraycopy(FormatUtils.getForStr(lnrctlpm.getAUTGEN_LMT_FLG(),1), 0, bytes, index, FormatUtils.getForStr(lnrctlpm.getAUTGEN_LMT_FLG(),1).length);
		index += FormatUtils.getForStr(lnrctlpm.getAUTGEN_LMT_FLG(),1).length;
		System.arraycopy(FormatUtils.getForStr(lnrctlpm.getLMT_FLG(),1), 0, bytes, index, FormatUtils.getForStr(lnrctlpm.getLMT_FLG(),1).length);
		index += FormatUtils.getForStr(lnrctlpm.getLMT_FLG(),1).length;
		System.arraycopy(FormatUtils.getForStr(lnrctlpm.getITM_IDX_CD1(),7), 0, bytes, index, FormatUtils.getForStr(lnrctlpm.getITM_IDX_CD1(),7).length);
		index += FormatUtils.getForStr(lnrctlpm.getITM_IDX_CD1(),7).length;
		System.arraycopy(FormatUtils.getForStr(lnrctlpm.getITM_IDX_MSK1(),9), 0, bytes, index, FormatUtils.getForStr(lnrctlpm.getITM_IDX_MSK1(),9).length);
		index += FormatUtils.getForStr(lnrctlpm.getITM_IDX_MSK1(),9).length;
		System.arraycopy(FormatUtils.getForStr(lnrctlpm.getITM_IDX_CD2(),7), 0, bytes, index, FormatUtils.getForStr(lnrctlpm.getITM_IDX_CD2(),7).length);
		index += FormatUtils.getForStr(lnrctlpm.getITM_IDX_CD2(),7).length;
		System.arraycopy(FormatUtils.getForStr(lnrctlpm.getITM_IDX_MSK2(),9), 0, bytes, index, FormatUtils.getForStr(lnrctlpm.getITM_IDX_MSK2(),9).length);
		index += FormatUtils.getForStr(lnrctlpm.getITM_IDX_MSK2(),9).length;
		System.arraycopy(FormatUtils.getForStr(lnrctlpm.getITM_IDX_CD3(),7), 0, bytes, index, FormatUtils.getForStr(lnrctlpm.getITM_IDX_CD3(),7).length);
		index += FormatUtils.getForStr(lnrctlpm.getITM_IDX_CD3(),7).length;
		System.arraycopy(FormatUtils.getForStr(lnrctlpm.getITM_IDX_MSK3(),9), 0, bytes, index, FormatUtils.getForStr(lnrctlpm.getITM_IDX_MSK3(),9).length);
		index += FormatUtils.getForStr(lnrctlpm.getITM_IDX_MSK3(),9).length;
		System.arraycopy(FormatUtils.getForStr(lnrctlpm.getITM_IDX_CD4(),7), 0, bytes, index, FormatUtils.getForStr(lnrctlpm.getITM_IDX_CD4(),7).length);
		index += FormatUtils.getForStr(lnrctlpm.getITM_IDX_CD4(),7).length;
		System.arraycopy(FormatUtils.getForStr(lnrctlpm.getITM_IDX_MSK4(),9), 0, bytes, index, FormatUtils.getForStr(lnrctlpm.getITM_IDX_MSK4(),9).length);
		index += FormatUtils.getForStr(lnrctlpm.getITM_IDX_MSK4(),9).length;
		System.arraycopy(FormatUtils.getForStr(lnrctlpm.getITM_IDX_CD5(),7), 0, bytes, index, FormatUtils.getForStr(lnrctlpm.getITM_IDX_CD5(),7).length);
		index += FormatUtils.getForStr(lnrctlpm.getITM_IDX_CD5(),7).length;
		System.arraycopy(FormatUtils.getForStr(lnrctlpm.getITM_IDX_MSK5(),9), 0, bytes, index, FormatUtils.getForStr(lnrctlpm.getITM_IDX_MSK5(),9).length);
		index += FormatUtils.getForStr(lnrctlpm.getITM_IDX_MSK5(),9).length;
		System.arraycopy(FormatUtils.getForStr(lnrctlpm.getDRAW_SCHD_FLG(),1), 0, bytes, index, FormatUtils.getForStr(lnrctlpm.getDRAW_SCHD_FLG(),1).length);
		index += FormatUtils.getForStr(lnrctlpm.getDRAW_SCHD_FLG(),1).length;
		System.arraycopy(FormatUtils.getForStr(lnrctlpm.getDRAW_SCHD_MTH(),1), 0, bytes, index, FormatUtils.getForStr(lnrctlpm.getDRAW_SCHD_MTH(),1).length);
		index += FormatUtils.getForStr(lnrctlpm.getDRAW_SCHD_MTH(),1).length;
		System.arraycopy(FormatUtils.getForStr(lnrctlpm.getPART_DRAW_FLG(),1), 0, bytes, index, FormatUtils.getForStr(lnrctlpm.getPART_DRAW_FLG(),1).length);
		index += FormatUtils.getForStr(lnrctlpm.getPART_DRAW_FLG(),1).length;
		System.arraycopy(FormatUtils.getForStr(lnrctlpm.getPART_MRG_FLG(),1), 0, bytes, index, FormatUtils.getForStr(lnrctlpm.getPART_MRG_FLG(),1).length);
		index += FormatUtils.getForStr(lnrctlpm.getPART_MRG_FLG(),1).length;
		System.arraycopy(FormatUtils.getForStr(lnrctlpm.getCMB_INT_MTH(),1), 0, bytes, index, FormatUtils.getForStr(lnrctlpm.getCMB_INT_MTH(),1).length);
		index += FormatUtils.getForStr(lnrctlpm.getCMB_INT_MTH(),1).length;
		System.arraycopy(FormatUtils.getForStr(lnrctlpm.getCMB_PLN_MTH(),1), 0, bytes, index, FormatUtils.getForStr(lnrctlpm.getCMB_PLN_MTH(),1).length);
		index += FormatUtils.getForStr(lnrctlpm.getCMB_PLN_MTH(),1).length;
		//System.arraycopy(FormatUtils.intToStr(lnrctlpm.getMIN_WHD_AMT(),16), 0, bytes, index, FormatUtils.intToStr(lnrctlpm.getMIN_WHD_AMT(),16).length);
		//index += FormatUtils.intToStr(lnrctlpm.getMIN_WHD_AMT(),16).length;
		System.arraycopy(FormatUtils.getForStr("0000000000000000",16), 0, bytes, index, FormatUtils.getForStr("0000000000000000",16).length);
		index += FormatUtils.getForStr("0000000000000000",16).length;
		System.arraycopy(FormatUtils.getForStr(lnrctlpm.getDUE_WHD_MTH(),1), 0, bytes, index, FormatUtils.getForStr(lnrctlpm.getDUE_WHD_MTH(),1).length);
		index += FormatUtils.getForStr(lnrctlpm.getDUE_WHD_MTH(),1).length;
//		System.arraycopy(FormatUtils.intToStr(lnrctlpm.getAUTO_WHD_PERD(),4), 0, bytes, index, FormatUtils.intToStr(lnrctlpm.getAUTO_WHD_PERD(),4).length);
////		index += FormatUtils.intToStr(lnrctlpm.getAUTO_WHD_PERD(),4).length;
		System.arraycopy(FormatUtils.getForStr("0000",4), 0, bytes, index, FormatUtils.getForStr("0000",4).length);
		index += FormatUtils.getForStr("0000",4).length;
		System.arraycopy(FormatUtils.getForStr(lnrctlpm.getAUTO_WHD_MTH(),1), 0, bytes, index, FormatUtils.getForStr(lnrctlpm.getAUTO_WHD_MTH(),1).length);
		index += FormatUtils.getForStr(lnrctlpm.getAUTO_WHD_MTH(),1).length;
		System.arraycopy(FormatUtils.getForStr(lnrctlpm.getPAY_MTH(),1), 0, bytes, index, FormatUtils.getForStr(lnrctlpm.getPAY_MTH(),1).length);
		index += FormatUtils.getForStr(lnrctlpm.getPAY_MTH(),1).length;
		System.arraycopy(FormatUtils.getForStr(lnrctlpm.getINST_MTH(),1), 0, bytes, index, FormatUtils.getForStr(lnrctlpm.getINST_MTH(),1).length);
		index += FormatUtils.getForStr(lnrctlpm.getINST_MTH(),1).length;
		System.arraycopy(FormatUtils.getForStr(lnrctlpm.getPAY_PSEQ_CD1(),7), 0, bytes, index, FormatUtils.getForStr(lnrctlpm.getPAY_PSEQ_CD1(),7).length);
		index += FormatUtils.getForStr(lnrctlpm.getPAY_PSEQ_CD1(),7).length;
		System.arraycopy(FormatUtils.getForStr(lnrctlpm.getPAY_SEQ_MSK1(),9), 0, bytes, index, FormatUtils.getForStr(lnrctlpm.getPAY_SEQ_MSK1(),9).length);
		index += FormatUtils.getForStr(lnrctlpm.getPAY_SEQ_MSK1(),9).length;
		System.arraycopy(FormatUtils.getForStr(lnrctlpm.getPAY_PSEQ_CD2(),7), 0, bytes, index, FormatUtils.getForStr(lnrctlpm.getPAY_PSEQ_CD2(),7).length);
		index += FormatUtils.getForStr(lnrctlpm.getPAY_PSEQ_CD2(),7).length;
		System.arraycopy(FormatUtils.getForStr(lnrctlpm.getPAY_SEQ_MSK2(),9), 0, bytes, index, FormatUtils.getForStr(lnrctlpm.getPAY_SEQ_MSK2(),9).length);
		index += FormatUtils.getForStr(lnrctlpm.getPAY_SEQ_MSK2(),9).length;
		System.arraycopy(FormatUtils.getForStr(lnrctlpm.getPAY_PSEQ_CD3(),7), 0, bytes, index, FormatUtils.getForStr(lnrctlpm.getPAY_PSEQ_CD3(),7).length);
		index += FormatUtils.getForStr(lnrctlpm.getPAY_PSEQ_CD3(),7).length;
		System.arraycopy(FormatUtils.getForStr(lnrctlpm.getPAY_SEQ_MSK3(),9), 0, bytes, index, FormatUtils.getForStr(lnrctlpm.getPAY_SEQ_MSK3(),9).length);
		index += FormatUtils.getForStr(lnrctlpm.getPAY_SEQ_MSK3(),9).length;
		System.arraycopy(FormatUtils.intToStr(lnrctlpm.getREPY_PRTY(),1), 0, bytes, index, FormatUtils.intToStr(lnrctlpm.getREPY_PRTY(),1).length);
		index += FormatUtils.intToStr(lnrctlpm.getREPY_PRTY(),1).length;
		System.arraycopy(FormatUtils.getForStr(lnrctlpm.getSPRD_REPY_FLG(),1), 0, bytes, index, FormatUtils.getForStr(lnrctlpm.getSPRD_REPY_FLG(),1).length);
		index += FormatUtils.getForStr(lnrctlpm.getSPRD_REPY_FLG(),1).length;
		System.arraycopy(FormatUtils.getForStr(lnrctlpm.getRMI_INT_FLG(),1), 0, bytes, index, FormatUtils.getForStr(lnrctlpm.getRMI_INT_FLG(),1).length);
		index += FormatUtils.getForStr(lnrctlpm.getRMI_INT_FLG(),1).length;
		System.arraycopy(FormatUtils.getForStr(lnrctlpm.getPI_RMI_MTH(),1), 0, bytes, index, FormatUtils.getForStr(lnrctlpm.getPI_RMI_MTH(),1).length);
		index += FormatUtils.getForStr(lnrctlpm.getPI_RMI_MTH(),1).length;
		System.arraycopy(FormatUtils.getForStr(lnrctlpm.getSTRK_BAL_MTH(),1), 0, bytes, index, FormatUtils.getForStr(lnrctlpm.getSTRK_BAL_MTH(),1).length);
		index += FormatUtils.getForStr(lnrctlpm.getSTRK_BAL_MTH(),1).length;
		System.arraycopy(FormatUtils.getForStr(lnrctlpm.getPRE_PAY_FLG(),1), 0, bytes, index, FormatUtils.getForStr(lnrctlpm.getPRE_PAY_FLG(),1).length);
		index += FormatUtils.getForStr(lnrctlpm.getPRE_PAY_FLG(),1).length;
//		System.arraycopy(FormatUtils.intToStr(lnrctlpm.getMIN_PRPY_AMT(),16), 0, bytes, index, FormatUtils.intToStr(lnrctlpm.getMIN_PRPY_AMT(),16).length);
//		index += FormatUtils.intToStr(lnrctlpm.getMIN_PRPY_AMT(),16).length;
//		System.arraycopy(FormatUtils.intToStr(lnrctlpm.getMAX_PRPY_CNT(),4), 0, bytes, index, FormatUtils.intToStr(lnrctlpm.getMAX_PRPY_CNT(),4).length);
//		index += FormatUtils.intToStr(lnrctlpm.getMAX_PRPY_CNT(),4).length;
//		System.arraycopy(FormatUtils.intToStr(lnrctlpm.getFST_PRPY_TERM(),4), 0, bytes, index, FormatUtils.intToStr(lnrctlpm.getFST_PRPY_TERM(),4).length);
//		index += FormatUtils.intToStr(lnrctlpm.getFST_PRPY_TERM(),4).length;
		System.arraycopy(FormatUtils.getForStr("0000000000000000",16), 0, bytes, index, FormatUtils.getForStr("0000000000000000",16).length);
		index += FormatUtils.getForStr("0000000000000000",16).length;
		System.arraycopy(FormatUtils.getForStr("0000",4), 0, bytes, index, FormatUtils.getForStr("0000",4).length);
		index += FormatUtils.getForStr("0000",4).length;
		System.arraycopy(FormatUtils.getForStr("0000",4), 0, bytes, index, FormatUtils.getForStr("0000",4).length);
		index += FormatUtils.getForStr("0000",4).length;
		System.arraycopy(FormatUtils.getForStr( "Y",1), 0, bytes, index, FormatUtils.getForStr("Y",1).length);
		index += FormatUtils.getForStr("Y",1).length;
		System.arraycopy(FormatUtils.getForStr(lnrctlpm.getPRPY_PTPL_MTH(),1), 0, bytes, index, FormatUtils.getForStr(lnrctlpm.getPRPY_PTPL_MTH(),1).length);
		index += FormatUtils.getForStr(lnrctlpm.getPRPY_PTPL_MTH(),1).length;
		System.arraycopy(FormatUtils.getForStr(lnrctlpm.getPRPY_INT_MTH(),1), 0, bytes, index, FormatUtils.getForStr(lnrctlpm.getPRPY_INT_MTH(),1).length);
		index += FormatUtils.getForStr(lnrctlpm.getPRPY_INT_MTH(),1).length;
		System.arraycopy(FormatUtils.getForStr(lnrctlpm.getFUL_PAY_FLG(),1), 0, bytes, index, FormatUtils.getForStr(lnrctlpm.getFUL_PAY_FLG(),1).length);
		index += FormatUtils.getForStr(lnrctlpm.getFUL_PAY_FLG(),1).length;
		System.arraycopy(FormatUtils.getForStr(lnrctlpm.getFULPAY_INT_MTH(),1), 0, bytes, index, FormatUtils.getForStr(lnrctlpm.getFULPAY_INT_MTH(),1).length);
		index += FormatUtils.getForStr(lnrctlpm.getFULPAY_INT_MTH(),1).length;
		System.arraycopy(FormatUtils.getForStr(lnrctlpm.getPEN_RUL_FLG(),1), 0, bytes, index, FormatUtils.getForStr(lnrctlpm.getPEN_RUL_FLG(),1).length);
		index += FormatUtils.getForStr(lnrctlpm.getPEN_RUL_FLG(),1).length;
		System.arraycopy(FormatUtils.getForStr(lnrctlpm.getPEN_FLG(),1), 0, bytes, index, FormatUtils.getForStr(lnrctlpm.getPEN_FLG(),1).length);
		index += FormatUtils.getForStr(lnrctlpm.getPEN_FLG(),1).length;
		System.arraycopy(FormatUtils.getForStr(lnrctlpm.getPEN_RUL(),7), 0, bytes, index, FormatUtils.getForStr(lnrctlpm.getPEN_RUL(),7).length);
		index += FormatUtils.getForStr(lnrctlpm.getPEN_RUL(),7).length;

		System.arraycopy(FormatUtils.getForStr(lnrctlpm.getINST_RBD_MTH(),1), 0, bytes, index, FormatUtils.getForStr(lnrctlpm.getINST_RBD_MTH(),1).length);
		index += FormatUtils.getForStr(lnrctlpm.getINST_RBD_MTH(),1).length;
		System.arraycopy(FormatUtils.getForStr(lnrctlpm.getCPT_PLN_MTH(),1), 0, bytes, index, FormatUtils.getForStr(lnrctlpm.getCPT_PLN_MTH(),1).length);
		index += FormatUtils.getForStr(lnrctlpm.getCPT_PLN_MTH(),1).length;
		System.arraycopy(FormatUtils.getForStr(lnrctlpm.getINST_RST_RUL(),1), 0, bytes, index, FormatUtils.getForStr(lnrctlpm.getINST_RST_RUL(),1).length);
		index += FormatUtils.getForStr(lnrctlpm.getINST_RST_RUL(),1).length;
		System.arraycopy(FormatUtils.getForStr(lnrctlpm.getFST_INST_MTH(),1), 0, bytes, index, FormatUtils.getForStr(lnrctlpm.getFST_INST_MTH(),1).length);
		index += FormatUtils.getForStr(lnrctlpm.getFST_INST_MTH(),1).length;
//		System.arraycopy(FormatUtils.intToStr(lnrctlpm.getINST_CEL_RAT(),12), 0, bytes, index, FormatUtils.intToStr(lnrctlpm.getINST_CEL_RAT(),12).length);
//		index += FormatUtils.intToStr(lnrctlpm.getINST_CEL_RAT(),12).length;
//		System.arraycopy(FormatUtils.intToStr(lnrctlpm.getINST_FLR_RAT(),12), 0, bytes, index, FormatUtils.intToStr(lnrctlpm.getINST_FLR_RAT(),12).length);
//		index += FormatUtils.intToStr(lnrctlpm.getINST_FLR_RAT(),12).length;
		System.arraycopy(FormatUtils.getForStr("000000000000000000000000",24), 0, bytes, index, FormatUtils.getForStr("000000000000000000000000",24).length);
		index += FormatUtils.getForStr("000000000000000000000000",24).length;
		System.arraycopy(FormatUtils.getForStr(lnrctlpm.getLOAN_CAL_PERD_FLG(),1), 0, bytes, index, FormatUtils.getForStr(lnrctlpm.getLOAN_CAL_PERD_FLG(),1).length);
		index += FormatUtils.getForStr(lnrctlpm.getLOAN_CAL_PERD_FLG(),1).length;
//		System.arraycopy(FormatUtils.intToStr(lnrctlpm.getCAL_PERD(),4), 0, bytes, index, FormatUtils.intToStr(lnrctlpm.getCAL_PERD(),4).length);
//		index += FormatUtils.intToStr(lnrctlpm.getCAL_PERD(),4).length;
		System.arraycopy(FormatUtils.getForStr("0001",4), 0, bytes, index, FormatUtils.getForStr("0001",4).length);
		index += FormatUtils.getForStr("0001",4).length;
		System.arraycopy(FormatUtils.getForStr(lnrctlpm.getCAL_PERD_UNIT(),1), 0, bytes, index, FormatUtils.getForStr(lnrctlpm.getCAL_PERD_UNIT(),1).length);
		index += FormatUtils.getForStr(lnrctlpm.getCAL_PERD_UNIT(),1).length;
//		System.arraycopy(FormatUtils.intToStr(lnrctlpm.getINCR_PERD(),4), 0, bytes, index, FormatUtils.intToStr(lnrctlpm.getINCR_PERD(),4).length);
//		index += FormatUtils.intToStr(lnrctlpm.getINCR_PERD(),4).length;
		System.arraycopy(FormatUtils.getForStr("0000",4), 0, bytes, index, FormatUtils.getForStr("0000",4).length);
		index += FormatUtils.getForStr("0000",4).length;
		System.arraycopy(FormatUtils.getForStr(lnrctlpm.getCINT_RUL(),7), 0, bytes, index, FormatUtils.getForStr(lnrctlpm.getCINT_RUL(),7).length);
		index += FormatUtils.getForStr(lnrctlpm.getCINT_RUL(),7).length;
		System.arraycopy(FormatUtils.getForStr(lnrctlpm.getMTR_INT_MTH(),1), 0, bytes, index, FormatUtils.getForStr(lnrctlpm.getMTR_INT_MTH(),1).length);
		index += FormatUtils.getForStr(lnrctlpm.getMTR_INT_MTH(),1).length;
		System.arraycopy(FormatUtils.getForStr(lnrctlpm.getRND_MTH(),1), 0, bytes, index, FormatUtils.getForStr(lnrctlpm.getRND_MTH(),1).length);
		index += FormatUtils.getForStr(lnrctlpm.getRND_MTH(),1).length;
		System.arraycopy(FormatUtils.getForStr(lnrctlpm.getP_HOL_MTH(),1), 0, bytes, index, FormatUtils.getForStr(lnrctlpm.getP_HOL_MTH(),1).length);
		index += FormatUtils.getForStr(lnrctlpm.getP_HOL_MTH(),1).length;
		System.arraycopy(FormatUtils.getForStr(lnrctlpm.getI_HOL_MTH(),1), 0, bytes, index, FormatUtils.getForStr(lnrctlpm.getI_HOL_MTH(),1).length);
		index += FormatUtils.getForStr(lnrctlpm.getI_HOL_MTH(),1).length;
		System.arraycopy(FormatUtils.intToStr(lnrctlpm.getPRIN_DOG_MTH(),1), 0, bytes, index, FormatUtils.intToStr(lnrctlpm.getPRIN_DOG_MTH(),1).length);
		index += FormatUtils.intToStr(lnrctlpm.getPRIN_DOG_MTH(),1).length;
		System.arraycopy(FormatUtils.getForStr(lnrctlpm.getPRIN_DOG(),5), 0, bytes, index, FormatUtils.getForStr(lnrctlpm.getPRIN_DOG(),5).length);
		index += FormatUtils.getForStr(lnrctlpm.getPRIN_DOG(),5).length;
		System.arraycopy(FormatUtils.getForStr(lnrctlpm.getINT_DOG_MTH(),1), 0, bytes, index, FormatUtils.getForStr(lnrctlpm.getINT_DOG_MTH(),1).length);
		index += FormatUtils.getForStr(lnrctlpm.getINT_DOG_MTH(),1).length;
//		System.arraycopy(FormatUtils.intToStr(lnrctlpm.getINT_DOG(),5), 0, bytes, index, FormatUtils.intToStr(lnrctlpm.getINT_DOG(),5).length);
//		index += FormatUtils.intToStr(lnrctlpm.getINT_DOG(),5).length;
		System.arraycopy(FormatUtils.getForStr("00000",5), 0, bytes, index, FormatUtils.getForStr("00000",5).length);
		index += FormatUtils.getForStr("00000",5).length;
		System.arraycopy(FormatUtils.getForStr(lnrctlpm.getIRAT_SET_FLG(),1), 0, bytes, index, FormatUtils.getForStr(lnrctlpm.getIRAT_SET_FLG(),1).length);
		index += FormatUtils.getForStr(lnrctlpm.getIRAT_SET_FLG(),1).length;
		System.arraycopy(FormatUtils.getForStr(lnrctlpm.getIRAT_CD(),10), 0, bytes, index, FormatUtils.getForStr(lnrctlpm.getIRAT_CD(),10).length);
		index += FormatUtils.getForStr(lnrctlpm.getIRAT_CD(),10).length;
		System.arraycopy(FormatUtils.getForStr(lnrctlpm.getIRAT_VALDT_ID(),1), 0, bytes, index, FormatUtils.getForStr(lnrctlpm.getIRAT_VALDT_ID(),1).length);
		index += FormatUtils.getForStr(lnrctlpm.getIRAT_VALDT_ID(),1).length;
		System.arraycopy(FormatUtils.getForStr(lnrctlpm.getIRAT_RLT_MTH(),1), 0, bytes, index, FormatUtils.getForStr(lnrctlpm.getIRAT_RLT_MTH(),1).length);
		index += FormatUtils.getForStr(lnrctlpm.getIRAT_RLT_MTH(),1).length;
		System.arraycopy(FormatUtils.getForStr(lnrctlpm.getFLT_MTH(),1), 0, bytes, index, FormatUtils.getForStr(lnrctlpm.getFLT_MTH(),1).length);
		index += FormatUtils.getForStr(lnrctlpm.getFLT_MTH(),1).length;
//		System.arraycopy(FormatUtils.intToStr(lnrctlpm.getFLT_PERD(),4), 0, bytes, index, FormatUtils.intToStr(lnrctlpm.getFLT_PERD(),4).length);
//		index += FormatUtils.intToStr(lnrctlpm.getFLT_PERD(),4).length;
		System.arraycopy(FormatUtils.getForStr("0000",4), 0, bytes, index, FormatUtils.getForStr("0000",4).length);
		index += FormatUtils.getForStr("0000",4).length;
		System.arraycopy(FormatUtils.getForStr(lnrctlpm.getFLT_PERD_UNIT(),1), 0, bytes, index, FormatUtils.getForStr(lnrctlpm.getFLT_PERD_UNIT(),1).length);
		index += FormatUtils.getForStr(lnrctlpm.getFLT_PERD_UNIT(),1).length;
		System.arraycopy(FormatUtils.getForStr(lnrctlpm.getCAPT_FLG(),1), 0, bytes, index, FormatUtils.getForStr(lnrctlpm.getCAPT_FLG(),1).length);
		index += FormatUtils.getForStr(lnrctlpm.getCAPT_FLG(),1).length;
		System.arraycopy(FormatUtils.getForStr(lnrctlpm.getCAP_FLG(),1), 0, bytes, index, FormatUtils.getForStr(lnrctlpm.getCAP_FLG(),1).length);
		index += FormatUtils.getForStr(lnrctlpm.getCAP_FLG(),1).length;
//		System.arraycopy(FormatUtils.intToStr(lnrctlpm.getCAP_PERD(),4), 0, bytes, index, FormatUtils.intToStr(lnrctlpm.getCAP_PERD(),4).length);
//		index += FormatUtils.intToStr(lnrctlpm.getCAP_PERD(),4).length;
		System.arraycopy(FormatUtils.getForStr("0000",4), 0, bytes, index, FormatUtils.getForStr("0000",4).length);
		index += FormatUtils.getForStr("0000",4).length;
		System.arraycopy(FormatUtils.getForStr(lnrctlpm.getBUD_FLG(),1), 0, bytes, index, FormatUtils.getForStr(lnrctlpm.getBUD_FLG(),1).length);
		index += FormatUtils.getForStr(lnrctlpm.getBUD_FLG(),1).length;
		System.arraycopy(FormatUtils.getForStr(lnrctlpm.getBUD_PERD(),1), 0, bytes, index, FormatUtils.getForStr(lnrctlpm.getBUD_PERD(),1).length);
		index += FormatUtils.getForStr(lnrctlpm.getBUD_PERD(),1).length;
		System.arraycopy(FormatUtils.getForStr(lnrctlpm.getBUD_MTH(),1), 0, bytes, index, FormatUtils.getForStr(lnrctlpm.getBUD_MTH(),1).length);
		index += FormatUtils.getForStr(lnrctlpm.getBUD_MTH(),1).length;
		System.arraycopy(FormatUtils.intToStr(lnrctlpm.getINT_DAYS(),3), 0, bytes, index, FormatUtils.intToStr(lnrctlpm.getINT_DAYS(),3).length);
		index += FormatUtils.intToStr(lnrctlpm.getINT_DAYS(),3).length;
		System.arraycopy(FormatUtils.getForStr(lnrctlpm.getRLT_FLG(),1), 0, bytes, index, FormatUtils.getForStr(lnrctlpm.getRLT_FLG(),1).length);
		index += FormatUtils.getForStr(lnrctlpm.getRLT_FLG(),1).length;
//		System.arraycopy(FormatUtils.intToStr(lnrctlpm.getDRAW_DAY_CNT(),6), 0, bytes, index, FormatUtils.intToStr(lnrctlpm.getDRAW_DAY_CNT(),6).length);
//		index += FormatUtils.intToStr(lnrctlpm.getDRAW_DAY_CNT(),6).length;
//		System.arraycopy(FormatUtils.intToStr(lnrctlpm.getLNDUE_DAY_CNT(),6), 0, bytes, index, FormatUtils.intToStr(lnrctlpm.getLNDUE_DAY_CNT(),6).length);
//		index += FormatUtils.intToStr(lnrctlpm.getLNDUE_DAY_CNT(),6).length;
		System.arraycopy(FormatUtils.getForStr("000000000007",12), 0, bytes, index, FormatUtils.getForStr("000000000007",12).length);
		index += FormatUtils.getForStr("000000000007",12).length;
		System.arraycopy(FormatUtils.getForStr(lnrctlpm.getCLASSED(),1), 0, bytes, index, FormatUtils.getForStr(lnrctlpm.getCLASSED(),1).length);
		index += FormatUtils.getForStr(lnrctlpm.getCLASSED(),1).length;
		System.arraycopy(FormatUtils.getForStr(lnrctlpm.getCommit_Flag(),1), 0, bytes, index, FormatUtils.getForStr(lnrctlpm.getCommit_Flag(),1).length);
		index += FormatUtils.getForStr(lnrctlpm.getCommit_Flag(),1).length;
		System.arraycopy(FormatUtils.getForStr(lnrctlpm.getCommit_Type(),8), 0, bytes, index, FormatUtils.getForStr(lnrctlpm.getCommit_Type(),8).length);
		index += FormatUtils.getForStr(lnrctlpm.getCommit_Type(),8).length;
		System.arraycopy(FormatUtils.getForStr(lnrctlpm.getAccrual_Type(),1), 0, bytes, index, FormatUtils.getForStr(lnrctlpm.getAccrual_Type(),1).length);
		index += FormatUtils.getForStr(lnrctlpm.getAccrual_Type(),1).length;
		System.arraycopy(FormatUtils.getForStr(lnrctlpm.getHoliday_Method(),1), 0, bytes, index, FormatUtils.getForStr(lnrctlpm.getHoliday_Method(),1).length);
		index += FormatUtils.getForStr(lnrctlpm.getHoliday_Method(),1).length;
		System.arraycopy(FormatUtils.getForStr(lnrctlpm.getHoliday_Override(),1), 0, bytes, index, FormatUtils.getForStr(lnrctlpm.getHoliday_Override(),1).length);
		index += FormatUtils.getForStr(lnrctlpm.getHoliday_Override(),1).length;
		System.arraycopy(FormatUtils.getForStr(lnrctlpm.getPROD_CLASS(),1), 0, bytes, index, FormatUtils.getForStr(lnrctlpm.getPROD_CLASS(),1).length);
		index += FormatUtils.getForStr(lnrctlpm.getPROD_CLASS(),1).length;
		System.arraycopy(FormatUtils.getForStr(lnrctlpm.getCOMMIT_FLG(),1), 0, bytes, index, FormatUtils.getForStr(lnrctlpm.getCOMMIT_FLG(),1).length);
		index += FormatUtils.getForStr(lnrctlpm.getCOMMIT_FLG(),1).length;
		System.arraycopy(FormatUtils.getForStr(lnrctlpm.getSCP_PAY_SCH2(),1), 0, bytes, index, FormatUtils.getForStr(lnrctlpm.getSCP_PAY_SCH2(),1).length);
		index += FormatUtils.getForStr(lnrctlpm.getSCP_PAY_SCH2(),1).length;
		System.arraycopy(FormatUtils.getForStr(lnrctlpm.getSCP_PAY_SCH3(),1), 0, bytes, index, FormatUtils.getForStr(lnrctlpm.getSCP_PAY_SCH3(),1).length);
		index += FormatUtils.getForStr(lnrctlpm.getSCP_PAY_SCH3(),1).length;
		System.arraycopy(FormatUtils.getForStr(lnrctlpm.getSCP_PAY_SCH4(),1), 0, bytes, index, FormatUtils.getForStr(lnrctlpm.getSCP_PAY_SCH4(),1).length);
		index += FormatUtils.getForStr(lnrctlpm.getSCP_PAY_SCH4(),1).length;
		System.arraycopy(FormatUtils.getForStr(lnrctlpm.getSC_INS_METH2(),1), 0, bytes, index, FormatUtils.getForStr(lnrctlpm.getSC_INS_METH2(),1).length);
		index += FormatUtils.getForStr(lnrctlpm.getSC_INS_METH2(),1).length;
		System.arraycopy(FormatUtils.getForStr(lnrctlpm.getSC_INS_METH3(),1), 0, bytes, index, FormatUtils.getForStr(lnrctlpm.getSC_INS_METH3(),1).length);
		index += FormatUtils.getForStr(lnrctlpm.getSC_INS_METH3(),1).length;
		System.arraycopy(FormatUtils.getForStr(lnrctlpm.getSRC_FLG(),1), 0, bytes, index, FormatUtils.getForStr(lnrctlpm.getSRC_FLG(),1).length);
		index += FormatUtils.getForStr(lnrctlpm.getSRC_FLG(),1).length;
		System.arraycopy(FormatUtils.getForStr(lnrctlpm.getLNAC_FLG(),1), 0, bytes, index, FormatUtils.getForStr(lnrctlpm.getLNAC_FLG(),1).length);
		index += FormatUtils.getForStr(lnrctlpm.getLNAC_FLG(),1).length;
		System.arraycopy(FormatUtils.getForStr(lnrctlpm.getPART_PAY_FLG(),1), 0, bytes, index, FormatUtils.getForStr(lnrctlpm.getPART_PAY_FLG(),1).length);
		index += FormatUtils.getForStr(lnrctlpm.getPART_PAY_FLG(),1).length;
		System.arraycopy(FormatUtils.getForStr(lnrctlpm.getOD_PAY_FLG(),1), 0, bytes, index, FormatUtils.getForStr(lnrctlpm.getOD_PAY_FLG(),1).length);
		index += FormatUtils.getForStr(lnrctlpm.getOD_PAY_FLG(),1).length;
		System.arraycopy(FormatUtils.getForStr(lnrctlpm.getPENALTY_FLG(),1), 0, bytes, index, FormatUtils.getForStr(lnrctlpm.getPENALTY_FLG(),1).length);
		index += FormatUtils.getForStr(lnrctlpm.getPENALTY_FLG(),1).length;
		System.arraycopy(FormatUtils.getForStr(lnrctlpm.getCALR_STD(),2), 0, bytes, index, FormatUtils.getForStr(lnrctlpm.getCALR_STD(),2).length);
		index += FormatUtils.getForStr(lnrctlpm.getCALR_STD(),2).length;
		System.arraycopy(FormatUtils.getForStr(lnrctlpm.getREF_CTY_CODE_INF(),20), 0, bytes, index, FormatUtils.getForStr(lnrctlpm.getREF_CTY_CODE_INF(),20).length);
		index += FormatUtils.getForStr(lnrctlpm.getREF_CTY_CODE_INF(),20).length;
		System.arraycopy(FormatUtils.getForStr(lnrctlpm.getCARRY_FLAG(),1), 0, bytes, index, FormatUtils.getForStr(lnrctlpm.getCARRY_FLAG(),1).length);
		index += FormatUtils.getForStr(lnrctlpm.getCARRY_FLAG(),1).length;
		System.arraycopy(FormatUtils.getForStr(lnrctlpm.getDEC_DIGITS(),1), 0, bytes, index, FormatUtils.getForStr(lnrctlpm.getDEC_DIGITS(),1).length);
		index += FormatUtils.getForStr(lnrctlpm.getDEC_DIGITS(),1).length;
		System.arraycopy(FormatUtils.getForStr(lnrctlpm.getTR_FLG(),1), 0, bytes, index, FormatUtils.getForStr(lnrctlpm.getTR_FLG(),1).length);
		index += FormatUtils.getForStr(lnrctlpm.getTR_FLG(),1).length;
//		System.arraycopy(FormatUtils.intToStr(lnrctlpm.getTAX_PCT(),5), 0, bytes, index, FormatUtils.intToStr(lnrctlpm.getTAX_PCT(),5).length);
//		index += FormatUtils.intToStr(lnrctlpm.getTAX_PCT(),5).length;
//		System.arraycopy(FormatUtils.intToStr(lnrctlpm.getADVANCE_DAY(),3), 0, bytes, index, FormatUtils.intToStr(lnrctlpm.getADVANCE_DAY(),3).length);
//		index += FormatUtils.intToStr(lnrctlpm.getADVANCE_DAY(),3).length;
		System.arraycopy(FormatUtils.getForStr("00000000",8), 0, bytes, index, FormatUtils.getForStr("00000000",8).length);
		index += FormatUtils.getForStr("00000000",8).length;
		System.arraycopy(FormatUtils.getForStr(lnrctlpm.getHOL_CAL_MTH(),1), 0, bytes, index, FormatUtils.getForStr(lnrctlpm.getHOL_CAL_MTH(),1).length);
		index += FormatUtils.getForStr(lnrctlpm.getHOL_CAL_MTH(),1).length;
		System.arraycopy(FormatUtils.getForStr(lnrctlpm.getAC_TYPE(),1), 0, bytes, index, FormatUtils.getForStr(lnrctlpm.getAC_TYPE(),1).length);
		index += FormatUtils.getForStr(lnrctlpm.getAC_TYPE(),1).length;
		System.arraycopy(FormatUtils.getForStr(lnrctlpm.getGROUP_TYP(),1), 0, bytes, index, FormatUtils.getForStr(lnrctlpm.getGROUP_TYP(),1).length);
		index += FormatUtils.getForStr(lnrctlpm.getGROUP_TYP(),1).length;
//		System.arraycopy(FormatUtils.getForStr(lnrctlpm.getGROUP(),1), 0, bytes, index, FormatUtils.getForStr(lnrctlpm.getGROUP(),1).length);
//		index += FormatUtils.getForStr(lnrctlpm.getGROUP(),1).length;
//		System.arraycopy(FormatUtils.getForStr(lnrctlpm.getCI_BASE(),1), 0, bytes, index, FormatUtils.getForStr(lnrctlpm.getCI_BASE(),1).length);
//		index += FormatUtils.getForStr(lnrctlpm.getCI_BASE(),1).length;
//		System.arraycopy(FormatUtils.getForStr(lnrctlpm.getFLOAT_MTH(),1), 0, bytes, index, FormatUtils.getForStr(lnrctlpm.getFLOAT_MTH(),1).length);
//		index += FormatUtils.getForStr(lnrctlpm.getFLOAT_MTH(),1).length;
//		System.arraycopy(FormatUtils.getForStr(lnrctlpm.getADD_RAT(),1), 0, bytes, index, FormatUtils.getForStr(lnrctlpm.getADD_RAT(),1).length);
//		index += FormatUtils.getForStr(lnrctlpm.getADD_RAT(),1).length;
//		System.arraycopy(FormatUtils.getForStr(lnrctlpm.getINT_PER(),1), 0, bytes, index, FormatUtils.getForStr(lnrctlpm.getINT_PER(),1).length);
//		index += FormatUtils.getForStr(lnrctlpm.getINT_PER(),1).length;
		System.out.println(index);
		System.arraycopy(FormatUtils.getForStr(LN,220), 0, bytes, index, FormatUtils.getForStr(LN,220).length);
		index += FormatUtils.getForStr(LN,220).length;
		System.arraycopy(FormatUtils.getForStr(lnrctlpm.getDICT_TYP(),1), 0, bytes, index, FormatUtils.getForStr(lnrctlpm.getDICT_TYP(),1).length);
		index += FormatUtils.getForStr(lnrctlpm.getDICT_TYP(),1).length;
		System.arraycopy(FormatUtils.getForStr(lnrctlpm.getIOVD_TYP(),1), 0, bytes, index, FormatUtils.getForStr(lnrctlpm.getIOVD_TYP(),1).length);
		index += FormatUtils.getForStr(lnrctlpm.getIOVD_TYP(),1).length;
		System.out.println("总长度：" +index);
		return bytes;
	}
}
