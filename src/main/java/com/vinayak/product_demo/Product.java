package com.vinayak.product_demo;
public class Product {
    private int id;
    private String name;
    private String type;
    private String place;
    private int warranty;

    public Product(int id, String name, String type, String place, int warranty) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.place = place;
        this.warranty = warranty;
    }
}
