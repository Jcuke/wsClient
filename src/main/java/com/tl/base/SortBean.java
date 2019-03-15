package com.tl.base;

import lombok.Data;

import java.io.Serializable;

/**
 * @program: matrix-tl
 * @description: 排序条件
 * @author: Ron
 * @create: 2018-07-09 16:45
 */
@Data
public class SortBean implements Serializable {

    private static final long serialVersionUID = 4782159653247491478L;

    private String sortName;
    private String direction = "ASC";

    @Override
    public String toString() {
        return "{\"sortName\" : " + (sortName == null ? null : "\"" + sortName + "\"") + "}";
    }
}
