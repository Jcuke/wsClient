package com.tl.domain.requestlog;

import com.tl.base.RequestHead;
import lombok.Data;

/**
 * @program: matrix-tl
 * @description: 异常日志列表查询请求消息体
 * @author: Ron
 * @create: 2018-06-13 10:11
 */
@Data
public class ExceptionLogListRequest extends RequestHead {

    private String api;
    private String stackTrace;
    private String log;
    private String args;
    private String declaringClass;
    private String methodName;
    private String fileName;
    private String lineNumber;
    private Long createTimeStart;
    private Long createTimeEnd;
}
