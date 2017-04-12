package com.raj;

/**
 * Created by rajkumarpurushothaman on 4/12/17.
 */
public class Main1 {

    public static void main() {

        Wall wall1 = new Wall("North");
        Wall wall2 = new Wall("South");
        Wall wall3 = new Wall("West");
        Wall wall4 = new Wall("East");
        Ceiling ceiling = new Ceiling(10, "White");
        Bed bed = new Bed("California Kind", 10, 4, 4, 4);
        Lamp lamp = new Lamp("Table Lamp", true, 10);
        Bedroom theBedroom = new Bedroom("Raj's Room", wall1, wall2, wall3, wall4, ceiling, bed, lamp);

        theBedroom.makeMethod();

        theBedroom.getLamp().switchOn();
    }
}
