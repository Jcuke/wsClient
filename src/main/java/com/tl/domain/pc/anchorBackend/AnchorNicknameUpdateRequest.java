package com.tl.domain.pc.anchorBackend;

import com.tl.base.RequestHead;
import lombok.Data;

/**
 * @program: matrix-tl
 * @description: 主播昵称修改入参请求消息体
 * @author: Ron
 * @create: 2018-07-02 11:36
 */
@Data
public class AnchorNicknameUpdateRequest extends RequestHead {

    private String nickname;

    @Override
    public String toString() {
        return "{\"nickname\" : " + (nickname == null ? null : "\"" + nickname + "\"") + "}";
    }
}

