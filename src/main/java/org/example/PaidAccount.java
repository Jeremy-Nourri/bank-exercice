package org.example;

public class PaidAccount extends BankAccount {
    public PaidAccount(Customer customer, double balance) {
        super(customer);
        setBalance(balance);
    }


}