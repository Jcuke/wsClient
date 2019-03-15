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
public class LiveListSearchRequest extends RequestHead {
    /**
     * 搜索关键字 1
     */
    private String key;

}
