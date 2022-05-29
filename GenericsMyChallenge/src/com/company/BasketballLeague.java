package com.company;

public class BasketballLeague extends League implements InterfaceAddTeam{

    public BasketballLeague(String name) {
        super(name);
    }

    @Override
    public boolean addTeam(BasketballTeam team, int ranking) {
        return super.addTeam(team, ranking);
    }
}
