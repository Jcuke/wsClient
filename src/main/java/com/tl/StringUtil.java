package com.tl;

import com.xiaoleilu.hutool.codec.Base64;
import lombok.extern.slf4j.Slf4j;
import sun.misc.BASE64Encoder;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.net.URLEncoder;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import java.util.regex.Pattern;

@Slf4j
public class StringUtil {

    private static final String ENCODING = "UTF-8";

    private static String goodNum[] = {"00000000","11111111","22222222","33333333","44444444","55555555","66666666","77777777","88888888","99999999",
                                       "12345678","87654321","11110000","11112222","66668888","88886666","68686868","86868686","88880000","66660000",
                                       "88881234","66661234","88881122","88882211","80808080","60606060"};

    public static boolean isEmpty(Object obj) {

        if (obj == null) {
            return true;
        }

        if(obj.toString().equals("(null)") || obj.toString().equals("null")){
            return true;
        }

        if (obj instanceof Number) {
            return ((Number) obj).doubleValue() == 0 || ((Number) obj).doubleValue() == -1;
        } else if (obj instanceof String) {
            return ((String) obj).trim().length() == 0;
        }
        return false;
    }

    public static String stringArray2String(String[] stringArray) {
        StringBuilder result = new StringBuilder();
        if (null != stringArray && stringArray.length > 0) {
            for (String s : stringArray) {
                result.append(",").append(s);
            }
        }
        if (result.toString().startsWith(",")) {
            result = new StringBuilder(result.substring(1));
        }
        result = new StringBuilder("[" + result + "]");
        return result.toString();
    }

    public static String coverNull(String str) {
        return str == null || "null".equalsIgnoreCase(str) ? "" : str;
    }

    public static String coverNull(String str, String value) {
        return str == null || "null".equalsIgnoreCase(str) ?  value : str;
    }

    public static Object coverNull2Object(Object src, Object value) {
        return src == null ?  value : src;
    }

    public static String genToken() {
        return genRandomString(32);
    }

    public static String genRandomString(int length) { //length表示生成字符串的长度
        String base = "abcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int number = random.nextInt(base.length());
            sb.append(base.charAt(number));
        }
        return sb.toString();
    }


    public static String genRandomStringWithNumNoGoodNum(int length){
            String randomNum = genRandomStringWithNum(length);
            for(String num:goodNum){
                if(num.equals(randomNum)){
                    return genRandomStringWithNumNoGoodNum(length);
                }
            }
            return randomNum;
    }

    public static String genRandomStringWithNum(int length) {
        String base = "0123456789";
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int number = random.nextInt(base.length());
            sb.append(base.charAt(number));
        }
        return sb.toString();
    }

    public static String uuidGen16() {
        return UUID.randomUUID().toString().replace("-", "");
    }

    public static String percentEncode(String value) {
        try {
            return value != null ? URLEncoder.encode(value, ENCODING).replace("+", "%20").replace("*", "%2A").replace("%7E", "~") : null;
        } catch (UnsupportedEncodingException e) {
            log.error("percentEncode方法异常:",e);
        }
        return "";
    }

    /**
     * 将 map 转换成 String 并用& 符号连接
     * @param map
     * @return
     */
    public static String map2StringWithAnd(Map<String, Object> map) {
        StringBuilder sb = new StringBuilder();
        String result;
        map.forEach((key, value) -> {
            if (value != null) {
                sb.append("&").append(key).append("=").append(value.toString());
            }
        });
        result = sb.toString();
        if(result.trim().length() > 0){
            result = result.substring(1);
        }
        return result;
    }

    /**
     * encode by Base64
     */
    public static String encodeBase64(byte[] input) {
        //Class clazz = Class.forName("com.sun.org.apache.xerces.internal.impl.dv.util.Base64");
        //Method mainMethod = clazz.getMethod("encode", byte[].class);
        //mainMethod.setAccessible(true);
        //Object retObj = mainMethod.invoke(null, new Object[]{input});
        //return (String) retObj;
        return new BASE64Encoder().encode(input);
    }

    /**
     * decode by Base64
     */
    public static byte[] decodeBase64(String input) throws Exception {
        Class clazz = Class.forName("com.sun.org.apache.xerces.internal.impl.dv.util.Base64");
        Method mainMethod = clazz.getMethod("decode", String.class);
        mainMethod.setAccessible(true);
        Object retObj = mainMethod.invoke(null, input);
        return (byte[]) retObj;
    }

    public static String coverEmpty2Null(String inputStr) {
        if (inputStr == null || inputStr.trim().length() == 0) {
            return null;
        }
        return inputStr;
    }

    public static String coverNull2Empty(String inputStr) {
        if (inputStr == null) {
            return "";
        }
        return inputStr;
    }

    public static String coverNull2Empty(Object inputStr) {
        if (inputStr == null) {
            return "";
        }
        return inputStr.toString();
    }

    public static boolean isNotEmpty(Object obj){
        return !isEmpty(obj);
    }

    private static String pattern = "^([hH][tT]{2}[pP]://|[hH][tT]{2}[pP][sS]://)(([A-Za-z0-9-~]+).)+([A-Za-z0-9-~/])+$";

    /**
     * 判断 url 是否合法
     */
    public static boolean isUrl(String url) {
        Pattern httpPattern = Pattern.compile(pattern);
        return httpPattern.matcher(url).matches();
    }

    public static String lowerFirst(String oldStr){
        char[]chars = oldStr.toCharArray();
        chars[0] += 32;
        return String.valueOf(chars);
    }

    public static final String encode(String sourceText){
        sourceText = Base64.encode(sourceText);
        StringBuilder str2 = new StringBuilder();  //存储加密后的字符串
        //加密过程
        for(int i=0;i<sourceText.length();i++){
            char c = (char)(sourceText.charAt(i) ^ 0x8934549034L);
            str2.append(c);
        }
        return str2.toString();
    }

    public static final String decode(String sourceText){
        StringBuilder str2 = new StringBuilder();  //存储加密后的字符串
        //加密过程
        for(int i=0;i<sourceText.length();i++){
            char c = (char)(sourceText.charAt(i) ^ 0x8934549034L);
            str2.append(c);
        }
        return Base64.decodeStr(str2.toString());
    }

}
