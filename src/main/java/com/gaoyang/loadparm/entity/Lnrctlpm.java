package com.gaoyang.loadparm.entity;

import java.math.BigDecimal;

public class Lnrctlpm {
	private String TYP;
	private String CD;
	private String DESC;
	private String CDESC;
	private String PRODMO;
	private byte[] CCY = new byte[0];
	private String HOL_TBL_NO;
	private String SPLT_FLG;
	private String MRG_FLG;
	private String RNTL_FLG;
	private String SUBS_FLG;
	private String REDRW_FLG;
	private String DEFER_FLG;
	private String CTRT_FLG;
	private String AUTGEN_LMT_FLG;
	private String LMT_FLG;
	private String ITM_IDX_CD1 ;
	private String ITM_IDX_MSK1;
	private String ITM_IDX_CD2;
	private String ITM_IDX_MSK2;
	private String ITM_IDX_CD3;
	private String ITM_IDX_MSK3;
	private String ITM_IDX_CD4;
	private String ITM_IDX_MSK4;
	private String ITM_IDX_CD5;
	private String ITM_IDX_MSK5;
	private String DRAW_SCHD_FLG;
	private String DRAW_SCHD_MTH;
	private String PART_DRAW_FLG;
	private String PART_MRG_FLG;
	private String CMB_INT_MTH;
	private String CMB_PLN_MTH;
	private BigDecimal MIN_WHD_AMT;
	private String DUE_WHD_MTH;
	private BigDecimal AUTO_WHD_PERD;
	private String AUTO_WHD_MTH;
	private String PAY_MTH;
	private String INST_MTH;
	private String PAY_PSEQ_CD1 ;
	private String PAY_SEQ_MSK1 ;
	private String PAY_PSEQ_CD2;
	private String PAY_SEQ_MSK2;
	private String PAY_PSEQ_CD3;
	private String PAY_SEQ_MSK3;
	private BigDecimal REPY_PRTY;
	private String SPRD_REPY_FLG;
	private String RMI_INT_FLG;
	private String PI_RMI_MTH;
	private String STRK_BAL_MTH;
	private String PRE_PAY_FLG;
	private BigDecimal MIN_PRPY_AMT;
	private BigDecimal MAX_PRPY_CNT;
	private BigDecimal FST_PRPY_TERM;
	private String IOVD_TYP;
	private String PRPY_PTPL_MTH;
	private String PRPY_INT_MTH;
	private String FUL_PAY_FLG;
	private String FULPAY_INT_MTH;
	private String PEN_RUL_FLG;
	private String PEN_FLG;
	private String PEN_RUL;
	private String INST_RBD_MTH;
	private String CPT_PLN_MTH;
	private String INST_RST_RUL;
	private String FST_INST_MTH;
	private BigDecimal INST_CEL_RAT;
	private BigDecimal INST_FLR_RAT;
	private String LOAN_CAL_PERD_FLG;
	private BigDecimal CAL_PERD;
	private String CAL_PERD_UNIT;
	private BigDecimal INCR_PERD;
	private String CINT_RUL;
	private String MTR_INT_MTH;
	private String RND_MTH;
	private String P_HOL_MTH;
	private String I_HOL_MTH;
	private BigDecimal PRIN_DOG_MTH;
	private String PRIN_DOG;
	private String INT_DOG_MTH;
	private BigDecimal INT_DOG;
	private String IRAT_SET_FLG;
	private String IRAT_CD;
	private String IRAT_VALDT_ID;
	private String IRAT_RLT_MTH;
	private String FLT_MTH;
	private BigDecimal FLT_PERD;
	private String FLT_PERD_UNIT;
	private String CAPT_FLG;
	private String CAP_FLG;
	private BigDecimal CAP_PERD;
	private String BUD_FLG;
	private String BUD_PERD;
	private String BUD_MTH;
	private BigDecimal INT_DAYS;
	private String RLT_FLG;
	private BigDecimal DRAW_DAY_CNT;
	private BigDecimal LNDUE_DAY_CNT;
	private String CLASSED;
	private String Commit_Flag;
	private String Commit_Type;
	private String Accrual_Type;
	private String Holiday_Method;
	private String Holiday_Override;
	private String PROD_CLASS;
	private String COMMIT_FLG;
	private String SCP_PAY_SCH2;
	private String SCP_PAY_SCH3;
	private String SCP_PAY_SCH4;
	private String SC_INS_METH2;
	private String SC_INS_METH3;
	private String SRC_FLG;
	private String LNAC_FLG;
	private String PART_PAY_FLG;
	private String OD_PAY_FLG;
	private String PENALTY_FLG;
	private String CALR_STD;
	private String REF_CTY_CODE_INF;
	private String CARRY_FLAG;
	private String DEC_DIGITS;
	private String TR_FLG;
	private BigDecimal TAX_PCT;
	private BigDecimal ADVANCE_DAY;
	private String HOL_CAL_MTH;
	private String AC_TYPE;
	private String DICT_TYP;
	private String GROUP_TYP;
	private String[] GROUP;
	private String[] CI_BASE;
	private String[] FLOAT_MTH;
	private BigDecimal[] ADD_RAT;
	private BigDecimal[] INT_PER;
	//额度代码
    private String LIMIT_CODE;
    //表内外
	private String TABLE_FLG;
	//可循环
	private String CIRCLE_FLG;
	//产品模型
	private String PROJECT_MODEL;
	//产品业务分类
	private String BUSI_TYPE;

