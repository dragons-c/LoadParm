package com.gaoyang.loadparm.entity;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;
@Component
public class Bptpdcd {
	public Bptpdcd( ) {
		this.PRDT_CODE = " ";
		this.CUS_PER_FLG = " ";
		this.CUS_COM_FLG = " ";
		this.CUS_FIN_FLG = " ";
		this.CUS_COM_SCOPE = " ";
		this.CUS_COM_TYP1 = " ";
		this.CUS_COM_TYP2 = " ";
		this.CUS_COM_TYP3 = " ";
		this.CUS_COM_TYP4 = " ";
		this.CUS_COM_TYP5 = " ";
		this.CUS_COM_TYP6 = " ";
		this.CUS_COM_TYP7 = " ";
		this.CUS_COM_TYP8 = " ";
		this.CUS_COM_TYP9 = " ";
		this.CUS_COM_TYP10 = " ";
		this.CUS_FIN_SCOPE = " ";
		this.CUS_FIN_TYP1 = " ";
		this.CUS_FIN_TYP2 = " ";
		this.CUS_FIN_TYP3 = " ";
		this.CUS_FIN_TYP4 = " ";
		this.CUS_FIN_TYP5 = " ";
		this.CUS_FIN_TYP6 = " ";
		this.CUS_FIN_TYP7 = " ";
		this.CUS_FIN_TYP8 = " ";
		this.CUS_FIN_TYP9 = " ";
		this.CUS_FIN_TYP10 = " ";
		this.CUS_GROUP_SCOPE = " ";
		this.CUS_GROUP1 = " ";
		this.CUS_GROUP2 = " ";
		this.CUS_GROUP3 = " ";
		this.CUS_GROUP4 = " ";
		this.CUS_GROUP5 = " ";
		this.CUS_GROUP6 = " ";
		this.CUS_GROUP7 = " ";
		this.CUS_GROUP8 = " ";
		this.CUS_GROUP9 = " ";
		this.CUS_GROUP10 = " ";
		this.PARTI_METH = " ";
		this.PARTI_TYPE = " ";
		this.PARTI_STRU = " ";
		this.SOLD_RGN = " ";
		this.CHNL_SCOPE = " ";
		this.CHNL1 = " ";
		this.CHNL2 = " ";
		this.CHNL3 = " ";
		this.CHNL4 = " ";
		this.CHNL5 = " ";
		this.CHNL6 = " ";
		this.CHNL7 = " ";
		this.CHNL8 = " ";
		this.CHNL9 = " ";
		this.CHNL10 = " ";
		this.PRDT_CUST_INFO = " ";
		this.PRDT_MARKT_GOAL = " ";
		this.COMP_PRDT_DESC = " ";
		this.PRDT_ADV_DESC = " ";
		this.PRDT_FAV_INFO = " ";
		this.PRDT_COUNTER = new BigDecimal(0);
		this.SOLD_NUM = new BigDecimal(0);
		this.SOLD_AMT = new BigDecimal(0);
		this.BEL_BR = new BigDecimal(0);
		this.LEVEL1 = " ";
		this.LEVEL2 = " ";
		this.LEVEL3 = " ";
		this.LEVEL4 = " ";
		this.LEVEL5 = " ";
		this.LEVEL6 = " ";
		this.LEVEL7 = " ";
		this.LEVEL8 = " ";
		this.LEVEL9 = " ";
	}

	private String PRDT_CODE;

    private String CUS_PER_FLG;

    private String CUS_COM_FLG;

    private String CUS_FIN_FLG;

    private String CUS_COM_SCOPE;

    private String CUS_COM_TYP1;

    private String CUS_COM_TYP2;

    private String CUS_COM_TYP3;

    private String CUS_COM_TYP4;

    private String CUS_COM_TYP5;

    private String CUS_COM_TYP6;

    private String CUS_COM_TYP7;

    private String CUS_COM_TYP8;

    private String CUS_COM_TYP9;

    private String CUS_COM_TYP10;

    private String CUS_FIN_SCOPE;

    private String CUS_FIN_TYP1;

    private String CUS_FIN_TYP2;

