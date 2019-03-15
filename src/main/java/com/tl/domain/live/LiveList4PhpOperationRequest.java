package com.tl.domain.live;

import com.tl.base.RequestHead;
import lombok.Data;

/**
 * @program: matrix-tl
 * @description: 直播间列表查询
 * @author: Ron
 * @create: 2018-07-02 11:29
 * Copyright (C) 2018 TL.Corp, All Rights Reserved.
 */
@Data
public class LiveList4PhpOperationRequest extends RequestHead {

    private String liveId;
    private String anchorNickname;
    private String topic;
    private String tag;
    private Integer liveStatus;
    // 轮播状态 2018-11-30 10:43:13
    private Integer videoStatus;

}
