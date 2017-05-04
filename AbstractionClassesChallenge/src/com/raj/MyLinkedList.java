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
        return false;
    }

    @Override
    public boolean removeItem(Item item) {
        return false;
    }

    @Override
    public void traverse(Item root) {

    }
}
