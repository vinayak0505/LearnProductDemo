package com.vinayak.product_demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Product {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
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

    public Product() {    }
    
}
