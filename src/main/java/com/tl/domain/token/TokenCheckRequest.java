package com.tl.domain.token;

import lombok.Data;

/**
 * @program: matrix-tl
 * @description: token验证
 * @author: Ron
 * @create: 2018-09-20 16:52
 * Copyright (C) 2018 TL.Crop, All Rights Reserved.
 */
@Data
public class TokenCheckRequest {

    private String url;
    private String deviceId;
    private String token;

}
