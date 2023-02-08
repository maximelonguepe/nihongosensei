package com.nihongosensei.controller;

import com.nihongosensei.entities.Category;
import com.nihongosensei.services.CategoryService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("categories")
public class CategoryController {
    @Autowired
    CategoryService categoryService;

    @GetMapping("")
    public List<Category> findAll() {
        return categoryService.findAll();
    }

    @PostMapping("")
    public Category save(@RequestBody Category category) {
        return categoryService.save(category);
    }


    @GetMapping("findByName")
    public List<Category> findByName(@PathParam("name")String name){
        return categoryService.findCategoriesByCategoryName(name);
    }

    @GetMapping("findById")
    public Category findById(@PathParam("id")Integer id){
        return categoryService.findCategoryById(id);
    }

}
