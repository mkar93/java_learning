package com.company;


import java.util.ArrayList;

public class CONT_TEST {

    private ArrayList<String> contactList = new ArrayList<String>();

    public void addContactName(String name){
        int check = checkForDuplicate(name);
        if(check >= 0){
            System.out.println("Name already exists.");
        }
        else contactList.add(name);
    }

    public int checkForDuplicate(String checkItem){
        return contactList.indexOf(checkItem);
    }

    public void addContactNumber(String number){
        int check = checkForDuplicate(number);
        if(check >= 0){
            System.out.println("Number already exists.");
        }
        else contactList.add(number);
    }

    public void removeContact(String name, String number){

    }

    public void removeContact(int position){

    }


}
