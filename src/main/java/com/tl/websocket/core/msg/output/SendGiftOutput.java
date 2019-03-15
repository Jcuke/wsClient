package com.tl.websocket.core.msg.output;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

/**
 * @program: matrix-tl
 * @description: 发送礼物广播 eg. xxx送了个游艇
 * @author: Ron
 * @create: 2018-08-22 16:14
 * Copyright (C) 2018 TL.Corp, All Rights Reserved.
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class SendGiftOutput{

    private String giftName;
    private String userId;
    private Integer giftNum;
    private String giftId;
    private String price;
    private String userName;
    private String liveId;
    private String appId;
    private String anchorId;
    private String effectType;
    private String sendIndex;
    private String avatar;
    private String role;
    private String sex;
    private String createTime;
    private String expGrade;
    private String anchorName;
    private Integer liveCount;
    private String uuid;
}
