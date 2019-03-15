package com.tl.websocket.core.msg.input;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.tl.websocket.core.msg.input.base.BusinessDataInput;
import lombok.Data;

/**
 * @program: matrix-tl
 * @description: 禁言输入消息, ws获取的参数
 * @author: Ron
 * @create: 2018-08-13 10:28
 * Copyright (C) 2018 TL.Corp, All Rights Reserved.
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class CcsInput extends BusinessDataInput {

    private String userId;
    private String userName;
    private String targetId;
    private String targetName;
    private String liveId;
    private String action;
    private String role;
}
