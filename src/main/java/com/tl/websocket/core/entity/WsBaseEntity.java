package com.tl.websocket.core.entity;

import lombok.Data;

/**
 * websocket消息基类
 */
@Data
public class WsBaseEntity {
	
	private String messageType;
	
	private Object businessData;

	public WsBaseEntity(){}
	
	public WsBaseEntity(String messageType, Object businessData) {
		super();
		this.messageType = messageType;
		this.businessData = businessData;
	}
}
