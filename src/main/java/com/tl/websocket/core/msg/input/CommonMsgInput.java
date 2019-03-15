package com.tl.websocket.core.msg.input;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class CommonMsgInput {
    //房间号
    private String liveId;
    //消息内容
    private String content;
}
