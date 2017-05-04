package com.raj;

/**
 * Created by rajkumarpurushothaman on 5/3/17.
 */
public interface NodeList {
    Item getRoot();
    boolean addItem(Item item);
    boolean removeItem(Item item);
    void traverse(Item root);
}
