package com.tl.domain.room;

import com.tl.base.RequestHead;
import lombok.Data;

/**
 * @program: matrix-tl
 * @description: 直播间列表查询
 * @author: Ron
 * @create: 2018-07-02 10:32
 */
@Data
public class RoomListRequest extends RequestHead {

    private static final long serialVersionUID = 5803194063260763814L;
    private Integer id;
    private String title;
    private Integer activityId;
    private Integer anchorId;
    private Integer tag;
    private String imgUrl;
    private Long startTimePlanFrom;
    private Long startTimePlanTo;
    private Long endTimePlanFrom;
    private Long endTimePlanTo;
    private Integer status;

    @Override
    public String toString() {
        return "{\"id\" : " + id + ",\"title\" : " + (title == null ? null : "\"" + title + "\"") + ",\"activityId\" : " + activityId + ",\"anchorId\" : " + anchorId + ",\"tag\" : " + tag + ",\"imgUrl\" : " + (imgUrl == null ? null : "\"" + imgUrl + "\"") + ",\"startTimePlanFrom\" : " + (startTimePlanFrom == null ? null : startTimePlanFrom) + ",\"startTimePlanTo\" : " + (startTimePlanTo == null ? null : startTimePlanTo) + ",\"endTimePlanFrom\" : " + (endTimePlanFrom == null ? null : endTimePlanFrom) + ",\"endTimePlanTo\" : " + (endTimePlanTo == null ? null : endTimePlanTo) + ",\"status\" : " + status + "}";
    }
}
