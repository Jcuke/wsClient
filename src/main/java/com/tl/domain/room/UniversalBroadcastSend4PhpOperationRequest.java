package com.tl.domain.room;

import com.tl.base.RequestHead;
import lombok.Data;

/**
 * @program: matrix-tl
 * @description: 运营后台对直播间发出警告的请求消息体
 * @author: Ron
 * @create: 2018-08-24 15:06
 * Copyright (C) 2018 TL.Corp, All Rights Reserved.
 */
@Data
public class UniversalBroadcastSend4PhpOperationRequest extends RequestHead {

    //广播范围
    String scope;
    //房间号，多个按英文逗号拼接
    String liveIds;
    //标签名称
    String tag;
    //广播内容
    String content;
    //点击响应事件
    String clickEvent;
    //跳转内容
    String forwardText;
    //操作人
    String createUser;

}