	public String getPROJECT_MODEL() {
		return PROJECT_MODEL;
	}

	public void setPROJECT_MODEL(String PROJECT_MODEL) {
		this.PROJECT_MODEL = PROJECT_MODEL;
	}

	public String getBUSI_TYPE() {
		return BUSI_TYPE;
	}

	public void setBUSI_TYPE(String BUSI_TYPE) {
		this.BUSI_TYPE = BUSI_TYPE;
	}

	public String getLIMIT_CODE() {
		return LIMIT_CODE;
	}

	public void setLIMIT_CODE(String LIMIT_CODE) {
		this.LIMIT_CODE = LIMIT_CODE;
	}

	public String getTABLE_FLG() {
		return TABLE_FLG;
	}

	public void setTABLE_FLG(String TABLE_FLG) {
		this.TABLE_FLG = TABLE_FLG;
	}

	public String getCIRCLE_FLG() {
		return CIRCLE_FLG;
	}

	public void setCIRCLE_FLG(String CIRCLE_FLG) {
		this.CIRCLE_FLG = CIRCLE_FLG;
	}

	public void setTYP(String TYP) {
		this.TYP = TYP;
	}

	public void setCD(String CD) {
		this.CD = CD;
	}

	public void setDESC(String DESC) {
		this.DESC = DESC;
	}

	public void setCDESC(String CDESC) {
		this.CDESC = CDESC;
	}

	public void setPRODMO(String PRODMO) {
		this.PRODMO = PRODMO;
	}

	public void setCCY(byte[] CCY) {
		this.CCY = CCY;
	}

	public void setHOL_TBL_NO(String HOL_TBL_NO) {
		this.HOL_TBL_NO = HOL_TBL_NO;
	}

	public void setSPLT_FLG(String SPLT_FLG) {
		this.SPLT_FLG = SPLT_FLG;
	}

	public void setMRG_FLG(String MRG_FLG) {
		this.MRG_FLG = MRG_FLG;
	}

	public void setRNTL_FLG(String RNTL_FLG) {
		this.RNTL_FLG = RNTL_FLG;
	}

	public void setSUBS_FLG(String SUBS_FLG) {
		this.SUBS_FLG = SUBS_FLG;
	}

	public void setREDRW_FLG(String REDRW_FLG) {
		this.REDRW_FLG = REDRW_FLG;
	}

	public void setDEFER_FLG(String DEFER_FLG) {
		this.DEFER_FLG = DEFER_FLG;
	}

	public void setCTRT_FLG(String CTRT_FLG) {
		this.CTRT_FLG = CTRT_FLG;
	}

	public void setAUTGEN_LMT_FLG(String AUTGEN_LMT_FLG) {
		this.AUTGEN_LMT_FLG = AUTGEN_LMT_FLG;
	}

	public void setLMT_FLG(String LMT_FLG) {
		this.LMT_FLG = LMT_FLG;
	}

	public void setITM_IDX_CD1(String ITM_IDX_CD1) {
		this.ITM_IDX_CD1 = ITM_IDX_CD1;
	}

	public void setITM_IDX_MSK1(String ITM_IDX_MSK1) {
		this.ITM_IDX_MSK1 = ITM_IDX_MSK1;
	}

	public void setITM_IDX_CD2(String ITM_IDX_CD2) {
		this.ITM_IDX_CD2 = ITM_IDX_CD2;
	}

	public void setITM_IDX_MSK2(String ITM_IDX_MSK2) {
		this.ITM_IDX_MSK2 = ITM_IDX_MSK2;
	}

