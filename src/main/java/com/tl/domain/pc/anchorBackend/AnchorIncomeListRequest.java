package com.tl.domain.pc.anchorBackend;

import com.tl.base.RequestHead;
import lombok.Data;

/**
 * @program: matrix-tl
 * @description: 主播pc端登录接口
 * @author: Ron
 * @create: 2018-07-02 11:36
 */
@Data
public class AnchorIncomeListRequest extends RequestHead {

    private Long startTime;
    private Long endTime;

    @Override
    public String toString() {
        return "{\"startTime\" : " + (startTime == null ? null : startTime) + ",\"endTime\" : " + (endTime == null ? null : endTime) + "}";
    }
}

