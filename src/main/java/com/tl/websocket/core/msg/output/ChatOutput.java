package com.tl.websocket.core.msg.output;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ChatOutput {
	String content;
	String userId;
	String userName;
	String role;
	String liveId;
	String avatar;
	String sex;
}
