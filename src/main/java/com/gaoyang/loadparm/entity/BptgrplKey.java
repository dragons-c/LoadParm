package com.gaoyang.loadparm.entity;

public class BptgrplKey {
    private String ASS_TYP;

    private String ASS_ID;

    private String ATH_TYP;

    public String getASS_TYP() {
        return ASS_TYP;
    }

    public void setASS_TYP(String ASS_TYP) {
        this.ASS_TYP = ASS_TYP == null ? null : ASS_TYP.trim();
    }

    public String getASS_ID() {
        return ASS_ID;
    }

    public void setASS_ID(String ASS_ID) {
        this.ASS_ID = ASS_ID == null ? null : ASS_ID.trim();
    }

    public String getATH_TYP() {
        return ATH_TYP;
    }

    public void setATH_TYP(String ATH_TYP) {
        this.ATH_TYP = ATH_TYP == null ? null : ATH_TYP.trim();
    }
}