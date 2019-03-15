package com.tl.domain.index;

import com.tl.base.RequestHead;
import lombok.Data;

@Data
public class LabelRequest extends RequestHead {
    private Integer id;
    private String name;

    @Override
    public String toString() {
        return "{\"id\" : " + id + ",\"name\" : " + name + "}";
    }
}
