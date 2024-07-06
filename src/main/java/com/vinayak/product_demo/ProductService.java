package com.vinayak.product_demo;

import java.util.List;

public class ProductService {

    ProductDB db = new ProductDB();
    public void addProduct(Product product) {
        System.out.println("Adding product: " + product);
        db.save(product);
    }

    public List<Product> getAllProducts() {
        return db.getAll();
    }

    public void getProductById(int id) {
    }
}
