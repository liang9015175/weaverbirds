package com.liuyanan.param;

import com.liuyanan.domain.Rent;
import lombok.Data;

/**
 * Created by Administrator on 2017/11/18.
 */
@Data
public class RentEx extends Rent {
    private String departName;
    private String itemName;
    private String outOrInName;
    private String rentStatusName;

}
