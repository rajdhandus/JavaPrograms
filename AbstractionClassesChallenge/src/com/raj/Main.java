package com.raj;

public class Main {

    public static void main(String[] args) {
	// write your code here

        MyLinkedList myLinkedList = new MyLinkedList(null);

        String input = "1 2 3 7 4 5 6";

        String[] ipt = input.split(" ");

        for (String item: ipt) {
            myLinkedList.addItem(new Node(item));
        }

        myLinkedList.traverse(myLinkedList.getRoot());

        myLinkedList.removeItem(new Node("4"));

        myLinkedList.traverse(myLinkedList.getRoot());

        myLinkedList.removeItem(new Node("3"));

        myLinkedList.traverse(myLinkedList.getRoot());

        myLinkedList.removeItem(new Node("4"));

        myLinkedList.traverse(myLinkedList.getRoot());

    }
}
