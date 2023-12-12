package com.gaoyang.loadparm.entity;

public class Bptgrp {
    private String ROLE_CD;

    private String ROLE_CNNM = "";

    private String ROLE_ENNM = "";

    private String ROLE_CNMS = "";

    private String ROLE_ENMS = "";

    private String ATH_MOV_FLG = "";

    private Integer EFF_DT = 20000101;

    private Integer EXP_DT = 99991231;

    private Integer UPD_DT ;

    private String UPD_TLR;

    public String getROLE_CD() {
        return ROLE_CD;
    }

    public void setROLE_CD(String ROLE_CD) {
        this.ROLE_CD = ROLE_CD == null ? null : ROLE_CD.trim();
    }

    public String getROLE_CNNM() {
        return ROLE_CNNM;
    }

    public void setROLE_CNNM(String ROLE_CNNM) {
        this.ROLE_CNNM = ROLE_CNNM == null ? null : ROLE_CNNM.trim();
    }

    public String getROLE_ENNM() {
        return ROLE_ENNM;
    }

    public void setROLE_ENNM(String ROLE_ENNM) {
        this.ROLE_ENNM = ROLE_ENNM == null ? null : ROLE_ENNM.trim();
    }

    public String getROLE_CNMS() {
        return ROLE_CNMS;
    }

    public void setROLE_CNMS(String ROLE_CNMS) {
        this.ROLE_CNMS = ROLE_CNMS == null ? null : ROLE_CNMS.trim();
    }

    public String getROLE_ENMS() {
        return ROLE_ENMS;
    }

    public void setROLE_ENMS(String ROLE_ENMS) {
        this.ROLE_ENMS = ROLE_ENMS == null ? null : ROLE_ENMS.trim();
    }

    public String getATH_MOV_FLG() {
        return ATH_MOV_FLG;
    }

    public void setATH_MOV_FLG(String ATH_MOV_FLG) {
        this.ATH_MOV_FLG = ATH_MOV_FLG == null ? null : ATH_MOV_FLG.trim();
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
        this.UPD_TLR = UPD_TLR == null ? null : UPD_TLR.trim();
    }
}