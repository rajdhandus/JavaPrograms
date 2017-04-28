package com.raj;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rajkumarpurushothaman on 4/27/17.
 */
public class Player implements ISaveable {

    private String name;
    private int hits;
    private int strength;
    private String weapon;

    public Player(String name, int hits, int strength) {
        this.name = name;
        this.hits = hits;
        this.strength = strength;
        this.weapon = "Sword";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHits() {
        return hits;
    }

    public void setHits(int hits) {
        this.hits = hits;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    //save the state of Player to an object and return

    @Override
    public List<String> saveToSaveable() {
        List<String> list = new ArrayList<>();
        list.add(0,this.name);
        list.add(1,""+this.hits);
        list.add(2,""+this.strength);
        list.add(3,this.weapon);
        return list;
    }

    //restore the state of the Player from an object

    @Override
    public void readFromSaveable(List<String> values) {
        if(values!=null && values.size()>0) {
            this.name = values.get(0);
            this.hits = Integer.parseInt(values.get(1));
            this.strength = Integer.parseInt(values.get(2));
            this.weapon = values.get(3);
        }
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", hits=" + hits +
                ", strength=" + strength +
                ", weapon='" + weapon + '\'' +
                '}';
    }
}
