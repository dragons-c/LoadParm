package com.gaoyang.loadparm.entity;

import org.springframework.stereotype.Component;

//活期产品参数
@Component
public class Ddvmprd {
	private String PRDMO_CD;
	private String PARM_CODE;
	private String CHN_NAME;
	private String PRD_TYP;
	private String SA_TYP;
	private String CUST_TYPE;
	private String CUR_TYPE;
	private String CCY;
	private String PRD_TOOL_PSB;
	private String PRD_TOOL_CARD;
	private String PRD_TOOL_CHQ;
	private String OVERDRAFT_FAC;
	private String CAL_DINT_METH;
	private String TAX_RATE_BASE;
	private String TAX_RATE_TENOR;
	private String DEP_POST_PERIOD1;
	private String DEP_POST_DATE1;
	private String OD_POST_PERIOD1;
	private String OD_POST_DATE1;
	private String DEP_POST_PERIOD2;
	private String DEP_POST_DATE2;
	private String OD_POST_PERIOD2;
	private String OD_POST_DATE2;
	private String CASH_TXN_TYPE;
	private String CASH_MSG_TYPE;
	private String CROS_DR_LMT;
	private String CROS_CR_LMT;
	private String REMARK;

	public Ddvmprd() {
		this.PRDMO_CD = " ";
		this.PARM_CODE = " ";
		this.CHN_NAME = " ";
		this.PRD_TYP = " ";
		this.SA_TYP = " ";
		this.CUST_TYPE = " ";
		this.CUR_TYPE = " ";
		this.CCY = " ";
		this.PRD_TOOL_PSB = " ";
		this.PRD_TOOL_CARD = " ";
		this.PRD_TOOL_CHQ = " ";
		this.OVERDRAFT_FAC = " ";
		this.CAL_DINT_METH = " ";
		this.TAX_RATE_BASE = " ";
		this.TAX_RATE_TENOR = " ";
		this.DEP_POST_PERIOD1 = " ";
		this.DEP_POST_DATE1 = " ";
		this.OD_POST_PERIOD1 = " ";
		this.OD_POST_DATE1 = " ";
		this.DEP_POST_PERIOD2 = " ";
		this.DEP_POST_DATE2 = " ";
		this.OD_POST_PERIOD2 = " ";
		this.OD_POST_DATE2 = " ";
		this.CASH_TXN_TYPE = " ";
		this.CASH_MSG_TYPE = " ";
		this.CROS_DR_LMT = " ";
		this.CROS_CR_LMT = " ";
		this.REMARK = " ";
	}

	public String getPRDMO_CD() {
		return PRDMO_CD;
	}

	public void setPRDMO_CD(String PRDMO_CD) {
		this.PRDMO_CD = PRDMO_CD;
	}

	public String getPARM_CODE() {
		return PARM_CODE;
	}

	public void setPARM_CODE(String PARM_CODE) {
		this.PARM_CODE = PARM_CODE;
	}

	public String getCHN_NAME() {
		return CHN_NAME;
	}

	public void setCHN_NAME(String CHN_NAME) {
		this.CHN_NAME = CHN_NAME;
	}

	public String getPRD_TYP() {
		return PRD_TYP;
	}

	public void setPRD_TYP(String PRD_TYP) {
		this.PRD_TYP = PRD_TYP;
	}

	public String getSA_TYP() {
		return SA_TYP;
	}

	public void setSA_TYP(String SA_TYP) {
		this.SA_TYP = SA_TYP;
	}

	public String getCUST_TYPE() {
		return CUST_TYPE;
	}

	public void setCUST_TYPE(String CUST_TYPE) {
		this.CUST_TYPE = CUST_TYPE;
	}

	public String getCUR_TYPE() {
		return CUR_TYPE;
	}

	public void setCUR_TYPE(String CUR_TYPE) {
		this.CUR_TYPE = CUR_TYPE;
	}

	public String getCCY() {
		return CCY;
	}

	public void setCCY(String CCY) {
		this.CCY = CCY;
	}

	public String getPRD_TOOL_PSB() {
		return PRD_TOOL_PSB;
	}

	public void setPRD_TOOL_PSB(String PRD_TOOL_PSB) {
		this.PRD_TOOL_PSB = PRD_TOOL_PSB;
	}

	public String getPRD_TOOL_CARD() {
		return PRD_TOOL_CARD;
	}

	public void setPRD_TOOL_CARD(String PRD_TOOL_CARD) {
		this.PRD_TOOL_CARD = PRD_TOOL_CARD;
	}

