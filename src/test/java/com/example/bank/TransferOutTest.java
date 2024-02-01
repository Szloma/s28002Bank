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
class TransferOutTest {
    @Autowired
    private AccountVault accountVault;
    @Autowired
    private ClientData clientData;
    @Autowired
    private TransferOut transferOut;

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
    @Test
    void MakeATransferNotSuccessfully(){
        double balance = 2000;
        String imie = "Janusz";
        String nazwisko = "Radeon";
        String nrKonta = "21424";
        String id = "44AA";
        Klient k1 = new Klient(balance,imie, nazwisko, nrKonta,id);
        accountVault.addClient(k1);
        TransferReceipt n2 = transferOut.MakeATransfer("44AA",100000);
        assertNotEquals(0,n2);

    }


}