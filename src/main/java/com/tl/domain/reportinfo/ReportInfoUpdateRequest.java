package com.tl.domain.reportinfo;

import lombok.Data;

/**
 * @program: matrix-tl
 * @description: 用户举报,列表查询入参
 * @author: Ron
 * @create: 2018-07-02 11:36
 */
@Data
public class ReportInfoUpdateRequest extends ReportInfoAddRequest {

    private Integer id;
    private Integer status;

    @Override
    public String toString() {
        return "{\"id\" : " + id + ",\"status\" : " + status + "}";
    }
}

