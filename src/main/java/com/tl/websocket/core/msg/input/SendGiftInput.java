package com.tl.websocket.core.msg.input;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.tl.websocket.core.msg.input.base.BusinessDataInput;
import lombok.Data;

/**
 * @program: matrix-tl
 * @description: 
 * @author: Ron
 * @create: 2018-08-22 16:14
 * Copyright (C) 2018 TL.Corp, All Rights Reserved.
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class SendGiftInput extends BusinessDataInput {

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
    private String clientIp;
    private String tomatoPrice;
    private String expGrade;
    private String anchorName;
    private Integer liveCount;
    private String uuid;
}