	public String getPRD_TOOL_CHQ() {
		return PRD_TOOL_CHQ;
	}

	public void setPRD_TOOL_CHQ(String PRD_TOOL_CHQ) {
		this.PRD_TOOL_CHQ = PRD_TOOL_CHQ;
	}

	public String getOVERDRAFT_FAC() {
		return OVERDRAFT_FAC;
	}

	public void setOVERDRAFT_FAC(String OVERDRAFT_FAC) {
		this.OVERDRAFT_FAC = OVERDRAFT_FAC;
	}

	public String getCAL_DINT_METH() {
		return CAL_DINT_METH;
	}

	public void setCAL_DINT_METH(String CAL_DINT_METH) {
		this.CAL_DINT_METH = CAL_DINT_METH;
	}

	public String getTAX_RATE_BASE() {
		return TAX_RATE_BASE;
	}

	public void setTAX_RATE_BASE(String TAX_RATE_BASE) {
		this.TAX_RATE_BASE = TAX_RATE_BASE;
	}

	public String getTAX_RATE_TENOR() {
		return TAX_RATE_TENOR;
	}

	public void setTAX_RATE_TENOR(String TAX_RATE_TENOR) {
		this.TAX_RATE_TENOR = TAX_RATE_TENOR;
	}

	public String getDEP_POST_PERIOD1() {
		return DEP_POST_PERIOD1;
	}

	public void setDEP_POST_PERIOD1(String DEP_POST_PERIOD1) {
		this.DEP_POST_PERIOD1 = DEP_POST_PERIOD1;
	}

	public String getDEP_POST_DATE1() {
		return DEP_POST_DATE1;
	}

	public void setDEP_POST_DATE1(String DEP_POST_DATE1) {
		this.DEP_POST_DATE1 = DEP_POST_DATE1;
	}

	public String getOD_POST_PERIOD1() {
		return OD_POST_PERIOD1;
	}

	public void setOD_POST_PERIOD1(String OD_POST_PERIOD1) {
		this.OD_POST_PERIOD1 = OD_POST_PERIOD1;
	}

	public String getOD_POST_DATE1() {
		return OD_POST_DATE1;
	}

	public void setOD_POST_DATE1(String OD_POST_DATE1) {
		this.OD_POST_DATE1 = OD_POST_DATE1;
	}

	public String getDEP_POST_PERIOD2() {
		return DEP_POST_PERIOD2;
	}

	public void setDEP_POST_PERIOD2(String DEP_POST_PERIOD2) {
		this.DEP_POST_PERIOD2 = DEP_POST_PERIOD2;
	}

	public String getDEP_POST_DATE2() {
		return DEP_POST_DATE2;
	}

	public void setDEP_POST_DATE2(String DEP_POST_DATE2) {
		this.DEP_POST_DATE2 = DEP_POST_DATE2;
	}

	public String getOD_POST_PERIOD2() {
		return OD_POST_PERIOD2;
	}

	public void setOD_POST_PERIOD2(String OD_POST_PERIOD2) {
		this.OD_POST_PERIOD2 = OD_POST_PERIOD2;
	}

	public String getOD_POST_DATE2() {
		return OD_POST_DATE2;
	}

	public void setOD_POST_DATE2(String OD_POST_DATE2) {
		this.OD_POST_DATE2 = OD_POST_DATE2;
	}

	public String getCASH_TXN_TYPE() {
		return CASH_TXN_TYPE;
	}

	public void setCASH_TXN_TYPE(String CASH_TXN_TYPE) {
		this.CASH_TXN_TYPE = CASH_TXN_TYPE;
	}

	public String getCASH_MSG_TYPE() {
		return CASH_MSG_TYPE;
	}

	public void setCASH_MSG_TYPE(String CASH_MSG_TYPE) {
		this.CASH_MSG_TYPE = CASH_MSG_TYPE;
	}

	public String getCROS_DR_LMT() {
		return CROS_DR_LMT;
	}

	public void setCROS_DR_LMT(String CROS_DR_LMT) {
		this.CROS_DR_LMT = CROS_DR_LMT;
	}

	public String getCROS_CR_LMT() {
		return CROS_CR_LMT;
	}

	public void setCROS_CR_LMT(String CROS_CR_LMT) {
		this.CROS_CR_LMT = CROS_CR_LMT;
	}

	public String getREMARK() {
		return REMARK;
	}

	public void setREMARK(String REMARK) {
		this.REMARK = REMARK;
	}
}
