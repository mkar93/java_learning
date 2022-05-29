package com.company;

import java.util.ArrayList;

public class FootballLeague extends League {

    ArrayList<FootballTeam> footballTeams;

    public FootballLeague(String name) {
        super(name);
        footballTeams = new ArrayList<>();
    }

    public void addTeam(FootballTeam team, int ranking) {
        if (footballTeams.contains(team)) {
            System.out.println(team.getName() + " is already in the league.");
        }
        footballTeams.add(ranking,team);
        System.out.println(team.getName() + " has been added to the league.");
    }
}


