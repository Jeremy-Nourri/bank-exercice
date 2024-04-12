package org.example;

public class Transaction {
    private TypeOfTransaction type;
    private double amount;

    public Transaction(TypeOfTransaction type, double amount) {
        this.type = type;
        this.amount = amount;
    }

    public TypeOfTransaction getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }


    public void setType(TypeOfTransaction type) {
        this.type = type;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

}
