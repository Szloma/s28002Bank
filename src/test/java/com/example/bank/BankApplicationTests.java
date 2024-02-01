package com.example.bank;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.containsString;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.springframework.test.util.AssertionErrors.assertEquals;

@SpringBootTest
class BankApplicationTests {
    @Autowired
    private AccountVault accountVault;
    @Autowired
    private ClientData clientData;
    @Autowired
    private TransferOut transferOut;
    @Autowired
    private TransferIn transferIn;
    @Test
    void contextLoads() {
    }
    @Test
    void SampleOperation(){
        Klient k1 = new Klient(100000,"Damian", "Argentyński", "123455678912345", "QD11");

        TransferReceipt n2 = transferOut.MakeATransfer("AA22", 1000000);

        //transferOut.MakeATransfer("AA22",100000000);
        //clientData.Show("QD11");
        //clientData.Show("AA22");
        assertNotEquals(n2.getStatus(), STATUS.ACCEPTED);
    }
    @Test
    void SampleOperation2(){
        Klient k2 = new Klient(200000,"Janusz", "Zielonoskory", "123455678954321", "AA22");
        TransferReceipt n3 = transferIn.MakeATransfer("AA22", 10000);
        String testString = n3.printReceipt();
        assertTrue(!testString.isEmpty());
    }


}
