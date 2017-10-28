package com.liuyanan.param;

import lombok.Data;

/**
 * Created by songliangliang on 2017/10/28.
 */
@Data
public class RentParam {
    /**
     * 姓名
     */
    private String userName;
    /**
     * 部门ID
     */
    private Integer depart;

    /**
     * 商品
     */
    private Integer itemId;
    /**
     * 租借数量
     */
    private Integer count;
    /**
     * 借入还是借出
     */
    private Integer outOrIn;


}
