package com.raj;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> listOfNumbers = new ArrayList<Integer>();

        listOfNumbers.add(1);
        listOfNumbers.add(3);
        listOfNumbers.add(4);
        listOfNumbers.add(6);

        System.out.println("Printing the list before insertion");

        for (Integer i: listOfNumbers) {
            System.out.println(i);
        }

        System.out.println("Printing the list after insertion");

        listOfNumbers.add(1,2);

        listOfNumbers.add(4,5);

        for (Integer i: listOfNumbers) {
            System.out.println(i);
        }

    }
}
