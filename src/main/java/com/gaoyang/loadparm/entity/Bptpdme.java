package com.gaoyang.loadparm.entity;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Date;
@Component
public class Bptpdme {
    private String PRDT_CODE;

	public Bptpdme( ) {
		this.PRDT_CODE = " ";
		this.PRDT_NAME = " ";
		this.BUSI_TYPE = " ";
		this.CTRACT_GROUP = " ";
		this.PRDT_MODEL = " ";
		this.PRDT_MODEL1 = " ";
		this.PRDT_MODEL2 = " ";
		this.PRDT_MODEL3 = " ";
		this.PRDT_MODEL4 = " ";
		this.PRDT_MODEL5 = " ";
		this.STS = " ";
		this.PRDT_IND = " ";
		this.DESC = " ";
		this.EFF_DATE = new BigDecimal(0);
		this.EXP_DATE = new BigDecimal(0);
		this.STOP_SOLD_DATE = new BigDecimal(0);
		this.PARM_CODE = " ";
		this.AC_RULE = " ";
		this.ACCR_TYPE = " ";
		this.RISK_LVL = " ";
		this.PRDT_MANEGER = " ";
		this.ASS_BR = new BigDecimal(0);
		this.OPEN_DATE = new BigDecimal(0);
		this.LAST_DATE = new BigDecimal(0);
		this.LAST_TLT = " ";
		this.TS = new Date();
	}

	private String PRDT_NAME;

    private String BUSI_TYPE;

    private String CTRACT_GROUP;

    private String PRDT_MODEL;

    private String PRDT_MODEL1;

    private String PRDT_MODEL2;

    private String PRDT_MODEL3;

    private String PRDT_MODEL4;

    private String PRDT_MODEL5;

    private String STS;

    private String PRDT_IND;

    private String DESC;

    private BigDecimal EFF_DATE;

    private BigDecimal EXP_DATE;

    private BigDecimal STOP_SOLD_DATE;

    private String PARM_CODE;

    private String AC_RULE;

    private String ACCR_TYPE;

    private String RISK_LVL;

    private String PRDT_MANEGER;

    private BigDecimal ASS_BR;

    private BigDecimal OPEN_DATE;

    private BigDecimal LAST_DATE;

    private String LAST_TLT;

    private Date TS;

    public String getPRDT_CODE() {
        return PRDT_CODE;
    }

    public void setPRDT_CODE(String PRDT_CODE) {
        this.PRDT_CODE = PRDT_CODE == null ? " " : PRDT_CODE.trim();
    }

    public String getPRDT_NAME() {
        return PRDT_NAME;
    }

    public void setPRDT_NAME(String PRDT_NAME) {
        this.PRDT_NAME = PRDT_NAME == null ? " " : PRDT_NAME.trim();
    }

    public String getBUSI_TYPE() {
        return BUSI_TYPE;
    }

    public void setBUSI_TYPE(String BUSI_TYPE) {
        this.BUSI_TYPE = BUSI_TYPE == null ? " " : BUSI_TYPE.trim();
    }

    public String getCTRACT_GROUP() {
        return CTRACT_GROUP;
    }

    public void setCTRACT_GROUP(String CTRACT_GROUP) {
        this.CTRACT_GROUP = CTRACT_GROUP == null ? " " : CTRACT_GROUP.trim();
    }

    public String getPRDT_MODEL() {
        return PRDT_MODEL;
    }

    public void setPRDT_MODEL(String PRDT_MODEL) {
        this.PRDT_MODEL = PRDT_MODEL == null ? " " : PRDT_MODEL.trim();
    }

    public String getPRDT_MODEL1() {
        return PRDT_MODEL1;
    }

    public void setPRDT_MODEL1(String PRDT_MODEL1) {
        this.PRDT_MODEL1 = PRDT_MODEL1 == null ? " " : PRDT_MODEL1.trim();
    }

    public String getPRDT_MODEL2() {
        return PRDT_MODEL2;
    }

