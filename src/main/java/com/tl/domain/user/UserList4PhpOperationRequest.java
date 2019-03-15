package com.tl.domain.user;

import com.tl.base.RequestHead;
import lombok.Data;

/**
 * @program: matrix-tl
 * @description: 运营后台用户列表
 * @author: Ron
 * @create: 2018-07-23 11:36
 * Copyright (C) 2018 TL.Corp, All Rights Reserved.
 */
@Data
public class UserList4PhpOperationRequest extends RequestHead {

    private String keyword;
}

