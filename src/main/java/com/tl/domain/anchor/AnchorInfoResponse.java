package com.tl.domain.anchor;


import lombok.Data;

/**
 * @program: matrix-tl
 * @description: 主播表
 * @create: 2018-09-01 14:01
 * Copyright (C) 2018 TL.Crop, All Rights Reserved.
 */
@Data
public class AnchorInfoResponse {

    //主播ID
    private String userId;
    //昵称
    private String nickname;
    //虚拟币余额
    private Long balance;
    //头像url
    private String avatar;
    //性别
    private Integer sex;
    //直播间id
    private String liveId;

    //粉丝数
    private Integer followerCount;
    //是否直播中
    private Integer isLiving;

    //认证时间
    private Long createTime;
    //是否冻结，1是， 0否
    private Integer isDeleted;
    //月在线时长，单位分钟
    private Integer monthOnLineTime;

    private String streamName;

    private Integer followed;

    //经验
    private Long exp;

    //经验对应的等级
    private Long expGrade;


}
