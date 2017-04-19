package com.raj;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static int[] baseData = new int[10];

    public static void main(String[] args) {
        System.out.println("Enter 10 Integers");
        initializeArray();
        printArray();
        resize();
        baseData[10] = 11;
        baseData[11] = 12;
        printArray();
    }

    private static void resize() {
        int[] original = baseData;

        baseData = new int[12];
        for (int i=0; i< original.length;i++) {
            original[i] = baseData[i];
        }
    }


    private static void printArray() {
        for (int i=0; i<baseData.length;i++) {
            System.out.print(baseData[i] + " ");
        }
    }

    private static void initializeArray() {
        for (int i=0; i<baseData.length;i++) {
            baseData[i]=scanner.nextInt();
        }
    }
}
