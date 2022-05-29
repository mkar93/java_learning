package com.company;

import java.util.Collections;

public class Main {


    public static void main(String[] args) {

        FootballLeague premiership = new FootballLeague("Premiership");
        HandballLeague leagueOne = new HandballLeague("League One");

        FootballTeam barcelona = new FootballTeam("Barcelona");
        FootballTeam chelsea = new FootballTeam("Chelsea");
        FootballTeam hajduk = new FootballTeam("Hajduk");
        FootballTeam dinamo = new FootballTeam("Dinamo");
        HandballTeam psg = new HandballTeam("PSG");

        premiership.addTeam(barcelona,1);
        premiership.addTeam(chelsea,3);
        premiership.addTeam(hajduk,2);
        premiership.addTeam(dinamo,4);

        //premiership.addTeam(psg);
    }


}
