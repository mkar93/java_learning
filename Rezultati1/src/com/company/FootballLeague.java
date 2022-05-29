package com.company;

import java.util.ArrayList;

public class FootballLeague extends League {

    ArrayList<FootballTeam> footballTeams;

    public FootballLeague(String leagueName) {
        super(leagueName);
        footballTeams = new ArrayList<>();
    }

    @Override
    public void addTeam(FootballTeam team, int ranking) {
        if(footballTeams.contains(team)){
            System.out.println(team.getName() + " is already in the league");
        }
        footballTeams.add(ranking,team);
        System.out.println(team.getName() + " has been delegated to the league");
    }

    @Override
    public void removeTeam(FootballTeam team) {
        if(footballTeams.contains(team)){
            footballTeams.remove(team);
            System.out.println(team.getName() + " has been relegated from the league");
        }
        System.out.println(team.getName() + " is not present in the league");

    }




}
