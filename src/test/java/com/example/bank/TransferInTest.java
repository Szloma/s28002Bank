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

@SpringBootTest
class TransferInTest {
    @Autowired
    private AccountVault accountVault;
    @Autowired
    private ClientData clientData;
    @Autowired
    private TransferIn transferIn;

    @Test
    void makeATransfer() {

    }
    @Test
    void MakeATransferSuccessfully(){
        double balance = 2000;
        String imie = "Janusz";
        String nazwisko = "Radeon";
        String nrKonta = "21424";
        String id = "99BB";
        Klient k1 = new Klient(balance,imie, nazwisko, nrKonta,id);
        accountVault.addClient(k1);
        TransferReceipt n2 = transferIn.MakeATransfer("99BB",1000);
        assertEquals(3000, n2.getCurrentBalance());
    }
    @Test
    void MakeATransferNotSUccessfully(){
        TransferReceipt n2 = transferIn.MakeATransfer("1111BB",1000);
        assertEquals(n2.getStatus(), STATUS.DECLINED);
    }
}