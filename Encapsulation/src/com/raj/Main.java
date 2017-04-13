package com.raj;

public class Main {

    public static void main(String[] args) {
        EnhancedPlayer player = new EnhancedPlayer("Raj", 100, "Coding");
        player.getHealth();
        player.loseHealth(50);
        player.getHealth();
        player.loseHealth(50);


    }
}
