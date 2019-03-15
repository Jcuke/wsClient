package com.tl.domain.anchor;

import com.tl.base.RequestHead;
import lombok.Data;

@Data
public class AnchorGiftRecordRequest extends RequestHead {

    //主播id
    private String anchorId;

    //直播场次编号
    String liveCount;


}
