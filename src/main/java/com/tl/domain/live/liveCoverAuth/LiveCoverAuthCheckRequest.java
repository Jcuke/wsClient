package com.tl.domain.live.liveCoverAuth;

import com.tl.base.RequestHead;
import lombok.Data;

/**
 * @program: matrix-tl
 * @description: ID Request
 * @author: Ron
 * @create: 2018-07-10 16:28
 */
@Data
public class LiveCoverAuthCheckRequest extends RequestHead {

    private Integer id;
    private Integer isChecked;
    private String reason;

}
