package com.tl.domain.clan;

import com.tl.base.RequestHead;
import lombok.Data;

/**
 * @program: matrix-tl
 * @description: 主播添加
 * @author: Ron
 * @create: 2018-07-02 11:36
 */
@Data
public class ClanAddAnchorRequest extends RequestHead {

    private String anchorId;  //主播Id 逗号隔开
    private String clanNickName;  //家族备注昵称

}

