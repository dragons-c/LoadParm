package com.gaoyang.loadparm.utils;



import java.math.BigDecimal;

/**
 * @author WT ZHONG
 * @version 1.0
 * @date 2020/5/5 18:07
 */
	public class AcmData{
		private String AC_MODEL; //char[6]
		private byte[] MOD_NAME; //blob,120
		private String[] EVENT_TYPE; //char[8]，循环30次
		private String UPD_TEL;//char[8]
		private BigDecimal UPD_DATE; //decimal,8
		private BigDecimal UPD_TIME;//decimal,6
		private String SUP_TEL1;//char[8]
		private String SUP_TEL2;//char[8]

    public String getAC_MODEL() {
        return AC_MODEL;
    }

    public void setAC_MODEL(String AC_MODEL) {
        this.AC_MODEL = FormatUtils.formatStr(AC_MODEL, 6);
    }

    public byte[] getMOD_NAME() {
        return MOD_NAME;
    }

    public void setMOD_NAME(byte[] MOD_NAME) {
        this.MOD_NAME = FormatUtils.formatBytes(MOD_NAME, 120);
    }

    public String[] getEVENT_TYPE() {
        return EVENT_TYPE;
    }

    public void setEVENT_TYPE(String[] EVENT_TYPE) {
        this.EVENT_TYPE = EVENT_TYPE;
    }

    public String getUPD_TEL() {
        return UPD_TEL;
    }

    public void setUPD_TEL(String UPD_TEL) {
        this.UPD_TEL = FormatUtils.formatStr(UPD_TEL, 8);
    }

    public BigDecimal getUPD_DATE() {
        return UPD_DATE;
    }

    public void setUPD_DATE(BigDecimal UPD_DATE) {
        this.UPD_DATE = UPD_DATE;
    }

    public BigDecimal getUPD_TIME() {
        return UPD_TIME;
    }

    public void setUPD_TIME(BigDecimal UPD_TIME) {
        this.UPD_TIME = UPD_TIME;
    }

    public String getSUP_TEL1() {
        return SUP_TEL1;
    }

    public void setSUP_TEL1(String SUP_TEL1) {
        this.SUP_TEL1 = FormatUtils.formatStr(SUP_TEL1, 8);
    }

    public String getSUP_TEL2() {
        return SUP_TEL2;
    }

    public void setSUP_TEL2(String SUP_TEL2) {
        this.SUP_TEL2 = FormatUtils.formatStr(SUP_TEL2, 8);
    }

    public byte[] objectToByte(int size){
        byte[] bytes = new byte[size];
        //转换成byte[]
        System.arraycopy(getAC_MODEL().getBytes(), 0, bytes, 0, getAC_MODEL().getBytes().length);
        int index = getAC_MODEL().getBytes().length;
        System.arraycopy(getMOD_NAME(), 0, bytes, index, getMOD_NAME().length);
        index += getMOD_NAME().length;
        for(String eventType : getEVENT_TYPE()){
            System.arraycopy(eventType.getBytes(), 0, bytes, index, eventType.getBytes().length);
            index += eventType.getBytes().length;
        }
        System.arraycopy(getUPD_TEL().getBytes(), 0, bytes, index, getUPD_TEL().getBytes().length);
        index += getUPD_TEL().getBytes().length;
        System.arraycopy(getUPD_DATE().toString().getBytes(), 0, bytes, index, getUPD_DATE().toString().getBytes().length);
        index += getUPD_DATE().toString().getBytes().length;
        System.arraycopy(getUPD_TIME().toString().getBytes(), 0, bytes, index, getUPD_TIME().toString().getBytes().length);
        index += getUPD_TIME().toString().getBytes().length;
        System.arraycopy(getSUP_TEL1().getBytes(), 0, bytes, index, getSUP_TEL1().getBytes().length);
        index += getSUP_TEL1().getBytes().length;
        System.arraycopy(getSUP_TEL2().getBytes(), 0, bytes, index, getSUP_TEL2().getBytes().length);
        index += getSUP_TEL2().getBytes().length;
        return bytes;
    }
}
