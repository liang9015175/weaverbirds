package com.liuyanan.param;

import lombok.Data;

/**
 * Created by songliangliang on 2017/10/28.
 */
@Data
public class RentGroup {

    private Integer departId;

    private String departName;

    private Integer itemId;

    private String itemName;

    private Integer count;

    private String outOrIn;
}
