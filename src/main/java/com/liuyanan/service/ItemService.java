package com.liuyanan.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.liuyanan.dao.CategoryMapper;
import com.liuyanan.dao.ItemMapper;
import com.liuyanan.domain.Category;
import com.liuyanan.domain.Item;
import com.liuyanan.domain.ItemExample;
import com.liuyanan.param.ItemEx;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by songliangliang on 2017/10/28.
 */
@Service
public class ItemService {
    @Autowired
    private ItemMapper itemMapper;
    @Autowired
    private CategoryMapper categoryMapper;
    public void add(Item item){
        itemMapper.insertSelective(item);
    }
    public void delete(Integer id){
        Item item=new Item();
        item.setId(id);
        item.setStatus(0);
        itemMapper.updateByPrimaryKeySelective(item);
    }
    public void update(Item item){
        itemMapper.updateByPrimaryKeySelective(item);
    }
    public PageInfo<ItemEx> list(String itemName,Integer curPage,Integer pageSize){
        PageHelper.startPage(curPage,pageSize);
        ItemExample example=new ItemExample();
        ItemExample.Criteria or = example.or();
        if(itemName!=null&&!itemName.equals("")){
            or.andItemNameLike("%"+itemName+"%");
        }
        or.andStatusEqualTo(1);
        List<Item> items = itemMapper.selectByExample(example);
        PageInfo<Item> pageInfo=new PageInfo<>(items);
        List<ItemEx> results=new ArrayList<>();
        for(Item item:items){
            ItemEx itemEx = new ItemEx();
            BeanUtils.copyProperties(item,itemEx);
            Category category = categoryMapper.selectByPrimaryKey(item.getCateId());
            if(category!=null){
                itemEx.setCateName(category.getCategoryName());
            }
            results.add(itemEx);
        }
        PageInfo<ItemEx> page=new PageInfo<>();
        BeanUtils.copyProperties(pageInfo,page);
        page.setList(results);
        return page;
    }

    public List<Item> list(Integer cateId) {
        ItemExample example=new ItemExample();
        example.or().andCateIdEqualTo(cateId);
        return itemMapper.selectByExample(example);
    }

    public Item getItem(Integer itemId) {
        return itemMapper.selectByPrimaryKey(itemId);
    }
}
