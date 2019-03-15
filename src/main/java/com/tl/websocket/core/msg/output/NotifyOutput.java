package com.tl.websocket.core.msg.output;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class NotifyOutput {
	   String userId;
	   String liveId;
	   Integer type;
	   String typeMsg;
}
