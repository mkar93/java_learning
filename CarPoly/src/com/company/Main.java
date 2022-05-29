package com.company;

class Car{

    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    public Car(int cylinders, String name) {
        this.name = name;
        this.cylinders = cylinders;
        this.engine = true;
        this.wheels = 4;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String startEngine(){
        return getClass().getSimpleName() + " engine has started.";
    }
    public String accelerate(){
        return getClass().getSimpleName() + " is accelerating.";
    }
    public String brake(){
        return getClass().getSimpleName() + " is braking.";
    }
}

class Mitsubishi extends Car{
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine(){
        return getClass().getSimpleName() + " engine has started";
    }
    @Override
    public String accelerate(){
        return getClass().getSimpleName() + " is accelerating.";
    }
    @Override
    public String brake(){
        return getClass().getSimpleName() + " is braking.";
    }
}

class Holden extends Car{
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine(){
        return getClass().getSimpleName() + " engine has started";
    }
    @Override
    public String accelerate(){
        return getClass().getSimpleName() + " is accelerating.";
    }
    @Override
    public String brake(){
        return getClass().getSimpleName() + " is braking.";
    }
}

class Ford extends Car{
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine(){
        return getClass().getSimpleName() + " engine has started";
    }
    @Override
    public String accelerate(){
        return getClass().getSimpleName() + " is accelerating.";
    }
    @Override
    public String brake(){
        return getClass().getSimpleName() + " is braking.";
    }
}

public class Main {

    public static void main(String[] args) {


	// write your code here
    }
}
