package com.service;

import com.netty.WebSocketClient;
import com.tl.base.CommonResponse;
import com.tl.base.Constant;
import com.tl.domain.live.LiveEnterRequest;
import com.tl.json.JSONUtil;
import com.tl.security.EncryptUtil;
import com.xiaoleilu.hutool.http.HttpUtil;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author Ron
 * @date : 2019/3/15 上午9:20
 * @description Copyright (C) 2018 TL.Crop, All Rights Reserved.
 */
public class TestMethod {

    public static final String socketHost = "websocket.kltbj.com:15247";
    public static final String apiHost = "54.254.179.115:5046";
    public static final String liveId = "49891227";

    private CommonResponse getLiveInitInfoTestForMultiUser(String userId) {
        try {
            //String apiUrl = "39.108.90.33:9051";
            //String apiUrl = "192.168.88.200:9051";
            //String apiUrl = "192.168.88.35:5046";

            LiveEnterRequest request = new LiveEnterRequest();
            request.setLiveId(liveId);
            request.setAppId("1");
            request.setUserId(userId);
            request.setEnterType("2");
            request.setIsReconnect("0");

            String result = HttpUtil.post("http://" + apiHost + "/mobile/live/getLiveInitInfo", JSONUtil.toJson(request));

            //hutool 的 json 解析方法孙支持嵌套结构的解析
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

        int count = 0;
        Set<String> userIdSet = readFile();
        for (String userId : userIdSet) {
            try {
                TestMethod testMethod = new TestMethod();
                CommonResponse cr = testMethod.getLiveInitInfoTestForMultiUser(userId);
                HashMap map = (HashMap) cr.getData();
                Map initOutput = (Map) (map.get("liveInitInfo"));
                ((Map)(initOutput.get("sysParamInfo"))).forEach((k,v) -> System.out.println(k + ":" + v));
                String k = (String) initOutput.get("k");
                System.out.println("userId: " + userId);
                String token = "111";
                String uriParamStr = liveId + "&"+ userId +"&2&1" + "/" + token + "/" + k;
                try {
                    uriParamStr = EncryptUtil.encrypt(uriParamStr);
                } catch (Exception e) {
                    e.printStackTrace();
                }

                Thread webSocketClientTread = new Thread(new WebSocketClient(uriParamStr, (String) initOutput.get("nickname")));
                webSocketClientTread.start();
                System.out.println("count: " + (count++));
            } catch (Throwable e) {
                continue;
            }
            System.out.println("userId: " + userId);
            break;
        }
    }


    /**
     * db.UserInfo.find({appId:"1"}, {_id:1}).limit(10).forEach(function(_x){
     * print(_x._id)
     * });
     *
     * 获取测试数据
     *
     * @return
     */
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
