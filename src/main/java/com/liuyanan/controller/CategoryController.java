package com.liuyanan.controller;

import com.liuyanan.domain.Category;
import com.liuyanan.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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
    public List<Category> selectCondition() {
        return categoryService.selectCondition();
    }

    @RequestMapping(value = "/put", method = RequestMethod.PUT)
    public void updateCategory(Category category) {
        categoryService.updateCategory(category);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    public void deleteCategory(Integer id) {
        categoryService.deleteCategory(id);
    }
}
