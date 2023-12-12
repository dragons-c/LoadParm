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
import java.math.BigDecimal;
import java.util.List;

@Controller
@RequestMapping("/upload")
public class ddvmpardController {
    @Autowired
	BptparmService bptparmService;
	@Autowired
	BptpdmeService bptpdmeService;
	@Autowired
	BptpdcdService bptpdcdService;
    private final  String DD = " ";
	@RequestMapping("/ddvmpard")
	@Transactional(rollbackFor = Exception.class)
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
			Ddvmprd ddvmprd = new Ddvmprd();
			ddvmprd.setPRDMO_CD("CAAC");
            ddvmprd.setPARM_CODE((String) list.get(0));
            ddvmprd.setCHN_NAME(list.get(1).toString().toUpperCase());
            String actyp = "CSV";
            if(actyp.contains(list.get(2).toString().substring(0,1))){
				ddvmprd.setPRD_TYP(((String)list.get(2)).substring(0,1));
			}else{
				throw new Exception("Account Type错误");
			}
			String satyp = "CPN";
			if(satyp.contains(list.get(3).toString().substring(0,1))){
				ddvmprd.setSA_TYP(((String)list.get(3)).substring(0,1));
			}else{
				throw new Exception("Savings Account Type错误");
			}
			ddvmprd.setCUST_TYPE(((String)list.get(4)));
			ddvmprd.setCUR_TYPE(((String)list.get(8)).substring(0,1));
			ddvmprd.setCCY(((String)list.get(9)).replaceAll("、",""));
			System.out.println(ddvmprd.getCCY());
			ddvmprd.setPRD_TOOL_PSB(((String)list.get(10)).substring(0,1));
			ddvmprd.setPRD_TOOL_CARD(((String)list.get(11)).substring(0,1));
			ddvmprd.setPRD_TOOL_CHQ(((String)list.get(12)).substring(0,1));
			ddvmprd.setOVERDRAFT_FAC(((String)list.get(13)).substring(0,1));
			ddvmprd.setCASH_TXN_TYPE(((String)list.get(14)).substring(0,1));
			//ddvmprd.setCASH_MSG_TYPE(((String)list.get(15)).substring(0,1));
			ddvmprd.setCROS_DR_LMT(((String)list.get(16)).substring(0,1));
			ddvmprd.setCROS_CR_LMT(((String)list.get(17)).substring(0,1));
			ddvmprd.setCAL_DINT_METH(((String)list.get(18)).substring(0,1));
			//记录利息税率代码
			//ddvmprd.setTAX_RATE_BASE((String)list.get(20));
			ddvmprd.setDEP_POST_PERIOD1(((String)list.get(21)).substring(0,1));
			if(list.get(22).toString().length() == 2){
				ddvmprd.setDEP_POST_DATE1("00"+list.get(22).toString());
			}else{
				ddvmprd.setDEP_POST_DATE1(list.get(22).toString());
			}

