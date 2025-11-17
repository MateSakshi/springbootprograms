package com.categoryexample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CategoryViewController {

    @GetMapping("/categories")
    public String showCategoryPage(Model model) {
        // You can pass default data if needed
        model.addAttribute("pageTitle", "Category Data Viewer");
        return "category"; // this will look for templates/category.html
    }
}
