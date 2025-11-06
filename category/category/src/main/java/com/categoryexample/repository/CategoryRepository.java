package com.categoryexample.repository;

import com.categoryexample.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
public interface CategoryRepository extends JpaRepository<Category,Integer> {
        List<Category> findByCategoryName(String categoryName);

        List<Category> findByDateOfBirthIsNull();

}

