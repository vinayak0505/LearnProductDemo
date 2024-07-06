package com.vinayak.product_demo;

public class ProductService {

    ProductDB db = new ProductDB();
    public void addProduct(Product product) {
        System.out.println("Adding product: " + product);
        db.save(product);
    }

    public void getAllProducts() {
    }

    public void getProductById(int id) {
    }
}
