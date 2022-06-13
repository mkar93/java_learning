package com.company;

import java.util.HashSet;
import java.util.Set;

public final class HeavenlyBodyC {

    private final String name;
    private final double orbitalPeriod;
    private final Set<HeavenlyBodyC> satellites;
    private final BodyType bodyType;

    public HeavenlyBodyC(String name, double orbitalPeriod, BodyType bodyType) {
        this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        this.satellites = new HashSet<>();
        this.bodyType = bodyType;
    }

    public String getName() {
        return name;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public boolean addMoon(HeavenlyBodyC moon){
        return this.satellites.add(moon);
    }

    public Set<HeavenlyBodyC> getSatellites() {
        return new HashSet<>(this.satellites);
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        System.out.println("obj.getClass() is " + obj.getClass());
        System.out.println("this.getClass() is " + this.getClass());
        if(obj == null || (obj.getClass() != this.getClass())){
            return false;
        }
        String objName = ((HeavenlyBodyC) obj).getName();
        return this.name.equals(objName);
    }

    @Override
    public int hashCode() {
        System.out.println("hashCode called");
        return this.name.hashCode() + 57;
    }
}