package com.company;

public class Healthy extends Burger{

    final static int saladPrice = 3;
    final static int cornPrice = 2;

    private int salad;
    private int corn;

    public Healthy(String breadRoll, String meat, int price, int salad, int corn) {
        super(breadRoll, meat, price);
        this.salad = salad;
        this.corn = corn;
    }




}
