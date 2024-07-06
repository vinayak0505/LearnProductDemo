package com.vinayak.product_demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductService {

    @Autowired
    ProductDB db;
    
    public void addProduct(Product product) {
        System.out.println("Adding product: " + product);
        db.save(product);
    }

    public List<Product> getAllProducts() {
        return db.findAll();
    }

    public void getProductById(int id) {
    }
}
