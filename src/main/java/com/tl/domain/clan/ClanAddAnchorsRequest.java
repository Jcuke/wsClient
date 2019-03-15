package com.tl.domain.clan;

import com.tl.base.RequestHead;
import lombok.Data;

import java.util.List;

/**
 * @program: matrix-tl
 * @description: 主播添加
 * @author: Ron
 * @create: 2018-07-02 11:36
 */
@Data
public class ClanAddAnchorsRequest extends RequestHead {

 private Integer clanId;

 private List<ClanAddAnchorRequest> anchors;




}

