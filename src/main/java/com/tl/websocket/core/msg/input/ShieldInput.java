package com.tl.websocket.core.msg.input;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
public class ShieldInput {

    //屏蔽发起人
    private String userId;
    //被屏蔽的人
    private String targetId;
    //屏蔽发起人的角色
    private String liveId;
    private String shieldStatus;//设置1，取消2
}
