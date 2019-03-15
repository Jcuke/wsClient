package com.tl.domain.anchor;

import com.tl.base.RequestHead;

import lombok.Data;

@Data
public class BannerRequest extends RequestHead{
	private Integer id;
	private String imgUrl;
	private Integer type;
	private String targetUrl;
	private Integer event;
}