	public void setITM_IDX_CD3(String ITM_IDX_CD3) {
		this.ITM_IDX_CD3 = ITM_IDX_CD3;
	}

	public void setITM_IDX_MSK3(String ITM_IDX_MSK3) {
		this.ITM_IDX_MSK3 = ITM_IDX_MSK3;
	}

	public void setITM_IDX_CD4(String ITM_IDX_CD4) {
		this.ITM_IDX_CD4 = ITM_IDX_CD4;
	}

	public void setITM_IDX_MSK4(String ITM_IDX_MSK4) {
		this.ITM_IDX_MSK4 = ITM_IDX_MSK4;
	}

	public void setITM_IDX_CD5(String ITM_IDX_CD5) {
		this.ITM_IDX_CD5 = ITM_IDX_CD5;
	}

	public void setITM_IDX_MSK5(String ITM_IDX_MSK5) {
		this.ITM_IDX_MSK5 = ITM_IDX_MSK5;
	}

	public void setDRAW_SCHD_FLG(String DRAW_SCHD_FLG) {
		this.DRAW_SCHD_FLG = DRAW_SCHD_FLG;
	}

	public void setDRAW_SCHD_MTH(String DRAW_SCHD_MTH) {
		this.DRAW_SCHD_MTH = DRAW_SCHD_MTH;
	}

	public void setPART_DRAW_FLG(String PART_DRAW_FLG) {
		this.PART_DRAW_FLG = PART_DRAW_FLG;
	}

	public void setPART_MRG_FLG(String PART_MRG_FLG) {
		this.PART_MRG_FLG = PART_MRG_FLG;
	}

	public void setCMB_INT_MTH(String CMB_INT_MTH) {
		this.CMB_INT_MTH = CMB_INT_MTH;
	}

	public void setCMB_PLN_MTH(String CMB_PLN_MTH) {
		this.CMB_PLN_MTH = CMB_PLN_MTH;
	}

	public void setMIN_WHD_AMT(BigDecimal MIN_WHD_AMT) {
		this.MIN_WHD_AMT = MIN_WHD_AMT;
	}

	public void setDUE_WHD_MTH(String DUE_WHD_MTH) {
		this.DUE_WHD_MTH = DUE_WHD_MTH;
	}

	public void setAUTO_WHD_PERD(BigDecimal AUTO_WHD_PERD) {
		this.AUTO_WHD_PERD = AUTO_WHD_PERD;
	}

	public void setAUTO_WHD_MTH(String AUTO_WHD_MTH) {
		this.AUTO_WHD_MTH = AUTO_WHD_MTH;
	}

	public void setPAY_MTH(String PAY_MTH) {
		this.PAY_MTH = PAY_MTH;
	}

	public void setINST_MTH(String INST_MTH) {
		this.INST_MTH = INST_MTH;
	}

	public void setPAY_PSEQ_CD1(String PAY_PSEQ_CD1) {
		this.PAY_PSEQ_CD1 = PAY_PSEQ_CD1;
	}

	public void setPAY_SEQ_MSK1(String PAY_SEQ_MSK1) {
		this.PAY_SEQ_MSK1 = PAY_SEQ_MSK1;
	}

	public void setPAY_PSEQ_CD2(String PAY_PSEQ_CD2) {
		this.PAY_PSEQ_CD2 = PAY_PSEQ_CD2;
	}

	public void setPAY_SEQ_MSK2(String PAY_SEQ_MSK2) {
		this.PAY_SEQ_MSK2 = PAY_SEQ_MSK2;
	}

	public void setPAY_PSEQ_CD3(String PAY_PSEQ_CD3) {
		this.PAY_PSEQ_CD3 = PAY_PSEQ_CD3;
	}

	public void setPAY_SEQ_MSK3(String PAY_SEQ_MSK3) {
		this.PAY_SEQ_MSK3 = PAY_SEQ_MSK3;
	}

	public void setREPY_PRTY(BigDecimal REPY_PRTY) {
		this.REPY_PRTY = REPY_PRTY;
	}

	public void setSPRD_REPY_FLG(String SPRD_REPY_FLG) {
		this.SPRD_REPY_FLG = SPRD_REPY_FLG;
	}

	public void setRMI_INT_FLG(String RMI_INT_FLG) {
		this.RMI_INT_FLG = RMI_INT_FLG;
	}

	public void setPI_RMI_MTH(String PI_RMI_MTH) {
		this.PI_RMI_MTH = PI_RMI_MTH;
	}

