package com.raj;

public class Main {

    public static void main(String[] args) {

        // primitive data types

	    // byte
        // short
        // int
        // long
        // float
        // double
        // char
        // boolean

        String str1 = "this is a string";
        System.out.println(str1);

        str1 = str1 + " added with another string";
        System.out.println(str1);

        str1 = str1 + " \u00A9 "; // unicodes can be appended to string
        System.out.println(str1);

        str1 = str1 + 2015; // primitive integers can be appended to string
        System.out.println(str1);

        str1 = str1 + " " + 1.2345; // primitive decimals can be appended to string
        System.out.println(str1);

    }
}
