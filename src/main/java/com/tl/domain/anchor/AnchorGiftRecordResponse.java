package com.tl.domain.anchor;

import lombok.Data;

@Data
public class AnchorGiftRecordResponse {

    private String anchorId ;

    private String anchorName;

    private String userId;

    private String userName;

    private String giftName;

    private Integer tomatoPrice;

    private Integer giftNum;

    //用户性别
    private String sex;

    //用户头像
    private String avatar;

    //用户角色
    private String role;

    //主播关注数量
    private Integer followAnchorCount;

    //用户经验值
    private Long exp;

    //用户经验等级
    private Long expGrade;


    private String  createTime;

    private Integer liveCount;


}
