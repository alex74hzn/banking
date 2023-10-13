package com.example.oop.banking;

public class CurrentAccount extends Account {
    private double overDraftLimit;

    public CurrentAccount(long accountNumber, double balance, double overDraftLimit) {
        super(accountNumber, balance);
        this.overDraftLimit = overDraftLimit;
    }

    public double getOverDraftLimit() {
        return overDraftLimit;
    }

    public void setOverDraftLimit(double overDraftLimit) {
        this.overDraftLimit = overDraftLimit;
    }

    public void withDraw(double amount){
        double money = getBalance();
        if((money - amount) < 0 && Math.abs(money - amount) > getOverDraftLimit()){
            this.setErrorMessage("Недостаточно средств!");
        }
        else{
            super.withDraw(amount);
            setMessage("Операция завершена успешно.");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CurrentAccount that)) return false;

        return Double.compare(that.overDraftLimit, overDraftLimit) == 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(overDraftLimit);
        return (int) (temp ^ (temp >>> 32));
    }

    public String toString(){
        return " Card number: " + getAccountNumber()
                + "\n Balance: " + getBalance()
                + "\n Overdraft limit: " + this.overDraftLimit +"\n";
    }
}
