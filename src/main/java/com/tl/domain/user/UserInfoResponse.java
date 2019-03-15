package com.tl.domain.user;

import lombok.Data;

@Data
public class UserInfoResponse {
    private String userId;
    private String avatar;
    private String name;
    private Long clearTime;
    //经验
    private Long exp;

    //经验对应的等级
    private Long expGrade;
}
