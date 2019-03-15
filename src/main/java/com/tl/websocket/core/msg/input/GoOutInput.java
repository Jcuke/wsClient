package com.tl.websocket.core.msg.input;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class GoOutInput {
    private String anchorId;
    private String liveId;
    private String userId;
    private String nickname;
    private Long createTime;
}
