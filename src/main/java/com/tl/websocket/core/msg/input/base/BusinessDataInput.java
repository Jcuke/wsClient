package com.tl.websocket.core.msg.input.base;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.io.Serializable;

/**
 * @program: matrix-tl
 * @description: 业务消息体
 * @author: Ron
 * @create: 2018-08-13 09:50
 * Copyright (C) 2018 TL.Corp, All Rights Reserved.
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class BusinessDataInput implements Serializable{
    private static final long serialVersionUID = -6324817735352508479L;

    private String liveId;
}
