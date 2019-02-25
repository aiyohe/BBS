package com.bbs.util;

import java.util.UUID;

/**
 * @Author: Mr.Zhang
 * @Description:
 * @Date: 15:51 2019/2/25
 * @Modified By:
 */
public class SequenceHelper {
    public static String getUUID() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }
}
