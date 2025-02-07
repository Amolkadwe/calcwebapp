package com.example.security;

import java.util.Properties;
import java.io.*;

public class ExposedConfig {
    public static void main(String[] args) throws IOException {
        Properties props = new Properties();
        FileInputStream fis = new FileInputStream("config.properties");
        props.load(fis);
        System.out.println("Database Password: " + props.getProperty("db.password")); // Exposing sensitive info
    }
}
