package com.company;

import java.util.ArrayList;

public class HandballLeague extends League{

    ArrayList<HandballTeam> handballTeams;

    public HandballLeague(String name) {
        super(name);
        handballTeams = new ArrayList<>();
    }

    public void addTeam(HandballTeam team) {
        if(handballTeams.contains(team)){
            System.out.println(team.getName() + " is already in the league.");
        }
        handballTeams.add(team);
        System.out.println(team.getName() + " has been added to the league.");
    }
}
