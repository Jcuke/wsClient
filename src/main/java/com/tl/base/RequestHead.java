package com.tl.base;

import lombok.Data;

import java.io.Serializable;

/**
 * @program: tl-front
 * @description: 请求头部公共消息体
 * @author: Ron
 * @create: 2018-06-13 10:00
 */
@Data
public class RequestHead implements Serializable {
    private static final long serialVersionUID = -8104223614145385814L;

    String appId;
    String openId;
    String myUserId;
    String contentType;
    String sdkVersion;
    String osVersion;
    String deviceType;
    String deviceName;
    String deviceId;
    String token;
    String ip;
    int totalRowsCount;
    int pageSize;
    int pageNumber;
    String sortJsonArray = "";//排序条件json数组

    //签名相关
    //随机数
    String randomStr;
    //时间戳(秒)
    String timeStampStr;
    //签名值
    String sign;

}
