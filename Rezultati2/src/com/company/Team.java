package com.company;

public abstract class Team<F extends Team> {
    private String name;

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
