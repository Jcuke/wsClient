package com.tl.domain.sys;

import com.tl.base.RequestHead;
import lombok.Data;

@Data
public class SysParamHistoryIdRequest extends RequestHead {
    private Integer id;
    private String oldValue;
    private String value;
    private String userName;
}
