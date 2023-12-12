package com.gaoyang.loadparm.entity;

import java.util.Date;

public class Citoic {
    private String OIC_NO;

    private Integer BOOK_BCH;

    private String TEAM_NO;

    private String NAME;

    private String TEL_NO;

    private String EMAIL;

    private String STAFF_NO;

    private String LEADER_FLG;

    private String TLR_ID;

    private Integer CREATE_UNIT;

	public Citoic() {
		this.OIC_NO = "";
		this.BOOK_BCH = 0;
		this.TEAM_NO = "";
		this.NAME = "";
		this.TEL_NO = "";
		this.EMAIL = "";
		this.STAFF_NO = "";
		this.LEADER_FLG = "";
		this.TLR_ID = "";
		this.CREATE_UNIT = 0;
		this.CREATE_TLR = "";
		this.CREATE_DATE = 0;
		this.CREATE_TIME = 0;
		this.LAST_UPD_DATE = 0;
		this.LAST_UPD_TLR = "";
		this.UPDTBL_DATE = 0;

	}

	private String CREATE_TLR;

    private Integer CREATE_DATE;

    private Integer CREATE_TIME;

    private Integer LAST_UPD_DATE;

    private String LAST_UPD_TLR;

    private Integer UPDTBL_DATE;

    private Date TS;

    public String getOIC_NO() {
        return OIC_NO;
    }

    public void setOIC_NO(String OIC_NO) {
        this.OIC_NO = OIC_NO == null ? null : OIC_NO.trim();
    }

    public Integer getBOOK_BCH() {
        return BOOK_BCH;
    }

    public void setBOOK_BCH(Integer BOOK_BCH) {
        this.BOOK_BCH = BOOK_BCH;
    }

    public String getTEAM_NO() {
        return TEAM_NO;
    }

    public void setTEAM_NO(String TEAM_NO) {
        this.TEAM_NO = TEAM_NO == null ? null : TEAM_NO.trim();
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME == null ? null : NAME.trim();
    }

    public String getTEL_NO() {
        return TEL_NO;
    }

    public void setTEL_NO(String TEL_NO) {
        this.TEL_NO = TEL_NO == null ? null : TEL_NO.trim();
    }

    public String getEMAIL() {
        return EMAIL;
    }

    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL == null ? null : EMAIL.trim();
    }

    public String getSTAFF_NO() {
        return STAFF_NO;
    }

    public void setSTAFF_NO(String STAFF_NO) {
        this.STAFF_NO = STAFF_NO == null ? null : STAFF_NO.trim();
    }

    public String getLEADER_FLG() {
        return LEADER_FLG;
    }

    public void setLEADER_FLG(String LEADER_FLG) {
        this.LEADER_FLG = LEADER_FLG == null ? null : LEADER_FLG.trim();
    }

    public String getTLR_ID() {
        return TLR_ID;
    }

    public void setTLR_ID(String TLR_ID) {
        this.TLR_ID = TLR_ID == null ? null : TLR_ID.trim();
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