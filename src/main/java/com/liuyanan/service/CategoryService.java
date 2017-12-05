package com.liuyanan.service;

import com.liuyanan.dao.CategoryMapper;
import com.liuyanan.domain.Category;
import com.liuyanan.domain.CategoryExample;
import com.liuyanan.exception.ParamException;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    public List<Category> selectCondition() {

        List<Category> categories = categoryMapper.selectByExample(null);
        return categories;
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
