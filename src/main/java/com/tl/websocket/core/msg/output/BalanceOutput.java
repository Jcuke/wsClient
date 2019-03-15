package com.tl.websocket.core.msg.output;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

/**
 * @program: matrix-tl
 * @description: 发送礼物返回账户余额 适用于主播或观众
 * @author: Ron
 * @create: 2018-08-22 16:14
 * Copyright (C) 2018 TL.Corp, All Rights Reserved.
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class BalanceOutput{
    Long balance;
    String userId;

}
