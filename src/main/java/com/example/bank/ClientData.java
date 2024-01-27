package com.example.bank;

import org.springframework.stereotype.Service;

import java.sql.SQLOutput;

@Service
public class ClientData {
    private final AccountVault accountVault;

    ClientData(AccountVault accountVault){
        this.accountVault= accountVault;
    }
    void Show(String ID){
        Klient k = accountVault.findClientById(ID);
        System.out.println(
                "Name: " + k.getName()+ " Surname: " + k.getNazwisko()+
                " Balance: " + k.getBalance()+ "zł Account: "+k.getNrKonta()
        );
    }
}
