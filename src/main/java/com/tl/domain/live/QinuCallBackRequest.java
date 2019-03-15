package com.tl.domain.live;

import com.tl.base.RequestHead;
import lombok.Data;

@Data
public class QinuCallBackRequest extends RequestHead {

    private String status;

    private String title;

}
