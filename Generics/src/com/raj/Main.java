package com.raj;

public class Main {

    public static void main(String[] args) {
        BaseballPlayer b1 = new BaseballPlayer("b1");
        SoccerPlayer s1 = new SoccerPlayer("s1");
        FootballPlayer f1 = new FootballPlayer("f1");

        Team<BaseballPlayer> yankees = new Team<>("NY Yankees");
        yankees.addPlayer(b1);

        Team<SoccerPlayer> manU = new Team<>("Manchester United");
        manU.addPlayer(s1);

//        Team<String> brokenCode = new Team<>("Broken Code");
//        brokenCode.addPlayer("Some stuff");
        
    }
}
