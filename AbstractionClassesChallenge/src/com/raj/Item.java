package com.raj;

/**
 * Created by rajkumarpurushothaman on 5/3/17.
 */
public abstract class Item {

    private Object data;
    protected Item next;
    protected Item previous;

    public Item(Object data) {
        this.data = data;
    }

    abstract Item next();
    abstract Item previous();
    abstract Item setNext(Item next);
    abstract Item setPrevious(Item previous);
    abstract int compareTo(Item item);

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
