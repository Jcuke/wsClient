package com.tl.domain.anchor;

import lombok.Data;

/**
 * @program: matrix-tl
 * @description: 主播添加
 * @author: Ron
 * @create: 2018-07-02 11:36
 */
@Data
public class VerificationCodeRequest  {
    private String  userId;
    private String phone;
}

