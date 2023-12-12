package com.gaoyang.loadparm.entity;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Date;
@Component
public class Bptporgm extends BptporgmKey {
	private BigDecimal EFF_DATE;

	private BigDecimal EXP_DATE;

	private String DESC;

	private String CDESC;

	private BigDecimal SUPR_BR;

	private String ATTR;

	private String LVL;

	private String TYP;

	private BigDecimal EFF_DT;

	private BigDecimal EXP_DT;

	private String CHN_NM;

	private String CHN_ADDR;

	private String ENG_NM;

	private String ENG_ADDR;

	private String ABBR;

	private String LINK_MAN;

	private String LINK_TEL;

	private String POST;

	private String TLR_MAX;

	private String ATH_MAX;

	private String FX_BUSI;

	private BigDecimal CNAP_NO;

	private String ACCT_FLG;

	private BigDecimal OPN_DT;

	private String RUN_HDAY;

	private String RUN_MODE;

	private String CALD_CD;

	private BigDecimal OPN_TM;

	private BigDecimal CLS_TM;

	private BigDecimal HOPN_TM;

	private BigDecimal HCLS_TM;

	private BigDecimal UPT_DT;

	private String UPT_TLR;

	private String FAX;

	private String TELEX;

	private String PRO_FLG;

	private String COST_FLG;

	private BigDecimal GL_MST;

	private String DEF_PTR;

	private String PAY_PTR;

	private String CFM_PTR;

	private String SWF_ID;

	private String BIC_NO;

	private String IBAN_NO;

	private BigDecimal CI_LEN;

	private String COUN_CD;

	private String CITY_CD;

	private String UNSCH_HOL;

	private BigDecimal UNSCH_HOL_TM;

	private String OPN_CHECK_FLG;

	private String VOU_CHECK_FLG;

	private String INT_TAX_FLG;

	private BigDecimal ERP_BRAN;

	private String ORG_FLG;

	private BigDecimal BRANCH_BR;

	private String FTZ_CD;

	private String BOP_CD;

	private String CIC_CD;

	private String FII_CD;
	private String CD_FLG;

	public String getCD_FLG() {
		return CD_FLG;
	}

	public void setCD_FLG(String CD_FLG) {
		this.CD_FLG = CD_FLG;
	}

	private BigDecimal UPD_DATE;

	private BigDecimal UPD_BR;

	private String UPD_TLR;

	private Date TS;

	public BigDecimal getEFF_DATE() {
		return EFF_DATE;
	}

	public void setEFF_DATE(BigDecimal EFF_DATE) {
		this.EFF_DATE = EFF_DATE;
	}

	public BigDecimal getEXP_DATE() {
		return EXP_DATE;
	}

	public void setEXP_DATE(BigDecimal EXP_DATE) {
		this.EXP_DATE = EXP_DATE;
	}

	public String getDESC() {
		return DESC;
	}

	public void setDESC(String DESC) {
		this.DESC = DESC == null ? null : DESC.trim();
	}

	public String getCDESC() {
		return CDESC;
	}

	public void setCDESC(String CDESC) {
		this.CDESC = CDESC == null ? null : CDESC.trim();
	}

	public BigDecimal getSUPR_BR() {
		return SUPR_BR;
	}

	public void setSUPR_BR(BigDecimal SUPR_BR) {
		this.SUPR_BR = SUPR_BR;
	}

	public String getATTR() {
		return ATTR;
	}

	public void setATTR(String ATTR) {
		this.ATTR = ATTR == null ? null : ATTR.trim();
	}

	public String getLVL() {
		return LVL;
	}

	public void setLVL(String LVL) {
		this.LVL = LVL == null ? null : LVL.trim();
	}

	public String getTYP() {
		return TYP;
	}

	public void setTYP(String TYP) {
		this.TYP = TYP == null ? null : TYP.trim();
	}

	public BigDecimal getEFF_DT() {
		return EFF_DT;
	}

