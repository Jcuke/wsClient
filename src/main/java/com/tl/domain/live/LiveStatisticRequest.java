package com.tl.domain.live;

import com.tl.base.RequestHead;
import lombok.Data;

/**
 * @program: matrix-tl
 * @description: ID Request
 * @author: Ron
 * @create: 2018-07-10 16:28
 */
@Data
public class LiveStatisticRequest extends RequestHead {

    private String startTime;
    private String endTime;
    private String anchorOpenId;

}