	public void setSTRK_BAL_MTH(String STRK_BAL_MTH) {
		this.STRK_BAL_MTH = STRK_BAL_MTH;
	}

	public void setPRE_PAY_FLG(String PRE_PAY_FLG) {
		this.PRE_PAY_FLG = PRE_PAY_FLG;
	}

	public void setMIN_PRPY_AMT(BigDecimal MIN_PRPY_AMT) {
		this.MIN_PRPY_AMT = MIN_PRPY_AMT;
	}

	public void setMAX_PRPY_CNT(BigDecimal MAX_PRPY_CNT) {
		this.MAX_PRPY_CNT = MAX_PRPY_CNT;
	}

	public void setFST_PRPY_TERM(BigDecimal FST_PRPY_TERM) {
		this.FST_PRPY_TERM = FST_PRPY_TERM;
	}

	public void setIOVD_TYP(String IOVD_TYP) {
		this.IOVD_TYP = IOVD_TYP;
	}

	public void setPRPY_PTPL_MTH(String PRPY_PTPL_MTH) {
		this.PRPY_PTPL_MTH = PRPY_PTPL_MTH;
	}

	public void setPRPY_INT_MTH(String PRPY_INT_MTH) {
		this.PRPY_INT_MTH = PRPY_INT_MTH;
	}

	public void setFUL_PAY_FLG(String FUL_PAY_FLG) {
		this.FUL_PAY_FLG = FUL_PAY_FLG;
	}

	public void setFULPAY_INT_MTH(String FULPAY_INT_MTH) {
		this.FULPAY_INT_MTH = FULPAY_INT_MTH;
	}

	public void setPEN_RUL_FLG(String PEN_RUL_FLG) {
		this.PEN_RUL_FLG = PEN_RUL_FLG;
	}

	public void setPEN_FLG(String PEN_FLG) {
		this.PEN_FLG = PEN_FLG;
	}

	public void setPEN_RUL(String PEN_RUL) {
		this.PEN_RUL = PEN_RUL;
	}

	public void setINST_RBD_MTH(String INST_RBD_MTH) {
		this.INST_RBD_MTH = INST_RBD_MTH;
	}

	public void setCPT_PLN_MTH(String CPT_PLN_MTH) {
		this.CPT_PLN_MTH = CPT_PLN_MTH;
	}

	public void setINST_RST_RUL(String INST_RST_RUL) {
		this.INST_RST_RUL = INST_RST_RUL;
	}

	public void setFST_INST_MTH(String FST_INST_MTH) {
		this.FST_INST_MTH = FST_INST_MTH;
	}

	public void setINST_CEL_RAT(BigDecimal INST_CEL_RAT) {
		this.INST_CEL_RAT = INST_CEL_RAT;
	}

	public void setINST_FLR_RAT(BigDecimal INST_FLR_RAT) {
		this.INST_FLR_RAT = INST_FLR_RAT;
	}

	public void setLOAN_CAL_PERD_FLG(String LOAN_CAL_PERD_FLG) {
		this.LOAN_CAL_PERD_FLG = LOAN_CAL_PERD_FLG;
	}

	public void setCAL_PERD(BigDecimal CAL_PERD) {
		this.CAL_PERD = CAL_PERD;
	}

	public void setCAL_PERD_UNIT(String CAL_PERD_UNIT) {
		this.CAL_PERD_UNIT = CAL_PERD_UNIT;
	}

	public void setINCR_PERD(BigDecimal INCR_PERD) {
		this.INCR_PERD = INCR_PERD;
	}

	public void setCINT_RUL(String CINT_RUL) {
		this.CINT_RUL = CINT_RUL;
	}

	public void setMTR_INT_MTH(String MTR_INT_MTH) {
		this.MTR_INT_MTH = MTR_INT_MTH;
	}

	public void setRND_MTH(String RND_MTH) {
		this.RND_MTH = RND_MTH;
	}

	public void setP_HOL_MTH(String p_HOL_MTH) {
		P_HOL_MTH = p_HOL_MTH;
	}

	public void setI_HOL_MTH(String i_HOL_MTH) {
		I_HOL_MTH = i_HOL_MTH;
	}

	public void setPRIN_DOG_MTH(BigDecimal PRIN_DOG_MTH) {
		this.PRIN_DOG_MTH = PRIN_DOG_MTH;
	}

	public void setPRIN_DOG(String PRIN_DOG) {
		this.PRIN_DOG = PRIN_DOG;
	}

