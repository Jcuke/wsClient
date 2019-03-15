package com.tl.domain.live;

import com.tl.base.RequestHead;
import lombok.Data;

/**
 * @program: matrix-tl
 * @description: 直播(Live)详情信息
 * @author: Ron
 * @create: 2018-07-02 11:29
 * Copyright (C) 2018 TL.Corp, All Rights Reserved.
 */
@Data
public class LiveDetailRequest extends RequestHead {

    private String liveId;

    @Override
    public String toString() {
        return "{\"liveId\" : " + (liveId == null ? null : "\"" + liveId + "\"") + "}";
    }
}
