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
public class LiveHeraldAuthRequest extends RequestHead {

    private Integer heraldId;
    //审核操作修改的状态值
    private Integer state;
    //审核驳回的理由
    private String reason;

}
