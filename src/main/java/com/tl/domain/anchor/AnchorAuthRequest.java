package com.tl.domain.anchor;

import com.tl.base.RequestHead;

import lombok.Data;

@Data
public class AnchorAuthRequest  extends RequestHead {
	private String realName;
	private String idCardNo;
	private String phone;
	private String idCardTop;
	private String idCardButtom;
	private String userId;
	private String nickname;
	private String avatar;
	private String keyword;
	private String countryCode;
	private String verifyCode;
}
