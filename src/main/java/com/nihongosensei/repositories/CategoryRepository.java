package com.nihongosensei.repositories;

import com.nihongosensei.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
    List<Category> findCategoryByCategoryName(String categoryName);

    Category findCategoryById(Integer id);
}
