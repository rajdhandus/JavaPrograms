package com.raj;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

/**
 * Created by rajkumarpurushothaman on 4/26/17.
 */
public class LinkedListDemo {

    private static LinkedList<String> listOfStrings = new LinkedList<String>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        listOfStrings.add("a");
        listOfStrings.add("b");
        listOfStrings.add("c");
        listOfStrings.add("d");

        ListIterator listIterator = listOfStrings.listIterator();
        int option;
        boolean quit = false;
        System.out.println("Enter your option : ");
        while(!quit) {
            option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 1:
                    if(listIterator.hasNext())
                        System.out.println(listIterator.next().toString());
                    else
                        System.out.println("End of List");
                    break;
                case 2:
                    if(listIterator.hasPrevious())
                        System.out.println(listIterator.previous().toString());
                    else
                        System.out.println("Beginning of the list");
                    break;
                case 3:
                    quit = true;
                    break;
            }
        }

    }
}
