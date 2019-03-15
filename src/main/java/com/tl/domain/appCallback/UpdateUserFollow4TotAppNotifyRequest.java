package com.tl.domain.appCallback;

import com.tl.base.RequestHead;
import lombok.Data;

/**
 * @program: matrix-tl
 * @description: 用户关注信息更新回调
 * @author: Ron
 * @create: 2018-10-08 18:12
 * Copyright (C) 2018 TL.Crop, All Rights Reserved.
 */
@Data
public class UpdateUserFollow4TotAppNotifyRequest extends RequestHead {

    //用户ID, 发起关注或取消关注的用户
    private String userId1;

    //用户ID, 被关注或被取消关注的用户
    private String userId2;

    //操作标识, 关注:1, 取消关注:0
    private String action;

}
