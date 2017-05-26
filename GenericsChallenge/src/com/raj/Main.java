package com.raj;

public class Main {

    public static void main(String[] args) {
      Team CSK = new CricketTeam("CSK");
      League<Team> IPL = new League("IPL");
      IPL.addTeam(CSK);


	// write your code here
    }
}
