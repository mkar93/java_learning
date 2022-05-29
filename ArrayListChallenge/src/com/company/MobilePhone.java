package com.company;

import java.util.ArrayList;


public class MobilePhone {

    private String myNumber;
    private ArrayList<Contacts> contactList;

    public MobilePhone(String myNumber){
        this.myNumber = myNumber;
        this.contactList = new ArrayList<Contacts>();
    }

    public boolean addNewContact(Contacts contact){
        if(checkForDuplicate(contact.getContactName()) >= 0){
            System.out.println("Contact already exists.");
            return false;
        }
        contactList.add(contact);
        return true;
    }

    private int checkForDuplicate(Contacts contact){
        return this.contactList.indexOf(contact);
    }

    private int checkForDuplicate(String contactName){
        for(int i=0;i<this.contactList.size();i++){
            Contacts contact = this.contactList.get(i);
            if(contact.getContactName().equals(contactName)){
                return i;
            }
        }
        return -1;
    }

    public boolean updateContact(Contacts oldContact, Contacts newContact){
        int position = checkForDuplicate(oldContact);
        if(position < 0){
            System.out.println(oldContact.getContactName() + " was not found.");
            return false;
        }
        else if(findContact(newContact.getContactName())!= -1){
            System.out.print("Contact " + newContact.getContactName() + " already exists.");
            return false;
        }
        this.contactList.set(position,newContact);
        System.out.println(oldContact.getContactName() + " was replaced with " + newContact.getContactName());
        return true;
    }

    public boolean removeContact(Contacts contact){
        int position = checkForDuplicate(contact);
        if(position < 0){
            System.out.println(contact.getContactName() + " was not found.");
            return false;
        }
        this.contactList.remove(position);
        System.out.println(contact.getContactName() + " was deleted.");
        return true;
    }

    private int findContact(Contacts contact){
        return this.contactList.indexOf(contact);
    }

    private int findContact(String contactName){
        for(int i=0;i<this.contactList.size();i++){
            Contacts contact = this.contactList.get(i);
            if(contact.getContactName().equals(contactName)){
                return i;
            }
        }
        return -1;
    }

    public String queryContact(Contacts contact){
        if(checkForDuplicate(contact) >= 0){
            return contact.getContactName();
        }
        return null;
    }

    public Contacts queryContact(String name){
        int position = findContact(name);
        if(position >= 0){
            return this.contactList.get(position);
        }
        return null;
    }

    public void printContactList(){
        System.out.println("You have " + contactList.size() + " contacts in your contact list.");
        for(int i=0;i<contactList.size();i++){
            System.out.println((i+1) + ". " + contactList.get(i).getContactName() + " - " + contactList.get(i).getContactPhone());
        }
    }
}
