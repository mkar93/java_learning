package com.company;

import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        /*
        FootballLeague footballLeague = new FootballLeague("Football League");

        footballLeague.addTeam("Barcelona", 1);

        League football = new League<>("Football");
        football.addTeam("Barcelona", 1);
        */

        FootballTeam barcelona = new FootballTeam("Barcelona");

        //League football = new League<>("Football League");

        //League basketball = new League("Basketball League");
        //football.addTeam(barcelona,1);

        //basketball.addTeam(barcelona)

        /*
        BasketballTeam psg = new BasketballTeam("PSG");

        BasketballLeague leagueOne = new BasketballLeague("League One");

        leagueOne.addTeam(psg, 1);
        */

        FootballLeague championship = new FootballLeague("Championship");
        FootballTeam chelsea = new FootballTeam("Chelsea");
        FootballTeam arsenal = new FootballTeam("Arsenal");

        championship.addTeam(chelsea,3);

        championship.addTeam(barcelona,2);

        //championship.addTeam(psg,1);

        championship.addTeam(arsenal,1);


        System.out.println(championship);

        //football.addTeam(psg,2);
    }
}
