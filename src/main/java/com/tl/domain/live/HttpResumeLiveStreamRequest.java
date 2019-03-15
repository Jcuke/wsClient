package com.tl.domain.live;

import com.tl.base.RequestHead;

import lombok.Data;

@Data
public class HttpResumeLiveStreamRequest extends RequestHead {
	private String appName;
	private String domainName;
	private String liveStreamType;
	private String streamName;
}	
