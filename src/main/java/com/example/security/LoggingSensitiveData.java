package com.example.security;

public class LoggingSensitiveData {
    public static void main(String[] args) {
        String creditCard = "4111-1111-1111-1111";
        System.out.println("User's Credit Card: " + creditCard); // Exposing sensitive info
    }
}
