package com.tl.base;

/**
 * @program: tl-front
 * @description: 常量类
 * @author: Ron
 * @create: 2018-06-08 16:44
 */
public class Constant {

    public static final String YES = "1";
    public static final String NO = "0";

    public static final  int NO_GUARD=0;
    public static final  int GUARD_WEEK=1;
    public static final  int GUARD_MONTH=2;
    public static final  int GUARD_YEAR=3;

    public static final int YES_INT_VALUE = 1;
    public static final int NO_INT_VALUE = 0;

    public static class CheckType {
        public final static String checkEmpty = "checkEmpty";
        public final static String checkNegativeNum = "checkNegativeNum";
        public final static String checkLenGt = "checkLenGt";
        public final static String checkValueGt = "checkValueGt";
        public final static String checkEqual0 = "checkEqual0";
        public final static String checkIllegalRange4Array = "checkIllegalRange4Array";
    }

    public static class RetCode {
        /**
         * 接口调用成功
         */
        public final static int SUCCESS = 100001;
        /**
         * 接口调用失败
         */
        public final static int FAIL = 100002;
        /**
         * 接口异常
         */
        public final static int EXCPTION = 100003;
        /**
         * 参数错误
         */
        public final static int PARAMETER_ERROR = 100004;
        public final static int KNOWN_ERROR = 100005;
        public final static int PARAMETER_PARSE_EXCEPTION = 1000006;
        public final static int JSON_PARSE_EXCEPTION = 1000007;

        public final static int SYSTEM_PARAMETER_ERROR = 200001;
        public final static int STREAM_BUCKET_ERROR = 200002;
        public final static int STREAM_PROVIDER_ERROR = 200003;
        public final static int REDIS_DATA_ERROR = 200004;

        public final static int REQUEST_ORDER_CONDITION_ERROR = 200101;


        public final static int REQUEST_BODY_NOT_JSON = 100501;
        public final static int REQUEST_BODY_PARAMETER_DATA_TYPE_ERROR = 100502;


    }

    /**
     * 设备类型
     */
    public static final class DeviceType {
        public final static String ANDROID = "android";
        public final static String IOS = "ios";
        public final static String PHP = "php";
        public final static String WEB = "web";
    }

    /**
     * 登录渠道名终端类型
     */
    public static final class LoginChannel {
        /**
         * web, php 等 pc端
         */
        public final static String PC = "pc";

        /**
         * android, ios 等 移动端
         */
        public final static String MOBILE = "mobile";

        public static String getChannelByDeviceType(String deviceType){

            if(DeviceType.IOS.equalsIgnoreCase(deviceType) || DeviceType.ANDROID.equalsIgnoreCase(deviceType)){
                return MOBILE;
            }
            if(DeviceType.WEB.equalsIgnoreCase(deviceType) || DeviceType.PHP.equalsIgnoreCase(deviceType)){
                return PC;
            }
            return "illegal login channel";
        }
    }
}
