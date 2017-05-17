package com.raj;

public class Main {

    public static void main(String[] args) {
        BaseballPlayer b1 = new BaseballPlayer("b1");
        SoccerPlayer s1 = new SoccerPlayer("s1");
        FootballPlayer f1 = new FootballPlayer("f1");

        Team<FootballPlayer> csk = new Team<>("CSK");

//        csk.addPlayer(b1);
//        csk.addPlayer(s1);
        csk.addPlayer(f1);

        System.out.println("CSK has " + csk.numOfPlayers()+ " players");

    }
}