    private String CUS_FIN_TYP3;

    private String CUS_FIN_TYP4;

    private String CUS_FIN_TYP5;

    private String CUS_FIN_TYP6;

    private String CUS_FIN_TYP7;

    private String CUS_FIN_TYP8;

    private String CUS_FIN_TYP9;

    private String CUS_FIN_TYP10;

    private String CUS_GROUP_SCOPE;

    private String CUS_GROUP1;

    private String CUS_GROUP2;

    private String CUS_GROUP3;

    private String CUS_GROUP4;

    private String CUS_GROUP5;

    private String CUS_GROUP6;

    private String CUS_GROUP7;

    private String CUS_GROUP8;

    private String CUS_GROUP9;

    private String CUS_GROUP10;

    private String PARTI_METH;

    private String PARTI_TYPE;

    private String PARTI_STRU;

    private String SOLD_RGN;

    private String CHNL_SCOPE;

    private String CHNL1;

    private String CHNL2;

    private String CHNL3;

    private String CHNL4;

    private String CHNL5;

    private String CHNL6;

    private String CHNL7;

    private String CHNL8;

    private String CHNL9;

    private String CHNL10;

    private String PRDT_CUST_INFO;

    private String PRDT_MARKT_GOAL;

    private String COMP_PRDT_DESC;

    private String PRDT_ADV_DESC;

    private String PRDT_FAV_INFO;

    private BigDecimal PRDT_COUNTER;

    private BigDecimal SOLD_NUM;

    private BigDecimal SOLD_AMT;

    private BigDecimal BEL_BR;

    private String LEVEL1;

    private String LEVEL2;

    private String LEVEL3;

    private String LEVEL4;

    private String LEVEL5;

    private String LEVEL6;

    private String LEVEL7;

    private String LEVEL8;

    private String LEVEL9;

    public String getPRDT_CODE() {
        return PRDT_CODE;
    }

    public void setPRDT_CODE(String PRDT_CODE) {
        this.PRDT_CODE = PRDT_CODE == null ? " " : PRDT_CODE.trim();
    }

    public String getCUS_PER_FLG() {
        return CUS_PER_FLG;
    }

    public void setCUS_PER_FLG(String CUS_PER_FLG) {
        this.CUS_PER_FLG = CUS_PER_FLG == null ? " " : CUS_PER_FLG.trim();
    }

    public String getCUS_COM_FLG() {
        return CUS_COM_FLG;
    }

    public void setCUS_COM_FLG(String CUS_COM_FLG) {
        this.CUS_COM_FLG = CUS_COM_FLG == null ? " " : CUS_COM_FLG.trim();
    }

    public String getCUS_FIN_FLG() {
        return CUS_FIN_FLG;
    }

    public void setCUS_FIN_FLG(String CUS_FIN_FLG) {
        this.CUS_FIN_FLG = CUS_FIN_FLG == null ? " " : CUS_FIN_FLG.trim();
    }

    public String getCUS_COM_SCOPE() {
        return CUS_COM_SCOPE;
    }

    public void setCUS_COM_SCOPE(String CUS_COM_SCOPE) {
        this.CUS_COM_SCOPE = CUS_COM_SCOPE == null ? " " : CUS_COM_SCOPE.trim();
    }

    public String getCUS_COM_TYP1() {
        return CUS_COM_TYP1;
    }

    public void setCUS_COM_TYP1(String CUS_COM_TYP1) {
        this.CUS_COM_TYP1 = CUS_COM_TYP1 == null ? " " : CUS_COM_TYP1.trim();
    }

    public String getCUS_COM_TYP2() {
        return CUS_COM_TYP2;
    }

    public void setCUS_COM_TYP2(String CUS_COM_TYP2) {
        this.CUS_COM_TYP2 = CUS_COM_TYP2 == null ? " " : CUS_COM_TYP2.trim();
    }

    public String getCUS_COM_TYP3() {
        return CUS_COM_TYP3;
    }

    public void setCUS_COM_TYP3(String CUS_COM_TYP3) {
        this.CUS_COM_TYP3 = CUS_COM_TYP3 == null ? " " : CUS_COM_TYP3.trim();
    }

