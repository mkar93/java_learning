package com.company;

import java.util.ArrayList;

public class Branch {

    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String customerName, double initialTransaction){
        Customer newCustomer = findCustomer(customerName);
        if(newCustomer == null){
            newCustomer = new Customer(customerName,initialTransaction);
            customers.add(newCustomer);
            return true;
        }
        else return false;
    }

    /*public boolean newCustomer(String customerName, double initialTransaction){
        if(findCustomer(customerName) == null){
            for(int i=0;i<customers.size();i++){
                Customer customer = customers.get(i);
                if(customer.getName().equals(customerName)){
                    return false;
                }
                else{
                    customers.add(new Customer(customerName,initialTransaction));
                    return true;
                }
            }
        }
        return false;
    }
     */

    public boolean addCustomerTransaction(String customerName, double transaction){
        Customer customer = findCustomer(customerName);
        if(customer != null){
            customer.addTransaction(transaction);
            return true;
        }
        else return false;
    }

    /*public boolean addCustomerTransaction(String customerName, double transaction){
        if(findCustomer(customerName) == null){
            return false;
        }
        Customer customer = findCustomer(customerName);
        customer.addTransaction(transaction);
        return true;
    }
    */

    private Customer findCustomer(String customerName){
        for(int i=0;i<this.customers.size();i++){
            if(this.customers.get(i).getName().equals(customerName)){
                return this.customers.get(i);
            }
        }
        return null;
    }
}
