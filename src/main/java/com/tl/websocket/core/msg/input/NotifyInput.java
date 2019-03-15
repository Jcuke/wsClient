package com.tl.websocket.core.msg.input;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class NotifyInput {
	public String userId;
	public String liveId;
	public Integer type;
	public String typeMsg;
}
