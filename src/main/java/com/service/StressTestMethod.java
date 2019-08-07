package com.service;

import com.netty.WebSocketClient;
import com.tl.OnlineUser;
import com.tl.StringUtil;
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
public class StressTestMethod {

    public static final String socketHost = "47.112.136.194:15247";
    public static final String apiHost = "47.112.136.194:10011";
    public static final String liveId = "93467122";


    /**
     * db.AnchorLiveInfo.find({openId:/3918/},{userId:1}).forEach(function(x){
     * 	print(x.userId)
     * });
     *
     * @param userId
     * @return
     */
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

            String result = HttpUtil.post("http://" + apiHost + "/api/mobile/live/getLiveInitInfo", JSONUtil.toJson(request));

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
                StressTestMethod testMethod = new StressTestMethod();
                CommonResponse cr = testMethod.getLiveInitInfoTestForMultiUser(userId);
                HashMap map = (HashMap) cr.getData();
                Map initOutput = (Map) (map.get("liveInitInfo"));
                ((Map)(initOutput.get("sysParamInfo"))).forEach((k,v) -> System.out.println(k + ":" + v));
                String k = (String) initOutput.get("k");
                //String k = "11_1317359040525887222_遹遞遱逆遺遠遥逆遺遠遭逆遹遰遽遌遺遞遡逄遺遞遡逆遺遞遟遍遻遰遮遞遹逆遲遞選遣遡遍遹遳遱遀遺遰遹送遻遷逄送遹遞遶遞選遠遗遌遺過遾遟遺遠遲遞遺逆遱送遻遠遽遌遺遞遡逄遺遞遡逆遺遞遱送遹遰遗遍遹遠遭逅遺遰遭逅遺遞遮遜遭遣遱逛遹遞遱逆遺遠遥逆遺遠遭逆送違适遾送遭逆遠送送遧遛送遛遝逇遹遠遟遃遺過遽遌遺遞遡逄遺遞遡逆遺遞遱遍遹遠遭逅遺遰遭逅遺遞遭遍遹遞遱逆遺遠遥逆遺遠遭逆遹遠遱遍遹遠遭逅遺遰遭逅遺遞遭遃遹遞遱逆遺遠遥逆遺遠遭逆選遠遱遍遹遠遭逅遺遰遭逅遺遞遭遍遹遠遭逅遺遰遭逅遺遞遭遍遹遠遭逅遺遰遭逅遺遞遭遍遹遠遭逅遺遰遭逅遺遞遭遍遹遠遭逅遺遰遭逅遺遞遭遃_f6de088fcb3e7ae743e9db8e6c7c61c3";
                String token = "111";
                String uriParamStr = liveId + "&"+ userId +"&2&1" + "/" + token + "/" + k;
                try {
                    uriParamStr = EncryptUtil.encrypt(uriParamStr);
                } catch (Exception e) {
                    e.printStackTrace();
                }



                String userEnterInfo = StringUtil.decode(k.split("_")[2]);
                OnlineUser onlineUser = OnlineUser.parseToOnlineUser(userEnterInfo);
                String userName = onlineUser.getUserName();

                Thread webSocketClientTread = new Thread(new WebSocketClient(uriParamStr, userName));
                webSocketClientTread.start();
                System.out.println("count: " + (count++));
            } catch (Throwable e) {
                e.printStackTrace();
                continue;
            }
            System.out.println("userId: " + userId);
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

        String pathname = "userDataStressTest.txt";
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
