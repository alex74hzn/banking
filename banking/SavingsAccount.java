package com.example.oop.banking;

public class SavingsAccount extends Account{
    private double interestRate;

    private static double FROZEN_PART;
    public SavingsAccount(long accountNumber, double balance, double _interestRate) {
        super(accountNumber, balance);
        interestRate = _interestRate;
        FROZEN_PART = balance;
    }
    public static double getFrozenPart() {
        return FROZEN_PART;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public void addInterest(){
        double interest = getBalance() / 100 * interestRate;
        deposit(interest);
    }

    public void withDraw(double amount){
        double profit = getBalance() - FROZEN_PART;
        if(amount > profit){
            setErrorMessage("Вы можете снять только проценты: " + profit );
        }
        else{
            double balance = getBalance() - amount;
            setBalance(balance);

        }
    }
    public String toString(){
        return "Card number: " + getAccountNumber()
                + "\n Balance: " + getBalance()
                + "\n Interest rate: " + this.interestRate +"\n";
    }
}