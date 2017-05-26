package com.raj;

public class Team<T> implements Comparable<Team<T>>{
  private String name;
  private int points;

  public Team(String name) {
    this.name = name;
    this.points = 0;
  }

  @Override
  public int compareTo(Team<T> otherTeam) {
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
