package com.tl.domain.live;

import com.tl.base.RequestHead;
import lombok.Data;

@Data
public class HttpForbidLiveStreamRequest extends RequestHead {
	private String appName;
	private String domainName;
	private String liveStreamType = "publisher";
	private String streamName;
	private String resumeTime;
    private String forbidReason;
}
