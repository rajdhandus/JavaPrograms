package com.raj;

/**
 * Created by rajkumarpurushothaman on 5/3/17.
 */
public class Node extends Item {

    public Node(Object data) {
        super(data);
    }

    @Override
    Item next() {
        return this.next;
    }

    @Override
    Item previous() {
        return this.previous;
    }

    @Override
    Item setNext(Item next) {
        this.next = next;
        return this.next;
    }

    @Override
    Item setPrevious(Item previous) {
        this.previous = previous;
        return this.previous;
    }

    @Override
    int compareTo(Item item) {
        if(item!=null) {
            return ((String) super.getData()).compareTo((String)item.getData());
        }
        else {
            return -1;
        }
    }
}
