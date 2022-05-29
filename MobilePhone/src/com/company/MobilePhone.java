package com.company;

import java.util.ArrayList;

public class MobilePhone {

    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }


    public boolean addNewContact(Contact newContact){
        if(findContact(newContact.getName()) >= 0){
            System.out.println(newContact.getName() + " already exists in contact list.");
            return false;
        }
        else {
            myContacts.add(newContact);
            return true;
        }
    }

    public boolean updateContact(Contact oldContact, Contact newContact){
        int listPosition = findContact(oldContact);
        if(listPosition < 0){
            System.out.println(oldContact.getName() + " was not found in contact list.");
            return false;
        }
        else if(newContact.getName().equals(oldContact.getName())){
            System.out.println("Contact " + newContact.getName() + " already exists.");
            return false;
        }
        else{
            this.myContacts.set(listPosition,newContact);
            System.out.println(oldContact.getName() + " was replaced with " + newContact.getName());
            return true;
        }
    }

    public boolean removeContact(Contact contact){
        int listPosition = findContact(contact);
        if(listPosition < 0){
            System.out.println(contact.getName() + " was not found in contact list.");
            return false;
        }
        else{
            this.myContacts.remove(listPosition);
            System.out.println(contact.getName() + " was removed from contact list.");
            return true;
        }
    }

    private int findContact(Contact contact){
        return findContact(contact.getName());
    }

    private int findContact(String contactName){
        for(int i=0;i<this.myContacts.size();i++){
            Contact contact = this.myContacts.get(i);
            if(contact.getName().equals(contactName)){
                return i;
            }
        }
        return -1;
    }

    public Contact queryContact(String contact){
        int listPosition = findContact(contact);
        if(listPosition >= 0){
            return this.myContacts.get(listPosition);
        }
        else return null;
    }

    public void printContacts(){
        System.out.println("Contact List:");
        for(int i=0;i<myContacts.size();i++){
            System.out.println((i+1) + ". " + myContacts.get(i).getName() + " -> " + myContacts.get(i).getPhoneNumber());
        }
    }
}
