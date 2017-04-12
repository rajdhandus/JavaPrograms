package com.raj;

/**
 * Created by rajkumarpurushothaman on 4/11/17.
 */
public class Porsche extends Car {

    private int roadServiceWarranty;

    public Porsche(int roadServiceWarranty) {
        super("4WD", "Porsche", 4, 4, 6, true);
        this.roadServiceWarranty = roadServiceWarranty;
    }

    public void accelerate(int rate) {

        int newSpeed = getCurrentVelocity() + rate;

        if(newSpeed > 0 && newSpeed <10) {
            stop();
            changeGear(1);
        } else if(newSpeed > 10 && newSpeed <20) {
            changeGear(2);
        } else if(newSpeed > 20 && newSpeed <30) {
            changeGear(3);
        } else if(newSpeed > 30 && newSpeed <40) {
            changeGear(4);
        } else{
            changeGear(5);
        }

        if(newSpeed >0)
            changeSpeed(newSpeed, getCurrentDirection());
    }
}
