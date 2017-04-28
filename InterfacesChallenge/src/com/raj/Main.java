package com.raj;

import java.util.ArrayList;

public class Main {

    public static void saveObject(ISaveable object){
        for(int i=0; i<object.saveToSaveable().size();i++) {
            System.out.println("Saving " + object.saveToSaveable().get(i) + " to a medium ");
        }
    }

    public static void loadObject(ISaveable object){
        ArrayList<String> values = new ArrayList<String>();
        values.add(0,"Rajkumar");
        values.add(1, "1");
        values.add(2, "100");
        values.add(3, "Knife");

        //values can be provided by any means; Scanner.in / after reading from I/O etc..
        object.readFromSaveable(values);
    }

    public static void main(String[] args) {

        ISaveable player = new Player("Raj", 0, 100);

        //save current state
        saveObject(player);

        //load a different state
        loadObject(player);

        //save the different state
        saveObject(player);
    }

}
