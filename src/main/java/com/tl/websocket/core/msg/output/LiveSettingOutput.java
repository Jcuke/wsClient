package com.tl.websocket.core.msg.output;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

/**
 * @program: matrix-tl
 * @description:
 * @author: Ron 房间设定配置项更新通知
 * @create: 2018-08-13 10:28
 * Copyright (C) 2018 TL.Corp, All Rights Reserved.
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class LiveSettingOutput {

    private String liveId;
    private String changeType;
    private String changeValue;
}
