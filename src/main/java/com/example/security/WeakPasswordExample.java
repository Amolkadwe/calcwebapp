package com.example.security;

public class WeakPasswordExample {
    public static void main(String[] args) {
        String hardcodedPassword = "password123"; // Weak password
        if ("password123".equals(hardcodedPassword)) {
            System.out.println("Access Granted!");
        }
    }
}
