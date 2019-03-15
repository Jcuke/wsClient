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
public class AnchorLoginRequest extends RequestHead {

    private String phone;
    private String password;
    private String ip;

    @Override
    public String toString() {
        return "{\"phone\" : " + (phone == null ? null : "\"" + phone + "\"") + ",\"password\" : " + (password == null ? null : "\"" + password + "\"") + ",\"ip\" : " + (ip == null ? null : "\"" + ip + "\"") + "}";
    }
}

