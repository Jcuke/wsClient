package com.netty;

import com.alibaba.fastjson.JSONObject;
import com.tl.security.EncryptUtil;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelPromise;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.handler.codec.http.FullHttpResponse;
import io.netty.handler.codec.http.websocketx.CloseWebSocketFrame;
import io.netty.handler.codec.http.websocketx.PongWebSocketFrame;
import io.netty.handler.codec.http.websocketx.TextWebSocketFrame;
import io.netty.handler.codec.http.websocketx.WebSocketClientHandshaker;
import io.netty.handler.codec.http.websocketx.WebSocketFrame;
import io.netty.handler.codec.http.websocketx.WebSocketHandshakeException;
import io.netty.util.AttributeKey;
import io.netty.util.CharsetUtil;

import java.util.Random;
import java.util.UUID;

public class WebSocketClientHandler extends SimpleChannelInboundHandler<Object> {
    private final WebSocketClientHandshaker handshaker;
    private ChannelPromise handshakeFuture;
    private String userName;

    public WebSocketClientHandler(WebSocketClientHandshaker handshaker, String userName) {
        this.handshaker = handshaker;
        this.userName = userName;
    }

    public ChannelFuture handshakeFuture() {
        return handshakeFuture;
    }

    @Override
    public void handlerAdded(ChannelHandlerContext ctx) {
        handshakeFuture = ctx.newPromise();

        ctx.attr(AttributeKey.valueOf("userName")).set(userName);

        //连上后，开始定时发心跳
        BusinessThreadPoolUtil.submit(() -> {
            while (true) {
                try {
                    Thread.sleep(5000l);
                    ctx.writeAndFlush(new TextWebSocketFrame(EncryptUtil.encrypt("ping")));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });


        //连上后，开始定时发心跳
        BusinessThreadPoolUtil.submit(() -> {
            while (true) {
                try {
                    Thread.sleep(5000);

                    //定时发聊天
                    //String chat = "{\"expGrade\":18,\"sex\":\"2\",\"appId\":\"1\",\"liveId\":\"94324557\",\"avatar\":\"http:\\/\\/35.220.167.29:7009\\/fanqie\\/_s3\\/avatars\\/20190402\\/48db3526b7e26f62ed93a445e40a21fb_80x80.png\",\"userName\":\"用户2421\",\"userId\":\"1348bf1f-0442-4713-a06b-aa80d618cf16\",\"guardType\":0,\"openDanmu\":\"0\",\"role\":\"2\",\"content\":\"ui\"} "
                    //ch.writeAndFlush(new TextWebSocketFrame(EncryptUtil.encrypt(randomString2(6))));
                    JSONObject chat = new JSONObject();
                    JSONObject businessData = new JSONObject();
                    businessData.put("openDanmu", "0");
                    businessData.put("content", randomString2(6));

                    String r = randomString2(3);
                    String t = String.valueOf(System.currentTimeMillis() / 1000);
                    String s = Md5Utils.hash(businessData.toString() + t + r + "456");

                    chat.put("messageType", "chat");
                    chat.put("businessData", businessData);
                    chat.put("r", r);
                    chat.put("t", t);
                    chat.put("s", s);

                    ctx.writeAndFlush(new TextWebSocketFrame(EncryptUtil.encrypt(chat.toString())));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        //连上后，开始定时发心跳
        BusinessThreadPoolUtil.submit(() -> {
            while (true) {
                try {
                    Thread.sleep(10000);

                    //定时发聊天
                    //String chat = "{\"expGrade\":18,\"sex\":\"2\",\"appId\":\"1\",\"liveId\":\"94324557\",\"avatar\":\"http:\\/\\/35.220.167.29:7009\\/fanqie\\/_s3\\/avatars\\/20190402\\/48db3526b7e26f62ed93a445e40a21fb_80x80.png\",\"userName\":\"用户2421\",\"userId\":\"1348bf1f-0442-4713-a06b-aa80d618cf16\",\"guardType\":0,\"openDanmu\":\"0\",\"role\":\"2\",\"content\":\"ui\"} "
                    //ch.writeAndFlush(new TextWebSocketFrame(EncryptUtil.encrypt(randomString2(6))));
                    JSONObject chat = new JSONObject();
                    JSONObject businessData = new JSONObject();

                    businessData.put("giftName","666");
                    businessData.put("sex","0");
                    businessData.put("anchorId","458f01f1-d4d7-4046-9435-1e5e78be43f5");
                    businessData.put("uuid", UUID.randomUUID().toString());
                    businessData.put("anchorName","用户39186964");
                    businessData.put("effectType",2);
                    businessData.put("giftId","8");
                    businessData.put("sendIndex",0);
                    businessData.put("liveCount","594");
                    businessData.put("createTime", System.currentTimeMillis() / 1000);
                    businessData.put("price","2");
                    businessData.put("clientIp","0.1.2.3");
                    businessData.put("giftNum",1);
                    businessData.put("tomatoPrice","20");
                    businessData.put("guardType","3");


                    String r = randomString2(3);
                    String t = String.valueOf(System.currentTimeMillis() / 1000);
                    String s = Md5Utils.hash(businessData.toString() + t + r + "456");

                    chat.put("messageType", "gift");
                    chat.put("businessData", businessData);
                    chat.put("r", r);
                    chat.put("t", t);
                    chat.put("s", s);

                    ctx.writeAndFlush(new TextWebSocketFrame(EncryptUtil.encrypt(chat.toString())));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    @Override
    public void channelActive(ChannelHandlerContext ctx) {
        handshaker.handshake(ctx.channel());
    }

    @Override
    public void channelInactive(ChannelHandlerContext ctx) {
        System.out.println("WebSocket Client disconnected!");
    }

    @Override
    public void channelRead0(ChannelHandlerContext ctx, Object msg) throws Exception {
        Channel ch = ctx.channel();
        if (!handshaker.isHandshakeComplete()) {
            try {
                handshaker.finishHandshake(ch, (FullHttpResponse) msg);
                System.out.println("WebSocket Client connected!");
                handshakeFuture.setSuccess();
            } catch (WebSocketHandshakeException e) {
                System.out.println("WebSocket Client failed to connect");
                handshakeFuture.setFailure(e);
            }
            return;
        }

        if (msg instanceof FullHttpResponse) {
            FullHttpResponse response = (FullHttpResponse) msg;
            throw new IllegalStateException(
                    "Unexpected FullHttpResponse (getStatus=" + response.status() +
                            ", content=" + response.content().toString(CharsetUtil.UTF_8) + ')');
        }

        WebSocketFrame frame = (WebSocketFrame) msg;
        if (frame instanceof TextWebSocketFrame) {

            String userName = (String) ctx.attr(AttributeKey.valueOf("userName")).get();

            TextWebSocketFrame textFrame = (TextWebSocketFrame) frame;
            System.out.println("WebSocket Client【"+ userName +"】 received message: " + EncryptUtil.decrypt(textFrame.text()));

        } else if (frame instanceof PongWebSocketFrame) {
            System.out.println("WebSocket Client received pong");
        } else if (frame instanceof CloseWebSocketFrame) {
            System.out.println("WebSocket Client received closing");
            ch.close();
        }
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) {
        cause.printStackTrace();
        if (!handshakeFuture.isDone()) {
            handshakeFuture.setFailure(cause);
        }
        ctx.close();
    }

    public static String randomString2(int length) {
        String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random random = new Random();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < length; i++) {
            int number = random.nextInt(62);
            sb.append(str.charAt(number));
        }
        return sb.toString();
    }
}