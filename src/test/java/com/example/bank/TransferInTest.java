package com.example.bank;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TransferInTest {

    @Test
    void makeATransfer() {

    }
    @Test
    void MakeATransferSuccessfully(){
        double balance = 2000;
        String imie = "Janusz";
        String nazwisko = "Radeon";
        String nrKonta = "21424";
        String id = "33AA";
        Klient k1 = new Klient(balance,imie, nazwisko, nrKonta,id);
        accountVault.addClient(k1);
        TransferReceipt n2 = transferOut.MakeATransfer("33AA",1000);
        assertEquals(1000, n2.getCurrentBalance());
    }
}