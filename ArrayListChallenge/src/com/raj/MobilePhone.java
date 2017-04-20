package com.raj;

import java.util.ArrayList;

/**
 * Created by rajkumarpurushothaman on 4/19/17.
 *
 * public vs private ?
 * new ArrayList<Contacts>(); inside or outside constructor?
 * getContactList() vs this.contactList?
 * defensive programming with checks before update / delete
 * factory method pattern for creating objects
 * no setters for Contacts?
 */
public class MobilePhone {
    private ArrayList<Contacts> contactList = new ArrayList<Contacts>();

    public ArrayList<Contacts> getContactList() {
        return contactList;
    }

    public void printAllContacts() {

        if(getContactList().size()>0) {
            for (Contacts contact: getContactList()) {
                System.out.println(contact.toString());
            }
        }
        else
            System.out.println("No contacts saved in your phone");
    }

    public void addContact(Contacts contact) {
        contactList.add(contact);
    }

    public void modifyContact(String oldContact, String newContact, boolean modifyName) {
        int position = findContact(oldContact);
        Contacts modifiedContact = getContactList().get(position);
        if(modifyName)
            modifiedContact.setName(newContact);
        else
            modifiedContact.setPhoneNumber(newContact);
        contactList.set(position,modifiedContact);
    }

    public void modifyContact(Contacts oldContact, Contacts newContact) {
        int position = findContact(oldContact);
        contactList.set(position,newContact);
    }

    public void removeContact(String name) {
        int position = findContact(name);
        contactList.remove(position);
    }

    public void removeContact(Contacts theContact) {
        int position = findContact(theContact);
        contactList.remove(position);
    }


    public Contacts getContact(String name) {
        int position = findContact(name);
        return getContactList().get(position);
    }

    public int findContact(String name) {
        for(Contacts theContact: getContactList()){
            if(theContact.getName().equals(name))
                return getContactList().indexOf(theContact);
        }
        return -1;
    }

    public int findContact(Contacts theContact) {
        return contactList.indexOf(theContact);
    }

}
