package com.example.security;

import java.sql.*;

public class SQLInjectionExample {
    public static void main(String[] args) {
        String userInput = "'; DROP TABLE users; --";
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "password")) {
            Statement stmt = conn.createStatement();
            String query = "SELECT * FROM users WHERE username = '" + userInput + "'";
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                System.out.println("User found: " + rs.getString("username"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
