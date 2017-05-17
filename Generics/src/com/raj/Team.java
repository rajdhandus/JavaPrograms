package com.raj;

import java.util.ArrayList;

public class Team<T> {

  private String name;
  private int played=0;
  private int won=0;
  private int lost=0;
  private int tied=0;

  private ArrayList<T> members = new ArrayList<>();

  public Team(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public boolean addPlayer(T player) {
    if(members.contains(player)) {
      System.out.println("The player is already on the team");
      return false;
    }
    else {
      System.out.println("New player " + ((Player)player).getName() + " picked for "
      + this.name);
      members.add(player);
      return true;
    }
  }

  public int numOfPlayers() {
    return this.members.size();
  }

  public void matchResult(Team opponent, int ourScore, int theirScore) {
    if(ourScore>theirScore) {
      won++;
    }
    else if(ourScore<theirScore) {
      lost++;
    }
    else {
      tied++;
    }
    if(opponent!=null) {
      opponent.matchResult(null, theirScore, ourScore);
    }
  }

  public int rankings() {
    return (this.won * 2) + this.tied;
  }


}