	public void setINT_DOG_MTH(String INT_DOG_MTH) {
		this.INT_DOG_MTH = INT_DOG_MTH;
	}

	public void setINT_DOG(BigDecimal INT_DOG) {
		this.INT_DOG = INT_DOG;
	}

	public void setIRAT_SET_FLG(String IRAT_SET_FLG) {
		this.IRAT_SET_FLG = IRAT_SET_FLG;
	}

	public void setIRAT_CD(String IRAT_CD) {
		this.IRAT_CD = IRAT_CD;
	}

	public void setIRAT_VALDT_ID(String IRAT_VALDT_ID) {
		this.IRAT_VALDT_ID = IRAT_VALDT_ID;
	}

	public void setIRAT_RLT_MTH(String IRAT_RLT_MTH) {
		this.IRAT_RLT_MTH = IRAT_RLT_MTH;
	}

	public void setFLT_MTH(String FLT_MTH) {
		this.FLT_MTH = FLT_MTH;
	}

	public void setFLT_PERD(BigDecimal FLT_PERD) {
		this.FLT_PERD = FLT_PERD;
	}

	public void setFLT_PERD_UNIT(String FLT_PERD_UNIT) {
		this.FLT_PERD_UNIT = FLT_PERD_UNIT;
	}

	public void setCAPT_FLG(String CAPT_FLG) {
		this.CAPT_FLG = CAPT_FLG;
	}

	public void setCAP_FLG(String CAP_FLG) {
		this.CAP_FLG = CAP_FLG;
	}

	public void setCAP_PERD(BigDecimal CAP_PERD) {
		this.CAP_PERD = CAP_PERD;
	}

	public void setBUD_FLG(String BUD_FLG) {
		this.BUD_FLG = BUD_FLG;
	}

	public void setBUD_PERD(String BUD_PERD) {
		this.BUD_PERD = BUD_PERD;
	}

	public void setBUD_MTH(String BUD_MTH) {
		this.BUD_MTH = BUD_MTH;
	}

	public void setINT_DAYS(BigDecimal INT_DAYS) {
		this.INT_DAYS = INT_DAYS;
	}

	public void setRLT_FLG(String RLT_FLG) {
		this.RLT_FLG = RLT_FLG;
	}

	public void setDRAW_DAY_CNT(BigDecimal DRAW_DAY_CNT) {
		this.DRAW_DAY_CNT = DRAW_DAY_CNT;
	}

	public void setLNDUE_DAY_CNT(BigDecimal LNDUE_DAY_CNT) {
		this.LNDUE_DAY_CNT = LNDUE_DAY_CNT;
	}

	public void setClass(String aClass) {
		CLASSED = aClass;
	}

	public void setCommit_Flag(String commit_Flag) {
		Commit_Flag = commit_Flag;
	}

	public void setCommit_Type(String commit_Type) {
		Commit_Type = commit_Type;
	}

	public void setAccrual_Type(String accrual_Type) {
		Accrual_Type = accrual_Type;
	}

	public void setHoliday_Method(String holiday_Method) {
		Holiday_Method = holiday_Method;
	}

	public void setHoliday_Override(String holiday_Override) {
		Holiday_Override = holiday_Override;
	}

	public void setPROD_CLASS(String PROD_CLASS) {
		this.PROD_CLASS = PROD_CLASS;
	}

	public void setCOMMIT_FLG(String COMMIT_FLG) {
		this.COMMIT_FLG = COMMIT_FLG;
	}

	public void setSCP_PAY_SCH2(String SCP_PAY_SCH2) {
		this.SCP_PAY_SCH2 = SCP_PAY_SCH2;
	}

	public void setSCP_PAY_SCH3(String SCP_PAY_SCH3) {
		this.SCP_PAY_SCH3 = SCP_PAY_SCH3;
	}

	public void setSCP_PAY_SCH4(String SCP_PAY_SCH4) {
		this.SCP_PAY_SCH4 = SCP_PAY_SCH4;
	}

	public void setSC_INS_METH2(String SC_INS_METH2) {
		this.SC_INS_METH2 = SC_INS_METH2;
	}

	public void setSC_INS_METH3(String SC_INS_METH3) {
		this.SC_INS_METH3 = SC_INS_METH3;
	}

	public void setSRC_FLG(String SRC_FLG) {
		this.SRC_FLG = SRC_FLG;
	}

	public void setLNAC_FLG(String LNAC_FLG) {
		this.LNAC_FLG = LNAC_FLG;
	}

