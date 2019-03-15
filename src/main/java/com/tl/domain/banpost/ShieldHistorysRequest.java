package com.tl.domain.banpost;

import com.tl.base.RequestHead;
import lombok.Data;

/**
 * @program: matrix-tl
 * @description: 用户屏蔽历史查询入参消息体
 * @author: Ron
 * @create: 2018-08-16 10:59
 * Copyright (C) 2018 TL.Corp, All Rights Reserved.
 */
@Data
public class ShieldHistorysRequest extends RequestHead {

    private static final long serialVersionUID = 454299880487021063L;
    private String liveId;

    @Override
    public String toString() {
        return "{\"liveId\" : " + (liveId == null ? null : "\"" + liveId + "\"") + "}";
    }
}
