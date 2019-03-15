import com.netty.WebSocketClient;
import com.service.TestMethod;
import com.tl.base.CommonResponse;
import com.tl.security.EncryptUtil;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static javafx.scene.input.KeyCode.K;

/**
 * @author Ron
 * @date : 2019/3/15 上午9:13
 * @description Copyright (C) 2018 TL.Crop, All Rights Reserved.
 */
public class ClientTest {

    @Test
    public void start() {
        try {
            TestMethod testMethod = new TestMethod();
            CommonResponse cr = testMethod.getLiveInitInfo();
            HashMap map = (HashMap) cr.getData();
            Map initOutput = (Map) (map.get("liveInitInfo"));
            String userInfoEncryptStr = (String) initOutput.get("userInfoEncryptStr");
            String k = (String) initOutput.get("k");
            System.out.println("userInfoEncryptStr:\n" + userInfoEncryptStr);
            System.out.println("k:\n" + k);

            String uriParamStr = EncryptUtil.encrypt(userInfoEncryptStr + "_____" + K);

            Thread webSocketClientTread = new Thread(new WebSocketClient(uriParamStr));
            webSocketClientTread.start();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
