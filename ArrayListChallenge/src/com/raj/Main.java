package com.raj;

import java.util.Scanner;

public class Main {

    private static MobilePhone mobilePhone = new MobilePhone();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int option;
        boolean loopBreaker = true;
        printInstructions();

        while(loopBreaker) {

            System.out.print("Enter your option : ");
            option = scanner.nextInt();
            scanner.nextLine();

            switch(option) {
                case 1:
                    printInstructions();
                    break;
                case 2:
                    printAllContacts();
                    break;
                case 3:
                    addContact();
                    break;
                case 4:
                    modifyContact();
                    break;
                case 5:
                    removeContact();
                    break;
                case 6:
                    findContact();
                    break;
                case 7:
                    loopBreaker = false;
                    break;
            }

        }
    }

    private static void printInstructions() {
        System.out.println("Enter");
        System.out.println("1 - To print Instructions");
        System.out.println("2 - To print all existing contacts");
        System.out.println("3 - To add a new contact");
        System.out.println("4 - To modify an existing contact");
        System.out.println("5 - To remove a contact");
        System.out.println("6 - To find a contact");
        System.out.println("7 - To quit this application");


    }

    private static void printAllContacts() {
        mobilePhone.printAllContacts();
    }

    private static void addContact() {
        System.out.print("Enter contact name: ");
        String name = scanner.nextLine();
        System.out.print("Enter contact number: ");
        String number = scanner.nextLine();
        mobilePhone.addContact(new Contacts(name, number));
        System.out.println("Contact added successfully!");
    }

    private static void modifyContact() {
        System.out.println("What do you wanna modify?(Name or Number) Type your answer : ");
        String nameOrNumber = scanner.nextLine().toLowerCase();
        if(nameOrNumber.equals("name")){
            System.out.println("Enter the name of the contact you wanna modify: ");
            String name = scanner.nextLine();
            System.out.println("Enter the new name: ");
            String newName = scanner.nextLine();

            mobilePhone.modifyContact(name, newName, true);
        }
        else{
            System.out.println("Enter the name of the contact you wanna modify: ");
            String name = scanner.nextLine();
            System.out.println("Enter the new number: ");
            String newNumber = scanner.nextLine();
            mobilePhone.modifyContact(name,newNumber, false);
        }

    }

    private static void removeContact() {
        System.out.println("Enter the name of the contact you wanna delete: ");
        String name = scanner.nextLine();

        mobilePhone.removeContact(name);
    }

    private static void findContact() {
        System.out.println("Enter the name of the contact you wanna search/find: ");
        String name = scanner.nextLine();

        if(mobilePhone.findContact(name)>=0){
            System.out.println("Contact Found");
            System.out.println(mobilePhone.getContact(name));
        }
        else{
            System.out.println("Contact NOT Found!!");
        }
    }
}
