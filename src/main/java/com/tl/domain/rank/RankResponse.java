package com.tl.domain.rank;

import com.tl.base.RequestHead;
import lombok.Data;

@Data
public class RankResponse extends RequestHead {
	private String userId;
	private String anchorId;
	private Long expend;
	private Long income;
	private String nickname;
	private String sex;
	private String avatar;

	// 等级数据
	private Long exp;
	private Long expGrade;

	// 关注和直播数据
	private Integer followStatus;
	private Integer liveStatus;
	private String liveId;
	private String pullStreamUrl;

	// 排行榜动态数据
	private Integer rank;
	private String readableIncome;
	private Integer trend;
	private Integer trendRank;
}
