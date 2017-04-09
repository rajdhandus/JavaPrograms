package com.company;

public class Main {

    public static void main(String[] args) {

        //width of an int = 4 bytes or 32 bits
        int myIntValue = 5/3;

        //width of a float = 4 bytes or 32 bits
        float myFloatValue = 5/3;

        //float myFloatValue1 = 5.2; --> will cause a compilation error;
        // java assumes literal decimal as double; assigning it to float will cause error

        //byte temp = 127;
        //byte temp1 = temp/2; --> will cause a compilation error;
        // java assumes literal expressions as int; assigning it to short, byte, long will cause error

        // can also be written as 5f/2f
        //float has 7 digits of precision

        //width of a float = 8 bytes or 64 bits
        double myDoubleValue = 5d/3;
        // can also be written as 5d/2d
        //double has 16 digits of precision

        //double is faster on modern computers
        // inbuilt functions in java return double
        // more precise

        System.out.println(myIntValue);
        System.out.println(myFloatValue);
        System.out.println(myDoubleValue);

        // program to convert pounds to kilograms

        double numberOfPounds = 120d;
        double numberOfKilos = numberOfPounds * 0.45359237d;
        System.out.println(numberOfPounds +" pounds are "+numberOfKilos +" kilos");

    }
}
