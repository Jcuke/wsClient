package com.tl.domain.live;

import com.tl.base.RequestHead;

import lombok.Data;

@Data
public class HttpDescribeLiveStreamsPublishListRequest extends RequestHead {
	private String domainName;
	private String endTime;
	private String startTime;
	private String appName;
	private String streamName;
}
