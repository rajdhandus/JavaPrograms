package com.raj;

/**
 * Created by rajkumarpurushothaman on 4/11/17.
 */
public class Resolution {
    private int height;
    private int width;
    private int pixleCount;

    public Resolution(int height, int width, int pixleCount) {
        this.height = height;
        this.width = width;
        this.pixleCount = pixleCount;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int getPixleCount() {
        return pixleCount;
    }
}
