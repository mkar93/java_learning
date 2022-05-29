package com.company;

import java.util.ArrayList;

public class Branches {

    private ArrayList<Customers> customer;

    public Branches(ArrayList<Customers> customer) {
        this.customer = customer;
    }


    private int checkCustomer(Customers customer){
        return checkCustomer(customer.getName());
    }

    private int checkCustomer(String customerName){
        for(int i=0;i<this.customer.size();i++){
            Customers customer = this.customer.get(i);
            if(customer.getName().equals(customerName)){
                return i;
            }
        }
        return -1;
    }

    public void addNewCustomer(Customers newCustomer){
        if(checkCustomer(newCustomer.getName()) >= 0){
            System.out.println(newCustomer.getName() + " already exists.");
        }
        else customer.add(newCustomer);
    }

    public void printCustomers(){
        System.out.println("Customer list:");
        for(int i=0;i<customer.size();i++){
            System.out.println((i+1) + ". " + customer.get(i).getName() + " -> " + customer.get(i).getTransactions());
        }
    }


}
