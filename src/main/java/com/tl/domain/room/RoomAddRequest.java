package com.tl.domain.room;

import com.tl.base.RequestHead;
import lombok.Data;

/**
 * @program: matrix-tl
 * @description: 添加直播间
 * @author: Ron
 * @create: 2018-07-02 10:32
 */
@Data
public class RoomAddRequest extends RequestHead {

    private String merchantName;
    private String title;
    private String topic;
    private String appId;
    private String appName;
    private String activityId;
    private Integer anchorId;
    private String tag;
    private String imgUrl;
    //private Long startTimePlan;
    //private Long endTimePlan;

    private String startDate;
    private String endDate;
    private String startTime;
    private String endTime;
    private String remark;

    private String ip;


    @Override
    public String toString() {
        return "{\"merchantName\" : " + (merchantName == null ? null : "\"" + merchantName + "\"") + ",\"title\" : " + (title == null ? null : "\"" + title + "\"") + ",\"topic\" : " + (topic == null ? null : "\"" + topic + "\"") + ",\"appId\" : " + (appId == null ? null : "\"" + appId + "\"") + ",\"appName\" : " + (appName == null ? null : "\"" + appName + "\"") + ",\"activityId\" : " + (activityId == null ? null : "\"" + activityId + "\"") + ",\"anchorId\" : " + anchorId + ",\"tag\" : " + (tag == null ? null : "\"" + tag + "\"") + ",\"imgUrl\" : " + (imgUrl == null ? null : "\"" + imgUrl + "\"") + ",\"startDate\" : " + (startDate == null ? null : "\"" + startDate + "\"") + ",\"endDate\" : " + (endDate == null ? null : "\"" + endDate + "\"") + ",\"startTime\" : " + (startTime == null ? null : "\"" + startTime + "\"") + ",\"endTime\" : " + (endTime == null ? null : "\"" + endTime + "\"") + ",\"remark\" : " + (remark == null ? null : "\"" + remark + "\"") + ",\"ip\" : " + (ip == null ? null : "\"" + ip + "\"") + "}";
    }
}
