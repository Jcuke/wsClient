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
public class NoSpeakInput extends CommonInput{
	String longTime;
}
