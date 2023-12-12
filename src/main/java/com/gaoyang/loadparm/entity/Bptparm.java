package com.gaoyang.loadparm.entity;

import java.util.Date;

public class Bptparm extends BptparmKey {
    private Integer EFF_DATE;

    private Integer EXP_DATE;

    private String DESC  = " ";

    private String CDESC  = " ";

    private Integer UPD_DATE;

    private Integer UPD_BR;

    private String UPD_TLR  = " ";

    private Date TS;

    private byte[] VAL;

    public Integer getEFF_DATE() {
        return EFF_DATE;
    }

    public void setEFF_DATE(Integer EFF_DATE) {
        this.EFF_DATE = EFF_DATE;
    }

    public Integer getEXP_DATE() {
        return EXP_DATE;
    }

    public void setEXP_DATE(Integer EXP_DATE) {
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

    public Integer getUPD_DATE() {
        return UPD_DATE;
    }

    public void setUPD_DATE(Integer UPD_DATE) {
        this.UPD_DATE = UPD_DATE;
    }

    public Integer getUPD_BR() {
        return UPD_BR;
    }

    public void setUPD_BR(Integer UPD_BR) {
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

    public byte[] getVAL() {
        return VAL;
    }

    public void setVAL(byte[] VAL) {
        this.VAL = VAL;
    }
}