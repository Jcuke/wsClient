package com.tl.websocket.core.msg.output;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 用户进入房间 返回初始化信息
 * @author LW
 *
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class InitOutput implements Serializable {

	//直播间信息
    String font;
	// 直播主题
	String topic;
	//主播ID
	String anchorId;
	Long clearTime;
	//在线用户列表  格式[{userId:1233,avatar:xxxx}, ...] 取前100名
	List onlineUserList = new ArrayList();
	//在线人数
	Integer count;
	Integer banPostAllStatus;//是否全局禁言
	//屏蔽的用户ID列表
	Set<String> shieldUserList;
	// 主播番票数
	Long amount;
	Integer postIntervalTimes;
	Integer banPostStatus;//该场次直播该观众是否被禁言
	List<String> banPostList;
	Long balance;
	String role;
	Long expGrade;//主播等级
	Long audienceExpGrade;//我的等级,观众等级
    //场控用户ID列表
    List<String> liveManangerList;

	//主播是否在后台
	//主播socket是否断开
	//当前直播间是否正在被警告
	//推流是否已停止
	String isWarn;
	String anchorSocketStatus;
	String streamStatus;
	String anchorIsBackend;
	String speakLevel;


	//主播信息
	String liveId;
	String tag;
	String avatar;
	String nickname;
	//直播总次数
	Integer liveCount;
	String liveCoverUrl;
	String recomCoverUrl;
	String pullStreamUrl;
	Integer free;
	String gpsAddress;
	//Long anchorIncome;
	Long startTime;
	Long endTime;
	//websocket服务器地址
	String wsServerAddress;
	//1直播中, 0未开播放
	Integer liveStatus;
	//警告状态
	Integer warnStatus;

	//主播在本直播间的礼物总收益
	Long giftIncome;

	//主播在本直播间的收到礼物总数量
	Integer giftCount;

	//本直播间同时在线用户的数的峰值
	Integer onlineUserCountPeekValue;

	//直播间实时在线人数
	Integer onlineUserCount;

	//主播是否冻结 "1"是, "0"否
	String isFrozen;

	//socket心跳间隔,单位(秒)
	Long socketHeartBeatInterval;

	//直播间排行榜配置
	List<String> liveRankConfig;

	//系统参数表
	Map<String, String> sysParamInfo;

	//守护类型
	Integer userGuardType;

	//守护到期时间
	String userGuardExpireTime;

	//主播守护数量
	String anchorGuardCount;


}
