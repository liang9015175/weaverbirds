package com.liuyanan.dao;

import com.liuyanan.param.RentGroup;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

/**
 * Created by songliangliang on 2017/10/28.
 */
public interface RentMapperEx {

    List<RentGroup> listGroup(@Param("startTime") Date startTime, @Param("endTime") Date endTime);
}
