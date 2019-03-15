package com.service;

import com.tl.base.CommonResponse;
import com.tl.base.Constant;
import com.tl.domain.live.LiveEnterRequest;
import com.tl.util.requestUtils.HttpUtil4LiveRecord;
import com.tl.util.requestUtils.json.JSONUtil;

/**
 * @author Ron
 * @date : 2019/3/15 上午9:20
 * @description Copyright (C) 2018 TL.Crop, All Rights Reserved.
 */
public class TestMethod {

    public CommonResponse getLiveInitInfo(){
        try {
            //String apiUrl = "39.108.90.33:9051";
            //String apiUrl = "192.168.88.200:9051";
            String apiUrl = "192.168.88.35:5046";

            LiveEnterRequest request = new LiveEnterRequest();
            request.setLiveId("17000545");
            request.setAppId("2");
            request.setUserId("220c508a-e2fd-4482-8da0-75854a8da72b");
            request.setEnterType("2");
            request.setIsReconnect("0");

            String result = HttpUtil4LiveRecord.post("http://"+ apiUrl +"/mobile/live/getLiveInitInfo", JSONUtil.toJson(request));
            CommonResponse cr = JSONUtil.fromJson(result, CommonResponse.class);
            if (Constant.RetCode.SUCCESS == cr.getCode()) {
                //System.out.print("接口调用成功: " + cr.getData());
            } else {
                System.out.print("接口调用失败: " + cr.getMsg() );
            }
            return cr;
        } catch (Throwable e) {
            e.printStackTrace();
            return null;
        }
    }
}
