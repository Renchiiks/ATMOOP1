package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);

        CustomerAccount customer1 = new CustomerAccount("AD1200012030200359100100", r.nextInt(500));
        CustomerAccount customer2 = new CustomerAccount("CZ6508000000192000145399", r.nextInt(500));

        List<CustomerAccount> accounts = new ArrayList<>();
        accounts.add(customer1);
        accounts.add(customer2);

        ATM atm = new ATM(r.nextInt(2000), accounts);

        do{
            System.out.println("Enter your account number:");

            while (accounts.contains())
        }

    }
}
