package com.tl.websocket.core.msg.input;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.tl.websocket.core.msg.input.base.BusinessDataInput;
import lombok.Data;

/**
 * @program: matrix-tl
 * @description: 屏蔽输入消息
 * @author: Ron
 * @create: 2018-08-13 13:41
 * Copyright (C) 2018 TL.Corp, All Rights Reserved.
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class LiveControlInput extends BusinessDataInput {

    private String anchorId;
    private String liveId;
    private String userId;
    private String nickname;
    private Integer liveControlStatus;
}
