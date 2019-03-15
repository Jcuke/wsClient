package com.tl.domain.mobile.anchorApp;

import com.tl.base.RequestHead;
import lombok.Data;

/**
 * @program: matrix-tl
 * @description: 主播昵称修改入参请求消息体
 * @author: Ron
 * @create: 2018-07-02 11:36
 * Copyright (C) 2018 TL.Corp, All Rights Reserved.
 */
@Data
public class AnchorNoticeUpdateRequest extends RequestHead {

    private String notice;

    @Override
    public String toString() {
        return "{\"notice\" : " + (notice == null ? null : "\"" + notice + "\"") + "}";
    }
}

