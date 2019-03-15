package com.tl.domain.dtos;

import com.tl.base.Constant;
import lombok.Data;

import java.io.Serializable;

/**
 * @program: matrix-tl
 * @description: 消息推送，消息数据传输对象
 * @author: Ron
 * @create: 2018-07-27 10:16
 * Copyright (C) 2018 TL.Corp, All Rights Reserved.
 */
@Data
public class MsgDto implements Serializable{

    private static final long serialVersionUID = -1956683723910291708L;
    //消息类型
    private String type = Constant.YES;
    //消息标题
    private String title = "";
    //消息内容
    private String content = "";

    @Override
    public String toString() {
        return "{\"type\" : " + (type == null ? null : "\"" + type + "\"") + ",\"title\" : " + (title == null ? null : "\"" + title + "\"") + ",\"content\" : " + (content == null ? null : "\"" + content + "\"") + "}";
    }
}
