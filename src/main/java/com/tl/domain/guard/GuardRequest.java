package com.tl.domain.guard;

import com.tl.base.RequestHead;
import lombok.Data;


@Data
public class GuardRequest extends RequestHead{

    private String guardId;

    private Integer guardType;

    private String userId;

    private String anchorId;

    private Integer price;

    private Integer tomatoPrice ;

    private Integer guardRatio;

}
