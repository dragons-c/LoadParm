package com.gaoyang.loadparm.entity;

import java.util.Date;

public class Bpttlt {
    private String TLR;

    private Integer TLR_BR;

    private Short TLR_TKS = 0;

    private String STAF_NO;

    private String TLR_CN_NM;

    private String TLR_EN_NM;

    private Integer EFF_DT;

    private Integer EXP_DT;

    private Integer UPD_DT = 0;

    private String UPD_TLR= " ";

    private String TLR_TYP= " ";

    private String TLR_LVL= " ";

    private String TX_LVL= " ";

    private String ATH_LVL = " ";

    private String ATH_RGN = " ";

    private String TMP_TX_LVL = " ";

    private String TMP_ATH_LVL = " ";

    private String TX_MODE = " ";

    private String SIGN_STS = " ";

    private String TLR_STS = " ";

    private Integer SIGN_DT  = 0;

    private String CRO_BR_SIGN = " ";

    private Integer SIGN_TIMES = 0;

    private Integer PSW_RETRY = 0;

    private String TRM_TYP = " ";

    private String SIGN_TRM = " ";

    private String PRT_IP = " ";

    private String TLR_STSW = " ";

    private Long LAST_JRN  = (long)0;

    private String ACC_VCH_NO = " ";

    private String TLR_CRD_NO = " ";

    private Integer CRD_PSW_DT = 0;

    private Integer KB_PSW_DT = 0;

    private String TELE = " ";

    private String PST_ADDRESS = " ";

    private String SIGN_TRM_FLG = " ";

    private String TRM_INFO = " ";

    private String PSW_TYP = " ";

    private String IDEN_DEV_ID = " ";

    private Integer NEW_BR ;

    private Integer NEW_BR_EFF = 0;

    private Integer TM_OUT_LMT = 0;

    private String ACC_SEN_CUS = " ";

    private String ACC_SEN_GL = " ";

    private String SUPER_FLG = " ";

    private String EXCEL_FLG = " ";

    private String DPT_NO = " ";

    private String ATH_CARD = " ";

    private String LDAP_ID = " ";

    private String PRT_NAME1 = " ";

    private String PRT_NAME2 = " ";

    private String PRT_NAME3 = " ";

    private String AA_CODE = " ";

    private Date TS;

	public String getTLR() {
		return TLR;
	}

	public void setTLR(String TLR) {
		this.TLR = TLR == null ? " " : TLR.trim();
	}

	public Integer getTLR_BR() {
		return TLR_BR;
	}

	public void setTLR_BR(Integer TLR_BR) {
		this.TLR_BR = TLR_BR;
	}

	public Short getTLR_TKS() {
		return TLR_TKS;
	}

	public void setTLR_TKS(Short TLR_TKS) {
		this.TLR_TKS = TLR_TKS;
	}

	public String getSTAF_NO() {
		return STAF_NO;
	}

	public void setSTAF_NO(String STAF_NO) {
		this.STAF_NO = STAF_NO == null ? " "  : STAF_NO.trim();
	}

	public String getTLR_CN_NM() {
		return TLR_CN_NM;
	}

	public void setTLR_CN_NM(String TLR_CN_NM) {
		this.TLR_CN_NM = TLR_CN_NM == null ? " "  : TLR_CN_NM.trim();
	}

	public String getTLR_EN_NM() {
		return TLR_EN_NM;
	}

	public void setTLR_EN_NM(String TLR_EN_NM) {
		this.TLR_EN_NM = TLR_EN_NM == null ? " "  : TLR_EN_NM.trim();
	}

	public Integer getEFF_DT() {
		return EFF_DT;
	}

	public void setEFF_DT(Integer EFF_DT) {
		this.EFF_DT = EFF_DT;
	}

	public Integer getEXP_DT() {
		return EXP_DT;
	}

	public void setEXP_DT(Integer EXP_DT) {
		this.EXP_DT = EXP_DT;
	}

	public Integer getUPD_DT() {
		return UPD_DT;
	}

	public void setUPD_DT(Integer UPD_DT) {
		this.UPD_DT = UPD_DT;
	}

	public String getUPD_TLR() {
		return UPD_TLR;
	}

	public void setUPD_TLR(String UPD_TLR) {
		this.UPD_TLR = UPD_TLR == null ? " "  : UPD_TLR.trim();
	}

	public String getTLR_TYP() {
		return TLR_TYP;
	}

	public void setTLR_TYP(String TLR_TYP) {
		this.TLR_TYP = TLR_TYP == null ? " "  : TLR_TYP.trim();
	}

	public String getTLR_LVL() {
		return TLR_LVL;
	}

	public void setTLR_LVL(String TLR_LVL) {
		this.TLR_LVL = TLR_LVL == null ? " "  : TLR_LVL.trim();
	}

	public String getTX_LVL() {
		return TX_LVL;
	}

	public void setTX_LVL(String TX_LVL) {
		this.TX_LVL = TX_LVL == null ? " "  : TX_LVL.trim();
	}

