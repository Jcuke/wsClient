package com.tl.common;

/**
 * @program: matrix-tl
 * @description: 业务常量定义
 * @author: Ron
 * @create: 2018-07-11 15:10
 */
public class ConstantBs {

    public static String[] CHANNELS = new String[]{Channel.TOT_APP_ID, Channel.YH_APP_ID};

    public interface Channel {

        String NULL_APP_ID = "0";
        String TOT_APP_ID = "1";
        String YH_APP_ID = "2";
    }

    public interface RequestHeadParameterName {
        String APP_ID = "appId";
        String OPEN_ID = "openId";
        String MY_USER_ID = "myUserId";
        String CONTENT_TYPE = "contentType";
        String SDK_VERSION = "sdkVersion";
        String DEVICE_TYPE = "deviceType";
        String DEVICE_NAME = "deviceName";
        String DEVICE_ID = "deviceId";
        String TOKEN = "token";
        String IP = "ip";
    }

    public interface LiveStatisticTableName {

        String dailyNewUserCount = "DailyNewUserCount";
        String dailyLiveTimes = "DailyLiveTimes";
        String dailyLiveAnchorCount = "DailyLiveAnchorCount";
        String liveAnchorCountPeakValue = "LiveAnchorCountPeakValue";
        String anchorDayAverageLiveMins = "AnchorDayAverageLiveMins";
        String liveRoomUserCountTrend = "LiveRoomUserCountTrend";
        String liveModuleWatchCountTrend = "LiveModuleWatchCountTrend";
    }

    public interface LiveStatisticKeys {
        String ANCHOR_LIVE_PEAK_VALUE = "anchorLivePeakValue";
        String LIVE_MODULE_ONLINE_COUNT_PEAK_VALUE = "liveModuleOnlineCountPeakValue";
        String LIVE_MODULE_WATCH_COUNT = "liveModuleWatchCountTrend";
        String LIVE_ROOM_USER_COUNT = "liveRoomUserCountTrend";
    }

    /**
     * 分隔符定义
     */
    public static class SplitMark {

        public final static String wsAddressSplit = "_-_";

        public final static String wsSessionIdSplit = "&";

        public static String getSessionId(String sessionId) {
            String[] ms = sessionId.split(wsAddressSplit);
            return ms[0];
        }

        public static String getLiveId(String sessionId) {
            return getSessionId(sessionId).split(wsSessionIdSplit)[0];
        }

        public static String getUserId(String sessionId) {
            return getSessionId(sessionId).split(wsSessionIdSplit)[1];
        }

        public static String getEnterType(String sessionId) {
            return getSessionId(sessionId).split(wsSessionIdSplit)[2];
        }
    }

    /**
     * 直播间用户角色
     */
    public interface LiveUserRole {

        /**
         * 主播
         */
        String ANCHOR = "1";
        /**
         * 观众
         */
        String AUDIENCE = "2";
        /**
         * 房间管理员
         */
        String ROOM_MANAGER = "3";
    }

    /**
     * 用户进入直播的入口类型，判断用户是作为主播进入，还是作为观众进入直播间
     */
    public interface LiveEnterType {
        /**
         * 主播端, 开播端
         */
        String ANCHOR = "1";
        /**
         * 观众, 观看端
         */
        String AUDIENCE = "2";

    }

    public interface LiveStatus {

        /**
         * 直播中
         */
        Integer LIVING = 1;
        /**
         * 1
         * 未开播
         */
        Integer END = 0;
    }

    public interface LiveStatusChangeEventType {

        //当网络不可靠的情况的情况,这几个状态值也不可靠,目前客户端没用到
        //主播socket状态
        String SOCKET_CONNECT_TIME = "socketConnectTime";
        //流状态,是否正在推流
        String PUSH_TIME = "pushTime";
        //直播间是否退到后台
        String ANCHOR_IS_BACKEND = "anchorIsBackend";
        //直播间警告状态
        String WARN_STATUS = "warnStatus";
        //直播间发言等级
        String SPEAK_LEVEL = "speakLevel";
    }

    public interface UniversalBroadcastScope {

        //按房间号广播
        String BY_LIVE_ID = "byLiveId";
        //按标签分类广播
        String BY_TAG = "byTag";
        //按标签分类广播
        String BY_APP_ID = "byAppId";
    }

    public interface UniversalBroadcastEvent {

        //无跳转事件
        String READ_ONLY = "readOnly";
        //跳转至房间
        String FORWARD_TO_LIVE = "forwardToLive";
        //跳转指定URL
        String FORWARD_TO_URL = "forwardToURL";
    }

}
