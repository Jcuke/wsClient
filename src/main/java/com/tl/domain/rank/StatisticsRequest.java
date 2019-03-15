package com.tl.domain.rank;

import com.tl.base.RequestHead;
import lombok.Data;

@Data
public class StatisticsRequest extends RequestHead {
	private String dateType;
	private String userId;
	private String anchorId;
	// 送完礼物后主播的总收入，用来刷新排行榜缓存
	private Long giftIncome;
	//经验等级类型 1:anchor主播等级 2:userInfo用户等级
	private Integer expGradeType;
}


//  todo  分割线，向下兼容版本，后续版本删除