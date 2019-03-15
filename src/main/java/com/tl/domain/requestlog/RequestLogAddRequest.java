package com.tl.domain.requestlog;

import lombok.Data;

import java.io.Serializable;

/**
 * @program: matrix-tl
 * @description: 请求消息体Add
 * @author: Ron
 * @create: 2018-06-13 10:11
 */
@Data
public class RequestLogAddRequest implements Serializable{
    private static final long serialVersionUID = -8682116350119558535L;

    private String remoteAddr;
    private String requestURI;
    private String method;
    private String urlParameters;
    private String requestBody;
    private String requestHead;
    private String contentType;
    private String sdkVersion;
    private String deviceType;
    private String deviceId;
    private String token;

    public RequestLogAddRequest() {
    }

    public RequestLogAddRequest(String remoteAddr, String requestURI, String method, String urlParameters, String requestBody, String requestHead, String contentType, String sdkVersion, String deviceType, String deviceId, String token) {
        this.remoteAddr = remoteAddr;
        this.requestURI = requestURI;
        this.method = method;
        this.urlParameters = urlParameters;
        this.requestBody = requestBody;
        this.requestHead = requestHead;
        this.contentType = contentType;
        this.sdkVersion = sdkVersion;
        this.deviceType = deviceType;
        this.deviceId = deviceId;
        this.token = token;
    }


    @Override
    public String toString() {
        return "{\"remoteAddr\" : " + (remoteAddr == null ? null : "\"" + remoteAddr + "\"") + ",\"requestURI\" : " + (requestURI == null ? null : "\"" + requestURI + "\"") + ",\"method\" : " + (method == null ? null : "\"" + method + "\"") + ",\"urlParameters\" : " + (urlParameters == null ? null : "\"" + urlParameters + "\"") + ",\"requestBody\" : " + (requestBody == null ? null : "\"" + requestBody + "\"") + ",\"requestHead\" : " + (requestHead == null ? null : "\"" + requestHead + "\"") + ",\"contentType\" : " + (contentType == null ? null : "\"" + contentType + "\"") + ",\"sdkVersion\" : " + (sdkVersion == null ? null : "\"" + sdkVersion + "\"") + ",\"deviceType\" : " + (deviceType == null ? null : "\"" + deviceType + "\"") + ",\"deviceId\" : " + (deviceId == null ? null : "\"" + deviceId + "\"") + ",\"token\" : " + (token == null ? null : "\"" + token + "\"") + "}";
    }
}
