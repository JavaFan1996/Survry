package com.atguigu.surveypark.util;

import java.lang.management.BufferPoolMXBean;
import java.security.MessageDigest;

public class DataUtil {


    /**
     * 将传入进来的src进行MD5加密，不需要懂，会用就好，将src将化为16进制32位的字符串，
     * 没有任何含义
     *
     * @param src
     * @return
     */
    public static String md5(String src) {


        try {

            StringBuffer buffer = new StringBuffer();
            char[] chars = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
            byte[] bytes = src.getBytes();

            MessageDigest md5 = MessageDigest.getInstance("MD5");
            byte[] targ = md5.digest(bytes);
            for (byte b : targ) {
                buffer.append(chars[(b >> 4) & 0x0F]);
                buffer.append(chars[b & 0x0F]);
            }
            return buffer.toString();


        } catch (Exception e) {
            e.printStackTrace();

        }
        return null;

    }
}