	public void setEFF_DT(BigDecimal EFF_DT) {
		this.EFF_DT = EFF_DT;
	}

	public BigDecimal getEXP_DT() {
		return EXP_DT;
	}

	public void setEXP_DT(BigDecimal EXP_DT) {
		this.EXP_DT = EXP_DT;
	}

	public String getCHN_NM() {
		return CHN_NM;
	}

	public void setCHN_NM(String CHN_NM) {
		this.CHN_NM = CHN_NM == null ? null : CHN_NM.trim();
	}

	public String getCHN_ADDR() {
		return CHN_ADDR;
	}

	public void setCHN_ADDR(String CHN_ADDR) {
		this.CHN_ADDR = CHN_ADDR == null ? null : CHN_ADDR.trim();
	}

	public String getENG_NM() {
		return ENG_NM;
	}

	public void setENG_NM(String ENG_NM) {
		this.ENG_NM = ENG_NM == null ? null : ENG_NM.trim();
	}

	public String getENG_ADDR() {
		return ENG_ADDR;
	}

	public void setENG_ADDR(String ENG_ADDR) {
		this.ENG_ADDR = ENG_ADDR == null ? null : ENG_ADDR.trim();
	}

	public String getABBR() {
		return ABBR;
	}

	public void setABBR(String ABBR) {
		this.ABBR = ABBR == null ? null : ABBR.trim();
	}

	public String getLINK_MAN() {
		return LINK_MAN;
	}

	public void setLINK_MAN(String LINK_MAN) {
		this.LINK_MAN = LINK_MAN == null ? null : LINK_MAN.trim();
	}

	public String getLINK_TEL() {
		return LINK_TEL;
	}

	public void setLINK_TEL(String LINK_TEL) {
		this.LINK_TEL = LINK_TEL == null ? null : LINK_TEL.trim();
	}

	public String getPOST() {
		return POST;
	}

	public void setPOST(String POST) {
		this.POST = POST == null ? null : POST.trim();
	}

	public String getTLR_MAX() {
		return TLR_MAX;
	}

	public void setTLR_MAX(String TLR_MAX) {
		this.TLR_MAX = TLR_MAX == null ? null : TLR_MAX.trim();
	}

	public String getATH_MAX() {
		return ATH_MAX;
	}

	public void setATH_MAX(String ATH_MAX) {
		this.ATH_MAX = ATH_MAX == null ? null : ATH_MAX.trim();
	}

	public String getFX_BUSI() {
		return FX_BUSI;
	}

	public void setFX_BUSI(String FX_BUSI) {
		this.FX_BUSI = FX_BUSI == null ? null : FX_BUSI.trim();
	}

	public BigDecimal getCNAP_NO() {
		return CNAP_NO;
	}

	public void setCNAP_NO(BigDecimal CNAP_NO) {
		this.CNAP_NO = CNAP_NO;
	}

	public String getACCT_FLG() {
		return ACCT_FLG;
	}

	public void setACCT_FLG(String ACCT_FLG) {
		this.ACCT_FLG = ACCT_FLG == null ? null : ACCT_FLG.trim();
	}

	public BigDecimal getOPN_DT() {
		return OPN_DT;
	}

	public void setOPN_DT(BigDecimal OPN_DT) {
		this.OPN_DT = OPN_DT;
	}

	public String getRUN_HDAY() {
		return RUN_HDAY;
	}

	public void setRUN_HDAY(String RUN_HDAY) {
		this.RUN_HDAY = RUN_HDAY == null ? null : RUN_HDAY.trim();
	}

	public String getRUN_MODE() {
		return RUN_MODE;
	}

	public void setRUN_MODE(String RUN_MODE) {
		this.RUN_MODE = RUN_MODE == null ? null : RUN_MODE.trim();
	}

	public String getCALD_CD() {
		return CALD_CD;
	}

	public void setCALD_CD(String CALD_CD) {
		this.CALD_CD = CALD_CD == null ? null : CALD_CD.trim();
	}

