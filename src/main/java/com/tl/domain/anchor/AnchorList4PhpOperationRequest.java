package com.tl.domain.anchor;

import com.tl.base.RequestHead;
import lombok.Data;

import java.util.Map;

/**
 * @program: matrix-tl
 * @description: 主播列表
 * @author: Ron
 * @create: 2018-07-23 11:36
 * Copyright (C) 2018 TL.Corp, All Rights Reserved.
 */
@Data
public class AnchorList4PhpOperationRequest extends RequestHead {

    //查询条件 主播用户户ID 主播昵称，主播间ID
    private String searchKey;
    //直播间id
    private String liveId;
    //是否开播中，1是 0否
    private Integer isLiving;
    //是否被冻结 1 是 0 否
    private Integer isDeleted;
    //排序集合
    private Map<String, Integer> requestSortMap;//  1:ASC,2:DESC
}

