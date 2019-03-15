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
public class AnchorIdRequest extends RequestHead {

    private String anchorId;


    @Override
    public String toString() {
        return "{\"anchorId\" : " + (anchorId == null ? null : "\"" + anchorId + "\"") + "}";
    }
}
