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
public class Main {

    public static void main(String[] args) {
        CellPhone samsung = new CellPhone();
        Scanner scanner = new Scanner(System.in);

        boolean isRunning = true;
        while (isRunning) {
            System.out.println("1. Power On");
            System.out.println("2. Power Off");
            System.out.println("3. Besarkan Volume");
            System.out.println("4. Kecilkan Volume");
            System.out.println("5. Top up pulsa");
            System.out.println("6. Lihat Pulsa");
            System.out.println("7. Atambah Kontak");
            System.out.println("8. Lihat semua kontak");
            System.out.println("9. Cari Kontak");
            System.out.println("10. Exit");
            System.out.print("Pilih  : ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    samsung.powerOn();
                    break;
                case 2:
                    samsung.powerOff();
                    break;
                case 3:
                    samsung.increaseVolume();
                    break;
                case 4:
                    samsung.decreaseVolume();
                    break;
                case 5:
                    System.out.print("Ketikan pulsa anda: Rp.");
                    double amount = scanner.nextDouble();
                    samsung.topUpBalance(amount);
                    break;
                case 6:
                    System.out.println("Balance: $" + samsung.getBalance());
                    break;
                case 7:
                    System.out.print("Enter nama kontak: ");
                    scanner.nextLine();
                    String name = scanner.nextLine();
                    System.out.print("Enter kontak nomor: ");
                    String phoneNumber = scanner.nextLine();
                    samsung.addContact(name, phoneNumber);
                    break;
                case 8:
                    samsung.viewAllContacts();
                    break;
                case 9:
                    System.out.print("Enter kontak nama untuk mencari: ");
                    scanner.nextLine();
                    String searchName = scanner.nextLine();
                    samsung.searchContact(searchName);
                    break;
                case 10:
                    isRunning = false;
                    System.out.println("Keluar");
                    break;
                default:
                    System.out.println("Anda salah pilih silahakan coba lagi");
                    break;
            }
            System.out.println();
        }

        scanner.close();
    }
}

