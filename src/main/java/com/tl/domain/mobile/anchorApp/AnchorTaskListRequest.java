package com.tl.domain.mobile.anchorApp;

import com.tl.base.RequestHead;
import lombok.Data;

/**
 * @program: matrix-tl
 * @description: 主播任务列表
 * @author: Ron
 * @create: 2018-07-23 11:36
 * Copyright (C) 2018 TL.Corp, All Rights Reserved.
 */
@Data
public class AnchorTaskListRequest extends RequestHead {

    private String phone;
    private String password;

    @Override
    public String toString() {
        return "{\"phone\" : " + (phone == null ? null : "\"" + phone + "\"") + ",\"password\" : " + (password == null ? null : "\"" + password + "\"") + "}";
    }
}

