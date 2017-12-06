package com.liuyanan.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.liuyanan.dao.CategoryMapper;
import com.liuyanan.domain.Category;
import com.liuyanan.domain.CategoryExample;
import com.liuyanan.exception.ParamException;
import com.liuyanan.param.CategoryEx;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by songliangliang on 2017/10/14.
 */
@Service
public class CategoryService {
    @Autowired
    private CategoryMapper categoryMapper;

    public void addCategory(Category category) {
        categoryMapper.insertSelective(category);
    }

    public PageInfo<CategoryEx> selectCondition(Integer curPage,Integer pageSize) {
        PageHelper.startPage(curPage,pageSize);
        List<Category> categories = categoryMapper.selectByExample(null);
        List<CategoryEx> result=new ArrayList<>();
        PageInfo pageInfo=new PageInfo(categories);
        if(!categories.isEmpty()){
            for (Category category:categories){
                CategoryEx categoryEx=new CategoryEx();
                if(category.getStatus()!=0){
                    categoryEx.setStatusName("正常");
                }else {
                    categoryEx.setStatusName("已删除");
                }
                BeanUtils.copyProperties(category,categoryEx);
                result.add(categoryEx);
            }
        }
        pageInfo.setList(result);
        return pageInfo;
    }

    public void updateCategory(Category category) {
        if (category.getId() == null) {
            throw new ParamException();
        }
        categoryMapper.updateByPrimaryKeySelective(category);
    }

    public void deleteCategory(Integer id) {
        Category category = new Category();
        category.setId(id);
        category.setStatus(0);
        categoryMapper.updateByPrimaryKeySelective(category);
    }

}
