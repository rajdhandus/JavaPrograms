package com.raj;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal("Animal", 1, 1, 100, 6);

        Dog dog = new Dog("Tiger", 100, 6, 4, 2, 1, 30, "short hair");

        dog.eat();
    }
}
