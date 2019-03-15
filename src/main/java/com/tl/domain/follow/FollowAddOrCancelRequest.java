package com.tl.domain.follow;

import com.tl.base.RequestHead;
import lombok.Data;

/**
 * @program: matrix-tl
 * @description: 添加或取消关注
 * @author: Ron
 * @create: 2018-09-01 14:10
 * Copyright (C) 2018 TL.Crop, All Rights Reserved.
 */
@Data
public class FollowAddOrCancelRequest extends RequestHead{

    private String userId;
    private String follower;
    private Integer followFlag;
}
