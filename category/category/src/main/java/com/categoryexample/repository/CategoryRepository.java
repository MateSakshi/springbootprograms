package com.categoryexample.repository;

import com.categoryexample.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
public interface CategoryRepository extends JpaRepository<Category,Integer> {
        List<Category> findByCategoryName(String categoryName);

        List<Category> findByDateOfBirthIsNull();

        @Query("SELECT c FROM Category c WHERE YEAR(c.dateOfBirth) = :year")
        List<Category> findByBirthYear(@Param("year") int year);


}

