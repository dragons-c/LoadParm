package com.gaoyang.loadparm.entity;

public class CltmchKey {
    private String r_TYPE;

    private Integer SEQ_NO;

    public String getR_TYPE() {
        return r_TYPE;
    }

    public void setR_TYPE(String r_TYPE) {
        this.r_TYPE = r_TYPE == null ? null : r_TYPE.trim();
    }

    public Integer getSEQ_NO() {
        return SEQ_NO;
    }

    public void setSEQ_NO(Integer SEQ_NO) {
        this.SEQ_NO = SEQ_NO;
    }
}