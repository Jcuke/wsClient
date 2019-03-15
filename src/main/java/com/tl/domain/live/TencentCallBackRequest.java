package com.tl.domain.live;

import com.tl.base.RequestHead;
import lombok.Data;

/**
 * @program: matrix-tl
 * @description: 腾讯云直播状态回调
 * @author: lyc
 * @create: 2018-12-1 17:07:49
 */
@Data
public class TencentCallBackRequest extends RequestHead {

    private String t;
    private String sign;
    private Integer event_type;
    private String stream_id;

}
