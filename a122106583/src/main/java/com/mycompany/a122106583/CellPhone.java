/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.a122106583;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class CellPhone implements Phone {
    private boolean isPowerOn;
    private int volume;
    private double balance;
    private ArrayList<Contact> contacts;

    public CellPhone() {
        isPowerOn = false;
        volume = 0;
        balance = 0.0;
        contacts = new ArrayList<>();
    }

    @Override
    public void powerOn() {
        isPowerOn = true;
        System.out.println("Phone powered on");
    }

    @Override
    public void powerOff() {
        isPowerOn = false;
        System.out.println("Phone powered off");
    }

    @Override
    public void increaseVolume() {
        if (isPowerOn) {
            volume++;
            System.out.println("Volume increased: " + volume);
        } else {
            System.out.println("Please turn on the phone first");
        }
    }

    @Override
    public void decreaseVolume() {
        if (isPowerOn) {
            volume--;
            System.out.println("Volume decreased: " + volume);
        } else {
            System.out.println("Please turn on the phone first");
        }
    }

    @Override
    public void topUpBalance(double amount) {
        if (isPowerOn) {
            balance += amount;
            System.out.println("Balance topped up: $" + amount);
        } else {
            System.out.println("Please turn on the phone first");
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public void addContact(String name, String phoneNumber) {
        if (isPowerOn) {
            Contact contact = new Contact(name, phoneNumber);
            contacts.add(contact);
            System.out.println("Contact added: " + name + " - " + phoneNumber);
        } else {
            System.out.println("Nyalakan HP terlebih dahuluu");
        }
    }

    @Override
    public void viewAllContacts() {
        if (isPowerOn) {
            if (contacts.isEmpty()) {
                System.out.println("Kontak tidak di temukan");
            } else {
                System.out.println("Semua Kontak:");
                for (Contact contact : contacts) {
                    System.out.println(contact.getName() + " - " + contact.getPhoneNumber());
                }
            }
        } else {
            System.out.println("Silahkan nyalakan HP terlebih dahulu");
        }
    }

    @Override
    public void searchContact(String name) {
        if (isPowerOn) {
            boolean found = false;
            for (Contact contact : contacts) {
                if (contact.getName().equalsIgnoreCase(name)) {
                    System.out.println("Contact found:");
                    System.out.println(contact.getName() + " - " + contact.getPhoneNumber());
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("Contact not found");
            }
        } else {
            System.out.println("Please turn on the phone first");
        }
    }
}


