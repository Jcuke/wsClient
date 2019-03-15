package com.tl.websocket.core.msg.input;

import lombok.Data;

/**
 * 全局禁言
 * @author LW
 *
 */
@Data
public class BanPostAllInput {
	   String userId;
	   String liveId;
	   String banPostAllStatus;
}
