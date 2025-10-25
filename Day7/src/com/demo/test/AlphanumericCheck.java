package com.demo.test;

public class AlphanumericCheck {
    public static void main(String[] args) {
        String str = "Java123";

        // Regex: ^[a-zA-Z0-9]+$ → only letters and digits, at least 1 char
        if (str.matches("^[a-zA-Z0-9]+$")) {
            System.out.println("The string is alphanumeric.");
        } else {
            System.out.println("The string contains non-alphanumeric characters.");
        }
    }
}