	public void setPART_PAY_FLG(String PART_PAY_FLG) {
		this.PART_PAY_FLG = PART_PAY_FLG;
	}

	public void setOD_PAY_FLG(String OD_PAY_FLG) {
		this.OD_PAY_FLG = OD_PAY_FLG;
	}

	public void setPENALTY_FLG(String PENALTY_FLG) {
		this.PENALTY_FLG = PENALTY_FLG;
	}

	public void setCALR_STD(String CALR_STD) {
		this.CALR_STD = CALR_STD;
	}

	public void setREF_CTY_CODE_INF(String REF_CTY_CODE_INF) {
		this.REF_CTY_CODE_INF = REF_CTY_CODE_INF;
	}

	public void setCARRY_FLAG(String CARRY_FLAG) {
		this.CARRY_FLAG = CARRY_FLAG;
	}

	public void setDEC_DIGITS(String DEC_DIGITS) {
		this.DEC_DIGITS = DEC_DIGITS;
	}

	public void setTR_FLG(String TR_FLG) {
		this.TR_FLG = TR_FLG;
	}

	public void setTAX_PCT(BigDecimal TAX_PCT) {
		this.TAX_PCT = TAX_PCT;
	}

	public void setADVANCE_DAY(BigDecimal ADVANCE_DAY) {
		this.ADVANCE_DAY = ADVANCE_DAY;
	}

	public void setHOL_CAL_MTH(String HOL_CAL_MTH) {
		this.HOL_CAL_MTH = HOL_CAL_MTH;
	}

	public void setAC_TYPE(String AC_TYPE) {
		this.AC_TYPE = AC_TYPE;
	}

	public void setDICT_TYP(String DICT_TYP) {
		this.DICT_TYP = DICT_TYP;
	}

	public void setGROUP_TYP(String GROUP_TYP) {
		this.GROUP_TYP = GROUP_TYP;
	}

	public void setGROUP(String[] GROUP) {
		this.GROUP = GROUP;
	}

	public void setCI_BASE(String[] CI_BASE) {
		this.CI_BASE = CI_BASE;
	}

	public void setFLOAT_MTH(String[] FLOAT_MTH) {
		this.FLOAT_MTH = FLOAT_MTH;
	}

	public void setADD_RAT(BigDecimal[] ADD_RAT) {
		this.ADD_RAT = ADD_RAT;
	}

	public void setINT_PER(BigDecimal[] INT_PER) {
		this.INT_PER = INT_PER;
	}

	public String getTYP() {
		return TYP;
	}

	public String getCD() {
		return CD;
	}

	public String getDESC() {
		return DESC;
	}

	public String getCDESC() {
		return CDESC;
	}

	public String getPRODMO() {
		return PRODMO;
	}

	public byte[] getCCY() {
		return CCY;
	}

	public String getHOL_TBL_NO() {
		return HOL_TBL_NO;
	}

	public String getSPLT_FLG() {
		return SPLT_FLG;
	}

	public String getMRG_FLG() {
		return MRG_FLG;
	}

	public String getRNTL_FLG() {
		return RNTL_FLG;
	}

	public String getSUBS_FLG() {
		return SUBS_FLG;
	}

	public String getREDRW_FLG() {
		return REDRW_FLG;
	}

	public String getDEFER_FLG() {
		return DEFER_FLG;
	}

	public String getCTRT_FLG() {
		return CTRT_FLG;
	}

	public String getAUTGEN_LMT_FLG() {
		return AUTGEN_LMT_FLG;
	}

	public String getLMT_FLG() {
		return LMT_FLG;
	}

	public String getITM_IDX_CD1() {
		return ITM_IDX_CD1;
	}

	public String getITM_IDX_MSK1() {
		return ITM_IDX_MSK1;
	}

	public String getITM_IDX_CD2() {
		return ITM_IDX_CD2;
	}

	public String getITM_IDX_MSK2() {
		return ITM_IDX_MSK2;
	}

	public String getITM_IDX_CD3() {
		return ITM_IDX_CD3;
	}

	public String getITM_IDX_MSK3() {
		return ITM_IDX_MSK3;
	}

	public String getITM_IDX_CD4() {
		return ITM_IDX_CD4;
	}

	public String getITM_IDX_MSK4() {
		return ITM_IDX_MSK4;
	}

	public String getITM_IDX_CD5() {
		return ITM_IDX_CD5;
	}

	public String getITM_IDX_MSK5() {
		return ITM_IDX_MSK5;
	}

	public String getDRAW_SCHD_FLG() {
		return DRAW_SCHD_FLG;
	}

