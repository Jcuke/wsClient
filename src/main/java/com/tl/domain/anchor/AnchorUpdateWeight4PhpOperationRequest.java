package com.tl.domain.anchor;

import com.tl.base.RequestHead;
import lombok.Data;

/**
 * @program: matrix-tl
 * @description: 更新主播权重请求
 * @author: lyc
 * @create: 2018-12-8 19:56:11
 */
@Data
public class AnchorUpdateWeight4PhpOperationRequest extends RequestHead {

    private String userId;
    private Integer weight;
}

