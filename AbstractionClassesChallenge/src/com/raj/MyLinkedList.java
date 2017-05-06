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
