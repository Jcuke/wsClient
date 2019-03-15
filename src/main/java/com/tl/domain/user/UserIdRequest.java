package com.tl.domain.user;

import com.tl.base.RequestHead;
import lombok.Data;

@Data
public class UserIdRequest extends RequestHead{

    private String userId;
}
