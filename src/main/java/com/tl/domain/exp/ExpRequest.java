package com.tl.domain.exp;

import com.tl.base.RequestHead;
import lombok.Data;

@Data
public class ExpRequest extends RequestHead{

    private String userId;
    private String liveId;
    private String userType;
    private String enterType;

}
