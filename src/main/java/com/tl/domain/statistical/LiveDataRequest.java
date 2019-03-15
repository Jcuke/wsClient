package com.tl.domain.statistical;

import com.tl.base.RequestHead;

public class LiveDataRequest extends RequestHead {
	private String date;
	private String type;
	private String uid;
	private String page;
	private String start;
	private String end;
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
