package com.company;

import java.util.List;

public class ATM {

    public ATM(int amountAvailable, List<CustomerAccount> customerAccounts) {

        if (amountAvailable == 0) {
            throw new IllegalArgumentException("Balance in ATM is can't be 0");
        }

        this.amountAvailable = amountAvailable;
        this.customerAccounts = customerAccounts.toArray(new CustomerAccount[0]);
    }

    private int amountAvailable;
    private CustomerAccount[] customerAccounts;

    public int getAmountAvailable() {
        return amountAvailable;
    }


    public CustomerAccount[] getCustomerAccounts() {
        return customerAccounts;
    }

    public void setAmountAvailable(int amountAvailable) {
        this.amountAvailable = amountAvailable;
    }

    public void setCustomerAccounts(CustomerAccount[] customerAccounts) {
        this.customerAccounts = customerAccounts;
    }


}