	public BigDecimal getOPN_TM() {
		return OPN_TM;
	}

	public void setOPN_TM(BigDecimal OPN_TM) {
		this.OPN_TM = OPN_TM;
	}

	public BigDecimal getCLS_TM() {
		return CLS_TM;
	}

	public void setCLS_TM(BigDecimal CLS_TM) {
		this.CLS_TM = CLS_TM;
	}

	public BigDecimal getHOPN_TM() {
		return HOPN_TM;
	}

	public void setHOPN_TM(BigDecimal HOPN_TM) {
		this.HOPN_TM = HOPN_TM;
	}

	public BigDecimal getHCLS_TM() {
		return HCLS_TM;
	}

	public void setHCLS_TM(BigDecimal HCLS_TM) {
		this.HCLS_TM = HCLS_TM;
	}

	public BigDecimal getUPT_DT() {
		return UPT_DT;
	}

	public void setUPT_DT(BigDecimal UPT_DT) {
		this.UPT_DT = UPT_DT;
	}

	public String getUPT_TLR() {
		return UPT_TLR;
	}

	public void setUPT_TLR(String UPT_TLR) {
		this.UPT_TLR = UPT_TLR == null ? null : UPT_TLR.trim();
	}

	public String getFAX() {
		return FAX;
	}

	public void setFAX(String FAX) {
		this.FAX = FAX == null ? null : FAX.trim();
	}

	public String getTELEX() {
		return TELEX;
	}

	public void setTELEX(String TELEX) {
		this.TELEX = TELEX == null ? null : TELEX.trim();
	}

	public String getPRO_FLG() {
		return PRO_FLG;
	}

	public void setPRO_FLG(String PRO_FLG) {
		this.PRO_FLG = PRO_FLG == null ? null : PRO_FLG.trim();
	}

	public String getCOST_FLG() {
		return COST_FLG;
	}

	public void setCOST_FLG(String COST_FLG) {
		this.COST_FLG = COST_FLG == null ? null : COST_FLG.trim();
	}

	public BigDecimal getGL_MST() {
		return GL_MST;
	}

	public void setGL_MST(BigDecimal GL_MST) {
		this.GL_MST = GL_MST;
	}

	public String getDEF_PTR() {
		return DEF_PTR;
	}

	public void setDEF_PTR(String DEF_PTR) {
		this.DEF_PTR = DEF_PTR == null ? null : DEF_PTR.trim();
	}

	public String getPAY_PTR() {
		return PAY_PTR;
	}

	public void setPAY_PTR(String PAY_PTR) {
		this.PAY_PTR = PAY_PTR == null ? null : PAY_PTR.trim();
	}

	public String getCFM_PTR() {
		return CFM_PTR;
	}

	public void setCFM_PTR(String CFM_PTR) {
		this.CFM_PTR = CFM_PTR == null ? null : CFM_PTR.trim();
	}

	public String getSWF_ID() {
		return SWF_ID;
	}

	public void setSWF_ID(String SWF_ID) {
		this.SWF_ID = SWF_ID == null ? null : SWF_ID.trim();
	}

	public String getBIC_NO() {
		return BIC_NO;
	}

	public void setBIC_NO(String BIC_NO) {
		this.BIC_NO = BIC_NO == null ? null : BIC_NO.trim();
	}

	public String getIBAN_NO() {
		return IBAN_NO;
	}

	public void setIBAN_NO(String IBAN_NO) {
		this.IBAN_NO = IBAN_NO == null ? null : IBAN_NO.trim();
	}

	public BigDecimal getCI_LEN() {
		return CI_LEN;
	}

	public void setCI_LEN(BigDecimal CI_LEN) {
		this.CI_LEN = CI_LEN;
	}

	public String getCOUN_CD() {
		return COUN_CD;
	}

	public void setCOUN_CD(String COUN_CD) {
		this.COUN_CD = COUN_CD == null ? null : COUN_CD.trim();
	}

