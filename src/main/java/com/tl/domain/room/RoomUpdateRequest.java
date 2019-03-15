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
public class RoomUpdateRequest extends RequestHead {

    private Integer id;
    private String title;
    private String topic;
    private String tag;
    private String startDate;
    private String endDate;
    private String startTime;
    private String endTime;
    private String remark;
    private Integer anchorId;
    private String ip;

    @Override
    public String toString() {
        return "{\"id\" : " + id + ",\"title\" : " + (title == null ? null : "\"" + title + "\"") + ",\"topic\" : " + (topic == null ? null : "\"" + topic + "\"") + ",\"tag\" : " + (tag == null ? null : "\"" + tag + "\"") + ",\"startDate\" : " + (startDate == null ? null : "\"" + startDate + "\"") + ",\"endDate\" : " + (endDate == null ? null : "\"" + endDate + "\"") + ",\"startTime\" : " + (startTime == null ? null : "\"" + startTime + "\"") + ",\"endTime\" : " + (endTime == null ? null : "\"" + endTime + "\"") + ",\"remark\" : " + (remark == null ? null : "\"" + remark + "\"") + ",\"anchorId\" : " + anchorId + ",\"ip\" : " + (ip == null ? null : "\"" + ip + "\"") + "}";
    }
}
