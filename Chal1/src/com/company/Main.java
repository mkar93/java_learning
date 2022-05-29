package com.company;

public class Main {

    public static void main(String[] args) {


        FootballLeague championship = new FootballLeague("Championship");
        HandballLeague leagueOne = new HandballLeague("France One");

        FootballTeam chelsea = new FootballTeam("Chelsea");
        HandballTeam psg = new HandballTeam("PSG");

        championship.addTeam(chelsea);

        //championship.addTeam(psg);

        leagueOne.addTeam(psg);
        //leagueOne.addTeam(chelsea);


    }
}
