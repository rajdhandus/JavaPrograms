package com.raj;

/**
 * Created by rajkumarpurushothaman on 4/11/17.
 */
public class PC {
    private Case theCase;
    private Motherboard motherboard;
    private Monitor monitor;

    public PC(Case theCase, Motherboard motherboard, Monitor monitor) {
        this.theCase = theCase;
        this.motherboard = motherboard;
        this.monitor = monitor;
    }

    public Case getTheCase() {
        return theCase;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }

    public Monitor getMonitor() {
        return monitor;
    }
}
