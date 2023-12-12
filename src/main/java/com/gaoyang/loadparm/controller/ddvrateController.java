package com.gaoyang.loadparm.controller;

import com.gaoyang.loadparm.entity.Bptparm;
import com.gaoyang.loadparm.entity.BptparmKey;
import com.gaoyang.loadparm.entity.Ddvmprd;
import com.gaoyang.loadparm.entity.Ddvrate;
import com.gaoyang.loadparm.service.BptparmService;
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
public class ddvrateController {
	@Autowired
	BptparmService bptparmService;
	private final  String DD = " ";
	@RequestMapping("/ddvrate")
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
//			String[] str2 = {};
			Ddvrate ddvrate = new Ddvrate();
			ddvrate.setPRDMO_CD("CAAC");
			ddvrate.setPARM_CODE((String) list.get(0));
			ddvrate.setCDESC((String) list.get(1));
			String[] str = ((String)list.get(2)).split("、");



			for (int j = 0 ; j < str.length; j++ ){
				if(list.get(3) != null){
				    String[] str2 = ((String)list.get(3)).split("/");
//					if(str2.length == 3){
					if(str[j].equals("LAK")){
						 String[] str3 = str2[0].replace(" ", "").split("LAK");
						System.out.println("LAK"+str3[0]);
						 if (str3[0].equals("100,000")){
							 ddvrate.setMIN_AMT("0000000010000000");
						 }else if (str3[0].equals("50,000")){
							 ddvrate.setMIN_AMT("0000000005000000");
						 }else if (str3[0].equals("500,000")){
							 ddvrate.setMIN_AMT("0000000050000000");
						 }else{
							 ddvrate.setMIN_AMT("0000000000000000");
						 }

					}else if(str2.length > 1 && str[j].equals("USD")){
						if (str2[1] != "" && str2[1].contains("USD")){
							String[] str4 = str2[1].replace(" ", "").split("USD");
							System.out.println("USD"+str4[0]);
							if (str4[0].equals("10")){
								ddvrate.setMIN_AMT("0000000000001000");
							}else if (str4[0].equals("50")){
								ddvrate.setMIN_AMT("0000000000005000");
							}
						}else{
							ddvrate.setMIN_AMT("0000000000000000");
						}

					}else if(str2.length > 2 && str[j].equals("THB")){
						if(str2[2] != "" && str2[2].contains("THB")){
							String[] str5 = str2[2].replace(" ", "").split("THB");
							System.out.println("THB"+str5[0]);
							if (str5[0].equals("1,000")){
								ddvrate.setMIN_AMT("0000000000100000");
							}else if (str5[0].equals("2,000")){
								ddvrate.setMIN_AMT("0000000000200000");
							}else if (str5[0].equals("500")){
								ddvrate.setMIN_AMT("0000000000050000");
							}
						}else{
							ddvrate.setMIN_AMT("0000000000000000");
						}

					 }else{
						ddvrate.setMIN_AMT("0000000000000000");
					}
//					}
//					else if(str2.length == 4){
//						if(str[j].equals("LAK")){
//							ddvrate.setMIN_AMT("0000000050000000");
//						}else if(str[j].equals("USD")){
//							ddvrate.setMIN_AMT("0000000000005000");
//						}else if(str[j].equals("THB")){
//							ddvrate.setMIN_AMT("0000000000200000");
//						}else if(str[j].equals("CNY")){
//							ddvrate.setMIN_AMT("0000000000050000");
//						}else{
//							ddvrate.setMIN_AMT("0000000000000000");
//						}
//					}

				}else {
					ddvrate.setMIN_AMT("0000000000000000");
				}

				ddvrate.setCCY(str[j]);
				ddvrate.setTIER_TYPE("A");
				ddvrate.setAMT_TIER_TYPE("A");
				ddvrate.setTAMT("9999999999999999");
				ddvrate.setSPR_TYPE("1");
				ddvrate.setINT_RBAS(list.get(11).toString());
				ddvrate.setINT_RCD(list.get(12).toString());
				if(list.get(13) != null){
                  ddvrate.setOD_INT_RBAS(list.get(13).toString());
                  ddvrate.setUOD_INT_RBAS(list.get(13).toString());
				}
				if(list.get(14) != null){
                   ddvrate.setOD_INT_RCD(list.get(14).toString());
                   ddvrate.setUOD_INT_RCD(list.get(14).toString());
				}
				ddvrate.setHL_FLG("H");
				ddvrate.setMAX_RATE("10");
				ddvrate.setMIN_RATE("0.1");
				saveParm(ddvrate);
			}
		}


		return "success";
	}


	public void saveParm(Ddvrate ddvrate){
		Bptparm bptparm = new Bptparm();
		BptparmKey bptparmKey = new BptparmKey();
		bptparm.setTYPE("PDRAT");
		int len1 = ddvrate.getPARM_CODE().length();
		int len2 = 8 - len1;
		String str = "";
		for(int i = 0; i< len2; i++){
			str +=" ";
		}
		System.out.println("空格长度："+str.length());
		bptparm.setCODE("999999"+ddvrate.getPARM_CODE()+str+ddvrate.getCCY());
		System.out.println(bptparm.getCODE());
		bptparm.setCDESC(ddvrate.getCDESC());
		//bptparm.setDESC(lnrctlpm.getDESC());
		bptparm.setEFF_DATE(20000101);
		bptparm.setEXP_DATE(99991231);
		bptparm.setVAL(objectToByte(953,ddvrate));
		bptparm.setUPD_DATE(20200713);
		bptparm.setUPD_BR(888010);
		bptparm.setUPD_TLR("BCELDR2");

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
	public byte[] objectToByte(int size,Ddvrate ddvrate) {
		byte[] bytes = new byte[size];
		System.arraycopy(FormatUtils.getForStr(ddvrate.getPRDMO_CD(),4), 0, bytes, 0, FormatUtils.getForStr(ddvrate.getPRDMO_CD(),4).length);
		int index = FormatUtils.getForStr(ddvrate.getPRDMO_CD(),4).length;
		System.arraycopy(FormatUtils.getForStr(ddvrate.getPARM_CODE(),8), 0, bytes, index, FormatUtils.getForStr(ddvrate.getPARM_CODE(),8).length);
		index += FormatUtils.getForStr(ddvrate.getPARM_CODE(),8).length;
		System.arraycopy(FormatUtils.getForStr(ddvrate.getCCY(),3), 0, bytes, index, FormatUtils.getForStr(ddvrate.getCCY(),3).length);
		index += FormatUtils.getForStr(ddvrate.getCCY(),3).length;
		System.arraycopy(FormatUtils.getForStr(ddvrate.getMIN_AMT(),16), 0, bytes, index, FormatUtils.getForStr(ddvrate.getMIN_AMT(),16).length);
		index += FormatUtils.getForStr(ddvrate.getMIN_AMT(),16).length;
		System.arraycopy(FormatUtils.getForStr(ddvrate.getTIER_TYPE(),1), 0, bytes, index, FormatUtils.getForStr(ddvrate.getTIER_TYPE(),1).length);
		index += FormatUtils.getForStr(ddvrate.getTIER_TYPE(),1).length;
		System.arraycopy(FormatUtils.getForStr(ddvrate.getAMT_TIER_TYPE(),1), 0, bytes, index, FormatUtils.getForStr(ddvrate.getAMT_TIER_TYPE(),1).length);
		index += FormatUtils.getForStr(ddvrate.getAMT_TIER_TYPE(),1).length;
		System.arraycopy(FormatUtils.getForStr(ddvrate.getTAMT(),16), 0, bytes, index, FormatUtils.getForStr(ddvrate.getTAMT(),16).length);
		index += FormatUtils.getForStr(ddvrate.getTAMT(),16).length;
		System.arraycopy(FormatUtils.getForStr(DD,14), 0, bytes, index, FormatUtils.getForStr(DD,14).length);
		index += FormatUtils.getForStr(DD,14).length;
		System.arraycopy(FormatUtils.getForStr(ddvrate.getSPR_TYPE(),1), 0, bytes, index, FormatUtils.getForStr(ddvrate.getSPR_TYPE(),1).length);
		index += FormatUtils.getForStr(ddvrate.getSPR_TYPE(),1).length;

		System.arraycopy(FormatUtils.getForStr(ddvrate.getINT_RBAS(),3), 0, bytes, index, FormatUtils.getForStr(ddvrate.getINT_RBAS(),3).length);
		index += FormatUtils.getForStr(ddvrate.getINT_RBAS(),3).length;
		System.arraycopy(FormatUtils.getForStr(ddvrate.getINT_RCD(),4), 0, bytes, index, FormatUtils.getForStr(ddvrate.getINT_RCD(),4).length);
		index += FormatUtils.getForStr(ddvrate.getINT_RCD(),4).length;
		System.arraycopy(FormatUtils.getForStr(ddvrate.getTIER_SPR(),8), 0, bytes, index, FormatUtils.getForStr(ddvrate.getTIER_SPR(),8).length);
		index += FormatUtils.getForStr(ddvrate.getTIER_SPR(),8).length;
		System.arraycopy(FormatUtils.getForStr(ddvrate.getTIER_SPR_PCT(),5), 0, bytes, index, FormatUtils.getForStr(ddvrate.getTIER_SPR_PCT(),5).length);
		index += FormatUtils.getForStr(ddvrate.getTIER_SPR_PCT(),5).length;
		System.arraycopy(FormatUtils.getForStr(DD,80), 0, bytes, index, FormatUtils.getForStr(DD,80).length);
		index += FormatUtils.getForStr(DD,80).length;

		System.arraycopy(FormatUtils.getForStr(ddvrate.getHL_FLG(),1), 0, bytes, index, FormatUtils.getForStr(ddvrate.getHL_FLG(),1).length);
		index += FormatUtils.getForStr(ddvrate.getHL_FLG(),1).length;
		System.arraycopy(FormatUtils.getForStr(ddvrate.getMAX_RATE(),12), 0, bytes, index, FormatUtils.getForStr(ddvrate.getMAX_RATE(),12).length);
		index += FormatUtils.getForStr(ddvrate.getMAX_RATE(),12).length;
		System.arraycopy(FormatUtils.getForStr(ddvrate.getMIN_RATE(),12), 0, bytes, index, FormatUtils.getForStr(ddvrate.getMIN_RATE(),12).length);
		index += FormatUtils.getForStr(ddvrate.getMIN_RATE(),12).length;
		System.arraycopy(FormatUtils.getForStr(DD,12), 0, bytes, index, FormatUtils.getForStr(DD,12).length);
		index += FormatUtils.getForStr(DD,12).length;



		System.arraycopy(FormatUtils.getForStr(DD,672), 0, bytes, index, FormatUtils.getForStr(DD,672).length);
		index += FormatUtils.getForStr(DD,672).length;
		System.arraycopy(FormatUtils.getForStr(ddvrate.getOD_INT_RBAS(),3), 0, bytes, index, FormatUtils.getForStr(ddvrate.getOD_INT_RBAS(),3).length);
		index += FormatUtils.getForStr(ddvrate.getOD_INT_RBAS(),3).length;
		System.arraycopy(FormatUtils.getForStr(ddvrate.getOD_INT_RCD(),4), 0, bytes, index, FormatUtils.getForStr(ddvrate.getOD_INT_RCD(),4).length);
		index += FormatUtils.getForStr(ddvrate.getOD_INT_RCD(),4).length;
		System.arraycopy(FormatUtils.getForStr(DD,25), 0, bytes, index, FormatUtils.getForStr(DD,25).length);
		index += FormatUtils.getForStr(DD,25).length;
		System.arraycopy(FormatUtils.getForStr(ddvrate.getUOD_INT_RBAS(),3), 0, bytes, index, FormatUtils.getForStr(ddvrate.getUOD_INT_RBAS(),3).length);
		index += FormatUtils.getForStr(ddvrate.getUOD_INT_RBAS(),3).length;
		System.arraycopy(FormatUtils.getForStr(ddvrate.getUOD_INT_RCD(),4), 0, bytes, index, FormatUtils.getForStr(ddvrate.getUOD_INT_RCD(),4).length);
		index += FormatUtils.getForStr(ddvrate.getUOD_INT_RCD(),4).length;
		System.arraycopy(FormatUtils.getForStr(DD,41), 0, bytes, index, FormatUtils.getForStr(DD,41).length);
		index += FormatUtils.getForStr(DD,41).length;
		System.out.println("总长度：" +index);
		return bytes;
	}


}
