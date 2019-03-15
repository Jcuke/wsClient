package com.tl.base;

/**
 * 系统配置变, 配置项编码
 */
public enum SysParamEnum {

    GIFT_RATIO("giftRatio", "礼物分成比例"),
    LIVE_ONLINE_USER_LIST_LEVEL_FILTER("liveOnlineUserListLevelFilter", "直播间在线用户列表显示等级"),
    ENABLE_LIVE("enableLive", "是否开启直播功能"),
    SPEAK_LEVEL_FILTER_ADMIN("speakLevelFilter4Admin", "管理员设置的全局的聊天发言等级"),
    SPEAK_KEY_WORDS_BLACK_LIST("speakKeyWordsBlackList", "聊天关键词屏蔽黑名单"),
    SOCKET_HEART_BEAT_INTERVAL("socketHeartBeatInterval", "直播客户端socket心跳间隔秒数"),
    AUDIENCE_ENTER_LIVE_BROADCAST_INTERVAL("audienceEnterLiveBroadcastInterval", "用户进入直播间广播间隔秒数"),
    ANCHOR_HEART_BEAT_TIMEOUT_INTERVAL("anchorHeartBeatTimeoutInterval", "主播心跳超时间隔秒数"),
    ENABLE_RECORD_API("enableRecordApi", "是否开发录制API"),
    ONELINE_COUNT_SYN_INTERVAL("onlineCountSynInterval", "在现人数同步间隔秒数"),
    LIVE_INIT_ONLINE_USER_LIST_SIZE("liveInitOnlineUserListSize", "进入直播间初始在线用户列表长度"),
    GIFT_TRUMPET_PLAY_PERIOD("giftTrumpetPlayPeriod", "礼物喇叭动画飘屏持续时间毫秒数"),
    LIVE_MANAGER_COUNT_LIMIT("liveManagerCountLimit", "房管人数上限"),
    FESTIVAL_DAY_TIME("festivalDayTime", "节假日之间区间的起止秒的时间戳"),
    LIVE_STATISTIC_HISTORY_DAY_COUNT("liveStatisticHistoryDayCount", "直播相关统计历史数据天数"),
    LIVE_WATCH_COUNT_STATISTIC_INTERVAL_MINS("liveWatchCountStatisticIntervalMins", "所有直播播间同时观看人数统计间隔分钟数"),
    LIVE_DEFAULT_COVER_PICTURE_URL("liveDefaultCoverPictureUrl", "开播默认封面图片URL"),
    NETEASE_STREAM_CALLBACK_DOMAIN("NetEaseStreamCallBackDomain", "网易云推拉流回调地址设置-域名配置");



    public String code;
    public String desc;

    SysParamEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    @Override
    public String toString() {
        return this.code;
    }

    //public static void main(String[] args) {
    //    System.out.println(SysParamEnum.GIFT_RATIO.code);
    //}
}
