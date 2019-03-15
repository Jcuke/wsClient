package com.tl.websocket.core;

import com.tl.base.Constant;

public class Const {

    /**
     * 采用redis存储时key前缀
     */
    public static final String REDIS_KEY_PRE = "BS_";

    public static final String ROOM = REDIS_KEY_PRE + "ROOM";

    public static final String TEMP_MOSTPER_ROOM_PRE = REDIS_KEY_PRE + "TEMP_MOSTPER_ROOM_";

    public static final String M_PRE = "M_";

    public static final String R_PRE = "R_";

    public static final String ROOM_PRE = REDIS_KEY_PRE + R_PRE;

    public static final String GIFT_AMOUNT_PRE = REDIS_KEY_PRE + "GIFT_AMOUNT_";

    public static final String ADDR_FIND_ROOM_PRE = REDIS_KEY_PRE + "ADDR_FIND_ROOM_";

    public static final String ADDR_FIND_UID_PRE = REDIS_KEY_PRE + "ADDR_FIND_UID_";

    public static final String MESSAGE_TYPE = "messageType";

    public static final String BUSINESS_DATA = "businessData";

    public static final String MESSAGE_SUCCESS = "success";

    public static final String DEBUG = "debug";

    /**
     * 业务服务器发布消息key
     */
    public static final String SUCCESS = "success";

    public static final String FAIL = "fail";

    public static final int INT_SUCCESS = 1;

    public static final int INT_FAIL = -1;

    public static final int ROLE_A = 1;//主播

    public static final int CODE_SUCCESS = 1;

    public static final int HTTP_CODE_SUCCESS = 100001;

    public static final int CODE_FAIL = -1;

    public static final int HTTP_CODE_FAIL = 100002;

    public static final String MESSAGE_FAIL = "fail";

    public static final int CODE_INPUT_ERROR = -2;

    public static final String MESSAGE_INPUT_ERROR = "input error";

    public static final int TIME_TAG = 6;

    public static final int PAGE_SIZE = 10;

    public static final String LOGIN_URL = "http://192.168.88.200:8002/#/home/project/inside/api/detail?groupID=68&apiID=252&projectName=zhanglingsdk&projectID=17";

    public final static String LIVE_DATA = "livedata";

    public final static String BALANCE_INSUFFICIENT = "余额不足";


    public final static String LIVE_CONTROL_APPOINT = Constant.YES;
    public final static String LIVE_CONTROL_CANCEL = "2";
}
