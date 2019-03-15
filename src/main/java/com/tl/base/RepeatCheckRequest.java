package com.tl.base;

import lombok.Data;

/**
 * @program: matrix-tl
 * @description: RepeatCheckRequest Request 属性值是否已存在的通用验证入参封装
 * @author: Ron
 * @create: 2018-07-10 16:28
 */
@Data
public class RepeatCheckRequest extends RequestHead {

    private String fieldName;
    private Object fieldValue;
    private String primaryKeyName;
    private Object primaryKeyValue;
    private Integer moduleId;

    public RepeatCheckRequest() {
    }

    public RepeatCheckRequest(String fieldName, Object fieldValue, Integer moduleId) {
        this.fieldName = fieldName;
        this.fieldValue = fieldValue;
        this.moduleId = moduleId;
    }

    public RepeatCheckRequest(String fieldName, Object fieldValue, String primaryKeyName, Object primaryKeyValue, Integer moduleId) {
        this.fieldName = fieldName;
        this.fieldValue = fieldValue;
        this.primaryKeyName = primaryKeyName;
        this.primaryKeyValue = primaryKeyValue;
        this.moduleId = moduleId;
    }
}
