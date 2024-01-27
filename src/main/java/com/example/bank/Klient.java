package com.example.bank;

public class Klient {
    private double balance;
    private String name;
    private String nazwisko;
    private String nrKonta;
    private String ID;

    public String getName() {
        return name;
    }

    public void createNewClient(double balance, String name, String nazwisko, String nrKonta, String ID){
        this.balance= balance;
        this.name = name;
        this.nazwisko = nazwisko;
        this.nrKonta = nrKonta;
        this.ID = ID;
    }
    Klient(double balance, String name, String nazwisko, String nrKonta, String ID){
        this.balance= balance;
        this.name = name;
        this.nazwisko = nazwisko;
        this.nrKonta = nrKonta;
        this.ID = ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getID() {
        return ID;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public String getNrKonta() {
        return nrKonta;
    }

    public double getBalance() {
        return balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setNrKonta(String nrKonta) {
        this.nrKonta = nrKonta;
    }

}
