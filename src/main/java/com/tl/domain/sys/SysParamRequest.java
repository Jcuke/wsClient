package com.tl.domain.sys;

import com.tl.base.RequestHead;
import lombok.Data;

@Data
public class SysParamRequest extends RequestHead{

	private String code;
	private String description;
	private String value;
}
