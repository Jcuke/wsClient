package com.tl.websocket.core.msg.output;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

/**
 * @program: matrix-tl
 * @description: 主播本直播间收到礼物总金额-返回给用户-消息体
 * @author: Ron
 * @create: 2018-08-22 17:28
 * Copyright (C) 2018 TL.Corp, All Rights Reserved.
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class AnchorGiftTotalAmountOut {

    private Long amount;

    public AnchorGiftTotalAmountOut() {
    }

    public AnchorGiftTotalAmountOut(Long amount) {
        this.amount = amount;
    }
}
