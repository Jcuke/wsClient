package com.tl.domain.mobile.anchorApp;

import com.tl.base.RequestHead;
import lombok.Data;

/**
 * @program: matrix-tl
 * @description: 主播任务批量放弃历史入参请求消息体
 * @author: Ron
 * @create: 2018-07-24 11:36
 * Copyright (C) 2018 TL.Corp, All Rights Reserved.
 */
@Data
public class TaskDiscardHistorysRequest extends RequestHead {

    private Integer id;

    @Override
    public String toString() {
        return "{\"id\" : " + id + "}";
    }
}

