package com.tl.domain.appCallback;

import com.tl.base.RequestHead;
import lombok.Data;

/**
 * @program: matrix-tl
 * @description: 余额更新回调
 * @author: Ron
 * @create: 2018-10-08 18:12
 * Copyright (C) 2018 TL.Crop, All Rights Reserved.
 */
@Data
public class UpdateUserBalance4TotAppNotifyRequest extends RequestHead {

    //用户ID
    private String userId;
    //虚拟币种类(默认为番茄币 type 代码 "1")
    private String type;
    //用户虚拟币余额
    private Long balance;
}
