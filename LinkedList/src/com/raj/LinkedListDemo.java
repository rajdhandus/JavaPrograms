package com.raj;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

/**
 * Created by rajkumarpurushothaman on 4/22/17.
 */
public class LinkedListDemo {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        LinkedList<String> citiesToVisit = new LinkedList<String>();

        citiesToVisit.add("Delhi");
        citiesToVisit.add("Mumbai");
        citiesToVisit.add("Chennai");
        citiesToVisit.add("Kolkatta");
        citiesToVisit.add("Bengaluru");
        citiesToVisit.add("Hyderabad");
        citiesToVisit.add("Pune");

        printList(citiesToVisit);

        System.out.println("Clearing the list to start again from beginning");
        System.out.println("================================");

        citiesToVisit.clear();


        addInOrder(citiesToVisit,"Delhi");
        addInOrder(citiesToVisit,"Mumbai");
        addInOrder(citiesToVisit,"Chennai");
        addInOrder(citiesToVisit,"Kolkatta");
        addInOrder(citiesToVisit,"Bengaluru");
        addInOrder(citiesToVisit,"Hyderabad");
        addInOrder(citiesToVisit,"Pune");

        System.out.println("================================");

        printList(citiesToVisit);

        System.out.println("================================");

        visitPlaces(citiesToVisit);

    }

    public static void printList(LinkedList<String> list) {

        ListIterator<String> listIterator = list.listIterator();

        while(listIterator.hasNext()){
            System.out.println(listIterator.next());
        }

    }

    public static void addInOrder(LinkedList<String> list, String item) {

        ListIterator<String> listIterator = list.listIterator();

        while(listIterator.hasNext()) {
            String next = listIterator.next();
            int compareResult = next.compareTo(item);

            if(compareResult==0) {
                System.out.println("The city is already in the list");
                return;
            }
            else if(compareResult>0) {
                listIterator.previous();
                listIterator.add(item);
                return;
            }
            else{
                continue;
            }
        }
        listIterator.add(item);
    }

    public static void visitPlaces(LinkedList<String> list) {

        printInstructions();

        ListIterator<String> listIterator = list.listIterator();

        boolean quit = false;
        int option;
        boolean movingForward = true;
        while(!quit){
            System.out.println("Please enter your option : ");
            option = scanner.nextInt();
            scanner.nextLine();
            switch (option){
                case 1:
                    printInstructions();
                    break;
                case 2:
                    if(!movingForward) {
                        if(listIterator.hasNext())
                            listIterator.next();
                        movingForward = true;
                    }
                    if(listIterator.hasNext()) {
                        System.out.println("Visiting " + listIterator.next());
                    }
                    else {
                        System.out.println("End of the list. You are done with the trip!");
                    }
                    break;
                case 3:
                    if(movingForward) {
                        if(listIterator.hasPrevious())
                            listIterator.previous();
                        movingForward = false;
                    }
                    if(listIterator.hasPrevious()) {
                        System.out.println("Visiting " + listIterator.previous());
                    }
                    else {
                        System.out.println("Beginning of the list. You are back to square 1");
                    }
                    break;
                default:
                    quit = true;
                    break;
            }

        }
    }

    private static void printInstructions() {
        System.out.println("Menu");
        System.out.println("======================");
        System.out.println("Press ");
        System.out.println("1 - To print instructions");
        System.out.println("2 - To go to the next city");
        System.out.println("3 - To go to the previous city");
        System.out.println("4 - To quit");
    }
}


