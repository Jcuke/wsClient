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
public class StartLiveRequest extends RequestHead {

    private String userId;
    private String topic;
    private Integer free;
    private String tag;
    //gps定位信息
    private String gpsAddress;

}
