package com.tl.domain.banpost;

import com.tl.base.RequestHead;
import lombok.Data;

/**
 * @program: matrix-tl
 * @description: 禁言历史查询入参消息体
 * @author: Ron
 * @create: 2018-08-16 10:59
 * Copyright (C) 2018 TL.Corp, All Rights Reserved.
 */
@Data
public class BanPostHistorysRequest  extends RequestHead {
    private static final long serialVersionUID = 5503287992441505346L;

    private String liveId;

    @Override
    public String toString() {
        return "{\"liveId\" : " + (liveId == null ? null : "\"" + liveId + "\"") + "}";
    }
}
