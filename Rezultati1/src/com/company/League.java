package com.company;

public abstract class League {

    private String leagueName;


    public League(String leagueName) {
        this.leagueName = leagueName;
    }

    public abstract void addTeam(FootballTeam team, int ranking);
    public abstract void removeTeam(FootballTeam team);



}
