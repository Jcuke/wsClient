package com.tl.domain.livedata;

import lombok.Data;

@Data
public class SendGiftRecord {
    private Integer id;
    private Integer giftId;
    private Integer giftCount;
    private String anchorId;
    private String roomId;
    private Long createTime;
    private Float giftPrice;
    private String giftPath;
    private String userName;
    private String userId;
    private String liveId;
    private String appId;
}