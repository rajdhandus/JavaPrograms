package com.raj;

public class Main {

    public static void main(String[] args) {

        int i = 1 + 2;

        i+= 2;
        System.out.println( " i is " + i);

        i-= 2;
        System.out.println( " i is " + i);

        i*= 2;
        System.out.println( " i is " + i);

        i/=2;
        System.out.println( " i is " + i);

        i%=2;
        System.out.println( " i is " + i);


        boolean isAlien = false;

        if(isAlien == true)
            System.out.println("I am an Alien!");

        int topScore = 100;

        int secondTopScore = 80;

        if(topScore<100)
            System.out.println("top scorer is not a centurion");

        if((topScore > secondTopScore) && (topScore >= 50))
            System.out.println("top scorer scored a half century");

        boolean isCar = true;

        boolean wasCar = ((topScore > secondTopScore) && (topScore >= 50)) ? true : false;

        System.out.println(wasCar);


    }
}
