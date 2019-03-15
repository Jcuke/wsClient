package com.tl.domain.live;

import com.tl.base.RequestHead;
import lombok.Data;

/**
 * @program: matrix-tl
 * @description: ID  2 Request
 * @create: 2018-07-10 16:28
 */
@Data
public class UserEnterLiveInitRequest extends RequestHead {

    private String userId;
    private String liveId;
    private String liveCount;

}
