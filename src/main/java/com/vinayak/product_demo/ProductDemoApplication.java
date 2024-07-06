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
        productService.addProduct(new Product(3, "Product 3", "Type 3", "Place 3", 3));
        productService.addProduct(new Product(4, "Product 4", "Type 4", "Place 4", 4));
        productService.addProduct(new Product(5, "Product 5", "Type 5", "Place 5", 5));
        productService.addProduct(new Product(6, "Product 6", "Type 6", "Place 6", 6));
        productService.addProduct(new Product(7, "Product 7", "Type 7", "Place 7", 7));
        productService.addProduct(new Product(8, "Product 8", "Type 8", "Place 8", 8));

        productService.getAllProducts();
    }

}
