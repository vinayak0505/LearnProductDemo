package com.vinayak.product_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProductDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductDemoApplication.class, args);
        ProductService productService = new ProductService();

        productService.addProduct(new Product(1, "Product 1", "Type 1", "Place 1", 1));
        productService.addProduct(new Product(2, "Product 2", "Type 2", "Place 2", 2));

        productService.getAllProducts();
    }

}
