package com.tl.websocket.core.msg.output;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

/**
 * @program: matrix-tl
 * @description: 运营后台对直播间发出警告的请求消息体
 * @author: Ron
 * @create: 2018-08-24 15:06
 * Copyright (C) 2018 TL.Corp, All Rights Reserved.
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class UniversalBroadcastOutput {

    String id;
    String appId;
    //广播内容
    String content;
    //点击响应事件
    String clickEvent;
    //跳转内容
    String forwardText;
    //操作人
    String createUser;

}
