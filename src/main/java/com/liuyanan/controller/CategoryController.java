package com.liuyanan.controller;

import com.github.pagehelper.PageInfo;
import com.liuyanan.domain.Category;
import com.liuyanan.param.CategoryEx;
import com.liuyanan.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by songliangliang on 2017/10/14.
 */
@RestController
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @RequestMapping(value = "/post", method = RequestMethod.POST)
    public void insertCategory(@RequestBody Category category) {
        categoryService.addCategory(category);
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public PageInfo<CategoryEx> selectCondition(Integer curPage, Integer pageSize) {
        return categoryService.selectCondition(curPage,pageSize);
    }

    @RequestMapping(value = "/put", method = RequestMethod.PUT)
    public void updateCategory(@RequestBody Category category) {
        categoryService.updateCategory(category);
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public void deleteCategory(@PathVariable Integer id) {
        categoryService.deleteCategory(id);
    }
}
