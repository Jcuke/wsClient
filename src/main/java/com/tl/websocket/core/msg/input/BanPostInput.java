package com.tl.websocket.core.msg.input;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

/**
 * @program: matrix-tl
 * @description: 禁言输入消息体
 * @author: Ron
 * @create: 2018-09-06 19:36
 * Copyright (C) 2018 TL.Crop, All Rights Reserved.
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class BanPostInput {

    private String userId;
    private String liveId;
    private String targetId;
    private String targetName;
    private String banPostStatus;
    private Long clearTime;
    private String role;
    private String userName;
}
