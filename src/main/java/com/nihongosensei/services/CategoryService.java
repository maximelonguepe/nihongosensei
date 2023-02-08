package com.nihongosensei.services;

import com.nihongosensei.entities.Category;
import com.nihongosensei.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    CategoryRepository categoryRepository;
    public List<Category> findAll(){

        return categoryRepository.findAll();
    }

    public Category save(Category category){
        return categoryRepository.save(category);
    }
    public List<Category> findCategoriesByCategoryName(String name){
        return categoryRepository.findCategoryByCategoryName(name);
    }

    public Category findCategoryById(Integer id){
        return categoryRepository.findCategoryById(id);
    }
}
