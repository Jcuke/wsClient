package com.tl.domain.live;

import lombok.Data;

import java.io.Serializable;

/**
 * 直播间信息附带主播信息
 */
@Data
public class LastLiveData implements Serializable {

    private String userId;
    private String liveId;
    private String tag;
    private String topic;
    private String avatar;
    private String nickname;
    private Integer sex;
    private Integer liveCount;
    private String liveCoverUrl;
    private Long anchorIncome;
    private Long startTime;
    private Long endTime;
    //主播在本直播间的礼物总收益
    private Long giftIncome;
    private Long giftIncomeCurrentLive;

    //主播在本直播间的收到礼物总数量
    private Integer giftCount;

    //本直播间同时在线用户的数的峰值
    private Integer onlineUserCountPeekValue;

    //直播间预告
    private String herald;

    //直播间预告发布时间
    private Long publishTime;

    //经验
    private Long exp;

    //经验对应的等级
    private Long expGrade;


}
