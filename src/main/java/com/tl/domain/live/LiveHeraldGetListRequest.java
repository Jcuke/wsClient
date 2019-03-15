package com.tl.domain.live;

import com.tl.base.RequestHead;
import lombok.Data;

/**
 * @program: matrix-tl
 * @description: ID Request
 * @author: lyc
 * @create: 2018-12-20 11:50:52
 */
@Data
public class LiveHeraldGetListRequest extends RequestHead {

    private String nickname;
    private Long startTime;
    private Long endTime;
    private Integer state;

}
