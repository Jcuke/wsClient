package com.tl.domain.mobile;

import com.tl.base.RequestHead;
import lombok.Data;

@Data
public class AnchorDailyIncomeRequest extends RequestHead {

    //查询开始时间
    String startTime;
    //查询结束时间
    String endTime;
    //主播id
    String anchorOpenId;

}
