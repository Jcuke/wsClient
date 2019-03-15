package com.tl.websocket.core.msg.input;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

/**
 * 禁言(主播和场控)别操作人输入框不允许输入  场控
 * @author LW
 *
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class CommonInput {
	public String anchorId;//发起人
	public String liveId;
	public String userId;//被操作人
	public String nickname;//被操作人
	public Integer action;
}
