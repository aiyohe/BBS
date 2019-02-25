package com.bbs.util;

/**
 * @Author: Mr.Zhang
 * @Description: 数据常量设置
 * @Date: 11:22 2019/2/25
 * @Modified By:
 */
public class ConstantUtil {
    /**
     * 有效标记
     */
    public static class Yxbj {
        /**
         * 有效
         */
        public static final int FLAG_EFFECTIVE = 1;//有效
        /**
         * 无效
         */
        public static final int FLAG_INVALID = 0;//无效
    }

    /**
     * 用户状态
     */
    public static class UserStatus {
        /**
         * 正常
         */
        public static final int STATUS_EFFECTIVE = 1;
        /**
         * 永久封禁
         */
        public static final int STATUS_INVALID = 0;
        /**
         * 封禁一段时间
         */
        public static final int STATUS_AGING = 2;
    }

    /**
     * 性别
     */
    public static class UserSex {
        /**
         * 女
         */
        public static final int SEX_WOMEN = 0;
        /**
         * 男
         */
        public static final int SEX_MEN = 1;
        /**
         * 保密
         */
        public static final int SEX_UNKNOWN = 2;
    }
}
