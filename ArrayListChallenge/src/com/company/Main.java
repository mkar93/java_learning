package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("0039 330, 4404");

    public static void main(String[] args) {

        boolean quit = false;
        startPhone();
        printActions();
        while(!quit){
            System.out.print("\nEnter action: (6 to show available actions)\t");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action){
                case 0:
                    System.out.println("\nShutting down....");
                    quit = true;
                    break;
                case 1: mobilePhone.printContactList(); break;
                case 2: addNewContact(); break;
                case 3: updateContact(); break;
                case 4: removeContact(); break;
                case 5: queryContact(); break;
                case 6: printActions(); break;

            }
        }
    }

    private static void addNewContact(){
        System.out.print("Enter new contact name: ");
        String name = scanner.nextLine();
        System.out.print("Enter phone number: ");
        String phone = scanner.nextLine();
        Contacts newContact = Contacts.createContact(name,phone);
        if(mobilePhone.addNewContact(newContact)){
            System.out.println("New contact added: " + name + " with the phone number: " + phone);
        }
        else System.out.println(name + " is already in contact list.");
    }

    private static void updateContact(){
        System.out.print("Enter contact name: ");
        String name = scanner.nextLine();
        Contacts existingContact = mobilePhone.queryContact(name);
        if(existingContact == null){
            System.out.println("Contact not found.");
        }
        System.out.print("Enter new contact name: ");
        String newName = scanner.nextLine();
        System.out.print("Enter new phone number: ");
        String newNumber = scanner.nextLine();
        Contacts newContact = Contacts.createContact(newName,newNumber);
        mobilePhone.updateContact(existingContact,newContact);
        if(mobilePhone.updateContact(existingContact,newContact)){
            System.out.println("Successfully updated contact.");
        }
        else System.out.println("Error updating contact.");
    }

    private static void removeContact() {
        System.out.print("Enter contact name: ");
        String name = scanner.nextLine();
        Contacts existingContact = mobilePhone.queryContact(name);
        if (existingContact == null) {
            System.out.println("Contact not found.");
        }

        if(mobilePhone.removeContact(existingContact)){
            System.out.println("Successfully deleted contact.");
        }
        else System.out.println("Error deleting contact.");
    }

    private static void queryContact() {
        System.out.println("Enter contact name: ");
        String name = scanner.nextLine();
        Contacts existingContact = mobilePhone.queryContact(name);
        if (existingContact == null) {
            System.out.println("Contact not found.");
        }

        System.out.println("Name: " + existingContact.getContactName() + " phone number is " + existingContact.getContactPhone());
    }

    private static void startPhone(){
        System.out.println("Starting phone....");
    }

    private static void printActions(){
        System.out.println("\nAvailable actions:\npress");
        System.out.println("0 - to shutdown\n" +
                "1 - to print contacts\n" +
                "2 - to add a new contact\n" +
                "3 - to update an existing contact\n" +
                "4 - to remove an existing contact\n" +
                "5 - query if an contact exists\n" +
                "6 - to print a list of available actions.");
        System.out.println("Choose your action: ");
    }
}
