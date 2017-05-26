package com.raj;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rajkumarpurushothaman on 5/21/17.
 */
public class League<T extends Team> {
  private String name;
  private List<T> listOfTeams;

  public League(String name) {
    this.name = name;
    this.listOfTeams = new ArrayList<T>();
  }

  public boolean addTeam(T team) {
    return this.listOfTeams.add(team);
  }

  public void printTable() {
    Collection.sort(listOfTeams);
    System.out.println(listOfTeams);
  }

}