    public String getCUS_COM_TYP4() {
        return CUS_COM_TYP4;
    }

    public void setCUS_COM_TYP4(String CUS_COM_TYP4) {
        this.CUS_COM_TYP4 = CUS_COM_TYP4 == null ? " " : CUS_COM_TYP4.trim();
    }

    public String getCUS_COM_TYP5() {
        return CUS_COM_TYP5;
    }

    public void setCUS_COM_TYP5(String CUS_COM_TYP5) {
        this.CUS_COM_TYP5 = CUS_COM_TYP5 == null ? " " : CUS_COM_TYP5.trim();
    }

    public String getCUS_COM_TYP6() {
        return CUS_COM_TYP6;
    }

    public void setCUS_COM_TYP6(String CUS_COM_TYP6) {
        this.CUS_COM_TYP6 = CUS_COM_TYP6 == null ? " " : CUS_COM_TYP6.trim();
    }

    public String getCUS_COM_TYP7() {
        return CUS_COM_TYP7;
    }

    public void setCUS_COM_TYP7(String CUS_COM_TYP7) {
        this.CUS_COM_TYP7 = CUS_COM_TYP7 == null ? " " : CUS_COM_TYP7.trim();
    }

    public String getCUS_COM_TYP8() {
        return CUS_COM_TYP8;
    }

    public void setCUS_COM_TYP8(String CUS_COM_TYP8) {
        this.CUS_COM_TYP8 = CUS_COM_TYP8 == null ? " " : CUS_COM_TYP8.trim();
    }

    public String getCUS_COM_TYP9() {
        return CUS_COM_TYP9;
    }

    public void setCUS_COM_TYP9(String CUS_COM_TYP9) {
        this.CUS_COM_TYP9 = CUS_COM_TYP9 == null ? " " : CUS_COM_TYP9.trim();
    }

    public String getCUS_COM_TYP10() {
        return CUS_COM_TYP10;
    }

    public void setCUS_COM_TYP10(String CUS_COM_TYP10) {
        this.CUS_COM_TYP10 = CUS_COM_TYP10 == null ? " " : CUS_COM_TYP10.trim();
    }

    public String getCUS_FIN_SCOPE() {
        return CUS_FIN_SCOPE;
    }

    public void setCUS_FIN_SCOPE(String CUS_FIN_SCOPE) {
        this.CUS_FIN_SCOPE = CUS_FIN_SCOPE == null ? " " : CUS_FIN_SCOPE.trim();
    }

    public String getCUS_FIN_TYP1() {
        return CUS_FIN_TYP1;
    }

    public void setCUS_FIN_TYP1(String CUS_FIN_TYP1) {
        this.CUS_FIN_TYP1 = CUS_FIN_TYP1 == null ? " " : CUS_FIN_TYP1.trim();
    }

    public String getCUS_FIN_TYP2() {
        return CUS_FIN_TYP2;
    }

    public void setCUS_FIN_TYP2(String CUS_FIN_TYP2) {
        this.CUS_FIN_TYP2 = CUS_FIN_TYP2 == null ? " " : CUS_FIN_TYP2.trim();
    }

    public String getCUS_FIN_TYP3() {
        return CUS_FIN_TYP3;
    }

    public void setCUS_FIN_TYP3(String CUS_FIN_TYP3) {
        this.CUS_FIN_TYP3 = CUS_FIN_TYP3 == null ? " " : CUS_FIN_TYP3.trim();
    }

    public String getCUS_FIN_TYP4() {
        return CUS_FIN_TYP4;
    }

    public void setCUS_FIN_TYP4(String CUS_FIN_TYP4) {
        this.CUS_FIN_TYP4 = CUS_FIN_TYP4 == null ? " " : CUS_FIN_TYP4.trim();
    }

    public String getCUS_FIN_TYP5() {
        return CUS_FIN_TYP5;
    }

    public void setCUS_FIN_TYP5(String CUS_FIN_TYP5) {
        this.CUS_FIN_TYP5 = CUS_FIN_TYP5 == null ? " " : CUS_FIN_TYP5.trim();
    }

