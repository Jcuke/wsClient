package com.tl.websocket.core.msg.output;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

/**
 * 用户进入房间广播消息  eg. xxx进入房间的广播
 * @author LW
 *
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class EntryOutput {
	String userName;
	String role;
    String userId;
    String avatar;
    String sex;
    Long expGrade;

}
