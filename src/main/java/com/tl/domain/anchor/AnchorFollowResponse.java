package com.tl.domain.anchor;

import lombok.Data;

@Data
public class AnchorFollowResponse {
    private String userId;
    private String liveId;
    private String avatar;
    private String nickname;
    private String liveCoverUrl;
    private String pullStreamUrl;
    private String topic;
    private Integer followerCount;
    private Integer onlineUserCount;
    private String gpsAddress;
    private  Integer isLiving;

    //直播间预告
    private String herald;

    //直播间预告发布时间
    private Long publishTime;
}
