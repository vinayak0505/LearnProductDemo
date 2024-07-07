package com.vinayak.product_demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class ProductController {
    
    @Autowired
    ProductService service;


    @GetMapping("/products")
    public List<Product> getAllProducts() {
        return service.getAllProducts(); 
    }

    @GetMapping("/product/{id}")
    public Product getProductById(@PathVariable int id) {
        return service.getProductById(id);
    }

    @GetMapping("/productByName/{name}")
    public Product getMethodName(@PathVariable String name) {
        return service.getProductByName(name);
    }
    
    @PostMapping("/product")
    public void addProduct(@RequestBody Product p) {
        System.out.println(p);
        service.addProduct(p);
    }
    
}
