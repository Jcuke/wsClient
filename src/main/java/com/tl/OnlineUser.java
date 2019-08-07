package com.tl;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

/**
 * @program: matrix-tl
 * @description: 用户session信息
 * @author: Ron
 * @create: 2018-09-04 11:40
 * Copyright (C) 2018 TL.Crop, All Rights Reserved.
 */
@Getter
@Setter
@Slf4j
@JsonIgnoreProperties(ignoreUnknown = true)
public class OnlineUser {

    private String sessionId;
    private String isReconnect;
    private String userId;
    private String openId;
    private String avatar;
    private String userName;
    private String sex;
    //观众，场控
    private String role;
    private Long expGrade;
    private String guardType;
    private String carId;//座驾id -1表示没有座驾
    private String carName;//座驾名字
    private String carIcon;//座驾图标 对应于 Car 类的 imgUrl
    private String carOnlineUrl;//座驾在线地址 Car: onlineUrl
    private String carResUrl;//座驾资源下载 Car: zipUrl
    private String isPlayCarAnim;//是否播放

    public static OnlineUser parseToOnlineUser(String urlArgs) {
        String[] args = urlArgs.split("216546566");
        return new OnlineUser(args[0],
                args[1],
                args[2],
                args[3],
                args[4],
                args[5],
                args[6],
                args[7],
                args[8],
                args[9],
                args[10],
                args[11],
                args[12],
                args[13],
                args[14],
                args[15]);
    }

    public OnlineUser(String sessionId, String isReconnect, String userId, String openId, String avatar, String userName, String sex, String role, String expGrade, String guardType, String carId, String carName, String carIcon, String carOnlineUrl, String carResUrl, String isPlayCarAnim) {
        if (expGrade == null) {
            expGrade = "1";
        }
        if (role == null) {
            role = "2";
        }
        if (guardType == null) {
            guardType = "0";
        }
        if (carId == null) {
            carId = "-1";
        }
        if (isReconnect == null) {
            isReconnect = "0";
        }
        this.sessionId = sessionId;
        this.isReconnect = isReconnect;
        this.userId = userId;
        this.openId = openId;
        this.avatar = avatar;
        this.userName = userName;
        this.sex = sex;
        this.role = role;
        this.expGrade = Long.parseLong(expGrade);
        this.guardType = guardType;
        this.carId = carId;
        this.carName = carName;
        this.carIcon = carIcon;
        this.carOnlineUrl = carOnlineUrl;
        this.carResUrl = carResUrl;
        this.isPlayCarAnim = isPlayCarAnim;
    }
}