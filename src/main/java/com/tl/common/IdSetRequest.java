package com.tl.common;

import com.tl.base.RequestHead;
import lombok.Data;

import java.util.Set;

/**
 * @program: matrix-tl
 * @description: ID Request
 * @author: Ron
 * @create: 2018-07-10 16:28
 */
@Data
public class IdSetRequest extends RequestHead {

    private Set<String> id;

}
