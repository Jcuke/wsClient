package com.tl.domain.sys;

import com.tl.base.RequestHead;
import lombok.Data;

@Data
public class SysParamHistoryRequest  extends RequestHead {
    private Integer id;
    private String  paramId;
    private String oldValue;
    private String value;
    private String userName;
}
