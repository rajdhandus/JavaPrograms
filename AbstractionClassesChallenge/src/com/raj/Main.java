package com.raj;

public class Main {

    public static void main(String[] args) {
	// write your code here

//        MyLinkedList myLinkedList = new MyLinkedList(null);

        SearchTree myADT = new SearchTree(null);

        String input = "1 2 3 7 4 5 6";

        String[] ipt = input.split(" ");

        for (String item: ipt) {
            myADT.addItem(new Node(item));
        }

        System.out.println("Traversing the tree");

        myADT.traverse(myADT.getRoot());

        myADT.removeItem(new Node("4"));

        System.out.println("Traversing the tree");

        myADT.traverse(myADT.getRoot());

        myADT.removeItem(new Node("3"));

        System.out.println("Traversing the tree");

        myADT.traverse(myADT.getRoot());

        myADT.removeItem(new Node("4"));

        System.out.println("Traversing the tree");

        myADT.traverse(myADT.getRoot());

    }
}
