package com.tl.websocket.core.msg.output;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class WarnOutput {
	   String userId;
	   String liveId;
	   Integer action;
}
