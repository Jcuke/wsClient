package com.tl.domain.anchor;

import com.tl.base.RequestHead;
import lombok.Data;

/**
 * @program: matrix-tl
 * @description: 主播列表查询
 * @create: 2018-07-02 11:29
 */
@Data
public class SearchAnchorListRequest extends RequestHead {

    private String key;
    private String userId;

}
