package com.company;

public class HandballLeague extends League{

    public HandballLeague(String name) {
        super(name);
    }

    public boolean addTeam(HandballTeam team) {
        if(teams.contains(team)){
            System.out.println(team.getName() + " is already in the league");
            return false;
        }
        teams.add(team);
        System.out.println(team.getName() + " has been added to the league");
        return true;
    }
}
