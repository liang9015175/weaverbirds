package com.liuyanan.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.liuyanan.dao.OfficeMapper;
import com.liuyanan.dao.OfficeRentMapper;
import com.liuyanan.domain.Office;
import com.liuyanan.domain.OfficeRent;
import com.liuyanan.domain.OfficeRentExample;
import com.liuyanan.param.OfficeEx;
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
public class OfficeService {
    @Autowired
    private OfficeMapper officeMapper;
    @Autowired
    private OfficeRentMapper officeRentMapper;

    public void addOffice(Office office) {
        officeMapper.insertSelective(office);
    }

    public void updateOffice(Office office) {
        officeMapper.updateByPrimaryKeySelective(office);
    }

    public void deleteOffice(Integer id) {
        officeMapper.deleteByPrimaryKey(id);
    }

    public PageInfo<OfficeEx> list(Integer curPage,Integer pageSize) {
        Date date = new Date();
        List<OfficeEx> exes = new ArrayList<>();
        PageHelper.startPage(curPage,pageSize);
        List<Office> offices = officeMapper.selectByExample(null);
        PageInfo pageInfo=new PageInfo(offices);
        for (Office office : offices) {
            OfficeEx ex = new OfficeEx();
            BeanUtils.copyProperties(office, ex);

            OfficeRentExample example = new OfficeRentExample();
            example.or().andOfficeIdEqualTo(office.getId());
            List<OfficeRent> rents = officeRentMapper.selectByExample(example);
            for (OfficeRent rent : rents) {
                if (date.after(rent.getStartTime()) && date.before(rent.getEndTime())) {
                    ex.setStatus("房间被占用");
                    ex.setStartTime(rent.getStartTime());
                    ex.setEndTime(rent.getEndTime());
                }
            }
            exes.add(ex);
        }
        PageInfo pages=new PageInfo();
        BeanUtils.copyProperties(pageInfo,pages);
        pages.setList(exes);
        return pages;
    }

    public void rent(OfficeRent officeRent) {
        officeRentMapper.insertSelective(officeRent);
    }

    public void updateRent(Integer id, Integer status) {
        OfficeRent officeRent = new OfficeRent();
        officeRent.setStatus(status);
        officeRent.setId(id);
        officeRentMapper.updateByPrimaryKeySelective(officeRent);
    }
}
