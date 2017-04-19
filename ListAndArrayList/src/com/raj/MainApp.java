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
        printInstructions();

        while(loopBreaker){

            System.out.println("Enter your option");
            int option;
            option = scanner.nextInt();
            scanner.nextLine();

            switch(option) {
                case 1:
                    printInstructions();
                    break;
                case 2:
                    groceryList.printGroceryList();
                    printInstructions();
                    break;
                case 3:
                    addItem();
                    printInstructions();
                    break;
                case 4:
                    modifyItem();
                    printInstructions();
                    break;
                case 5:
                    removeItem();
                    printInstructions();
                    break;
                case 6:
                    searchForItem();
                    printInstructions();
                    break;
                case 7:
                    loopBreaker = false;
                    break;
            }

        }

    }

    private static void printInstructions() {
        System.out.print("\nPress ");
        System.out.print("\n 1 - To print choice options");
        System.out.print("\n 2 - To print the list of grocery items");
        System.out.print("\n 3 - To add an item to the list");
        System.out.print("\n 4 - To modify an item in the list");
        System.out.print("\n 5 - To remove an item from the list");
        System.out.print("\n 6 - To search for an item in the list");
        System.out.print("\n 7 - To quit this wonderful application");
    }

    private static void addItem() {
        System.out.print("Enter the name of the item you wanna add : ");
        String newItem = scanner.nextLine();
        groceryList.addGroceryItem(newItem);
        System.out.println("Item " + newItem + " added successfully!");
    }

    private static void modifyItem() {
        System.out.print("Enter the position of the item you wanna modify: ");
        int position = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter the new item you wanna insert: ");
        groceryList.modifyGroceryList(position-1,scanner.nextLine());
        System.out.println("Item #" +position + " modified successfully!");
    }

    private static void removeItem() {
        System.out.print("Enter the position of the item you wanna remove: ");
        int position = scanner.nextInt();
        scanner.nextLine();
        groceryList.removeGroceryItem(position-1);
        System.out.println("Item #" + position + " removed successfully!");
    }

    private static void searchForItem() {
        System.out.print("Enter the name of the item you wanna search for : ");
        String searchTerm = scanner.nextLine();
        if(groceryList.findItem(searchTerm)!=null)
            System.out.println("Item found in the list");
        else
            System.out.println("Item was NOT found!");
    }
}
