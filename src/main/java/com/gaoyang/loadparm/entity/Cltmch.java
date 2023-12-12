package com.gaoyang.loadparm.entity;

import java.util.Date;

public class Cltmch extends CltmchKey {
    private String TYPE;

    private String CI_NO;

    private String PROD_CODE;

    private String LMT_CODE;

    private String REC_STATUS;

    private Integer UNCONFMD_UNIT;

    private Integer CREATE_DATE;

    private String CREATE_TL;

    private Integer CREATE_UNIT;

    private Integer UPDATE_DATE;

    private String UPDATE_TL;

    private Integer UPDATE_UNIT;

    private Integer CONF_UNIT;

    private String CONF_SUP;

    private Integer CONF_DATE;

    private String OVER_SUP1;

    private String OVER_SUP2;

    private Short VER_NO;

    private Integer UPDTBL_DATE ;

    private Date TS;



    public Cltmch() {
        this.CI_NO="";
        this.UPDATE_DATE = 0;
        this.UPDATE_TL="";
        this.UPDATE_UNIT=0;
        this.CONF_UNIT=0;
        this.CONF_SUP="";
        this.CONF_DATE=0;
        this.OVER_SUP1="";
        this.OVER_SUP2="";
        this.UPDTBL_DATE=0;
        this.UNCONFMD_UNIT=0;
    }

    public String getTYPE() {
        return TYPE;
    }

    public void setTYPE(String TYPE) {
        this.TYPE = TYPE == null ? null : TYPE.trim();
    }

    public String getCI_NO() {
        return CI_NO;
    }

    public void setCI_NO(String CI_NO) {
        this.CI_NO = CI_NO == null ? null : CI_NO.trim();
    }

    public String getPROD_CODE() {
        return PROD_CODE;
    }

    public void setPROD_CODE(String PROD_CODE) {
        this.PROD_CODE = PROD_CODE == null ? null : PROD_CODE.trim();
    }

    public String getLMT_CODE() {
        return LMT_CODE;
    }

    public void setLMT_CODE(String LMT_CODE) {
        this.LMT_CODE = LMT_CODE == null ? null : LMT_CODE.trim();
    }

    public String getREC_STATUS() {
        return REC_STATUS;
    }

    public void setREC_STATUS(String REC_STATUS) {
        this.REC_STATUS = REC_STATUS == null ? null : REC_STATUS.trim();
    }

    public Integer getUNCONFMD_UNIT() {
        return UNCONFMD_UNIT;
    }

    public void setUNCONFMD_UNIT(Integer UNCONFMD_UNIT) {
        this.UNCONFMD_UNIT = UNCONFMD_UNIT;
    }

    public Integer getCREATE_DATE() {
        return CREATE_DATE;
    }

    public void setCREATE_DATE(Integer CREATE_DATE) {
        this.CREATE_DATE = CREATE_DATE;
    }

    public String getCREATE_TL() {
        return CREATE_TL;
    }

    public void setCREATE_TL(String CREATE_TL) {
        this.CREATE_TL = CREATE_TL == null ? null : CREATE_TL.trim();
    }

    public Integer getCREATE_UNIT() {
        return CREATE_UNIT;
    }

    public void setCREATE_UNIT(Integer CREATE_UNIT) {
        this.CREATE_UNIT = CREATE_UNIT;
    }

    public Integer getUPDATE_DATE() {
        return UPDATE_DATE;
    }

    public void setUPDATE_DATE(Integer UPDATE_DATE) {
        this.UPDATE_DATE = UPDATE_DATE;
    }

    public String getUPDATE_TL() {
        return UPDATE_TL;
    }

    public void setUPDATE_TL(String UPDATE_TL) {
        this.UPDATE_TL = UPDATE_TL == null ? null : UPDATE_TL.trim();
    }

    public Integer getUPDATE_UNIT() {
        return UPDATE_UNIT;
    }

    public void setUPDATE_UNIT(Integer UPDATE_UNIT) {
        this.UPDATE_UNIT = UPDATE_UNIT;
    }

    public Integer getCONF_UNIT() {
        return CONF_UNIT;
    }

    public void setCONF_UNIT(Integer CONF_UNIT) {
        this.CONF_UNIT = CONF_UNIT;
    }

    public String getCONF_SUP() {
        return CONF_SUP;
    }

    public void setCONF_SUP(String CONF_SUP) {
        this.CONF_SUP = CONF_SUP == null ? null : CONF_SUP.trim();
    }

    public Integer getCONF_DATE() {
        return CONF_DATE;
    }

    public void setCONF_DATE(Integer CONF_DATE) {
        this.CONF_DATE = CONF_DATE;
    }

    public String getOVER_SUP1() {
        return OVER_SUP1;
    }

    public void setOVER_SUP1(String OVER_SUP1) {
        this.OVER_SUP1 = OVER_SUP1 == null ? null : OVER_SUP1.trim();
    }

    public String getOVER_SUP2() {
        return OVER_SUP2;
    }

    public void setOVER_SUP2(String OVER_SUP2) {
        this.OVER_SUP2 = OVER_SUP2 == null ? null : OVER_SUP2.trim();
    }

    public Short getVER_NO() {
        return VER_NO;
    }

    public void setVER_NO(Short VER_NO) {
        this.VER_NO = VER_NO;
    }

    public Integer getUPDTBL_DATE() {
        return UPDTBL_DATE;
    }

    public void setUPDTBL_DATE(Integer UPDTBL_DATE) {
        this.UPDTBL_DATE = UPDTBL_DATE;
    }

    public Date getTS() {
        return TS;
    }

    public void setTS(Date TS) {
        this.TS = TS;
    }
}