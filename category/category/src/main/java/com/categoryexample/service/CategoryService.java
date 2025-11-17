package com.categoryexample.service;

import com.categoryexample.model.Category;
import com.categoryexample.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public Category saveEmployee(Category category) {
        return categoryRepository.save(category);
    }
    public List<Category> getAllEmployees() {
        return categoryRepository.findAll();
    }
    public List<Category> findByDepartmentName(String departmentName){
        return categoryRepository.findByDepartmentName(departmentName);
    }
    public Optional<Category> findById(int id){
        return categoryRepository.findById(id);
    }
    public List<Category> findByFirstName(String firstName){
        return categoryRepository.findByFirstName(firstName);
    }
    public List<Category> findByDateOfBirthIsNull(){
        return categoryRepository.findByDateOfBirthIsNull();
    }
    public List<Category> findByYear(int year) {
        return categoryRepository.findByBirthYear(year);
    }

}
