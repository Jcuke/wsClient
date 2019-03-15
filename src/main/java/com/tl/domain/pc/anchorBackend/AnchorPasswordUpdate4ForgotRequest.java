package com.tl.domain.pc.anchorBackend;

import com.tl.base.RequestHead;
import lombok.Data;

@Data
public class AnchorPasswordUpdate4ForgotRequest extends RequestHead {

    private String phone;
    private String password;
}

