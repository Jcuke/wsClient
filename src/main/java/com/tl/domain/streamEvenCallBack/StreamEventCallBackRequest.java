package com.tl.domain.streamEvenCallBack;

import com.tl.base.RequestHead;
import lombok.Data;

/**
 * @program: matrix-tl
 * @description: --
 * @author: Ron
 * @create: 2018-09-08 22:51
 * Copyright (C) 2018 TL.Crop, All Rights Reserved.
 */
@Data
public class StreamEventCallBackRequest extends RequestHead{

    private String liveId;
}
