package com.tl.forcache;

import lombok.Data;

import java.io.Serializable;

@Data
public class LiveHistoryDto implements Serializable {

    private Integer id;
    private String userId;
    private String liveId;
    private String tag;
    private String topic;
    private String avatar;
    private String nikename;
    private String liveCoverUrl;
    private String recomCoverUrl;
    private String pushStreamUrl;
    private String pullStreamUrl;
    private String streamName;
    private Integer free = 0;
    private String gpsAddress;
    private Long anchorIncome = 0L;
    private Long startTime = 0L;
    private Long endTime = 0L;
    private Long giftIncome;
    private Integer giftCount;
    private Integer onlineUserCountPeekValue;
    private Long createTime = 0L;
    private Integer liveCount;
    private String appId;
    private String openId;
}