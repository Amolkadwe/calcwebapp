package com.example.security;

public class NoLoggingExample {
    public static void main(String[] args) {
        try {
            throw new Exception("Security error occurred!");
        } catch (Exception e) {
            // No logging
        }
    }
}
