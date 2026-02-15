package org.sliit.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {

    @GetMapping("All")
    public String getAllProducts() {
        return "All products";
    }

    @GetMapping("ById")
    public String getProductById() {
        return "Product by ID";
    }

    @PostMapping("Add")
    public String addProduct() {
        return "Add product";
    }

    @DeleteMapping("Delete")
    public String deleteProduct() {
        return "Delete product";
    }
}
