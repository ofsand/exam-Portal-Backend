package com.exam.services;

import com.exam.models.exam.Category;
import com.exam.repo.CategoryRepository;
import org.springframework.stereotype.Service;

public interface CategoryService {

    public Category createCategory(Category category);


}
