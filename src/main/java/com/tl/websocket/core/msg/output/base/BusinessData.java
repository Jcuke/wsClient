package com.tl.websocket.core.msg.output.base;

import lombok.Data;

/**
 * @program: matrix-tl
 * @description: 业务消息体
 * @author: Ron
 * @create: 2018-08-13 09:50
 * Copyright (C) 2018 TL.Corp, All Rights Reserved.
 */
@Data
public class BusinessData<T> {
    private Integer code = 1;
    private String message = "success";
    private T resultData;

    public BusinessData(T resultData) {
        this.resultData = resultData;
    }

    public BusinessData() {
    }
}


