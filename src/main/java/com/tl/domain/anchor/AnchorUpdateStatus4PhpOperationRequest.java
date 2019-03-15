package com.tl.domain.anchor;

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
public class AnchorUpdateStatus4PhpOperationRequest extends RequestHead {

    private String userId;
    private Integer isDeleted;
}

