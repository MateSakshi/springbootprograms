package com.springexample.product.controller;

import com.springexample.product.model.Product;
import com.springexample.product.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping
    public Product createProduct(@RequestBody Product product){
        return productService.saveProduct(product);
    }
    @GetMapping
    public List<Product> getProduct(){
        return productService.getAllProducts();
    }
    @GetMapping("/{name}")
    public Product getProduct(@PathVariable String name){
        Product product = productService.findByName(name);
        return product;
    }
    @GetMapping("/{category}")
    public Product getProductCategory(@PathVariable String category){
        Product product = productService.findByCategory(category);
        return product;
    }

}
