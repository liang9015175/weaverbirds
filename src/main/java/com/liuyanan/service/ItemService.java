package com.liuyanan.service;

import com.liuyanan.dao.ItemMapper;
import com.liuyanan.domain.Item;
import com.liuyanan.domain.ItemExample;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by songliangliang on 2017/10/28.
 */
@Service
public class ItemService {
    @Autowired
    private ItemMapper itemMapper;
    public void add(Item item){
        itemMapper.insertSelective(item);
    }
    public void delete(Integer id){
        itemMapper.deleteByPrimaryKey(id);
    }
    public void update(Item item){
        itemMapper.updateByPrimaryKeySelective(item);
    }
    public List<Item> list(String itemName,Integer curPage,Integer pageSize){
        ItemExample example=new ItemExample();
        example.or().andItemNameLike("%"+itemName+"%");
        RowBounds rowBounds=new RowBounds((curPage-1)*pageSize,pageSize);
        return itemMapper.selectByExampleWithRowbounds(example,rowBounds);
    }
}
