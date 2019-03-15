package com.tl.domain.reportinfo;

import com.tl.base.RequestHead;
import lombok.Data;

/**
 * @program: matrix-tl
 * @description: 主播列表查询
 * @author: Ron
 * @create: 2018-07-02 11:29
 */
@Data
public class ReportInfoListRequest extends RequestHead {

    private Long createTimeFrom;
    private Long createTimeTo;
    private Integer status;

    @Override
    public String toString() {
        return "{\"createTimeFrom\" : " + (createTimeFrom == null ? null : createTimeFrom) + ",\"createTimeTo\" : " + (createTimeTo == null ? null : createTimeTo) + ",\"status\" : " + status + "}";
    }
}
