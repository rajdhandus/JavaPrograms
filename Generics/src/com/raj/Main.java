package com.raj;

public class Main {

    public static void main(String[] args) {
        BaseballPlayer b1 = new BaseballPlayer("b1");
        SoccerPlayer s1 = new SoccerPlayer("s1");
        FootballPlayer brady = new FootballPlayer("Tom Brady");
        FootballPlayer manning = new FootballPlayer("Eli Manning");

        Team<BaseballPlayer> yankees = new Team<>("NY Yankees");
        yankees.addPlayer(b1);

        Team<SoccerPlayer> manU = new Team<>("Manchester United");
        manU.addPlayer(s1);

        Team<FootballPlayer> nePatriots = new Team<>("NE Patriots");
        nePatriots.addPlayer(brady);

        Team<FootballPlayer> nyJets = new Team<>("NY Jets");
        nyJets.addPlayer(manning);

        nePatriots.matchResult(nyJets, 21, 30);

        System.out.println("Rankings");
        System.out.println(nyJets.getName() + " : "+nyJets.rankings());
        System.out.println(nePatriots.getName()+" : " +nePatriots.rankings());

//        nePatriots.matchResult(manU,21,30);

//        Team<String> brokenCode = new Team<>("Broken Code");
//        brokenCode.addPlayer("Some stuff");
    }
}
