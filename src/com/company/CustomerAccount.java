package com.company;

public class CustomerAccount {

    public CustomerAccount(String accNumber, int balance) {

        if (balance < 0) {
            throw new IllegalArgumentException("Balance must be more than 0");
        }
        if (accNumber.length() != 24) {
            throw new IllegalArgumentException("Account number must have 24 chars");
        }
        this.accNumber = accNumber;
        this.balance = balance;
    }

    private String accNumber;
    private int balance;

    public String getAccNumber() {
        return accNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setAccNumber(String accNumber) {
        this.accNumber = accNumber;

    }

    public void setBalance(int balance) {
        this.balance = balance;
    }


}
