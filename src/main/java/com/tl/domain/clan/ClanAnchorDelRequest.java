package com.tl.domain.clan;

import com.tl.base.RequestHead;
import lombok.Data;

/**
 */
@Data
public class ClanAnchorDelRequest extends RequestHead {


    private Integer clanId;
    /**
     * 家族名称
     */
    private String anchorId;


}

