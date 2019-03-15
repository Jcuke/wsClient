package com.tl.domain.clan;

import com.tl.base.RequestHead;
import lombok.Data;

/**
 * @program: matrix-tl
 * @description: 主播添加
 * @author: Ron
 * @create: 2018-07-02 11:36
 */
@Data
public class AnchorClanAddRequest extends RequestHead {


    private Integer id;
    /**
     * 家族名称
     */
    private String name;
    /**
     * 族长编号
     */
    private String adminId;

    private String adminName;

    private String adminPhone;

    private String adminankCardNo;

    private String adminAlipay;
    /**分成比例**/
    private Integer  proportion;

}

