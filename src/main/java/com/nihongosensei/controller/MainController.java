package com.nihongosensei.controller;

import com.nihongosensei.Category;
import com.nihongosensei.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MainController {
    @Autowired
    CategoryService categoryService;
    @GetMapping("hello")
    public List<Category> hello(){
        return categoryService.findAll();
    }
}
