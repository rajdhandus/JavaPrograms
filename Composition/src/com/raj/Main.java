package com.raj;

public class Main {

    public static void main(String[] args) {
        Resolution resolution = new Resolution(15, 15, 4000);
        Monitor monitor = new Monitor("Samsung", "CurveXL", resolution, 27);
        Dimensions dimensions = new Dimensions(20,20,20);
        Case theCase = new Case("Tower", "Dell", "120V", dimensions);
        Motherboard motherboard = new Motherboard("Intel", "Intel", 2, 6, "V2");

        PC myPC = new PC(theCase, motherboard, monitor);

        myPC.getTheCase().pressPowerButton();
        myPC.getMotherboard().loadProgram("Windows");
        myPC.getMonitor().drawPixel(5,5,"Red");

    }
}
