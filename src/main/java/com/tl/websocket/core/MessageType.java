package com.tl.websocket.core;

public class MessageType {
    //发送礼物
    public static final String GIFT = "gift";

    //礼物喇叭
    public static final String GIFT_TRUMPET = "giftTrumpet";

    //进入直播间
    public static final String ENTRY = "entry";

    //主播非主动离开直播间
    public static final String LEAVE = "leave";

    public static final String DISCONNECT = "disconnect";

    public static final String LIVE_SETTING = "liveSetting";

    public static final String ONLINE_USER_LIST = "onlineUserList";

    public static final String TOKEN_INVALID_NOTIFY = "tokenInvalidNotify";

    //聊天
    public static final String CHAT = "chat";

    //礼物总金额
    public static final String GAMOUNT = "gamount";

    //初始化数据
    public static final String INIT = "init";

    //余额
    public static final String BALANCE = "balance";

    public static final String AMOUNT = "amount";

    //用户屏蔽
    public static final String SHIELD = "shield";

    //用户禁言
    public static final String BANPOST = "banPost";

    //整个房间禁言
    public static final String BANPOST_ALL = "banPostAll";

    //房间发言间隔时间设置
    public static final String POST_INTERVAL = "postInterval";

    //直播警告
    public static final String WARN = "warn";

    //直播间通用广播消息
    public static final String UNIVERSAL_BROADCAST = "universalBroadcast";

    //直播通知
    public static final String NOTIFY = "notify";

    //禁止推流-封停
    public static final String FORBIDLIVE = "forbidLive";

    //暂停推流显示遮罩图片的事件通知
    public static final String PAUSE_PUSH_IMAGE = "pausePushImage";

    //通用的文本消息
    public static final String COMMON_MSG = "commonMsg";

    //设置场控
    public static final String LIVE_CONTROL = "liveControl";
    // 踢出房间
    public static final String GOOUT = "goOut";

    public static final String BROKE_STREAM = "brokeStream";

    public static final String PUSH_STREAM = "pushStream";

    //socket 连接存活检测消息
    public static final String PING = "ping";

    public static final String SOCKET_TIMEOUT = "socketTimeout";

    //websocket服务启动通知消息
    public static final String SOCKET_SERVER_START = "socketServerStart";

    //用户等级
    public static final String USER_GRADE = "userGrade";


}
