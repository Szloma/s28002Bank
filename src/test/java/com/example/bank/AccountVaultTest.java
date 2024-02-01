package com.example.bank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class AccountVaultTest {
    @Autowired
    AccountVault accountVault;
    @Autowired
    TransferOut transferOut;

    @Test
    void createAclient(){
        double balance = 1000;
        String imie = "Janusz";
        String nazwisko = "Radeon";
        String nrKonta = "21424";
        String id = "33AA";
        Klient k1 = new Klient(balance,imie, nazwisko, nrKonta,id);
        accountVault.addClient(k1);
    }
    @Test
    void createSecondClient(){
        double balance = 1000;
        String imie = "Janusz";
        String nazwisko = "Radeon";
        String nrKonta = "21424";
        String id = "33AA";
        Klient k1 = new Klient(balance,imie, nazwisko, nrKonta,id);
        double balance2 = 2000;
        String imie2 = "Adrian";
        String nazwisko2 = "Puchacki";
        String nrKonta2 = "33333";
        String id2 = "33AA";
        Klient k2 = new Klient(balance2,imie2, nazwisko2, nrKonta2,id2);
        accountVault.addClient(k2);
    }

}