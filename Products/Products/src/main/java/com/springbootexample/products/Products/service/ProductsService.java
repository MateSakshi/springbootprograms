package com.springbootexample.products.Products.service;

import com.springbootexample.products.Products.model.Products;
import com.springbootexample.products.Products.repository.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductsService {
    @Autowired
    private ProductsRepository productsRepository;

    public Products saveProduct(Products products) {
        return productsRepository.save(products);
    }

    public List<Products> getAllProducts() {
        return productsRepository.findAll();
    }

    public Products findByName(String name) {
        return productsRepository.findByName(name);
    }
}
