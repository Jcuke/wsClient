package com.tl.domain.mobile.anchorApp;

import com.tl.base.RequestHead;
import lombok.Data;

/**
 * @program: matrix-tl
 * @description: 主播准备直播，验证接口入参请求消息体
 * @author: Ron
 * @create: 2018-07-25 11:36
 * Copyright (C) 2018 TL.Corp, All Rights Reserved.
 */
@Data
public class PrepareLiveCheckRequest extends RequestHead {

    private String liveId;

    @Override
    public String toString() {
        return "{\"liveId\" : " + (liveId == null ? null : "\"" + liveId + "\"") + "}";
    }
}

