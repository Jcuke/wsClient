package com.tl.domain.live;

import lombok.Data;

@Data
public class LiveHeraldResponse {

    private String userId;
    // 现在待审核的预告
    private String auditLiveHerald;
    // 现在使用中的预告
    private String useLiveHerald;
}
