package com.raj;

/**
 * Created by rajkumarpurushothaman on 4/12/17.
 */
public class Lamp {
    private String style;
    private boolean isBattery;
    private int globeRating;

    public Lamp(String style, boolean isBattery, int globeRating) {
        this.style = style;
        this.isBattery = isBattery;
        this.globeRating = globeRating;
    }

    public void switchOn() {
        System.out.println("Turning the switch on");
    }

    public String getStyle() {
        return style;
    }

    public boolean isBattery() {
        return isBattery;
    }

    public int getGlobeRating() {
        return globeRating;
    }
}