    public String getCUS_FIN_TYP6() {
        return CUS_FIN_TYP6;
    }

    public void setCUS_FIN_TYP6(String CUS_FIN_TYP6) {
        this.CUS_FIN_TYP6 = CUS_FIN_TYP6 == null ? " " : CUS_FIN_TYP6.trim();
    }

    public String getCUS_FIN_TYP7() {
        return CUS_FIN_TYP7;
    }

    public void setCUS_FIN_TYP7(String CUS_FIN_TYP7) {
        this.CUS_FIN_TYP7 = CUS_FIN_TYP7 == null ? " " : CUS_FIN_TYP7.trim();
    }

    public String getCUS_FIN_TYP8() {
        return CUS_FIN_TYP8;
    }

    public void setCUS_FIN_TYP8(String CUS_FIN_TYP8) {
        this.CUS_FIN_TYP8 = CUS_FIN_TYP8 == null ? " " : CUS_FIN_TYP8.trim();
    }

    public String getCUS_FIN_TYP9() {
        return CUS_FIN_TYP9;
    }

    public void setCUS_FIN_TYP9(String CUS_FIN_TYP9) {
        this.CUS_FIN_TYP9 = CUS_FIN_TYP9 == null ? " " : CUS_FIN_TYP9.trim();
    }

    public String getCUS_FIN_TYP10() {
        return CUS_FIN_TYP10;
    }

    public void setCUS_FIN_TYP10(String CUS_FIN_TYP10) {
        this.CUS_FIN_TYP10 = CUS_FIN_TYP10 == null ? " " : CUS_FIN_TYP10.trim();
    }

    public String getCUS_GROUP_SCOPE() {
        return CUS_GROUP_SCOPE;
    }

    public void setCUS_GROUP_SCOPE(String CUS_GROUP_SCOPE) {
        this.CUS_GROUP_SCOPE = CUS_GROUP_SCOPE == null ? " " : CUS_GROUP_SCOPE.trim();
    }

    public String getCUS_GROUP1() {
        return CUS_GROUP1;
    }

    public void setCUS_GROUP1(String CUS_GROUP1) {
        this.CUS_GROUP1 = CUS_GROUP1 == null ? " " : CUS_GROUP1.trim();
    }

    public String getCUS_GROUP2() {
        return CUS_GROUP2;
    }

    public void setCUS_GROUP2(String CUS_GROUP2) {
        this.CUS_GROUP2 = CUS_GROUP2 == null ? " " : CUS_GROUP2.trim();
    }

    public String getCUS_GROUP3() {
        return CUS_GROUP3;
    }

    public void setCUS_GROUP3(String CUS_GROUP3) {
        this.CUS_GROUP3 = CUS_GROUP3 == null ? " " : CUS_GROUP3.trim();
    }

    public String getCUS_GROUP4() {
        return CUS_GROUP4;
    }

    public void setCUS_GROUP4(String CUS_GROUP4) {
        this.CUS_GROUP4 = CUS_GROUP4 == null ? " " : CUS_GROUP4.trim();
    }

    public String getCUS_GROUP5() {
        return CUS_GROUP5;
    }

    public void setCUS_GROUP5(String CUS_GROUP5) {
        this.CUS_GROUP5 = CUS_GROUP5 == null ? " " : CUS_GROUP5.trim();
    }

    public String getCUS_GROUP6() {
        return CUS_GROUP6;
    }

    public void setCUS_GROUP6(String CUS_GROUP6) {
        this.CUS_GROUP6 = CUS_GROUP6 == null ? " " : CUS_GROUP6.trim();
    }

    public String getCUS_GROUP7() {
        return CUS_GROUP7;
    }

    public void setCUS_GROUP7(String CUS_GROUP7) {
        this.CUS_GROUP7 = CUS_GROUP7 == null ? " " : CUS_GROUP7.trim();
    }

    public String getCUS_GROUP8() {
        return CUS_GROUP8;
    }

    public void setCUS_GROUP8(String CUS_GROUP8) {
        this.CUS_GROUP8 = CUS_GROUP8 == null ? " " : CUS_GROUP8.trim();
    }

