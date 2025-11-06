package com.categoryexample.controller;

import com.categoryexample.model.Category;
import com.categoryexample.service.CategoryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/category")
public class CategoryController {
    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }
    @PostMapping
    public Category createCategory(@RequestBody Category category){
        return categoryService.saveCategory(category);
    }
    @GetMapping("/categoryName/{categoryName}")
    public List<Category> getByCategory(@PathVariable String categoryName){
        return categoryService.findByCategoryName(categoryName);
    }
    @GetMapping("/{id}")
    public Optional<Category> getByID(@PathVariable int id){
        return categoryService.findById(id);
    }
    @GetMapping("/dateOfBirth/Null")
    public List<Category> getByDOBIsNull(){
        return categoryService.findByDateOfBirthIsNull();
    }


}
