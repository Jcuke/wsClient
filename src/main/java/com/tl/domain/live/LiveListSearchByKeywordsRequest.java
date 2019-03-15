package com.tl.domain.live;

import com.tl.base.RequestHead;
import lombok.Data;

@Data
public class LiveListSearchByKeywordsRequest extends RequestHead {

    /**
     * 搜索关键字
     */
    private String keywords;
}
