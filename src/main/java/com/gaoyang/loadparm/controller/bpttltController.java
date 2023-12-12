package com.gaoyang.loadparm.controller;

import com.gaoyang.loadparm.entity.BpttltWithBLOBs;
import com.gaoyang.loadparm.service.BpttltService;
import com.gaoyang.loadparm.utils.ExcelUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/upload")
public class bpttltController {
	@Autowired
	BpttltService bpttltService;

	@RequestMapping("/bpttlt")
	@Transactional(rollbackFor = Exception.class)
	public String uploadBpttlt(MultipartFile fileTest, HttpServletRequest request) throws Exception {
//	try {
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
			BpttltWithBLOBs bpttltWithBLOBs = new BpttltWithBLOBs();
			if (list.get(0) != null){
				System.out.println((list.get(0)).toString().length());

					bpttltWithBLOBs.setTLR((String) list.get(0));


			}
			if (list.get(1) != null){
				bpttltWithBLOBs.setTLR_BR(Integer.parseInt((String) list.get(1)));
				bpttltWithBLOBs.setNEW_BR(Integer.parseInt((String) list.get(1)));
			}
			if (list.get(2) != null){
				System.out.println((list.get(2)).toString().length());
				bpttltWithBLOBs.setSTAF_NO((String) list.get(2));
			}
			if (list.get(3) != null){
				bpttltWithBLOBs.setTLR_CN_NM((String) list.get(3));
			}
			if (list.get(4) != null){
				bpttltWithBLOBs.setTLR_EN_NM((String) list.get(4));
			}
			if (list.get(5) != null){
				bpttltWithBLOBs.setEFF_DT(Integer.valueOf(list.get(5).toString()));
			}
			if (list.get(6) != null){
				bpttltWithBLOBs.setEXP_DT(Integer.valueOf(list.get(6).toString()));
			}
			if (list.get(7) != null){
				bpttltWithBLOBs.setTLR_TYP((String) list.get(7));
			}
			if (list.get(8) != null){
				bpttltWithBLOBs.setTLR_LVL((String) list.get(8));
			}
			if (list.get(9) != null){
				bpttltWithBLOBs.setTX_LVL((String) list.get(9));
				bpttltWithBLOBs.setTMP_TX_LVL((String) list.get(9));
			}
			if (list.get(10) != null){
				bpttltWithBLOBs.setATH_LVL((String) list.get(10));
				bpttltWithBLOBs.setTMP_ATH_LVL((String) list.get(10));
			}
			if (list.get(11) != null){
				bpttltWithBLOBs.setATH_RGN((String) list.get(11));
			}
			if (list.get(12) != null){
				bpttltWithBLOBs.setTX_MODE((String) list.get(12));
			}
			if (list.get(13) != null){
				bpttltWithBLOBs.setSIGN_STS((String) list.get(13));
			}
			if (list.get(14) != null){
				bpttltWithBLOBs.setTLR_STS((String) list.get(14));
			}
			if (list.get(15) != null){
				bpttltWithBLOBs.setCRO_BR_SIGN((String) list.get(15));
			}
			if (list.get(16) != null){
				bpttltWithBLOBs.setTRM_TYP((String) list.get(16));
			}
			if (list.get(17) != null){
				bpttltWithBLOBs.setEXCEL_FLG((String) list.get(17));
			}
			if (list.get(18) != null){
				String stsw = list.get(18).toString();
//					if(stsw.substring(0,1).equals("1") && stsw.substring(1,2).equals("1")){
//						throw new Exception("1,2位状态字错误" + list.get(18).toString());
//					}else if (stsw.substring(2,3).equals("1") && stsw.substring(3,4).equals("1")){
//						throw new Exception("3,4位状态字错误" + list.get(18).toString());
//					}else if (stsw.substring(7,8).equals("1") &&  stsw.substring(5,6).equals("1")){
//						throw new Exception("6,8位状态字错误" + list.get(18).toString());
//					}else{
					bpttltWithBLOBs.setTLR_STSW((String) list.get(18));
	//			}

			}
			System.out.println(list.get(18));
			if (list.get(19) != null){
				bpttltWithBLOBs.setLAST_JRN(Long.parseLong((String) list.get(19)) );
			}
			if (list.get(20) != null){
				bpttltWithBLOBs.setTELE((String) list.get(20));
			}
			if (list.get(21) != null){
				bpttltWithBLOBs.setPST_ADDRESS((String) list.get(21));
			}
			if (list.get(22) != null){
				bpttltWithBLOBs.setACC_SEN_CUS((String) list.get(22));
			}
			if (list.get(23) != null){
				bpttltWithBLOBs.setACC_SEN_GL((String) list.get(23));
			}
			if (list.get(24) != null){
				bpttltWithBLOBs.setSUPER_FLG((String) list.get(24));
			}
			if (list.get(25) != null){
				bpttltWithBLOBs.setDPT_NO((String) list.get(25));
			}
			if (list.get(26) != null){
				bpttltWithBLOBs.setAA_CODE((String) list.get(26));
			}
			bpttltWithBLOBs.setUPD_TLR("MIG"+ LocalDate.now().getMonthValue()+LocalDate.now().getDayOfMonth());
		//	bpttltWithBLOBs.setKB_PSW("ÀÇû¼ ]LÉ\u0098\u0087.D§F  ¤ ] ".getBytes());
         BpttltWithBLOBs bpttltWithBLOBs2  =   bpttltService.select(bpttltWithBLOBs.getTLR());
           if (bpttltWithBLOBs2 != null){
			   System.out.println("更新数据："+bpttltWithBLOBs.getTLR());
			   bpttltService.update(bpttltWithBLOBs);
		   }else{
			   System.out.println("增加数据："+bpttltWithBLOBs.getTLR());
			   bpttltService.add(bpttltWithBLOBs);
		   }



		}
//	} catch (Exception e) {
//		TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
//		System.out.println(new Date());
//		System.out.println(e.getMessage());
//	}
		return "success";
	}
}
