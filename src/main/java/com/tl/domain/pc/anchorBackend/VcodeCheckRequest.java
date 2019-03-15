package com.tl.domain.pc.anchorBackend;

import com.tl.base.RequestHead;
import lombok.Data;

@Data
public class VcodeCheckRequest extends RequestHead {

    private String vid;
    private String vcode;

    @Override
    public String toString() {
        return "{\"vid\" : " + (vid == null ? null : "\"" + vid + "\"") + ",\"vcode\" : " + (vcode == null ? null : "\"" + vcode + "\"") + "}";
    }
}

