package com.tl.domain.anchor;

import com.tl.base.RequestHead;
import lombok.Data;

/**
 * @program: matrix-tl
 * @description: 主播添加
 * @author: Ron
 * @create: 2018-07-02 11:36
 */
@Data
public class AnchorAddRequest extends RequestHead {

    private String realName;
    private String nickname;
    private String idCardNo;
    private String idCardTop;
    private String idCardButtom;
    private String idCardWithHand;
    private Integer giftDivRatio;
    private String imgUrl;
    private String phone;
    private String tag;

    @Override
    public String toString() {
        return "{\"realName\" : " + (realName == null ? null : "\"" + realName + "\"") + ",\"nickname\" : " + (nickname == null ? null : "\"" + nickname + "\"") + ",\"idCardNo\" : " + (idCardNo == null ? null : "\"" + idCardNo + "\"") + ",\"idCardTop\" : " + (idCardTop == null ? null : "\"" + idCardTop + "\"") + ",\"idCardButtom\" : " + (idCardButtom == null ? null : "\"" + idCardButtom + "\"") + ",\"idCardWithHand\" : " + (idCardWithHand == null ? null : "\"" + idCardWithHand + "\"") + ",\"giftDivRatio\" : " + giftDivRatio + ",\"imgUrl\" : " + (imgUrl == null ? null : "\"" + imgUrl + "\"") + ",\"phone\" : " + (phone == null ? null : "\"" + phone + "\"") + ",\"tag\" : " + (tag == null ? null : "\"" + tag + "\"") + "}";
    }
}

