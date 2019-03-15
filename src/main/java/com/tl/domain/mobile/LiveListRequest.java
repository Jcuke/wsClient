package com.tl.domain.mobile;

import com.tl.base.RequestHead;
import lombok.Data;

/**
 * @program: matrix-tl
 * @description: 主播列表
 * @author: Ron
 * @create: 2018-07-23 11:36
 * Copyright (C) 2018 TL.Corp, All Rights Reserved.
 */
@Data
public class LiveListRequest extends RequestHead {

    //登录的用户ID
    private String userId;
    //查询条件 主播昵称，主播间主播
    private String keyword;
    //只查询关注的主播
    private int onlyFollow;

}

