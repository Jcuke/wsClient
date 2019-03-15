package com.tl.websocket.core.msg.output;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class GoOutOutput {
    private String anchorId;
    private String liveId;
    private String userId;
    private String nickname;
    private Long createTime;
}
