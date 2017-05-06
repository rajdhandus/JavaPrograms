package com.raj;

/**
 * Created by rajkumarpurushothaman on 5/3/17.
 */
public class MyLinkedList implements NodeList {

    private Item root=null;

    public MyLinkedList(Item root) {
        this.root = root;
    }

    @Override
    public Item getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(Item item) {
        if(this.root==null) {
            this.root = item;
            return true;
        }

        Item currentItem = this.root;

        while(currentItem!=null) {
            int compareResult = currentItem.compareTo(item);
            if(compareResult <0) {
                //item is larger, move right and insert
                if(currentItem.next()!=null) {
                    currentItem = currentItem.next();
                }
                else {
                    currentItem.setNext(item);
                    item.setPrevious(currentItem);
                    return true;
                }
            }
            else if(compareResult>0) {
                // item is smaller, move left and insert
                if(currentItem.previous()!=null) {
                    Item prev = currentItem.previous();
                    prev.setNext(item);
                    item.setPrevious(prev);
                    item.setNext(currentItem);
                    currentItem.setPrevious(item);
                }
                else {
                    // we have reached the first item a.k.a this.root
                    // so instead of currentItem use this.root

//                    currentItem.setPrevious(item);
//                    item.setNext(currentItem);

                    this.root.setPrevious(item);
                    item.setNext(this.root);
                    this.root = item;
                }
                return true;
            }
            else {
                // duplicate
                System.out.println("Deplicate item found!");
                return false;
            }
        }

        return false;
    }

    @Override
    public boolean removeItem(Item item) {
        return false;
    }

    @Override
    public void traverse(Item root) {
        Item current = root;
        while(current.next()!=null) {
            System.out.println("Value : " + current.getData());
            current = current.next();
        }
    }
}
