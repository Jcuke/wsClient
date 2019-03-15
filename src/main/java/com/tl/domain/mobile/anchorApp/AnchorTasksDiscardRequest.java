package com.tl.domain.mobile.anchorApp;

import com.tl.base.RequestHead;
import lombok.Data;

/**
 * @program: matrix-tl
 * @description: 主播任务批量放弃入参请求消息体
 * @author: Ron
 * @create: 2018-07-24 11:36
 * Copyright (C) 2018 TL.Corp, All Rights Reserved.
 */
@Data
public class AnchorTasksDiscardRequest extends RequestHead {

    private String taskId;
    private String reason;

    @Override
    public String toString() {
        return "{\"taskId\" : " + (taskId == null ? null : "\"" + taskId + "\"") + ",\"reason\" : " + (reason == null ? null : "\"" + reason + "\"") + "}";
    }
}

