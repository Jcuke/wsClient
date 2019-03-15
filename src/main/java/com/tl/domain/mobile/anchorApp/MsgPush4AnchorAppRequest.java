package com.tl.domain.mobile.anchorApp;

import com.tl.base.RequestHead;
import com.tl.domain.dtos.MsgDto;
import lombok.Data;

/**
 * @program: matrix-tl
 * @description: 主播app端的消息推送接口入参请求消息体
 * @author: Ron
 * @create: 2018-07-26 11:36
 * Copyright (C) 2018 TL.Corp, All Rights Reserved.
 */
@Data
public class MsgPush4AnchorAppRequest extends RequestHead {

    private Integer anchorId;
    private MsgDto msg;

    @Override
    public String toString() {
        return "{\"anchorId\" : " + anchorId + ",\"msg\" : " + (msg == null ? null : msg) + "}";
    }
}

