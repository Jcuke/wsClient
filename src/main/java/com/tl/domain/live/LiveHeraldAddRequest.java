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
public class LiveHeraldAddRequest extends RequestHead {

    private String userId;
    //直播间预告内容
    private String content;

}
