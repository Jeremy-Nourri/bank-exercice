package org.example;

public class Customer {
    private final String firstName;
    private final String lastName;
    private int phoneNumber;
    private final int id;
    protected BankAccount[] accounts;

    public Customer(String firstName, String lastName, int phoneNumber, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public int getId() {
        return id;
    }

    public BankAccount[] getAccounts() {
        return accounts;
    }


    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void addAccount(BankAccount account) {
        BankAccount[] newAccounts = new BankAccount[accounts.length + 1];
        for (int i = 0; i < accounts.length; i++) {
            newAccounts[i] = accounts[i];
        }
        newAccounts[accounts.length] = account;
        accounts = newAccounts;
    }

//    public void displayAccounts() {
//        for (BankAccount account : accounts) {
//            System.out.println(account);
//        }
//    }

}
