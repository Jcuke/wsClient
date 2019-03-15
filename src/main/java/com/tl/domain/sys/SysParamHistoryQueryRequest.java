package com.tl.domain.sys;

import com.tl.base.RequestHead;
import lombok.Data;

@Data
public class SysParamHistoryQueryRequest extends RequestHead {


    private  String paramId;
}
