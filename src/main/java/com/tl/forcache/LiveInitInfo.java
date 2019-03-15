package com.tl.forcache;

import com.tl.websocket.core.msg.output.InitOutput;
import lombok.Data;

import java.util.Set;

/**
 * 用户进入房间 返回初始化信息
 * @author LW
 *
 */
@Data
public class LiveInitInfo {

	InitOutput initOutput;
	Set<String> followTargetUserIds;
	Set<String> kickedLiveIds;
	Set<String> banPostTargetUserIds;
	Set<String> shieldTargetUserIds;
	LiveHistoryDto liveHistory;
	LiveHeraldDto liveHerald;

}
