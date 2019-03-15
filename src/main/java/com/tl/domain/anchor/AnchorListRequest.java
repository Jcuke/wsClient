package com.tl.domain.anchor;

import com.tl.base.RequestHead;
import lombok.Data;

/**
 * @program: matrix-tl
 * @description: 主播列表查询
 * @author: Ron
 * @create: 2018-07-02 11:29
 */
@Data
public class AnchorListRequest extends RequestHead {

    private String realName;
    private String nickname;
    private String idCardNo;
    private String idCardTop;
    private String idCardButtom;
    private Integer giftDivRatioFrom;
    private String idCardWithHand;
    private Integer giftDivRatioTo;
    private String phone;
    private String tag;
    private Integer status;
    private Long createTimeFrom;
    private Long createTimeTo;

    @Override
    public String toString() {
        return "{\"realName\" : " + (realName == null ? null : "\"" + realName + "\"") + ",\"nickname\" : " + (nickname == null ? null : "\"" + nickname + "\"") + ",\"idCardNo\" : " + (idCardNo == null ? null : "\"" + idCardNo + "\"") + ",\"idCardTop\" : " + (idCardTop == null ? null : "\"" + idCardTop + "\"") + ",\"idCardButtom\" : " + (idCardButtom == null ? null : "\"" + idCardButtom + "\"") + ",\"giftDivRatioFrom\" : " + giftDivRatioFrom + ",\"idCardWithHand\" : " + (idCardWithHand == null ? null : "\"" + idCardWithHand + "\"") + ",\"giftDivRatioTo\" : " + giftDivRatioTo + ",\"phone\" : " + (phone == null ? null : "\"" + phone + "\"") + ",\"tag\" : " + (tag == null ? null : "\"" + tag + "\"") + ",\"status\" : " + status + ",\"createTimeFrom\" : " + (createTimeFrom == null ? null : createTimeFrom) + ",\"createTimeTo\" : " + (createTimeTo == null ? null : createTimeTo) + "}";
    }
}
