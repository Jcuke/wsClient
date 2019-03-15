package com.tl.domain.anchor;

import com.tl.base.RequestHead;
import lombok.Data;

@Data
public class AnchorIdRequest  extends RequestHead {
    private String anchorId;

    @Override
    public String toString() {
        return "{\"anchorId\" : " + (anchorId == null ? null : "\"" + anchorId + "\"")   ;

    }
}
