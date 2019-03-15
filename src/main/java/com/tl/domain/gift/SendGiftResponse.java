package com.tl.domain.gift;

import lombok.Data;

import java.io.Serializable;

/**
 * @program: tl-front
 * @description: 礼物发送出参消息体
 * @author: Ron
 * @create: 2018-06-08 16:16
 */
@Data
public class SendGiftResponse implements Serializable {
    private static final long serialVersionUID = -2772043584196381619L;

    private Long userBalance;
    private int status;

    @Override
    public String toString() {
        return "{\"userBalance\" : " + userBalance + ",\"status\" : " + status + "}";
    }
}
