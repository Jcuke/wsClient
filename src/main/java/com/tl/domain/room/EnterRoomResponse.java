package com.tl.domain.room;

import lombok.Data;

import java.io.Serializable;

/**
 * @program: matrix-tl
 * @description: 进入房间出参消息体
 * @author: Ron
 * @create: 2018-06-08 15:44
 */
@Data
public class EnterRoomResponse implements Serializable{

    private static final long serialVersionUID = -5205290070822114476L;

    private String userId;
    //主播头像url
    private String anchorImgUrl;
    //主播昵称
    private String anchorNikename;
    //主播公告
    private String anchorNotice;
    //房间号
    private Integer roomId;
    //直播ID
    private String liveId;
    //直播标题
    private String title;
    //拉流地址
    private String streamAddressPull;
    //websocket 服务端地址
    private String wsServerAddress;
    //主播id
    private Integer anchorId;
    //房间用户基数(虚假用户数)
    private Integer baseUserCount;

    @Override
    public String toString() {
        return "{\"userId\" : " + (userId == null ? null : "\"" + userId + "\"") + ",\"anchorImgUrl\" : " + (anchorImgUrl == null ? null : "\"" + anchorImgUrl + "\"") + ",\"anchorNikename\" : " + (anchorNikename == null ? null : "\"" + anchorNikename + "\"") + ",\"anchorNotice\" : " + (anchorNotice == null ? null : "\"" + anchorNotice + "\"") + ",\"roomId\" : " + roomId + ",\"liveId\" : " + (liveId == null ? null : "\"" + liveId + "\"") + ",\"title\" : " + (title == null ? null : "\"" + title + "\"") + ",\"streamAddressPull\" : " + (streamAddressPull == null ? null : "\"" + streamAddressPull + "\"") + ",\"anchorId\" : " + anchorId + ",\"baseUserCount\" : " + baseUserCount + "}";
    }
}
