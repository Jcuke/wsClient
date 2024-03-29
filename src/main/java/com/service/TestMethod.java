package com.service;

import com.netty.WebSocketClient;
import com.tl.base.CommonResponse;
import com.tl.base.Constant;
import com.tl.domain.live.LiveEnterRequest;
import com.tl.security.EncryptUtil;
import com.tl.util.requestUtils.HttpUtil4LiveRecord;
import com.tl.util.requestUtils.json.JSONUtil;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 * @author Ron
 * @date : 2019/3/15 上午9:20
 * @description Copyright (C) 2018 TL.Crop, All Rights Reserved.
 */
public class TestMethod {

    public CommonResponse getLiveInitInfo() {
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

            String result = HttpUtil4LiveRecord.post("http://" + apiUrl + "/mobile/live/getLiveInitInfo", JSONUtil.toJson(request));
            CommonResponse cr = JSONUtil.fromJson(result, CommonResponse.class);
            if (Constant.RetCode.SUCCESS == cr.getCode()) {
                //System.out.print("接口调用成功: " + cr.getData());
            } else {
                System.out.print("接口调用失败: " + cr.getMsg());
            }
            return cr;
        } catch (Throwable e) {
            e.printStackTrace();
            return null;
        }
    }

    private CommonResponse getLiveInitInfoTestForMultiUser(String userId) {
        try {
            //String apiUrl = "39.108.90.33:9051";
            //String apiUrl = "192.168.88.200:9051";
            String apiUrl = "192.168.88.35:5046";

            LiveEnterRequest request = new LiveEnterRequest();
            request.setLiveId("31797277");
            request.setAppId("1");
            request.setUserId(userId);
            request.setEnterType("2");
            request.setIsReconnect("0");

            String result = HttpUtil4LiveRecord.post("http://" + apiUrl + "/mobile/live/getLiveInitInfo", JSONUtil.toJson(request));
            CommonResponse cr = JSONUtil.fromJson(result, CommonResponse.class);
            if (Constant.RetCode.SUCCESS == cr.getCode()) {
                //System.out.print("接口调用成功: " + cr.getData());
            } else {
                System.out.print("接口调用失败: " + cr.getMsg());
            }
            return cr;
        } catch (Throwable e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {

        //Arrays.stream(args).forEach(x -> System.out.println("参数: " + x));

        multiUserTest();
    }

    public static void multiUserTest() {

        Set<String> userIdSet = readFile();
        for (String userId : userIdSet) {
            try {
                userId = userId.substring(0, userId.length() - 1);
                TestMethod testMethod = new TestMethod();
                CommonResponse cr = testMethod.getLiveInitInfoTestForMultiUser(userId);
                HashMap map = (HashMap) cr.getData();
                Map initOutput = (Map) (map.get("liveInitInfo"));
                String userInfoEncryptStr = (String) initOutput.get("userInfoEncryptStr");
                String k = (String) initOutput.get("k");

                String uriParamStr = null;
                try {
                    uriParamStr = EncryptUtil.encrypt(userInfoEncryptStr + "_____" + k);
                } catch (Exception e) {
                    e.printStackTrace();
                }

                Thread webSocketClientTread = new Thread(new WebSocketClient(uriParamStr));
                webSocketClientTread.start();
            } catch (Throwable e) {
                continue;
            }
            System.out.println("userId: " + userId);
        }
    }


    public static Set<String> readFile() {

        Set<String> userIdSet = new HashSet<>();

        String pathname = "userData.txt";
        try {
            FileReader reader = new FileReader(pathname);
            BufferedReader br = new BufferedReader(reader);
            String line;
            while ((line = br.readLine()) != null) {
                //System.out.println(line);
                userIdSet.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return userIdSet;
    }
}
