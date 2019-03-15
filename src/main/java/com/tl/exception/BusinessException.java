package com.tl.exception;

/**
 * @program: matrix-tl
 * @description: 业务数据异常
 * @author: Ron
 * @create: 2018-07-07 15:21
 */
public class BusinessException extends RuntimeException{

    private int code;

    public BusinessException(ResponseStatus responseStatus){
        super(responseStatus.msg);
        this.code= responseStatus.code;
    }

    public BusinessException(IResponseStatus iResponseStatus){
        super(iResponseStatus.getMsg());
        this.code=iResponseStatus.getCode();
    }


    private BusinessException(int code,String msg){
        super(msg);
        this.code=code;
    }


    @Override
    public String getMessage() {
        return super.getMessage();
    }


    public int  getCode(){
        return code;
    }


    /**
     *
     * 参数错误异常 动态拼接message 在baseController用到
     *
     * 此方法不应在其他地方调用
     *
     * @param paramName
     * @return
     */
    public static BusinessException newParamsException(String paramName){
        return new BusinessException(200002,paramName);
    }

}
