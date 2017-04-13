package com.raj;

/**
 * Created by rajkumarpurushothaman on 4/12/17.
 */
public class Printer {
    private int tonerLevel;
    private int numberofPages=0;
    private boolean isDuplex;

    public Printer(int tonerLevel, int numberofPages, boolean isDuplex) {
        if(tonerLevel >=0 && tonerLevel <=100)
            this.tonerLevel = tonerLevel;
        else
            this.tonerLevel = -1;

        this.numberofPages = numberofPages;
        this.isDuplex = isDuplex;
    }



    public void fillToner(int refillLevel) {
        // fill upto 100% toner level depending on the current level
        if(this.tonerLevel+refillLevel <=100)
            this.tonerLevel = this.tonerLevel + refillLevel;
        else
            this.tonerLevel = 100;
    }

    public void print(int page) {

        if(isDuplex)
            page /= 2;

        System.out.println("Printing " + page + " pages");

        this.numberofPages += page;
        this.tonerLevel -= 1;

        // decrease toner level
        // depending on duplex type print 1 or 2 pages per print
    }

    public int getNumberofPages() {
        return numberofPages;
    }
}
