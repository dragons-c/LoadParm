package com.gaoyang.loadparm.entity;

public class Ilparm {
	private String PROD_CODE;
	private String PROD_MOD;
	private String CHN_NAME;
	private String TR_TYP;
	private String ADV_FLG;
	private String CUR_TYPE;

	public String getPROD_CODE() {
		return PROD_CODE;
	}

	public void setPROD_CODE(String PROD_CODE) {
		this.PROD_CODE = PROD_CODE;
	}

	public Ilparm() {
		this.PROD_MOD = " ";
		this.CHN_NAME = " ";
		this.TR_TYP = " ";
		this.ADV_FLG = " ";
		this.CUR_TYPE = " ";
	}

	public String getPROD_MOD() {
		return PROD_MOD;
	}

	public void setPROD_MOD(String PROD_MOD) {
		this.PROD_MOD = PROD_MOD;
	}

	public String getCHN_NAME() {
		return CHN_NAME;
	}

	public void setCHN_NAME(String CHN_NAME) {
		this.CHN_NAME = CHN_NAME;
	}

	public String getTR_TYP() {
		return TR_TYP;
	}

	public void setTR_TYP(String TR_TYP) {
		this.TR_TYP = TR_TYP;
	}

	public String getADV_FLG() {
		return ADV_FLG;
	}

	public void setADV_FLG(String ADV_FLG) {
		this.ADV_FLG = ADV_FLG;
	}

	public String getCUR_TYPE() {
		return CUR_TYPE;
	}

	public void setCUR_TYPE(String CUR_TYPE) {
		this.CUR_TYPE = CUR_TYPE;
	}
}
