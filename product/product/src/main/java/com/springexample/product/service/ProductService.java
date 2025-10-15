package com.springexample.product.service;

import org.springframework.stereotype.Service;


import com.springexample.product.model.Product;
import com.springexample.product.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product findByName(String name) {
        return productRepository.findByName(name);
    }

    public Product findByCategory(String category){
        return productRepository.findByCategory(category);
    }
}

