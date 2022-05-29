package com.company;

public class Deluxe extends Burger{

    final static int drinkPrice = 5;
    final static int chipsPrice = 5;

    private int drink;
    private int chips;

    public Deluxe(int drink, int chips) {
        this.drink = drink;
        this.chips = chips;
    }

    public int basePrice(Burger price){
        return price.getPrice();
    }


}
