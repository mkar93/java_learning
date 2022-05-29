package com.company;

public class VipCustomer {
    private String name;
    private int creditLimit;
    private String emailAdress;

    public VipCustomer(){
        this("Marin", 150000, "marin@email.com");
    }

    public VipCustomer(String name, int creditLimit){
        this(name, creditLimit, "unknown@email.com");
    }

    public VipCustomer(String name, int creditLimit, String emailAdress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAdress = emailAdress;
    }

    public String getName() {
        return name;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAdress() {
        return emailAdress;
    }
}
