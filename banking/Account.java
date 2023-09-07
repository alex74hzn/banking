package com.example.oop.banking;

public class Account {
    private long accountNumber;
    private double balance;
    private String errorMessage;

    public Account(long accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public void deposit(double amount){
        balance = balance + amount;
    }
    public void withDraw(double amount){
        if((amount <= balance)) {
            balance = balance - amount;
        }else{
            errorMessage = "НЕ-НЕ-НЕ!";
        }
    }
}