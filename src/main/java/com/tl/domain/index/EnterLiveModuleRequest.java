package com.tl.domain.index;

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
public class EnterLiveModuleRequest extends RequestHead {

    //用户昵称
    private String name;
    //用户性别
    private String sex;
    //用户头像url
    private String avatar;
    ////用户虚拟币余额
    private long balance;
    ////用户角色
    //private int role;
    //用户是否已登录
    private int isLogin;
}
