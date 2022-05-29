package com.company;


public class FootballLeague extends League{

    public FootballLeague(String name) {
        super(name);
    }


    public void addTeam(FootballTeam team) {
        if(teams.contains(team)){
            System.out.println(team.getName() + " is already in the league");
        }
        teams.add(team);
        System.out.println(team.getName() + " has been added to the league");
    }

}
