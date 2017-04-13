package com.raj;

/**
 * Created by rajkumarpurushothaman on 4/12/17.
 */
public class EnhancedPlayer {

    private String name;
    private int health=100;
    private String weapon;

    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;
        if(health>0 && health<100)
            this.health = health;
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        System.out.println("Curent Health : " + health);
        return health;
    }

    public String getWeapon() {
        return weapon;
    }

    public void loseHealth(int damage) {
        System.out.println("Player lost some health; Knocking off the damage - " + damage);
        this.health -= damage;
        if(this.health <=0) {
            System.out.println("Curent health of the player : " + this.health);
            System.out.println("Player Knocked Out!!");
        }
    }
}
