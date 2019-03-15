package com.tl.domain.streamErrorReport;

import com.tl.base.RequestHead;
import lombok.Data;

/**
 * @program: matrix-tl
 * @description: 进入直播模块入参
 * @author: Ron
 * @create: 2018-09-01 18:12
 * Copyright (C) 2018 TL.Crop, All Rights Reserved.
 */
@Data
public class StreamErrorReportQueryRequest extends RequestHead {

    private String providerName;
    private String account;
    private Long startTime;
    private Long endTime;
}