	public String getCITY_CD() {
		return CITY_CD;
	}

	public void setCITY_CD(String CITY_CD) {
		this.CITY_CD = CITY_CD == null ? null : CITY_CD.trim();
	}

	public String getUNSCH_HOL() {
		return UNSCH_HOL;
	}

	public void setUNSCH_HOL(String UNSCH_HOL) {
		this.UNSCH_HOL = UNSCH_HOL == null ? null : UNSCH_HOL.trim();
	}

	public BigDecimal getUNSCH_HOL_TM() {
		return UNSCH_HOL_TM;
	}

	public void setUNSCH_HOL_TM(BigDecimal UNSCH_HOL_TM) {
		this.UNSCH_HOL_TM = UNSCH_HOL_TM;
	}

	public String getOPN_CHECK_FLG() {
		return OPN_CHECK_FLG;
	}

	public void setOPN_CHECK_FLG(String OPN_CHECK_FLG) {
		this.OPN_CHECK_FLG = OPN_CHECK_FLG == null ? null : OPN_CHECK_FLG.trim();
	}

	public String getVOU_CHECK_FLG() {
		return VOU_CHECK_FLG;
	}

	public void setVOU_CHECK_FLG(String VOU_CHECK_FLG) {
		this.VOU_CHECK_FLG = VOU_CHECK_FLG == null ? null : VOU_CHECK_FLG.trim();
	}

	public String getINT_TAX_FLG() {
		return INT_TAX_FLG;
	}

	public void setINT_TAX_FLG(String INT_TAX_FLG) {
		this.INT_TAX_FLG = INT_TAX_FLG == null ? null : INT_TAX_FLG.trim();
	}

	public BigDecimal getERP_BRAN() {
		return ERP_BRAN;
	}

	public void setERP_BRAN(BigDecimal ERP_BRAN) {
		this.ERP_BRAN = ERP_BRAN;
	}

	public String getORG_FLG() {
		return ORG_FLG;
	}

	public void setORG_FLG(String ORG_FLG) {
		this.ORG_FLG = ORG_FLG == null ? null : ORG_FLG.trim();
	}

	public BigDecimal getBRANCH_BR() {
		return BRANCH_BR;
	}

	public void setBRANCH_BR(BigDecimal BRANCH_BR) {
		this.BRANCH_BR = BRANCH_BR;
	}

	public String getFTZ_CD() {
		return FTZ_CD;
	}

	public void setFTZ_CD(String FTZ_CD) {
		this.FTZ_CD = FTZ_CD == null ? null : FTZ_CD.trim();
	}

	public String getBOP_CD() {
		return BOP_CD;
	}

	public void setBOP_CD(String BOP_CD) {
		this.BOP_CD = BOP_CD == null ? null : BOP_CD.trim();
	}

	public String getCIC_CD() {
		return CIC_CD;
	}

	public void setCIC_CD(String CIC_CD) {
		this.CIC_CD = CIC_CD == null ? null : CIC_CD.trim();
	}

	public String getFII_CD() {
		return FII_CD;
	}

	public void setFII_CD(String FII_CD) {
		this.FII_CD = FII_CD == null ? null : FII_CD.trim();
	}

	public BigDecimal getUPD_DATE() {
		return UPD_DATE;
	}

	public void setUPD_DATE(BigDecimal UPD_DATE) {
		this.UPD_DATE = UPD_DATE;
	}

	public BigDecimal getUPD_BR() {
		return UPD_BR;
	}

	public void setUPD_BR(BigDecimal UPD_BR) {
		this.UPD_BR = UPD_BR;
	}

	public String getUPD_TLR() {
		return UPD_TLR;
	}

	public void setUPD_TLR(String UPD_TLR) {
		this.UPD_TLR = UPD_TLR == null ? null : UPD_TLR.trim();
	}

	public Date getTS() {
		return TS;
	}

	public void setTS(Date TS) {
		this.TS = TS;
	}
}