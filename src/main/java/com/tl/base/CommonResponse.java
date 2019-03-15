package com.tl.base;

import com.tl.exception.ResponseStatus;
import lombok.Data;

import java.io.Serializable;
import java.util.HashMap;

/**
 * json 响应
 */
@Data
public class CommonResponse implements Serializable{

    protected int code;

	protected String msg;

    private Object data = new HashMap<>();

    public static CommonResponse success(){
        CommonResponse commonResponse = new CommonResponse();
        commonResponse.setCode(ResponseStatus.success.code);
        commonResponse.setMsg(ResponseStatus.success.msg);
        return commonResponse;
    }


    public static CommonResponse success(Object data){
        CommonResponse success = success();
        if(data == null){
            success.setData(new HashMap<>());
        }else {
            success.setData(data);
        }
        return success;
    }


}
