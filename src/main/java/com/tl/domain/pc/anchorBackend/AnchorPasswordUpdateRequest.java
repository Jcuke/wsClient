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
public class AnchorPasswordUpdateRequest extends RequestHead {

    private String passwordOld;
    private String password;

    @Override
    public String toString() {
        return "{\"passwordOld\" : " + (passwordOld == null ? null : "\"" + passwordOld + "\"") + ",\"password\" : " + (password == null ? null : "\"" + password + "\"") + "}";
    }
}

