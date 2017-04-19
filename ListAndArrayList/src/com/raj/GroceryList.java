package com.raj;

import java.util.ArrayList;

/**
 * Created by rajkumarpurushothaman on 4/19/17.
 */
public class GroceryList {

    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryItem(String item) {
        groceryList.add(item);
    }

    public void printGroceryList() {
        System.out.println("You have" + groceryList.size() + " items");
        for (int i=0;i<groceryList.size();i++) {
            System.out.println((i+1)+". " + groceryList.get(i));
        }
    }

    public void modifyGroceryList(int position, String newItem) {
        groceryList.set(position,newItem);
        System.out.println("Grocery item #" + (position+1) + " has been modified");
    }

    public void removeGroceryItem(int position) {
        groceryList.remove(position);
        System.out.println("Grocery item #" + (position+1) + " has been removed");
    }

    public String findItem(String item) {
//        boolean exists = groceryList.contains(item);
        int position = groceryList.indexOf(item);

        if(position>=0)
            return groceryList.get(position);
        else
            return null;
    }

}
