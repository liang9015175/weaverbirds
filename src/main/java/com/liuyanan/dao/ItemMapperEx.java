package com.liuyanan.dao;

import org.apache.ibatis.annotations.Param;

/**
 * Created by songliangliang on 2017/10/28.
 */
public interface ItemMapperEx {

    void reduceStockCount(@Param("itemId") Integer itemId, @Param("count") Integer count,
                          @Param("outOrIn") Integer outOrIn);
}