    public String getCUS_GROUP9() {
        return CUS_GROUP9;
    }

    public void setCUS_GROUP9(String CUS_GROUP9) {
        this.CUS_GROUP9 = CUS_GROUP9 == null ? " " : CUS_GROUP9.trim();
    }

    public String getCUS_GROUP10() {
        return CUS_GROUP10;
    }

    public void setCUS_GROUP10(String CUS_GROUP10) {
        this.CUS_GROUP10 = CUS_GROUP10 == null ? " " : CUS_GROUP10.trim();
    }

    public String getPARTI_METH() {
        return PARTI_METH;
    }

    public void setPARTI_METH(String PARTI_METH) {
        this.PARTI_METH = PARTI_METH == null ? " " : PARTI_METH.trim();
    }

    public String getPARTI_TYPE() {
        return PARTI_TYPE;
    }

    public void setPARTI_TYPE(String PARTI_TYPE) {
        this.PARTI_TYPE = PARTI_TYPE == null ? " " : PARTI_TYPE.trim();
    }

    public String getPARTI_STRU() {
        return PARTI_STRU;
    }

    public void setPARTI_STRU(String PARTI_STRU) {
        this.PARTI_STRU = PARTI_STRU == null ? " " : PARTI_STRU.trim();
    }

    public String getSOLD_RGN() {
        return SOLD_RGN;
    }

    public void setSOLD_RGN(String SOLD_RGN) {
        this.SOLD_RGN = SOLD_RGN == null ? " " : SOLD_RGN.trim();
    }

    public String getCHNL_SCOPE() {
        return CHNL_SCOPE;
    }

    public void setCHNL_SCOPE(String CHNL_SCOPE) {
        this.CHNL_SCOPE = CHNL_SCOPE == null ? " " : CHNL_SCOPE.trim();
    }

    public String getCHNL1() {
        return CHNL1;
    }

    public void setCHNL1(String CHNL1) {
        this.CHNL1 = CHNL1 == null ? " " : CHNL1.trim();
    }

    public String getCHNL2() {
        return CHNL2;
    }

    public void setCHNL2(String CHNL2) {
        this.CHNL2 = CHNL2 == null ? " " : CHNL2.trim();
    }

    public String getCHNL3() {
        return CHNL3;
    }

    public void setCHNL3(String CHNL3) {
        this.CHNL3 = CHNL3 == null ? " " : CHNL3.trim();
    }

    public String getCHNL4() {
        return CHNL4;
    }

    public void setCHNL4(String CHNL4) {
        this.CHNL4 = CHNL4 == null ? " " : CHNL4.trim();
    }

    public String getCHNL5() {
        return CHNL5;
    }

    public void setCHNL5(String CHNL5) {
        this.CHNL5 = CHNL5 == null ? " " : CHNL5.trim();
    }

    public String getCHNL6() {
        return CHNL6;
    }

    public void setCHNL6(String CHNL6) {
        this.CHNL6 = CHNL6 == null ? " " : CHNL6.trim();
    }

    public String getCHNL7() {
        return CHNL7;
    }

    public void setCHNL7(String CHNL7) {
        this.CHNL7 = CHNL7 == null ? " " : CHNL7.trim();
    }

    public String getCHNL8() {
        return CHNL8;
    }

    public void setCHNL8(String CHNL8) {
        this.CHNL8 = CHNL8 == null ? " " : CHNL8.trim();
    }

    public String getCHNL9() {
        return CHNL9;
    }

    public void setCHNL9(String CHNL9) {
        this.CHNL9 = CHNL9 == null ? " " : CHNL9.trim();
    }

    public String getCHNL10() {
        return CHNL10;
    }

    public void setCHNL10(String CHNL10) {
        this.CHNL10 = CHNL10 == null ? " " : CHNL10.trim();
    }

    public String getPRDT_CUST_INFO() {
        return PRDT_CUST_INFO;
    }

    public void setPRDT_CUST_INFO(String PRDT_CUST_INFO) {
        this.PRDT_CUST_INFO = PRDT_CUST_INFO == null ? " " : PRDT_CUST_INFO.trim();
    }

