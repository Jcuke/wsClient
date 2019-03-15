package com.tl.websocket.core.msg.output.base;

import lombok.Data;

import java.io.Serializable;

/**
 * @program: matrix-tl
 * @description: ws给客户端的返回消息体
 * @author: Ron
 * @create: 2018-08-13 09:50
 * Copyright (C) 2018 TL.Corp, All Rights Reserved.
 */
@Data
public class WsMsgBodyOutput<T> implements Serializable{

    private static final long serialVersionUID = 7405671259285632386L;
    private String messageType;
    private BusinessData<T> businessData;
}
