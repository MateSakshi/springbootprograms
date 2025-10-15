package com.springbootexample.products.Products.repository;

import com.springbootexample.products.Products.model.Products;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductsRepository extends JpaRepository<Products, Integer> {

    Products findByName(String name);
}


