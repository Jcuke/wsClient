package com.tl.domain.live;

import com.tl.base.RequestHead;
import lombok.Data;

import java.util.List;

/**
 * @program: matrix-tl
 * @description: 将对应的录像状态置为删除
 * @author: lyc
 * @create: 2018-12-1 17:07:49
 */
@Data
public class DelRecord4PhpOperationRequest extends RequestHead {

    private List<String> recordList;

}
