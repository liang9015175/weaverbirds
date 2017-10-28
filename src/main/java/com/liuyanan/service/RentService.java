package com.liuyanan.service;

import com.liuyanan.dao.ItemMapperEx;
import com.liuyanan.dao.RentMapper;
import com.liuyanan.dao.RentMapperEx;
import com.liuyanan.domain.Rent;
import com.liuyanan.domain.RentExample;
import com.liuyanan.param.RentGroup;
import com.liuyanan.param.RentParam;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by songliangliang on 2017/10/28.
 */
@Service
public class RentService {
    @Autowired
    private RentMapper rentMapper;
    @Autowired
    private RentMapperEx rentMapperEx;
    @Autowired
    private ItemMapperEx itemMapperEx;

    public void rent(RentParam param) {
        Rent rent = new Rent();
        BeanUtils.copyProperties(param, rent);
        rent.setCreateAt(new Date());
        rent.setStatus(1);
        rent.setRentStatus(0);
        rentMapper.insertSelective(rent);
        //减库存
        itemMapperEx.reduceStockCount(param.getItemId(), param.getCount(), param.getOutOrIn());
    }

    public void audit(Integer rentId) {
        Rent rent = new Rent();
        rent.setId(rentId);
        rent.setRentStatus(1);
        rent.setUpdateAt(new Date());
        rentMapper.updateByPrimaryKeySelective(rent);
    }

    public List<Rent> list(Integer rentId, String userName, Integer depart, Integer outOrIn, Integer rentStatus, Integer curPage, Integer pageSize) {
        RentExample example = new RentExample();
        example.or().andIdEqualTo(rentId).
                andUserNameLike("%" + userName + "%").
                andDepartEqualTo(depart).
                andOutOrInEqualTo(outOrIn).
                andRentStatusEqualTo(rentStatus);
        RowBounds rowBounds = new RowBounds((curPage - 1) * pageSize, pageSize);
        List<Rent> rents = rentMapper.selectByExampleWithRowbounds(example, rowBounds);
        return rents;
    }

    public List<RentGroup> listGroup(Date startTime, Date endTime) {
        return rentMapperEx.listGroup(startTime, endTime);
    }
}