    public void setPRDT_MODEL2(String PRDT_MODEL2) {
        this.PRDT_MODEL2 = PRDT_MODEL2 == null ? " " : PRDT_MODEL2.trim();
    }

    public String getPRDT_MODEL3() {
        return PRDT_MODEL3;
    }

    public void setPRDT_MODEL3(String PRDT_MODEL3) {
        this.PRDT_MODEL3 = PRDT_MODEL3 == null ? " " : PRDT_MODEL3.trim();
    }

    public String getPRDT_MODEL4() {
        return PRDT_MODEL4;
    }

    public void setPRDT_MODEL4(String PRDT_MODEL4) {
        this.PRDT_MODEL4 = PRDT_MODEL4 == null ? " " : PRDT_MODEL4.trim();
    }

    public String getPRDT_MODEL5() {
        return PRDT_MODEL5;
    }

    public void setPRDT_MODEL5(String PRDT_MODEL5) {
        this.PRDT_MODEL5 = PRDT_MODEL5 == null ? " " : PRDT_MODEL5.trim();
    }

    public String getSTS() {
        return STS;
    }

    public void setSTS(String STS) {
        this.STS = STS == null ? " " : STS.trim();
    }

    public String getPRDT_IND() {
        return PRDT_IND;
    }

    public void setPRDT_IND(String PRDT_IND) {
        this.PRDT_IND = PRDT_IND == null ? " " : PRDT_IND.trim();
    }

    public String getDESC() {
        return DESC;
    }

    public void setDESC(String DESC) {
        this.DESC = DESC == null ? " " : DESC.trim();
    }

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

    public BigDecimal getSTOP_SOLD_DATE() {
        return STOP_SOLD_DATE;
    }

    public void setSTOP_SOLD_DATE(BigDecimal STOP_SOLD_DATE) {
        this.STOP_SOLD_DATE = STOP_SOLD_DATE;
    }

    public String getPARM_CODE() {
        return PARM_CODE;
    }

    public void setPARM_CODE(String PARM_CODE) {
        this.PARM_CODE = PARM_CODE == null ? " " : PARM_CODE.trim();
    }

    public String getAC_RULE() {
        return AC_RULE;
    }

    public void setAC_RULE(String AC_RULE) {
        this.AC_RULE = AC_RULE == null ? " " : AC_RULE.trim();
    }

    public String getACCR_TYPE() {
        return ACCR_TYPE;
    }

    public void setACCR_TYPE(String ACCR_TYPE) {
        this.ACCR_TYPE = ACCR_TYPE == null ? " " : ACCR_TYPE.trim();
    }

    public String getRISK_LVL() {
        return RISK_LVL;
    }

    public void setRISK_LVL(String RISK_LVL) {
        this.RISK_LVL = RISK_LVL == null ? " " : RISK_LVL.trim();
    }

    public String getPRDT_MANEGER() {
        return PRDT_MANEGER;
    }

    public void setPRDT_MANEGER(String PRDT_MANEGER) {
        this.PRDT_MANEGER = PRDT_MANEGER == null ? null : PRDT_MANEGER.trim();
    }

    public BigDecimal getASS_BR() {
        return ASS_BR;
    }

    public void setASS_BR(BigDecimal ASS_BR) {
        this.ASS_BR = ASS_BR;
    }

    public BigDecimal getOPEN_DATE() {
        return OPEN_DATE;
    }

    public void setOPEN_DATE(BigDecimal OPEN_DATE) {
        this.OPEN_DATE = OPEN_DATE;
    }

    public BigDecimal getLAST_DATE() {
        return LAST_DATE;
    }

    public void setLAST_DATE(BigDecimal LAST_DATE) {
        this.LAST_DATE = LAST_DATE;
    }

    public String getLAST_TLT() {
        return LAST_TLT;
    }

    public void setLAST_TLT(String LAST_TLT) {
        this.LAST_TLT = LAST_TLT == null ? " " : LAST_TLT.trim();
    }

    public Date getTS() {
        return TS;
    }

    public void setTS(Date TS) {
        this.TS = TS;
    }
}