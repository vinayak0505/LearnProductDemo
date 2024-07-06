package com.vinayak.product_demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProductDB {

    Connection conn = null;

    public ProductDB() {
        try {
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/learning", "postgres", "qwerty12345");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void save(Product product) {
        String query = "INSERT INTO product (name, type, place, warranty) VALUES (?, ?, ?, ?)";

        try {
            PreparedStatement st = conn.prepareStatement(query);
            st.setString(1, product.getName());
            st.setString(2, product.getType());
            st.setString(3, product.getPlace());
            st.setInt(4, product.getWarranty());
            st.execute();
        } catch (Exception e) {
        }
    }

}
