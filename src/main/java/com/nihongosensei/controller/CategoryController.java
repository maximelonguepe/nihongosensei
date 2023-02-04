package com.nihongosensei.controller;

import com.nihongosensei.entities.Category;
import com.nihongosensei.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("categories")
public class CategoryController {
    @Autowired
    CategoryService categoryService;
    @GetMapping("")
    public List<Category> findAll(){
        return categoryService.findAll();
    }
}