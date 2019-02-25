package com.bbs.util;

import java.io.Serializable;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author: Mr.Zhang
 * @Description: 时间工具类
 * @Date: 11:24 2018/6/25
 * @Modified By:
 */
public class DateUtil implements Serializable {
    /**
     * 获取当前时间
     * @return
     */
    public static final Timestamp getTimeStamp(){
        Timestamp time = Timestamp.valueOf(getDateString());
        return null;
    }
    public static String getDateString() {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat(
                "yyyy-MM-dd HH:mm:ss");
        String time = sdf.format(date);
        return time;
    }
}