			ddvmprd.setDEP_POST_PERIOD2(((String)list.get(23)).substring(0,1));
			if(list.get(24).toString().length() == 2){
				ddvmprd.setDEP_POST_DATE2("00"+list.get(24).toString());
			}else{
				ddvmprd.setDEP_POST_DATE2(list.get(24).toString());
			}
			if(list.get(25) != null){
                ddvmprd.setOD_POST_PERIOD1(list.get(25).toString().substring(0,1));
			}
			if(list.get(26) != null){
				if(list.get(26).toString().length() == 2){
					ddvmprd.setOD_POST_DATE1("00"+list.get(26).toString());
				}else{
					ddvmprd.setOD_POST_DATE1(list.get(26).toString());
				}

			}
			if(list.get(27) != null) {
				ddvmprd.setOD_POST_PERIOD2(list.get(27).toString().substring(0,1));
			}
			if(list.get(28) != null){
				if(list.get(28).toString().length() == 2){
					ddvmprd.setOD_POST_DATE2("00"+list.get(28).toString());
				}else{
					ddvmprd.setOD_POST_DATE2(list.get(28).toString());
				}

			}
			saveParm(ddvmprd);
			saveBptpdme(ddvmprd);
			saveBptpdcd(ddvmprd);
		}

		return "success";
	}
	public void saveBptpdme(Ddvmprd ddvmprd){
		Bptpdme bptpdme = new Bptpdme();
		bptpdme.setPRDT_CODE(ddvmprd.getPARM_CODE());
		bptpdme.setPRDT_NAME(ddvmprd.getCHN_NAME());
		bptpdme.setBUSI_TYPE("CDP");
		bptpdme.setPRDT_MODEL(ddvmprd.getPRDMO_CD());
		bptpdme.setPRDT_IND("0");
		bptpdme.setEFF_DATE(new BigDecimal("20000101"));
		bptpdme.setEXP_DATE(new BigDecimal("99991231"));
		bptpdme.setSTOP_SOLD_DATE(new BigDecimal("99991231"));
		bptpdme.setPARM_CODE(ddvmprd.getPARM_CODE());
		bptpdme.setLAST_TLT("BCELDD2");
		Bptpdme bptpdme2 = bptpdmeService.find(bptpdme.getPRDT_CODE());
		if(bptpdme2 == null){
			bptpdmeService.add(bptpdme);
		}else{
			bptpdmeService.update(bptpdme);
		}

	}
	public void saveBptpdcd(Ddvmprd ddvmprd){
		Bptpdcd bptpdcd = new Bptpdcd();
		bptpdcd.setPRDT_CODE(ddvmprd.getPARM_CODE());
		//	if(lnrctlpm.getPROD_CLASS().substring(0,1).equals("2")){
		String[] str =  ddvmprd.getCUST_TYPE().split(";");
		if(str.length == 1){
			if(ddvmprd.getCUST_TYPE().substring(0,1).equals("P")){
				bptpdcd.setCUS_PER_FLG("1");
				bptpdcd.setCUS_COM_FLG("0");
				bptpdcd.setCUS_FIN_FLG("0");
			}else if(ddvmprd.getCUST_TYPE().substring(0,1).equals("C")){
				bptpdcd.setCUS_PER_FLG("0");
				bptpdcd.setCUS_COM_FLG("1");
				bptpdcd.setCUS_FIN_FLG("0");
			}else if(ddvmprd.getCUST_TYPE().substring(0,1).equals("F")){
				bptpdcd.setCUS_PER_FLG("0");
				bptpdcd.setCUS_COM_FLG("0");
				bptpdcd.setCUS_FIN_FLG("1");
			}
		}else if(str.length == 2){
            if(str[0].substring(0,1).equals("P") &&  str[1].substring(0,1).equals("C")){
				bptpdcd.setCUS_PER_FLG("1");
				bptpdcd.setCUS_COM_FLG("1");
				bptpdcd.setCUS_FIN_FLG("0");
			}else if(str[0].substring(0,1).equals("P") &&  str[1].substring(0,1).equals("F")){
				bptpdcd.setCUS_PER_FLG("1");
				bptpdcd.setCUS_COM_FLG("0");
				bptpdcd.setCUS_FIN_FLG("1");
			}else if(str[0].substring(0,1).equals("C") &&  str[1].substring(0,1).equals("F")){
				bptpdcd.setCUS_PER_FLG("0");
				bptpdcd.setCUS_COM_FLG("1");
				bptpdcd.setCUS_FIN_FLG("1");
			}
		}else if(str.length == 3){
			bptpdcd.setCUS_PER_FLG("1");
			bptpdcd.setCUS_COM_FLG("1");
			bptpdcd.setCUS_FIN_FLG("1");
		}


		Bptpdcd bptpdcd2 = bptpdcdService.find(bptpdcd.getPRDT_CODE());
		if (bptpdcd2 == null){
			bptpdcdService.add(bptpdcd);
		}else{
			bptpdcdService.update(bptpdcd);
		}

	}
	public void saveParm(Ddvmprd ddvmprd){
		Bptparm bptparm = new Bptparm();
		BptparmKey bptparmKey = new BptparmKey();
		bptparm.setTYPE("PRDPR");
		bptparm.setCODE("999999"+ddvmprd.getPARM_CODE());
		bptparm.setCDESC(ddvmprd.getCHN_NAME());
//		bptparm.setDESC(ddvmprd.getCHN_NAME().substring(0,19));
		bptparm.setEFF_DATE(20000101);
		bptparm.setEXP_DATE(99991231);
	 	bptparm.setVAL(objectToByte(413,ddvmprd));
		bptparm.setUPD_DATE(20200506);
		bptparm.setUPD_BR(888010);
		bptparm.setUPD_TLR("BCELDD2");
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
	public byte[] objectToByte(int size,Ddvmprd ddvmprd) {
		byte[] bytes = new byte[size];
		System.arraycopy(FormatUtils.getForStr(ddvmprd.getPRDMO_CD(),4), 0, bytes, 0, FormatUtils.getForStr(ddvmprd.getPRDMO_CD(),4).length);
		int index = FormatUtils.getForStr(ddvmprd.getPRDMO_CD(),4).length;
		System.arraycopy(FormatUtils.getForStr(ddvmprd.getPARM_CODE(),8), 0, bytes, index, FormatUtils.getForStr(ddvmprd.getPARM_CODE(),8).length);
		index += FormatUtils.getForStr(ddvmprd.getPARM_CODE(),8).length;
		System.arraycopy(FormatUtils.getForStr(ddvmprd.getCHN_NAME(),60), 0, bytes, index, FormatUtils.getForStr(ddvmprd.getCHN_NAME(),60).length);
		index += FormatUtils.getForStr(ddvmprd.getCHN_NAME(),60).length;
		System.arraycopy(FormatUtils.getForStr(ddvmprd.getPRD_TYP(),1), 0, bytes, index, FormatUtils.getForStr(ddvmprd.getPRD_TYP(),1).length);
		index += FormatUtils.getForStr(ddvmprd.getPRD_TYP(),1).length;
		System.arraycopy(FormatUtils.getForStr(ddvmprd.getSA_TYP(),1), 0, bytes, index, FormatUtils.getForStr(ddvmprd.getSA_TYP(),1).length);
		index += FormatUtils.getForStr(ddvmprd.getSA_TYP(),1).length;
		System.arraycopy(FormatUtils.getForStr(DD,1), 0, bytes, index, FormatUtils.getForStr(DD,1).length);
		index += FormatUtils.getForStr(DD,1).length;
		System.arraycopy(FormatUtils.getForStr(ddvmprd.getCUR_TYPE(),1), 0, bytes, index, FormatUtils.getForStr(ddvmprd.getCUR_TYPE(),1).length);
		index += FormatUtils.getForStr(ddvmprd.getCUR_TYPE(),1).length;
		System.arraycopy(FormatUtils.getForStr(ddvmprd.getCCY(),24), 0, bytes, index, FormatUtils.getForStr(ddvmprd.getCCY(),24).length);
		index += FormatUtils.getForStr(ddvmprd.getCCY(),24).length;
		System.arraycopy(FormatUtils.getForStr(DD,36), 0, bytes, index, FormatUtils.getForStr(DD,36).length);
		index += FormatUtils.getForStr(DD,36).length;
		System.arraycopy(FormatUtils.getForStr(ddvmprd.getPRD_TOOL_PSB(),1), 0, bytes, index, FormatUtils.getForStr(ddvmprd.getPRD_TOOL_PSB(),1).length);
		index += FormatUtils.getForStr(ddvmprd.getPRD_TOOL_PSB(),1).length;
		System.arraycopy(FormatUtils.getForStr(ddvmprd.getPRD_TOOL_CARD(),1), 0, bytes, index, FormatUtils.getForStr(ddvmprd.getPRD_TOOL_CARD(),1).length);
		index += FormatUtils.getForStr(ddvmprd.getPRD_TOOL_CARD(),1).length;
		System.arraycopy(FormatUtils.getForStr(ddvmprd.getPRD_TOOL_CHQ(),1), 0, bytes, index, FormatUtils.getForStr(ddvmprd.getPRD_TOOL_CHQ(),1).length);
		index += FormatUtils.getForStr(ddvmprd.getPRD_TOOL_CHQ(),1).length;
		System.arraycopy(FormatUtils.getForStr(ddvmprd.getOVERDRAFT_FAC(),1), 0, bytes, index, FormatUtils.getForStr(ddvmprd.getOVERDRAFT_FAC(),1).length);
		index += FormatUtils.getForStr(ddvmprd.getOVERDRAFT_FAC(),1).length;
		System.arraycopy(FormatUtils.getForStr(ddvmprd.getCAL_DINT_METH(),1), 0, bytes, index, FormatUtils.getForStr(ddvmprd.getCAL_DINT_METH(),1).length);
		index += FormatUtils.getForStr(ddvmprd.getCAL_DINT_METH(),1).length;
		System.arraycopy(FormatUtils.getForStr(ddvmprd.getTAX_RATE_BASE(),3), 0, bytes, index, FormatUtils.getForStr(ddvmprd.getTAX_RATE_BASE(),3).length);
		index += FormatUtils.getForStr(ddvmprd.getTAX_RATE_BASE(),3).length;
		System.arraycopy(FormatUtils.getForStr(ddvmprd.getTAX_RATE_TENOR(),4), 0, bytes, index, FormatUtils.getForStr(ddvmprd.getTAX_RATE_TENOR(),4).length);
		index += FormatUtils.getForStr(ddvmprd.getTAX_RATE_TENOR(),4).length;
		System.arraycopy(FormatUtils.getForStr(ddvmprd.getDEP_POST_PERIOD1(),1), 0, bytes, index,FormatUtils.getForStr(ddvmprd.getDEP_POST_PERIOD1(),1).length);
		index += FormatUtils.getForStr(ddvmprd.getDEP_POST_PERIOD1(),1).length;
		System.arraycopy(FormatUtils.getForStr(ddvmprd.getDEP_POST_DATE1(),4), 0, bytes, index, FormatUtils.getForStr(ddvmprd.getDEP_POST_DATE1(),4).length);
		index += FormatUtils.getForStr(ddvmprd.getDEP_POST_DATE1(),4).length;
		System.arraycopy(FormatUtils.getForStr(ddvmprd.getOD_POST_PERIOD1(),1), 0, bytes, index, FormatUtils.getForStr(ddvmprd.getOD_POST_PERIOD1(),1).length);
		index += FormatUtils.getForStr(ddvmprd.getOD_POST_PERIOD1(),1).length;
		System.arraycopy(FormatUtils.getForStr(ddvmprd.getOD_POST_DATE1(),4), 0, bytes, index, FormatUtils.getForStr(ddvmprd.getOD_POST_DATE1(),4).length);
		index += FormatUtils.getForStr(ddvmprd.getOD_POST_DATE1(),4).length;
		System.arraycopy(FormatUtils.getForStr(ddvmprd.getDEP_POST_PERIOD2(),1), 0, bytes, index,FormatUtils.getForStr(ddvmprd.getDEP_POST_PERIOD2(),1).length);
		index += FormatUtils.getForStr(ddvmprd.getDEP_POST_PERIOD2(),1).length;
		System.arraycopy(FormatUtils.getForStr(ddvmprd.getDEP_POST_DATE2(),4), 0, bytes, index, FormatUtils.getForStr(ddvmprd.getDEP_POST_DATE2(),4).length);
		index += FormatUtils.getForStr(ddvmprd.getDEP_POST_DATE2(),4).length;
		System.arraycopy(FormatUtils.getForStr(ddvmprd.getOD_POST_PERIOD2(),1), 0, bytes, index, FormatUtils.getForStr(ddvmprd.getOD_POST_PERIOD2(),1).length);
		index += FormatUtils.getForStr(ddvmprd.getOD_POST_PERIOD2(),1).length;
		System.arraycopy(FormatUtils.getForStr(ddvmprd.getOD_POST_DATE2(),4), 0, bytes, index, FormatUtils.getForStr(ddvmprd.getOD_POST_DATE2(),4).length);
		index += FormatUtils.getForStr(ddvmprd.getOD_POST_DATE2(),4).length;
		System.arraycopy(FormatUtils.getForStr(ddvmprd.getCASH_TXN_TYPE(),1), 0, bytes, index, FormatUtils.getForStr(ddvmprd.getCASH_TXN_TYPE(),1).length);
		index += FormatUtils.getForStr(ddvmprd.getCASH_TXN_TYPE(),1).length;
		System.arraycopy(FormatUtils.getForStr(ddvmprd.getCASH_MSG_TYPE(),1), 0, bytes, index, FormatUtils.getForStr(ddvmprd.getCASH_MSG_TYPE(),1).length);
		index += FormatUtils.getForStr(ddvmprd.getCASH_MSG_TYPE(),1).length;
		System.arraycopy(FormatUtils.getForStr(ddvmprd.getCROS_DR_LMT(),1), 0, bytes, index, FormatUtils.getForStr(ddvmprd.getCROS_DR_LMT(),1).length);
		index += FormatUtils.getForStr(ddvmprd.getCROS_DR_LMT(),1).length;
		System.arraycopy(FormatUtils.getForStr(ddvmprd.getCROS_CR_LMT(),1), 0, bytes, index, FormatUtils.getForStr(ddvmprd.getCROS_CR_LMT(),1).length);
		index += FormatUtils.getForStr(ddvmprd.getCROS_CR_LMT(),1).length;
		System.arraycopy(FormatUtils.getForStr(ddvmprd.getREMARK(),240), 0, bytes, index, FormatUtils.getForStr(ddvmprd.getREMARK(),240).length);
		index += FormatUtils.getForStr(ddvmprd.getREMARK(),240).length;
		System.arraycopy(FormatUtils.getForStr(DD,1), 0, bytes, index, FormatUtils.getForStr(DD,1).length);
		index += FormatUtils.getForStr(DD,1).length;
		System.out.println("总长度：" +index);
		return bytes;
	}
}
