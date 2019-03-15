package com.tl.domain.pc.anchorBackend;

import com.tl.base.RequestHead;
import lombok.Data;

/**
 * @program: matrix-tl
 * @description: 主播资料修改入参请求消息体
 * @author: Ron
 * @create: 2018-07-02 11:36
 */
@Data
public class AnchorProfileUpdateRequest extends RequestHead {

    private String imgUrl;
    private String notice;

    @Override
    public String toString() {
        return "{\"imgUrl\" : " + (imgUrl == null ? null : "\"" + imgUrl + "\"") + ",\"notice\" : " + (notice == null ? null : "\"" + notice + "\"") + "}";
    }
}

