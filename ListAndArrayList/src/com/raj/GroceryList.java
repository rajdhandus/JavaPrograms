package com.raj;

import java.util.ArrayList;

/**
 * Created by rajkumarpurushothaman on 4/19/17.
 */
public class GroceryList {

    private ArrayList<String> groceryList = new ArrayList<String>();

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void addGroceryItem(String item) {
        groceryList.add(item);
    }

    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items");
        for (int i=0;i<groceryList.size();i++) {
            System.out.println((i+1)+". " + groceryList.get(i));
        }
    }

    public void modifyGroceryList(String oldItem, String newItem) {
        int position = findItem(oldItem);
        if(position>=0) {
            modifyGroceryList(position,newItem);
        }
    }

    private void modifyGroceryList(int position, String newItem) {
        groceryList.set(position,newItem);
        System.out.println("Grocery item #" + (position+1) + " has been modified");
    }

    public void removeGroceryItem(String item) {
        int position = findItem(item);
        if(position>=0) {
            removeGroceryItem(position);
        }
    }

    private void removeGroceryItem(int position) {
        groceryList.remove(position);
        System.out.println("Grocery item #" + (position+1) + " has been removed");
    }

    private int findItem(String item) {
        return groceryList.indexOf(item);
    }

    public boolean isPresent(String item) {
        int index = findItem(item);
        if(index==-1)
            return false;
        else
            return true;
    }

}
