package com.gaoyang.loadparm.entity;

public class BpttltWithBLOBs extends Bpttlt {
    private byte[] TLR_CRD_PSW = new byte[]{};

    private byte[] KB_PSW= new byte[]{};

    private byte[] LAST_KB_PSW = new byte[]{};

    public byte[] getTLR_CRD_PSW() {
        return TLR_CRD_PSW;
    }

    public void setTLR_CRD_PSW(byte[] TLR_CRD_PSW) {
        this.TLR_CRD_PSW = TLR_CRD_PSW;
    }

    public byte[] getKB_PSW() {
        return KB_PSW;
    }

    public void setKB_PSW(byte[] KB_PSW) {
        this.KB_PSW = KB_PSW;
    }

    public byte[] getLAST_KB_PSW() {
        return LAST_KB_PSW;
    }

    public void setLAST_KB_PSW(byte[] LAST_KB_PSW) {
        this.LAST_KB_PSW = LAST_KB_PSW;
    }
}