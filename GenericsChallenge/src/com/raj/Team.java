package com.raj;

public class Team {
  private String name;
  private int points;

  public Team(String name) {
    this.name = name;
    this.points = 0;
  }

  public int compareTo(Team otherTeam) {
    if(this.points>otherTeam.points) {
      return 1;
    }
    else if(this.points<otherTeam.points) {
      return -1;
    }
    else {
      return 0;
    }
  }

}
