package com.netty;

import lombok.extern.slf4j.Slf4j;

import java.security.MessageDigest;

/**
 * @program: matrix-tl
 * @description: MD5工具类
 * @author: Ron
 * @create: 2018-07-04 11:48
 */
@Slf4j
public class Md5Utils {



    private static byte[] md5(String s) {
        MessageDigest algorithm;
        try {
            algorithm = MessageDigest.getInstance("MD5");
            algorithm.reset();
            algorithm.update(s.getBytes("UTF-8"));
            return algorithm.digest();
        } catch (Exception e) {
            log.error("md5工具类异常",e);
        }
        return null;
    }

    private static String toHex(byte hash[]) {
        if (hash == null) {
            return null;
        }
        StringBuilder buf = new StringBuilder(hash.length * 2);
        int i;

        for (i = 0; i < hash.length; i++) {
            if ((hash[i] & 0xff) < 0x10) {
                buf.append("0");
            }
            buf.append(Long.toString(hash[i] & 0xff, 16));
        }
        return buf.toString();
    }

    public static String hash(String s) {
        try {
            return new String(toHex(md5(s)).getBytes("UTF-8"), "UTF-8");
        } catch (Exception e) {
            log.error("md5工具类异常:",e);
            return s;
        }
    }
    public static String hash(String str, String salt) {
        return Md5Utils.hash(str + salt);
    }

    /**
     * 对密码按照用户名，密码，盐进行加密
     * @param username 用户名
     * @param password 密码
     * @param salt 盐
     * @return
     */
    public static String encryptPassword(String username, String password, String salt) {
        return Md5Utils.hash(username + password + salt);
    }

    /**
     * 对密码按照密码，盐进行加密
     * @param password 密码
     * @param salt 盐
     * @return
     */
    public static String encryptPassword(String password, String salt) {
        return Md5Utils.hash(password + salt);
    }

    public static String encryptPassword(String password) {
        return Md5Utils.hash(password);
    }

    public static String getDefaultPassword(){
        return Md5Utils.hash("123456");
    }
}