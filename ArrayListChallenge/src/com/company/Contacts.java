package com.company;

public class Contacts {

    private String contactName;
    private String contactPhone;

    public Contacts(String contactName, String contactPhone) {
        this.contactName = contactName;
        this.contactPhone = contactPhone;
    }

    public String getContactName(){
        return contactName;
    }

    public String getContactPhone(){
        return contactPhone;
    }

    public static Contacts createContact(String contactName, String contactPhone){
        return new Contacts(contactName, contactPhone);
    }
}
