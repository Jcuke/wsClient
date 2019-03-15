package com.tl.websocket.core.entity;

import lombok.Data;

@Data
public class CodeMessage {
	
	private int code;
	
	private String message;
	
	private Object resultData;

	public CodeMessage(){}
	
	public CodeMessage(int code, String message, Object resultData) {
		super();
		this.code = code;
		this.message = message;
		this.resultData = resultData;
	}

    public CodeMessage(int code, String message) {
        super();
        this.code = code;
        this.message = message;
    }
}
