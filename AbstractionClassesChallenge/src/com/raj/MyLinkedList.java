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

        Item current = getRoot();

        while(current!=null) {
            int compareResult = current.compareTo(item);
            if(compareResult>0) {
                // item is small, move left
                if(current.previous()!=null) {
                    Item prev = current.previous();

                    item.setPrevious(prev);
                    prev.setNext(item);

                    item.setNext(current);
                    current.setPrevious(item);

                    return true;
                }
                else {
                    this.root.setPrevious(item);
                    this.root = item;
                    item.setNext(this.root);
                    return true;
                }
            }
            else if(compareResult<0) {
                // item is bigger, move right
                if(current.next()!=null) {
                    current = current.next();
                }
                else {
                    current.setNext(item);
                    item.setPrevious(current);
                    return true;
                }
            }
            else {
                // item is already present, ignore!
                System.out.println("Duplicate item");
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(Item item) {

        Item current = this.root;

        while(current.next()!=null) {
            if(current.compareTo(item)==0) {
                Item prev = current.previous();
                Item next = current.next();
                prev.setNext(next);
                next.setPrevious(prev);
                System.out.println("Deleted " + item.getData());
                return true;
            }
            else {
                current = current.next();
                continue;
            }
        }

        return false;
    }

    @Override
    public void traverse(Item root) {
        Item current = root;
        while(current!=null) {
            System.out.println("Value : " + current.getData());
            current = current.next();
        }
    }
}
