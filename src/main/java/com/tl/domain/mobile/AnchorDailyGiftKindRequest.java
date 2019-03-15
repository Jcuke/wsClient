package com.tl.domain.mobile;

import com.tl.base.RequestHead;
import lombok.Data;

@Data
public class AnchorDailyGiftKindRequest extends RequestHead {
    //查询开始时间
    String startTime;
    //查询结束时间
    String endTime;
    //主播id
    String anchorOpenId;
    //礼物id
    Integer giftId;


}
