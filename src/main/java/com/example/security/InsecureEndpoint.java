package com.example.security;

public class InsecureEndpoint {
    public static void main(String[] args) {
        boolean isAdmin = true; // Access control bypass
        if (isAdmin) {
            System.out.println("Admin Access Granted!");
        }
    }
}
