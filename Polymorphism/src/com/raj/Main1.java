package com.raj;

/**
 * Created by rajkumarpurushothaman on 4/13/17.
 */

class Parent {
    private String name;
    private String childName;

    public Parent(String name, String childName) {
        this.name = name;
        this.childName = childName;
    }
}

class Child1 extends Parent {

    public Child1(String childName) {
        super("Parent", childName);
    }
}


class Child2 extends Parent {

    public Child2(String childName) {
        super("Parent", childName);
    }
}

public class Main1 {
}
