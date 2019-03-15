package com.tl.domain.reportinfo;

import com.tl.base.RequestHead;
import lombok.Data;

/**
 * @program: matrix-tl
 * @description: 用户举报-新增-入参
 * @author: Ron
 * @create: 2018-07-02 11:36
 */
@Data
public class ReportInfoAddRequest extends RequestHead {

    private Integer roomId;
    private String userId;
    private Integer anchorId;
    private String reason;

    @Override
    public String toString() {
        return "{\"roomId\" : " + roomId + ",\"userId\" : " + userId + ",\"anchorId\" : " + anchorId + ",\"reason\" : " + (reason == null ? null : "\"" + reason + "\"") + "}";
    }
}

