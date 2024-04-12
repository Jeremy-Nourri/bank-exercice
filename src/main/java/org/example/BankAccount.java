package org.example;

public abstract class BankAccount {
    private double balance = 0;
    private Customer customer;
    private Transaction[] transactions;

    public BankAccount(Customer customer) {
        this.customer = customer;
    }

    public double getBalance() {
        return balance;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Transaction[] getTransactions() {
        return transactions;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setTransactions(Transaction[] transactions) {
        this.transactions = transactions;
    }


}
