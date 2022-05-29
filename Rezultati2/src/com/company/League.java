package com.company;

import java.util.ArrayList;

public abstract class League<T extends Team<Team>> {

    private String name;
    private ArrayList<T> teams;

    public League(String name) {
        this.name = name;
        teams = new ArrayList<T>();
    }

    public void addTeam(T team){
        if(teams.contains(team)){
            System.out.println(team.getName() + " is already in the league.");
        }
        teams.add(team);
        System.out.println(team.getName() + " has been delegated to the league.");
    }
}
