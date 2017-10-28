package com.liuyanan.service;

import com.liuyanan.dao.DepartMapper;
import com.liuyanan.domain.Depart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
        departMapper.deleteByPrimaryKey(id);
    }
    public void updateDepart(Depart depart){
        departMapper.updateByPrimaryKeySelective(depart);
    }
    public List<Depart> list(){
        return departMapper.selectByExample(null);
    }
}
