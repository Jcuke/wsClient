package com.tl.domain.gift;

import com.tl.base.RequestHead;
import lombok.Data;

/**
 * @program: matrix-tl
 * @description: 礼物列表获取
 * @author: Ron
 * @create: 2018-06-21 18:05
 */
@Data
public class GiftListRequest extends RequestHead{

    private Integer type;
}
