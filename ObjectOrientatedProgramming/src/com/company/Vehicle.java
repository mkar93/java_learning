package com.company;

public class Vehicle {

    private int steering;
    private int changingGears;
    private int movingSpeed;

    private int currentDirection;
    private int currentVelocity;

    public Vehicle(int steering, int changingGears, int movingSpeed, int currentDirection, int currentVelocity) {
        this.steering = steering;
        this.changingGears = changingGears;
        this.movingSpeed = movingSpeed;

        this.currentDirection = 0;
        this.currentVelocity = 0;
    }

    public void steer(int direction){
        this.currentDirection += direction;
        System.out.println("Vehicle.steer(): Steering at " + currentDirection + " degrees");
    }

    public void move(int velocity, int direction){
        currentDirection = direction;
        currentVelocity = velocity;
        System.out.println("Vehicle.move(): Moving at " + currentVelocity + " in direction " + currentDirection);
    }

    public int getSteering() {
        return steering;
    }

    public int getChangingGears() {
        return changingGears;
    }

    public int getMovingSpeed() {
        return movingSpeed;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public void stop(){
        this.currentVelocity = 0;
    }
}
