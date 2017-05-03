package com.raj;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog("Tiger");
        dog.breathe();
        dog.eat();

        dog = new Dog("Rosie");
        dog.eat();
        dog.breathe();

        Parrot parrot = new Parrot("Parrot");
        parrot.breathe();
        parrot.eat();
        parrot.fly();

        Penguin penguin = new Penguin("Penguin");
        penguin.breathe();
        penguin.eat();
        penguin.fly();
    }
}
