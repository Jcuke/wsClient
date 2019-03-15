package com.tl.websocket.core.msg.output;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.List;

/**
 * @program: matrix-tl
 * @description: 屏蔽输出消息
 * @author: Ron
 * @create: 2018-08-13 13:41
 * Copyright (C) 2018 TL.Corp, All Rights Reserved.
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ShieldOut {

    private List<String> shieldUserList;

    public ShieldOut(List<String> shieldUserList) {
        this.shieldUserList = shieldUserList;
    }

}
