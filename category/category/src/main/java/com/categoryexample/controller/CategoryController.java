package com.categoryexample.controller;

import com.categoryexample.model.Category;
import com.categoryexample.service.CategoryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/category")
public class CategoryController {
    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }
    @PostMapping
    public Category createCategory(@RequestBody Category category) {
        return categoryService.saveEmployee(category);
    }

    @GetMapping("/all")
    public List<Category> getAllEmployees() {
        return categoryService.getAllEmployees();
    }
    @GetMapping("/departmentName/{departmentName}")
    public List<Category> getByDepartment(@PathVariable String departmentName){
        return categoryService.findByDepartmentName(departmentName);
    }
    @GetMapping("/id/{id}")
    public Optional<Category> getByID(@PathVariable int id){
        return categoryService.findById(id);
    }
    @GetMapping("/name/{firstName}")
    public List<Category> getByName(@PathVariable String firstName){
        return categoryService.findByFirstName(firstName);
    }
    @GetMapping("/dob/null")
    public List<Category> getByDOBIsNull(){
        return categoryService.findByDateOfBirthIsNull();
    }
    @GetMapping("/dob/{year}")
    public List<Category> getByYear(@PathVariable int year) {
        return categoryService.findByYear(year);
    }
}