	public String getDRAW_SCHD_MTH() {
		return DRAW_SCHD_MTH;
	}

	public String getPART_DRAW_FLG() {
		return PART_DRAW_FLG;
	}

	public String getPART_MRG_FLG() {
		return PART_MRG_FLG;
	}

	public String getCMB_INT_MTH() {
		return CMB_INT_MTH;
	}

	public String getCMB_PLN_MTH() {
		return CMB_PLN_MTH;
	}

	public BigDecimal getMIN_WHD_AMT() {
		return MIN_WHD_AMT;
	}

	public String getDUE_WHD_MTH() {
		return DUE_WHD_MTH;
	}

	public BigDecimal getAUTO_WHD_PERD() {
		return AUTO_WHD_PERD;
	}

	public String getAUTO_WHD_MTH() {
		return AUTO_WHD_MTH;
	}

	public String getPAY_MTH() {
		return PAY_MTH;
	}

	public String getINST_MTH() {
		return INST_MTH;
	}

	public String getPAY_PSEQ_CD1() {
		return PAY_PSEQ_CD1;
	}

	public String getPAY_SEQ_MSK1() {
		return PAY_SEQ_MSK1;
	}

	public String getPAY_PSEQ_CD2() {
		return PAY_PSEQ_CD2;
	}

	public String getPAY_SEQ_MSK2() {
		return PAY_SEQ_MSK2;
	}

	public String getPAY_PSEQ_CD3() {
		return PAY_PSEQ_CD3;
	}

	public String getPAY_SEQ_MSK3() {
		return PAY_SEQ_MSK3;
	}

	public BigDecimal getREPY_PRTY() {
		return REPY_PRTY;
	}

	public String getSPRD_REPY_FLG() {
		return SPRD_REPY_FLG;
	}

	public String getRMI_INT_FLG() {
		return RMI_INT_FLG;
	}

	public String getPI_RMI_MTH() {
		return PI_RMI_MTH;
	}

	public String getSTRK_BAL_MTH() {
		return STRK_BAL_MTH;
	}

	public String getPRE_PAY_FLG() {
		return PRE_PAY_FLG;
	}

	public BigDecimal getMIN_PRPY_AMT() {
		return MIN_PRPY_AMT;
	}

	public BigDecimal getMAX_PRPY_CNT() {
		return MAX_PRPY_CNT;
	}

	public BigDecimal getFST_PRPY_TERM() {
		return FST_PRPY_TERM;
	}

	public String getIOVD_TYP() {
		return IOVD_TYP;
	}

	public String getPRPY_PTPL_MTH() {
		return PRPY_PTPL_MTH;
	}

	public String getPRPY_INT_MTH() {
		return PRPY_INT_MTH;
	}

	public String getFUL_PAY_FLG() {
		return FUL_PAY_FLG;
	}

	public String getFULPAY_INT_MTH() {
		return FULPAY_INT_MTH;
	}

	public String getPEN_RUL_FLG() {
		return PEN_RUL_FLG;
	}

	public String getPEN_FLG() {
		return PEN_FLG;
	}

	public String getPEN_RUL() {
		return PEN_RUL;
	}

	public String getINST_RBD_MTH() {
		return INST_RBD_MTH;
	}

	public String getCPT_PLN_MTH() {
		return CPT_PLN_MTH;
	}

	public String getINST_RST_RUL() {
		return INST_RST_RUL;
	}

	public String getFST_INST_MTH() {
		return FST_INST_MTH;
	}

	public BigDecimal getINST_CEL_RAT() {
		return INST_CEL_RAT;
	}

	public BigDecimal getINST_FLR_RAT() {
		return INST_FLR_RAT;
	}

	public String getLOAN_CAL_PERD_FLG() {
		return LOAN_CAL_PERD_FLG;
	}

	public BigDecimal getCAL_PERD() {
		return CAL_PERD;
	}

	public String getCAL_PERD_UNIT() {
		return CAL_PERD_UNIT;
	}

	public BigDecimal getINCR_PERD() {
		return INCR_PERD;
	}

	public String getCINT_RUL() {
		return CINT_RUL;
	}

	public String getMTR_INT_MTH() {
		return MTR_INT_MTH;
	}

	public String getRND_MTH() {
		return RND_MTH;
	}

	public String getP_HOL_MTH() {
		return P_HOL_MTH;
	}

	public String getI_HOL_MTH() {
		return I_HOL_MTH;
	}

