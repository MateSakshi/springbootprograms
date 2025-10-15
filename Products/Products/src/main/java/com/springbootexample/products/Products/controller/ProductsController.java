package com.springbootexample.products.Products.controller;

import com.springbootexample.products.Products.model.Products;
import com.springbootexample.products.Products.service.ProductsService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductsController {

    private final ProductsService productsService;

    public ProductsController(ProductsService productsService) {
        this.productsService = productsService;
    }

    @PostMapping
    public Products createProduct(@RequestBody Products product){
        return productsService.saveProduct(product);
    }
    @GetMapping
    public List<Products> getProduct(){
        return productsService.getAllProducts();
    }
    @GetMapping("/{name}")
    public Products getProduct(@PathVariable String name){
        return productsService.findByName(name);
    }

}
