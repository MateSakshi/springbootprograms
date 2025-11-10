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

    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }
    public List<Category> findByCategoryName(String category){
        return categoryRepository.findByCategoryName(category);
    }
    public Optional<Category> findById(int id){
        return categoryRepository.findById(id);
    }

    public List<Category> findByDateOfBirthIsNull(){
        return categoryRepository.findByDateOfBirthIsNull();
    }

    public List<Category> findByYear(int year) {
        return categoryRepository.findByBirthYear(year);
    }

}
