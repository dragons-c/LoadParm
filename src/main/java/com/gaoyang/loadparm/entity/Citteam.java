package com.gaoyang.loadparm.entity;

import java.util.Date;

public class Citteam {
    private String TEAM_NO;

    private String TEAM_NM;

    private Integer BRANCH;

    private String PROFIT;

    private String DIVISION;

    private String REGION;

    private Integer CREATE_UNIT;

    private String CREATE_TLR;

    private Integer CREATE_DATE;

    private Integer CREATE_TIME;

    private Integer LAST_UPD_DATE;

    private String LAST_UPD_TLR;

    private Integer UPDTBL_DATE;

    private Date TS;

	public Citteam() {
		this.TEAM_NO = "";
		this.TEAM_NM = "";
		this.BRANCH = 0;
		this.PROFIT = "";
		this.DIVISION = "";
		this.REGION = "";
		this.CREATE_UNIT = 0;
		this.CREATE_TLR = "";
		this.CREATE_DATE = 0;
		this.CREATE_TIME = 0;
		this.LAST_UPD_DATE = 0;
		this.LAST_UPD_TLR = "";
		this.UPDTBL_DATE = 0;

	}

	public String getTEAM_NO() {
        return TEAM_NO;
    }

    public void setTEAM_NO(String TEAM_NO) {
        this.TEAM_NO = TEAM_NO == null ? null : TEAM_NO.trim();
    }

    public String getTEAM_NM() {
        return TEAM_NM;
    }

    public void setTEAM_NM(String TEAM_NM) {
        this.TEAM_NM = TEAM_NM == null ? null : TEAM_NM.trim();
    }

    public Integer getBRANCH() {
        return BRANCH;
    }

    public void setBRANCH(Integer BRANCH) {
        this.BRANCH = BRANCH;
    }

    public String getPROFIT() {
        return PROFIT;
    }

    public void setPROFIT(String PROFIT) {
        this.PROFIT = PROFIT == null ? null : PROFIT.trim();
    }

    public String getDIVISION() {
        return DIVISION;
    }

    public void setDIVISION(String DIVISION) {
        this.DIVISION = DIVISION == null ? null : DIVISION.trim();
    }

    public String getREGION() {
        return REGION;
    }

    public void setREGION(String REGION) {
        this.REGION = REGION == null ? null : REGION.trim();
    }

    public Integer getCREATE_UNIT() {
        return CREATE_UNIT;
    }

    public void setCREATE_UNIT(Integer CREATE_UNIT) {
        this.CREATE_UNIT = CREATE_UNIT;
    }

    public String getCREATE_TLR() {
        return CREATE_TLR;
    }

    public void setCREATE_TLR(String CREATE_TLR) {
        this.CREATE_TLR = CREATE_TLR == null ? null : CREATE_TLR.trim();
    }

    public Integer getCREATE_DATE() {
        return CREATE_DATE;
    }

    public void setCREATE_DATE(Integer CREATE_DATE) {
        this.CREATE_DATE = CREATE_DATE;
    }

    public Integer getCREATE_TIME() {
        return CREATE_TIME;
    }

    public void setCREATE_TIME(Integer CREATE_TIME) {
        this.CREATE_TIME = CREATE_TIME;
    }

    public Integer getLAST_UPD_DATE() {
        return LAST_UPD_DATE;
    }

    public void setLAST_UPD_DATE(Integer LAST_UPD_DATE) {
        this.LAST_UPD_DATE = LAST_UPD_DATE;
    }

    public String getLAST_UPD_TLR() {
        return LAST_UPD_TLR;
    }

    public void setLAST_UPD_TLR(String LAST_UPD_TLR) {
        this.LAST_UPD_TLR = LAST_UPD_TLR == null ? null : LAST_UPD_TLR.trim();
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