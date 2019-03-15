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
public class LiveMsg4PhpOperationRequest extends RequestHead {

    //房间号
    private String liveId;
    //通知或警告的消息内容
    private String content;
    //发起警告 1， 取消 2
    public String action;

}
