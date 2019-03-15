package com.tl.security;


import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESedeKeySpec;
import javax.crypto.spec.IvParameterSpec;
import java.security.Key;
import java.util.Base64;

public class EncryptUtil {

    private static String CHARSET = "UTF-8";
    // 向量 可有可无 终端后台也要约定
    private final static String iv = "01234567";

    static public String encryptKey = "246887c3-ee20-4fe8-a320-1fde4a8d10b6";

    public final static String encrypt(String plainText) throws Exception {

        Key deskey = null;
        DESedeKeySpec spec = new DESedeKeySpec(encryptKey.getBytes());
        SecretKeyFactory keyfactory = SecretKeyFactory.getInstance("desede");
        deskey = keyfactory.generateSecret(spec);

        Cipher cipher = Cipher.getInstance("desede/CBC/PKCS5Padding");
        IvParameterSpec ips = new IvParameterSpec(iv.getBytes());
        cipher.init(Cipher.ENCRYPT_MODE, deskey, ips);
        byte[] encryptData = cipher.doFinal(plainText.getBytes(CHARSET));
        return Base64.getEncoder().encodeToString(encryptData);

    }

    public final static String decrypt(String encryptText) throws Exception {

        Key deskey = null;
        DESedeKeySpec spec = new DESedeKeySpec(encryptKey.getBytes());
        SecretKeyFactory keyfactory = SecretKeyFactory.getInstance("desede");
        deskey = keyfactory.generateSecret(spec);
        Cipher cipher = Cipher.getInstance("desede/CBC/PKCS5Padding");
        IvParameterSpec ips = new IvParameterSpec(iv.getBytes());
        cipher.init(Cipher.DECRYPT_MODE, deskey, ips);

        byte[] decryptData = cipher.doFinal(Base64.getDecoder().decode(encryptText));

        return new String(decryptData, CHARSET);
    }

}
