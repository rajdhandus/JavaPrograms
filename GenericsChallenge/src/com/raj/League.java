package com.raj;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by rajkumarpurushothaman on 5/21/17.
 */
public class League<T extends Team> {
  private String name;
  private List<T> listOfTeams;

  public League(String name) {
    this.name = name;
    this.listOfTeams = new LinkedList<T>();
  }

  public boolean addTeam(T team) {
      return false;
  }

  public void printTable() {
    System.out.println();
  }

}