	public String getATH_LVL() {
		return ATH_LVL;
	}

	public void setATH_LVL(String ATH_LVL) {
		this.ATH_LVL = ATH_LVL == null ? " "  : ATH_LVL.trim();
	}

	public String getATH_RGN() {
		return ATH_RGN;
	}

	public void setATH_RGN(String ATH_RGN) {
		this.ATH_RGN = ATH_RGN == null ? " "  : ATH_RGN.trim();
	}

	public String getTMP_TX_LVL() {
		return TMP_TX_LVL;
	}

	public void setTMP_TX_LVL(String TMP_TX_LVL) {
		this.TMP_TX_LVL = TMP_TX_LVL == null ? " "  : TMP_TX_LVL.trim();
	}

	public String getTMP_ATH_LVL() {
		return TMP_ATH_LVL;
	}

	public void setTMP_ATH_LVL(String TMP_ATH_LVL) {
		this.TMP_ATH_LVL = TMP_ATH_LVL == null ? " "  : TMP_ATH_LVL.trim();
	}

	public String getTX_MODE() {
		return TX_MODE;
	}

	public void setTX_MODE(String TX_MODE) {
		this.TX_MODE = TX_MODE == null ? " "  : TX_MODE.trim();
	}

	public String getSIGN_STS() {
		return SIGN_STS;
	}

	public void setSIGN_STS(String SIGN_STS) {
		this.SIGN_STS = SIGN_STS == null ? " "  : SIGN_STS.trim();
	}

	public String getTLR_STS() {
		return TLR_STS;
	}

	public void setTLR_STS(String TLR_STS) {
		this.TLR_STS = TLR_STS == null ? " "  : TLR_STS.trim();
	}

	public Integer getSIGN_DT() {
		return SIGN_DT;
	}

	public void setSIGN_DT(Integer SIGN_DT) {
		this.SIGN_DT = SIGN_DT;
	}

	public String getCRO_BR_SIGN() {
		return CRO_BR_SIGN;
	}

	public void setCRO_BR_SIGN(String CRO_BR_SIGN) {
		this.CRO_BR_SIGN = CRO_BR_SIGN == null ? " "  : CRO_BR_SIGN.trim();
	}

	public Integer getSIGN_TIMES() {
		return SIGN_TIMES;
	}

	public void setSIGN_TIMES(Integer SIGN_TIMES) {
		this.SIGN_TIMES = SIGN_TIMES;
	}

	public Integer getPSW_RETRY() {
		return PSW_RETRY;
	}

	public void setPSW_RETRY(Integer PSW_RETRY) {
		this.PSW_RETRY = PSW_RETRY;
	}

	public String getTRM_TYP() {
		return TRM_TYP;
	}

	public void setTRM_TYP(String TRM_TYP) {
		this.TRM_TYP = TRM_TYP == null ? " "  : TRM_TYP.trim();
	}

	public String getSIGN_TRM() {
		return SIGN_TRM;
	}

	public void setSIGN_TRM(String SIGN_TRM) {
		this.SIGN_TRM = SIGN_TRM == null ? " "  : SIGN_TRM.trim();
	}

	public String getPRT_IP() {
		return PRT_IP;
	}

	public void setPRT_IP(String PRT_IP) {
		this.PRT_IP = PRT_IP == null ? " "  : PRT_IP.trim();
	}

	public String getTLR_STSW() {
		return TLR_STSW;
	}

	public void setTLR_STSW(String TLR_STSW) {
		this.TLR_STSW = TLR_STSW == null ? " "  : TLR_STSW.trim();
	}

	public Long getLAST_JRN() {
		return LAST_JRN;
	}

	public void setLAST_JRN(Long LAST_JRN) {
		this.LAST_JRN = LAST_JRN;
	}

	public String getACC_VCH_NO() {
		return ACC_VCH_NO;
	}

	public void setACC_VCH_NO(String ACC_VCH_NO) {
		this.ACC_VCH_NO = ACC_VCH_NO == null ? " "  : ACC_VCH_NO.trim();
	}

	public String getTLR_CRD_NO() {
		return TLR_CRD_NO;
	}

	public void setTLR_CRD_NO(String TLR_CRD_NO) {
		this.TLR_CRD_NO = TLR_CRD_NO == null ? " "  : TLR_CRD_NO.trim();
	}

	public Integer getCRD_PSW_DT() {
		return CRD_PSW_DT;
	}

	public void setCRD_PSW_DT(Integer CRD_PSW_DT) {
		this.CRD_PSW_DT = CRD_PSW_DT;
	}

	public Integer getKB_PSW_DT() {
		return KB_PSW_DT;
	}

	public void setKB_PSW_DT(Integer KB_PSW_DT) {
		this.KB_PSW_DT = KB_PSW_DT;
	}

	public String getTELE() {
		return TELE;
	}

