package com.tl.domain.user;

import com.tl.base.RequestHead;
import lombok.Data;

@Data
public class LiveUserInfoRequest extends RequestHead {
    private String anchorId;
    private String nickname;
}
