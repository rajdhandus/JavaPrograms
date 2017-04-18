package com.raj;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myArray = getIntegers(5);
        printArray(myArray);
        System.out.println("Average of the numbers is -> " + getAverage(myArray));
    }

    public static int[] getIntegers(int numOfInts) {
        System.out.println("Enter " + numOfInts + " integers" );
        int[] values = new int[numOfInts];

        for(int i=0; i<values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static void printArray(int[] array) {
        for(int i=0; i<array.length;i++) {
            System.out.println("Element at postition " + i + " was " +array[i]);
        }
    }

    public static double getAverage(int[] array) {
        int sum =0;
        for (int i=0; i<array.length;i++) {
            sum +=array[i];
        }
        return (double)sum/ (double)array.length;
    }

}