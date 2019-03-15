package com.tl.websocket.core.msg.output;

import lombok.Data;

/**
 * @program: matrix-tl
 * @description: 用户退出直播间的广播消息
 * @author: Ron
 * @create: 2018-08-15 14:21
 * Copyright (C) 2018 TL.Corp, All Rights Reserved.
 */
@Data
public class LeaveMsgOut {

    private String role;
    private String userId;
//    private String streamName;
//
//    private Integer onlineUserCountPeekValue;
//    private Long startTime;
//    private Long endTime;
//    private String gpsAddress;
//    private String nikename;
//    private String avatar;
//    private String topic;
//    private String liveId;
//    private Integer isFollowed;


    public LeaveMsgOut() {
    }

    public LeaveMsgOut(String role, String userId) {
        this.role = role;
        this.userId = userId;
    }

}
