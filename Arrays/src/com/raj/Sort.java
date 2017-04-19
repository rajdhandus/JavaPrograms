package com.raj;

import java.util.Scanner;

/**
 * Created by rajkumarpurushothaman on 4/18/17.
 */
public class Sort {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arrayOfInts = getIntegers(5);
        sortIntArray(arrayOfInts);
        printIntArray(arrayOfInts);
    }

    private static void printIntArray(int[] arrayOfInts) {
        for(int i=0; i<arrayOfInts.length;i++) {
            System.out.println(arrayOfInts[i]);
        }
    }

    private static void sortIntArray(int[] arrayOfInts) {
        for(int i=0; i<arrayOfInts.length-1;i++){
            for(int j=i+1; j<arrayOfInts.length;j++){
                if(arrayOfInts[j]>arrayOfInts[i]) {
                    int temp = arrayOfInts[j];
                    arrayOfInts[j] = arrayOfInts[i];
                    arrayOfInts[i] = temp;
                }
            }
        }
    }

    private static int[] getIntegers(int num) {
        int[] array = new int[num];
        System.out.println("Enter " + num + " integer numbers");
        for(int i=0; i<array.length;i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }
}
