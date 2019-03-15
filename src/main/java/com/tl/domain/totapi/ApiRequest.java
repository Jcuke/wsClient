package com.tl.domain.totapi;

import com.tl.base.RequestHead;
import lombok.Data;

@Data
public class ApiRequest extends RequestHead{
    private String methodId;

    private String phone;
    private String countryCode;
    private String verifyCode;
    private String memberId;

    private String receiverMemberId;
    private String amount;
    private String content;
    private String ip;
    private String uniqueCode;
    private String percentage;
    // 0.未冻结 1.已冻结
    private String isFrozen;
}
