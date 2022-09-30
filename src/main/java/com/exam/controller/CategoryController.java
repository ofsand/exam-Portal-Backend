package com.exam.controller;

import com.exam.models.exam.Category;
import com.exam.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/category")
@CrossOrigin("*")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    //createCategory
    @PostMapping("/")
    public ResponseEntity<?> createCategory(@RequestBody Category category) {
        Category category1 = this.categoryService.addCategory(category);
        return ResponseEntity.ok(category1);
    }

    @GetMapping("/{categoryId}")
    public Category getCategory(@PathVariable("categoryId") Long categoryId) {
        return this.categoryService.getCategory(categoryId);
    }

    @GetMapping("/")
    public ResponseEntity<?> getCategories( ){
        return ResponseEntity.ok(this.categoryService.getCategories());
    }
    @PutMapping("/")
    public Category updateCategory(@RequestBody Category category) {
        return this.categoryService.updateCategory(category);
    }
    @DeleteMapping("/{categoryId}")
    public void deleteCategory(@PathVariable("categoryId") Long categoryId) {
        Category category = new Category();
        category.setcId(categoryId);
        this.categoryService.deleteCategory(categoryId);
    }

}
