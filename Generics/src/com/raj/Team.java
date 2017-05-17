package com.raj;

import java.util.ArrayList;

public class Team {

  private String name;
  private int played=0;
  private int won=0;
  private int lost=0;
  private int tied=0;

  private ArrayList<Player> members = new ArrayList<>();

  public Team(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public boolean addPlayer(Player player) {
    if(members.contains(player)) {
      System.out.println("The player is already on the team");
      return false;
    }
    else {
      System.out.println("New player " + player.getName() + " picked for "
      + this.name;
      members.add(player);
      return true;
    }
  }

}
