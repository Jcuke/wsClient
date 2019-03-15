package com.tl.base;

import lombok.Data;

import java.util.List;

/**
 * @program: tl-front
 * @description: 入参校验
 * @author: Ron
 * @create: 2018-06-09 18:06
 */
@Data
public class InputCheck {

    private String methodName;
    private Object inputObj;
    private String fieldName;
    private int comparaNumVal;
    private List<Object> range;

    public InputCheck() {
    }

    public InputCheck(String methodName, Object inputObj, String fieldName) {
        this.methodName = methodName;
        this.inputObj = inputObj;
        this.fieldName = fieldName;
    }

    public InputCheck(String methodName, Object inputObj, String fieldName, int comparaNumVal) {
        this.methodName = methodName;
        this.inputObj = inputObj;
        this.fieldName = fieldName;
        this.comparaNumVal = comparaNumVal;
    }

    public InputCheck(String methodName, Object inputObj, String fieldName, List<Object> range) {
        this.methodName = methodName;
        this.inputObj = inputObj;
        this.fieldName = fieldName;
        this.range = range;
    }

}
