package com.tl.forcache;

import lombok.Data;

import java.io.Serializable;

@Data
public class LiveHeraldDto implements Serializable {

    private Integer id;
    private String userId;
    private String nickname;
    private String liveId;
    private String content;
    private Integer state = 1;
    private Long createTime = 0L;
    private Long updateTime = 0L;
    private String reason = "";
    private String appId  ;
    private String openId  ;
}