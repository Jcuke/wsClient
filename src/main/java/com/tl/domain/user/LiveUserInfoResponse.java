package com.tl.domain.user;

import lombok.Data;

@Data
public class LiveUserInfoResponse {
    private String name;
    private String avatar;
    private String userId;
    private String managerStatus;
    private String banPostStatus;
    private Long exp;
    private Long expGrade;
}
