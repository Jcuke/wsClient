package com.tl.base;

/**
 * @program: matrix-tl
 * @description: redis 的 key
 * @author: Ron
 * @create: 2018-07-06 14:31
 */
public class RedisKeys {

    /**
     * appID 在 redis 的前缀
     */
    public final static String APPID_PREFIXX = "project_";

    /**
     * 礼物列表
     */
    public final static String GIFT_LIST = "live_gift";

    /**
     * 直播间内正在生效的被踢出的用户列表
     */
    public final static String GO_OUT_USERS = "go_out_users_";


    /**
     * 首页标签栏
     */
    public final static String INDEX_LABELS = "tag_key_";

    /**
     * 首页标签栏
     */
    public final static String HOT_KEY = "hot_key";


    /**
     * 广告列表前缀
     */
    public final static String ADVERTISEMENT = "ad_";

    /**
     * 直播间公告
     */
    public final static String ADV_NOTICE = "notice_";

    /**
     * 首页排行榜配置
     */
    public final static String RANK_CONFIG_INDEX = "rankConfig:index_";

    /**
     * 直播间排行榜配置
     */
    public final static String RANK_CONFIG_LIVE = "rankConfig:live_";

    /**
     * 推荐主播列表
     */
    public final static String COMMENDATORY_ANCHOR = "commendatory_anchor_";

    /**
     * 主播信息
     */
    public final static String ANCHOR_INFO = "live:anchorInfo:";

    /**
     * 直播间信息
     */
    public final static String ANCHOR_LIVE_INFO = "anchor:anchorLiveInfo:";

    /**
     * 热门直播间列表
     */
    public final static String HOT_LIVE = "live:hotLive:";

    /**
     * 在线直播间信息
     */
    public final static String ONLINE_LIVE_INFO = "live:onlineLiveInfo:";

    /**
     * 直播间禁言用户列表
     */
    public final static String LIVE_BAN_POST_USER_LIST = "live:banPostUserList:";

    /**
     * 屏蔽的目标用户列表
     */
    public final static String SHIELD_USER_LIST = "live:shieldUserList:";

    /**
     * 用户关注关系
     */
    public final static String LIVE_FANS_RELATION = "live:fansRelation:";

    /**
     * 用户进入直播间,返回的直播间初始化信息
     */
    public final static String LIVE_INIT_INFO = "live:initInfo:";

    /**
     * 直播间在线用户列表
     */
    public final static String ONLINE_USER_LIST = "live:onlineUserList:";

    /**
     * 踢出, key userId, value liveId's set
     */
    public final static String KICKED_USER_LIVE_IDS = "live:kickedUserLiveIds:";

    /**
     * 上一次开播统计数据(用于给用户看的,直播结束画面的数据)
     */
    public final static String LAST_LIVE_DATA = "live:lastLiveData:";

    /**
     * 在线观众用户信息
     * live:onlineAudience:liveId:appId:userId userInfo
     */
    public final static String ONLINE_AUDIENCE = "live:onlineAudience:";

    public final static String ONLINE_AUDIENCE_ID_WITH_EXP_GRADE = "live:onlineAudienceUserIdSetWithExpGrade:";

    public final static String USER_EXP_GRADE = "user:expGrade:";

    public final static String LIVE_HISTORY = "live:liveHistory:";

    public final static String LIVE_HERALD = "live:liveHerald:";

    public final static String TOKEN_PREFIX = "token:";

    public final static String USER_TOKEN_PREFIX = "userToken:";

    public static final  String STREAM_LEVEL_REDIS_KEY_NAME = "streamLevel_";
}