    public String getPRDT_MARKT_GOAL() {
        return PRDT_MARKT_GOAL;
    }

    public void setPRDT_MARKT_GOAL(String PRDT_MARKT_GOAL) {
        this.PRDT_MARKT_GOAL = PRDT_MARKT_GOAL == null ? " " : PRDT_MARKT_GOAL.trim();
    }

    public String getCOMP_PRDT_DESC() {
        return COMP_PRDT_DESC;
    }

    public void setCOMP_PRDT_DESC(String COMP_PRDT_DESC) {
        this.COMP_PRDT_DESC = COMP_PRDT_DESC == null ? " " : COMP_PRDT_DESC.trim();
    }

    public String getPRDT_ADV_DESC() {
        return PRDT_ADV_DESC;
    }

    public void setPRDT_ADV_DESC(String PRDT_ADV_DESC) {
        this.PRDT_ADV_DESC = PRDT_ADV_DESC == null ? " " : PRDT_ADV_DESC.trim();
    }

    public String getPRDT_FAV_INFO() {
        return PRDT_FAV_INFO;
    }

    public void setPRDT_FAV_INFO(String PRDT_FAV_INFO) {
        this.PRDT_FAV_INFO = PRDT_FAV_INFO == null ? " " : PRDT_FAV_INFO.trim();
    }

    public BigDecimal getPRDT_COUNTER() {
        return PRDT_COUNTER;
    }

    public void setPRDT_COUNTER(BigDecimal PRDT_COUNTER) {
        this.PRDT_COUNTER = PRDT_COUNTER;
    }

    public BigDecimal getSOLD_NUM() {
        return SOLD_NUM;
    }

    public void setSOLD_NUM(BigDecimal SOLD_NUM) {
        this.SOLD_NUM = SOLD_NUM;
    }

    public BigDecimal getSOLD_AMT() {
        return SOLD_AMT;
    }

    public void setSOLD_AMT(BigDecimal SOLD_AMT) {
        this.SOLD_AMT = SOLD_AMT;
    }

    public BigDecimal getBEL_BR() {
        return BEL_BR;
    }

    public void setBEL_BR(BigDecimal BEL_BR) {
        this.BEL_BR = BEL_BR;
    }

    public String getLEVEL1() {
        return LEVEL1;
    }

    public void setLEVEL1(String LEVEL1) {
        this.LEVEL1 = LEVEL1 == null ? " " : LEVEL1.trim();
    }

    public String getLEVEL2() {
        return LEVEL2;
    }

    public void setLEVEL2(String LEVEL2) {
        this.LEVEL2 = LEVEL2 == null ? " " : LEVEL2.trim();
    }

    public String getLEVEL3() {
        return LEVEL3;
    }

    public void setLEVEL3(String LEVEL3) {
        this.LEVEL3 = LEVEL3 == null ? " " : LEVEL3.trim();
    }

    public String getLEVEL4() {
        return LEVEL4;
    }

    public void setLEVEL4(String LEVEL4) {
        this.LEVEL4 = LEVEL4 == null ? " " : LEVEL4.trim();
    }

    public String getLEVEL5() {
        return LEVEL5;
    }

    public void setLEVEL5(String LEVEL5) {
        this.LEVEL5 = LEVEL5 == null ? " " : LEVEL5.trim();
    }

    public String getLEVEL6() {
        return LEVEL6;
    }

    public void setLEVEL6(String LEVEL6) {
        this.LEVEL6 = LEVEL6 == null ? " " : LEVEL6.trim();
    }

    public String getLEVEL7() {
        return LEVEL7;
    }

    public void setLEVEL7(String LEVEL7) {
        this.LEVEL7 = LEVEL7 == null ? " " : LEVEL7.trim();
    }

    public String getLEVEL8() {
        return LEVEL8;
    }

    public void setLEVEL8(String LEVEL8) {
        this.LEVEL8 = LEVEL8 == null ? " " : LEVEL8.trim();
    }

    public String getLEVEL9() {
        return LEVEL9;
    }

    public void setLEVEL9(String LEVEL9) {
        this.LEVEL9 = LEVEL9 == null ? " " : LEVEL9.trim();
    }
}