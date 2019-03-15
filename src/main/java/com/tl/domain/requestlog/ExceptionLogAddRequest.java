package com.tl.domain.requestlog;

import com.tl.base.RequestHead;
import lombok.Data;

/**
 * @program: matrix-tl
 * @description: 请求消息体Add
 * @author: Ron
 * @create: 2018-06-13 10:11
 */
@Data
public class ExceptionLogAddRequest extends RequestHead{

    private String api;
    private String method;
    private String log;
}
