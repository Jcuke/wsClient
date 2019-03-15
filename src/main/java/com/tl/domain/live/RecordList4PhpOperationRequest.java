package com.tl.domain.live;

import com.tl.base.RequestHead;
import lombok.Data;

/**
 * @program: matrix-tl
 * @description: 录像列表查询
 * @author: lyc
 * @create: 2018-12-1 17:07:49
 */
@Data
public class RecordList4PhpOperationRequest extends RequestHead {

    private String id;
    private String liveId;
    private String nickName;
    private Long startTime;
    private Long endTime;

}
