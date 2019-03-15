package com.tl.domain.room;

import com.tl.base.RequestHead;
import lombok.Data;

/**
 * @program: matrix-tl
 * @description: 进入房间入参消息体
 * @author: Ron
 * @create: 2018-06-08 15:43
 */
@Data
public class EnterRoomRequest extends RequestHead {

    //活动ID
    private String activityId;
    //app user唯一标识
    private String appUserId;
    //app user 昵称
    private String userName;
    //app user 头像
    private String userPicUrl;
    //app user 虚拟币余额
    private Long userBalance;
}
