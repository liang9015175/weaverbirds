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

    public List<Category> selectCondition(String categoryName, Integer curPage, Integer pageSize) {
        if (curPage == null || curPage <= 1) {
            curPage = 1;
        }
        if (pageSize == null || pageSize <= 1) {
            pageSize = 1;
        }
        Integer offset = (curPage - 1) * pageSize;
        CategoryExample example = new CategoryExample();
        example.or().andCategoryNameLike("%" + categoryName + "%").andStatusEqualTo(1);
        List<Category> categories = categoryMapper.selectByExampleWithRowbounds(example, new RowBounds(offset, pageSize));
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
