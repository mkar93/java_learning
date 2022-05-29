package com.company;

import java.util.ArrayList;

public abstract class League<T extends Team> {

    private String name;

    private ArrayList<Team<T>> teams = new ArrayList<Team<T>>();

    public League(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public boolean addTeam(T team, int ranking){
        if(teams.contains(team)){
            System.out.println(team.getName() + " is already in the league");
            return false;
        }
        else{
            teams.add(ranking,team);
            System.out.println(team.getName() + " has been added to the league");
            return true;
        }
    }

}
