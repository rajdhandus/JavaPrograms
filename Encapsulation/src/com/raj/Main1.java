package com.raj;

/**
 * Created by rajkumarpurushothaman on 4/12/17.
 */
public class Main1 {

    public static void main(String[] args) {
        Printer myPrinter = new Printer(100,0,true);
        System.out.println(myPrinter.getNumberofPages());
        myPrinter.print(4);
        System.out.println(myPrinter.getNumberofPages());

    }
}
