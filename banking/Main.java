package com.example.oop.banking;

public class Main {
    public static void main(String[] args) {
        Account current = new CurrentAccount(2435352, 500.0, 200);
        Account saving = new SavingsAccount(2837467, 390, 3.2);
        System.out.println(current.toString());
        current.deposit(150);
        System.out.println(current.toString());
        System.out.println("balance: " + current.getBalance());
        System.out.println(current.getMessage());

        System.out.println(saving.toString());
        saving.addInterest();
        System.out.println(saving.toString());
        saving.withDraw(100);
        System.out.println(saving.getMessage());

        saving.withDraw(12);
        System.out.println(saving.getMessage());
        System.out.println("balance: " + saving.getBalance());
    }
}
