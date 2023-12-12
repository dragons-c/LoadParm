package com.gaoyang.loadparm.entity;

public class Bptgrpl extends BptgrplKey {
    private Short ROLE_CNT;

    private Integer UPD_DT;

    private String UPD_TLR;

    private byte[] ROLE_TXT;

    public Short getROLE_CNT() {
        return ROLE_CNT;
    }

    public void setROLE_CNT(Short ROLE_CNT) {
        this.ROLE_CNT = ROLE_CNT;
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

    public byte[] getROLE_TXT() {
        return ROLE_TXT;
    }

    public void setROLE_TXT(byte[] ROLE_TXT) {
        this.ROLE_TXT = ROLE_TXT;
    }
}