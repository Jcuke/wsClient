package com.tl.domain.live;

import com.tl.base.RequestHead;
import lombok.Data;

/**
 * @program: matrix-tl
 * @description: 进入直播间前获取初始化数据
 * @author: Ron
 * @create: 2018-07-02 11:29
 * Copyright (C) 2018 TL.Corp, All Rights Reserved.
 */
@Data
public class EnterLiveCkeckRequest extends RequestHead {

    private String liveId;
    private String userId;

    @Override
    public String toString() {
        return "{\"liveId\" : " + (liveId == null ? null : "\"" + liveId + "\"") + ",\"userId\" : " + userId + "}";
    }
}
