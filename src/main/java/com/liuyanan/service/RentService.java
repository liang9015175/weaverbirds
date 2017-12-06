package com.liuyanan.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.liuyanan.dao.*;
import com.liuyanan.domain.*;
import com.liuyanan.param.RentEx;
import com.liuyanan.param.RentGroup;
import com.liuyanan.param.RentParam;
import com.sun.org.apache.regexp.internal.RE;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
    @Autowired
    private ItemMapper itemMapper;
    @Autowired
    private DepartMapper departMapper;
    public void rent(RentParam param) {
        Rent rent = new Rent();
        BeanUtils.copyProperties(param, rent);
        rent.setNums(param.getCount());
        rent.setCreateAt(new Date());
        rent.setStatus(1);
        rent.setRentStatus(0);
        rent.setDepartId(param.getDepart());
        rentMapper.insertSelective(rent);
        //减库存
        itemMapperEx.reduceStockCount(param.getItemId(), param.getCount(), param.getOutOrIn());
    }

    public void audit(Integer rentId,Integer status) {
        Rent rent = new Rent();
        rent.setId(rentId);
        rent.setRentStatus(status);
        rent.setUpdateAt(new Date());
        rentMapper.updateByPrimaryKeySelective(rent);
    }

    public PageInfo<RentEx> list( String userName, Integer depart, Integer outOrIn, Integer rentStatus, Integer curPage, Integer pageSize) {
        RentExample example = new RentExample();
        List<RentEx> resul=new ArrayList<>();
        RentExample.Criteria criteria = example.or();

        if(userName!=null){
            criteria.andUserNameLike("%" + userName + "%");
        }
        if(depart!=null){
            criteria.andDepartIdEqualTo(depart);
        }
        if(outOrIn!=null){
            criteria.andOutOrInEqualTo(outOrIn);
        }
        if(rentStatus!=null){
            criteria.andRentStatusEqualTo(rentStatus);
        }
        PageHelper.startPage(curPage,pageSize);
        List<Rent> rents = rentMapper.selectByExample(example);
        PageInfo<Rent> pageInfo=new PageInfo<>(rents);
        PageInfo<RentEx> page=new PageInfo<>();
        BeanUtils.copyProperties(pageInfo,page);
        for(Rent rent: rents){
            RentEx rentEx = new RentEx();
            BeanUtils.copyProperties(rent,rentEx);
            Depart departDomain = departMapper.selectByPrimaryKey(rent.getDepartId());
            if(departDomain!=null){
                rentEx.setDepartName(departDomain.getName());
            }

            Item itemDomain = itemMapper.selectByPrimaryKey(rent.getItemId());
            if(itemDomain!=null){
                rentEx.setItemName(itemDomain.getItemName());
            }
            if(rent.getRentStatus()==0){
                rentEx.setRentStatusName("审核中");
            }else if(rent.getRentStatus()==1){
                rentEx.setRentStatusName("审核通过");
            }else {
                rentEx.setRentStatusName("不通过");
            }
            if(rent.getOutOrIn()==1){
                rentEx.setOutOrInName("借出");
            }else {
                rentEx.setOutOrInName("借入");
            }
            resul.add(rentEx);
        }
        page.setList(resul);
        return page;
    }

    public List<RentGroup> listGroup(Date startTime, Date endTime) {
        return rentMapperEx.listGroup(startTime, endTime);
    }
}
