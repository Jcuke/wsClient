package com.tl.domain.live;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.tl.base.RequestHead;
import lombok.Data;

/**
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class BanPostRequest      extends RequestHead {

    private String anchorId;
    private String userId;
    private String clearTime;
    private String action;
}
