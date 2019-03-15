package com.tl.domain.anchor;

import com.tl.base.RequestHead;
import lombok.Data;

/**
 * @program: matrix-tl
 * @description: 主播列表查询
 * @author: 
 * @create: 2018-07-02 11:29
 */
@Data
public class TlAnchorRequest extends RequestHead {
	private Integer id;
	private String userId;
	private Integer isChecked;
	private String reason;
}
