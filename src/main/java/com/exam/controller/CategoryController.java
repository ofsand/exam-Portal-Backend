package com.exam.controller;

import com.exam.models.exam.Category;
import com.exam.services.CategoryService;
import com.exam.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    //createCategory
    @PostMapping("/")
    public Category createCategory(@RequestBody Category category) {
        return this.categoryService.createCategory(category);
    }

}
