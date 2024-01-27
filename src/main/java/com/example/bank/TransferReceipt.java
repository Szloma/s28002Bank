package com.example.bank;

public class TransferReceipt {
    private double value;
    private double currentBalance;
    private STATUS S;
    TransferReceipt(double value, double currentBalance, STATUS S){
        this.value = value;
        this.currentBalance = currentBalance;
        this.S = S;
    }

    public STATUS getStatus() {
        return S;
    }

    public double getCurrentBalance() {
        return currentBalance;
    }

    public double getValue() {
        return value;
    }

    public void setCurrentBalance(double currentBalance) {
        this.currentBalance = currentBalance;
    }

    public void setValue(double value) {
        this.value = value;
    }
    public void printReceipt(){
        System.out.println("Amount of money transfered: "+ this.value + " Current balance: "+ this.currentBalance + " Operation status: " + this.S);
    }
}
