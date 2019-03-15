package com.tl.domain.live;

import lombok.Data;

@Data
public class PreStartLiveResponse {

    private String  userId;
    private String  liveCoverUrl;
    private String  recomCoverUrl;
    private Integer isChecked = 0;
    private String  tag;
    private String  topic;
}
