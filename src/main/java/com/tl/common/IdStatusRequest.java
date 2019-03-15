package com.tl.common;

import com.tl.base.RequestHead;
import lombok.Data;

/**
 * @program: matrix-tl
 * @description: ID Request
 * @author: Ron
 * @create: 2018-07-10 16:28
 */
@Data
public class IdStatusRequest extends RequestHead {

    private Integer id;
    private Integer status;

    @Override
    public String toString() {
        return "{\"id\" : " + id + ",\"status\" : " + status + "}";
    }
}
