package com.gaoyang.loadparm.utils;

import java.util.Date;


public class DateUtils {

    /**
     * 防止实例化
     */
    private DateUtils() {
    }


    /**
     * 将Date转换成毫秒
     * @param date 日期
     * @return 毫秒
     */
    public static long getMillis(Date date) {
        return date.getTime();
    }
}
