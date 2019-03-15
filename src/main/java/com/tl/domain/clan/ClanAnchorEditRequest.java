package com.tl.domain.clan;

import com.tl.base.RequestHead;
import lombok.Data;

/**
 */
@Data
public class ClanAnchorEditRequest extends RequestHead {


    private Integer clanId;
    /**
     * 家族名称
     */
    private String anchorId;

    /**
     * 家族名称
     */
    private String clanNickName;


}

