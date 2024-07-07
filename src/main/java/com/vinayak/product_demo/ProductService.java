package com.vinayak.product_demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductService {

    @Autowired
    ProductDB db;
    
    public void addProduct(Product product) {
        db.save(product);
    }

    public List<Product> getAllProducts() {
        return db.findAll();
    }

    public Product getProductById(int id) {
        return db.findById(id).orElse(new Product());
    }

    public Product getProductByName(String name) {
        return db.findByName(name);
    }
}
