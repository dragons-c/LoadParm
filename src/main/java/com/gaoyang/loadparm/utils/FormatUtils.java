package com.gaoyang.loadparm.utils;

import java.math.BigDecimal;
import java.util.Arrays;

/**
 * @author WT ZHONG
 * @version 1.0
 * @date 2020/5/5 14:21
 * 自动补齐空格
 */
public class FormatUtils {

    /**
     * 格式化字符串
     * @param str
     * @param length
     * @return
     */
    public static String formatStr(String str, int length) {
        if (str == null) {
            str = "";
        }
        int strLen = str.getBytes().length;
//		System.out.println("strlen:"+strLen+","+"length:"+length);
        if (strLen == length) {
            return str;
        } else if (strLen < length) {
            int temp = length - strLen;
            String tem = "";
            for (int i = 0; i < temp; i++) {
                tem = tem + " ";
            }
            return str + tem;
        } else {
            return str.substring(0, length);
        }
    }
    public static  byte[]   getForStr(String str,int size){
    	String str2 = formatStr(str, size);
    	return str2.getBytes();
	}

	public static  byte[]   intToStr(BigDecimal bigDecimal,int size){
		String str3 = 	formatStr(bigDecimal.toString(), size);
		return str3.getBytes();
	}
    /**
     * 格式化byte[]
     * @param bytes
     * @param length
     * @return
     */
    public static byte[] formatBytes(byte[] bytes, int length) {
        int bytesLen = bytes.length;
        if (bytesLen == length) {
            return bytes;
        } else{
            byte[] newBytes = new byte[length];
            byte[] tem = " ".getBytes();
            if (bytesLen < length){
                System.arraycopy(bytes, 0, newBytes, 0, bytesLen);
                for (int i = bytesLen; i < length;i++){
                    newBytes[i] = tem[0];
                }
            }else{
                System.arraycopy(bytes, 0, newBytes, 0, length);
            }
            return newBytes;
        }
    }
	public static String formatInt(BigDecimal num ,int len) {
		String numStr = String.valueOf(num);
		if(numStr.length() < len) {
			int i = numStr.length();
			for(int j = i ; j < len; j++ ) {
				numStr = "0"+numStr;
			}
		}
		return numStr;
	}
	// prec 精度   len  长度
	public static String formatDouble(BigDecimal num,int len2,int prec) {
		String numStr = String.valueOf(num);
		String[] str = numStr.split("\\.");
		if(str.length == 1 ) {
			str[1] = "";
		}
		int m = str[1].length();
		for(int c = m ; c < prec; c++) {
			str[1] = str[1] + "0";
		}
		String newStr = str[0] + str[1];
		if(newStr.length() < len2) {
			int j = newStr.length();
			for(int n = j; n < len2; n++ ) {
				newStr = "0" + newStr;
			}
		}
		return newStr;
	}
}
