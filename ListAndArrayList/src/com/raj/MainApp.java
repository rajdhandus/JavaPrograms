package com.raj;

import java.util.Scanner;

/**
 * Created by rajkumarpurushothaman on 4/19/17.
 */
public class MainApp {

    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        boolean loopBreaker = true;
        int option;
        System.out.println("Enter your option");
        option = scanner.nextInt();

        while(loopBreaker){

            switch(option) {
                case 1:
                    printInstructions();
                    break;
                case 2:
                    groceryList.printGroceryList();
                    break;
                case 3:
                    addItem();
                    break;
                case 4:
                    modifyItem();
                    break;
                case 5:
                    removeItem();
                    break;
                case 6:
                    searchForItem();
                    break;
                case 7:
                    loopBreaker = false;
                    break;
            }

        }

    }

    private static void printInstructions() {
    }

    private static void addItem() {
    }

    private static void modifyItem() {
    }

    private static void removeItem() {
    }

    private static void searchForItem() {
    }
}