	public BigDecimal getPRIN_DOG_MTH() {
		return PRIN_DOG_MTH;
	}

	public String getPRIN_DOG() {
		return PRIN_DOG;
	}

	public String getINT_DOG_MTH() {
		return INT_DOG_MTH;
	}

	public BigDecimal getINT_DOG() {
		return INT_DOG;
	}

	public String getIRAT_SET_FLG() {
		return IRAT_SET_FLG;
	}

	public String getIRAT_CD() {
		return IRAT_CD;
	}

	public String getIRAT_VALDT_ID() {
		return IRAT_VALDT_ID;
	}

	public String getIRAT_RLT_MTH() {
		return IRAT_RLT_MTH;
	}

	public String getFLT_MTH() {
		return FLT_MTH;
	}

	public BigDecimal getFLT_PERD() {
		return FLT_PERD;
	}

	public String getFLT_PERD_UNIT() {
		return FLT_PERD_UNIT;
	}

	public String getCAPT_FLG() {
		return CAPT_FLG;
	}

	public String getCAP_FLG() {
		return CAP_FLG;
	}

	public BigDecimal getCAP_PERD() {
		return CAP_PERD;
	}

	public String getBUD_FLG() {
		return BUD_FLG;
	}

	public String getBUD_PERD() {
		return BUD_PERD;
	}

	public String getBUD_MTH() {
		return BUD_MTH;
	}

	public BigDecimal getINT_DAYS() {
		return INT_DAYS;
	}

	public String getRLT_FLG() {
		return RLT_FLG;
	}

	public BigDecimal getDRAW_DAY_CNT() {
		return DRAW_DAY_CNT;
	}

	public BigDecimal getLNDUE_DAY_CNT() {
		return LNDUE_DAY_CNT;
	}



	public String getCommit_Flag() {
		return Commit_Flag;
	}

	public String getCommit_Type() {
		return Commit_Type;
	}

	public String getAccrual_Type() {
		return Accrual_Type;
	}

	public String getHoliday_Method() {
		return Holiday_Method;
	}

	public String getHoliday_Override() {
		return Holiday_Override;
	}

	public String getPROD_CLASS() {
		return PROD_CLASS;
	}

	public String getCOMMIT_FLG() {
		return COMMIT_FLG;
	}

	public String getSCP_PAY_SCH2() {
		return SCP_PAY_SCH2;
	}

	public String getSCP_PAY_SCH3() {
		return SCP_PAY_SCH3;
	}

	public String getSCP_PAY_SCH4() {
		return SCP_PAY_SCH4;
	}

	public String getSC_INS_METH2() {
		return SC_INS_METH2;
	}

	public String getSC_INS_METH3() {
		return SC_INS_METH3;
	}

	public String getSRC_FLG() {
		return SRC_FLG;
	}

	public void setCLASSED(String CLASSED) {
		this.CLASSED = CLASSED;
	}

	public String getLNAC_FLG() {
		return LNAC_FLG;
	}

	public String getCLASSED() {
		return CLASSED;
	}

	public String getPART_PAY_FLG() {
		return PART_PAY_FLG;
	}

	public String getOD_PAY_FLG() {
		return OD_PAY_FLG;
	}

	public String getPENALTY_FLG() {
		return PENALTY_FLG;
	}

	public String getCALR_STD() {
		return CALR_STD;
	}

	public String getREF_CTY_CODE_INF() {
		return REF_CTY_CODE_INF;
	}

	public String getCARRY_FLAG() {
		return CARRY_FLAG;
	}

	public String getDEC_DIGITS() {
		return DEC_DIGITS;
	}

	public String getTR_FLG() {
		return TR_FLG;
	}

	public BigDecimal getTAX_PCT() {
		return TAX_PCT;
	}

	public BigDecimal getADVANCE_DAY() {
		return ADVANCE_DAY;
	}

	public String getHOL_CAL_MTH() {
		return HOL_CAL_MTH;
	}

	public String getAC_TYPE() {
		return AC_TYPE;
	}

	public String getDICT_TYP() {
		return DICT_TYP;
	}

	public String getGROUP_TYP() {
		return GROUP_TYP;
	}

	public String[] getGROUP() {
		return GROUP;
	}

	public String[] getCI_BASE() {
		return CI_BASE;
	}

	public String[] getFLOAT_MTH() {
		return FLOAT_MTH;
	}

	public BigDecimal[] getADD_RAT() {
		return ADD_RAT;
	}

	public BigDecimal[] getINT_PER() {
		return INT_PER;
	}
}
