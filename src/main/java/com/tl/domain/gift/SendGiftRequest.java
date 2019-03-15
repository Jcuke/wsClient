package com.tl.domain.gift;

import com.tl.base.RequestHead;
import lombok.Data;

/**
 * @program: tl-front
 * @description: 礼物发送入参消息体
 * @author: Ron
 * @create: 2018-06-08 16:15
 */
@Data
public class SendGiftRequest extends RequestHead{

    private Integer giftId;
    private Integer giftCount;
    private Integer roomId;
    private String userId;

    @Override
    public String toString() {
        return "{\"giftId\" : " + giftId + ",\"giftCount\" : " + giftCount + ",\"roomId\" : " + roomId + ",\"userId\" : " + userId + "}";
    }
}
