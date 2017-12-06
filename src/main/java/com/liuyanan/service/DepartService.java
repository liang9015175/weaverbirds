package com.liuyanan.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.liuyanan.dao.DepartMapper;
import com.liuyanan.domain.Depart;
import com.liuyanan.domain.DepartExample;
import com.liuyanan.param.DepartEx;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by songliangliang on 2017/10/28.
 */
@Service
public class DepartService {
    @Autowired
    private DepartMapper departMapper;

    public void addDepart(Depart depart){
        departMapper.insertSelective(depart);
    }
    public void deleteDepart(Integer id){
        Depart depart=new Depart();
        depart.setId(id);
        depart.setStatus(0);
        departMapper.updateByPrimaryKeySelective(depart);
    }
    public void updateDepart(Depart depart){
        departMapper.updateByPrimaryKeySelective(depart);
    }
    public PageInfo<DepartEx> list(Integer curPage,Integer pageSize){
        DepartExample example=new DepartExample();
        example.or().andStatusEqualTo(1);
        PageHelper.startPage(curPage,pageSize);
        List<Depart> departs = departMapper.selectByExample(example);
        PageInfo pageInfo=new PageInfo(departs);
        List<DepartEx> result=new ArrayList<>();
        for(Depart depart:departs){
            DepartEx departEx=new DepartEx();
            BeanUtils.copyProperties(depart,departEx);
            if(depart.getStatus()==0){
                departEx.setStatusName("已删除");
            }else {
                departEx.setStatusName("正常");
            }
            result.add(departEx);
        }
        pageInfo.setList(result);
        return pageInfo;
    }
}
