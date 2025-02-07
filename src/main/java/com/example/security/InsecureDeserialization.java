package com.example.security;

import java.io.*;

public class InsecureDeserialization {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("malicious.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Object obj = ois.readObject();
        System.out.println("Deserialized Object: " + obj);
        ois.close();
    }
}
