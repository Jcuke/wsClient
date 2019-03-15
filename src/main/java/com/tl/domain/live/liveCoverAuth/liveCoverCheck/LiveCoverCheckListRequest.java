package com.tl.domain.live.liveCoverAuth.liveCoverCheck;

import com.tl.base.RequestHead;
import lombok.Data;

/**
 * @program: matrix-tl
 * @description: ID Request
 * @author: Ron
 * @create: 2018-07-10 16:28
 */
@Data
public class LiveCoverCheckListRequest extends RequestHead {

    private String liveId;
    //直播间封面
    private String liveCoverUrl;
    //推荐位封面
    private String recomCoverUrl;

}
