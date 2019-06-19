package com.tl.exception;

public enum ResponseStatus {

    /**
     *
     *  根据条件获取不记录 ，提示为 xxx获取失败，例如：用户获取失败，主播获取失败 等等
     *  不要提示为 xxx不存在
     *
     */
    success(100001,"success");

    public int code;
    public String msg;

    ResponseStatus(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

}

