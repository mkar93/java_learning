package com.company;

public class Burger {

    final static int lettucePrice = 1;
    final static int tomatoPrice = 2;
    final static int carrotPrice = 1;
    final static int cheesePrice = 3;

    private String breadRoll;
    private String meat;
    private int lettuce;
    private int tomato;
    private int carrot;
    private int cheese;

    private int price = 5;

    public Burger(){

    }

    public Burger(String breadRoll, String meat, int price) {
        this.breadRoll = breadRoll;
        this.meat = meat;
        this.price = price;
    }

    public int getPrice() {
        return this.price;
    }

    public int getLettucePrice(){
        System.out.print("\nPrice of one lettuce is ");
        return lettucePrice;
    }
    public int getTomatoPrice(){
        System.out.print("\nPrice of one tomato is ");
        return tomatoPrice;
    }
    public int getCarrotPrice(){
        System.out.print("\nPrice of one carrot is ");
        return carrotPrice;
    }
    public int getCheesePrice(){
        System.out.print("\nPrice of one cheese is ");
        return cheesePrice;
    }

    public int totalPrice(int lettuce, int tomato, int carrot, int cheese){
        return (lettuce*lettucePrice) + (tomato*tomatoPrice) + (carrot*carrotPrice) + (cheese*cheesePrice) + this.price;
    }
}
