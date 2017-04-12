package com.raj;

/**
 * Created by rajkumarpurushothaman on 4/11/17.
 */
public class Monitor {
    private String manufacturer;
    private String model;
    private Resolution resolution;
    private int size;

    public Monitor(String manufacturer, String model, Resolution resolution, int size) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.resolution = resolution;
        this.size = size;
    }

    public void drawPixel(int x, int y, String color) {
        System.out.println("Drawing pixel at" + x + " " + y + "location with color" + color);
    }
}
