package com.tl.domain.index;

import com.tl.base.RequestHead;
import lombok.Data;

@Data
public class LabelAddRequest extends RequestHead {
    private LabelRequest [] labels;
}