	public void setTELE(String TELE) {
		this.TELE = TELE == null ? " "  : TELE.trim();
	}

	public String getPST_ADDRESS() {
		return PST_ADDRESS;
	}

	public void setPST_ADDRESS(String PST_ADDRESS) {
		this.PST_ADDRESS = PST_ADDRESS == null ? " "  : PST_ADDRESS.trim();
	}

	public String getSIGN_TRM_FLG() {
		return SIGN_TRM_FLG;
	}

	public void setSIGN_TRM_FLG(String SIGN_TRM_FLG) {
		this.SIGN_TRM_FLG = SIGN_TRM_FLG == null ? " "  : SIGN_TRM_FLG.trim();
	}

	public String getTRM_INFO() {
		return TRM_INFO;
	}

	public void setTRM_INFO(String TRM_INFO) {
		this.TRM_INFO = TRM_INFO == null ? " "  : TRM_INFO.trim();
	}

	public String getPSW_TYP() {
		return PSW_TYP;
	}

	public void setPSW_TYP(String PSW_TYP) {
		this.PSW_TYP = PSW_TYP == null ? " "  : PSW_TYP.trim();
	}

	public String getIDEN_DEV_ID() {
		return IDEN_DEV_ID;
	}

	public void setIDEN_DEV_ID(String IDEN_DEV_ID) {
		this.IDEN_DEV_ID = IDEN_DEV_ID == null ? " "  : IDEN_DEV_ID.trim();
	}

	public Integer getNEW_BR() {
		return NEW_BR;
	}

	public void setNEW_BR(Integer NEW_BR) {
		this.NEW_BR = NEW_BR;
	}

	public Integer getNEW_BR_EFF() {
		return NEW_BR_EFF;
	}

	public void setNEW_BR_EFF(Integer NEW_BR_EFF) {
		this.NEW_BR_EFF = NEW_BR_EFF;
	}

	public Integer getTM_OUT_LMT() {
		return TM_OUT_LMT;
	}

	public void setTM_OUT_LMT(Integer TM_OUT_LMT) {
		this.TM_OUT_LMT = TM_OUT_LMT;
	}

	public String getACC_SEN_CUS() {
		return ACC_SEN_CUS;
	}

	public void setACC_SEN_CUS(String ACC_SEN_CUS) {
		this.ACC_SEN_CUS = ACC_SEN_CUS == null ? " "  : ACC_SEN_CUS.trim();
	}

	public String getACC_SEN_GL() {
		return ACC_SEN_GL;
	}

	public void setACC_SEN_GL(String ACC_SEN_GL) {
		this.ACC_SEN_GL = ACC_SEN_GL == null ? " "  : ACC_SEN_GL.trim();
	}

	public String getSUPER_FLG() {
		return SUPER_FLG;
	}

	public void setSUPER_FLG(String SUPER_FLG) {
		this.SUPER_FLG = SUPER_FLG == null ? " "  : SUPER_FLG.trim();
	}

	public String getEXCEL_FLG() {
		return EXCEL_FLG;
	}

	public void setEXCEL_FLG(String EXCEL_FLG) {
		this.EXCEL_FLG = EXCEL_FLG == null ? " "  : EXCEL_FLG.trim();
	}

	public String getDPT_NO() {
		return DPT_NO;
	}

	public void setDPT_NO(String DPT_NO) {
		this.DPT_NO = DPT_NO == null ? " "  : DPT_NO.trim();
	}

	public String getATH_CARD() {
		return ATH_CARD;
	}

	public void setATH_CARD(String ATH_CARD) {
		this.ATH_CARD = ATH_CARD == null ? " "  : ATH_CARD.trim();
	}

	public String getLDAP_ID() {
		return LDAP_ID;
	}

	public void setLDAP_ID(String LDAP_ID) {
		this.LDAP_ID = LDAP_ID == null ? " "  : LDAP_ID.trim();
	}

	public String getPRT_NAME1() {
		return PRT_NAME1;
	}

	public void setPRT_NAME1(String PRT_NAME1) {
		this.PRT_NAME1 = PRT_NAME1 == null ? " "  : PRT_NAME1.trim();
	}

	public String getPRT_NAME2() {
		return PRT_NAME2;
	}

	public void setPRT_NAME2(String PRT_NAME2) {
		this.PRT_NAME2 = PRT_NAME2 == null ? " "  : PRT_NAME2.trim();
	}

	public String getPRT_NAME3() {
		return PRT_NAME3;
	}

	public void setPRT_NAME3(String PRT_NAME3) {
		this.PRT_NAME3 = PRT_NAME3 == null ? " "  : PRT_NAME3.trim();
	}

	public Date getTS() {
		return TS;
	}

	public void setTS(Date TS) {
		this.TS = TS;
	}

    public String getAA_CODE() {
        return AA_CODE;
    }

    public void setAA_CODE(String AA_CODE) {
        this.AA_CODE = AA_CODE == null ? " " : AA_CODE.trim();
    }

}