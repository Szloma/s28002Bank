package com.example.bank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BankApplication {
    private final AccountVault accountVault;
    private final ClientData clientData;

    private final TransferOut transferOut;
    private final TransferIn transferIn;

    public BankApplication(AccountVault accountVault){
        this.accountVault =accountVault;
        this.clientData = new ClientData(accountVault);
        this.transferOut = new TransferOut(accountVault);
        this.transferIn = new TransferIn(accountVault);
        exec();
    }

    public static void main(String[] args) {
        SpringApplication.run(BankApplication.class, args);

    }

    public void exec(){

        Klient k1 = new Klient(100000,"Damian", "Argentyński", "123455678912345", "QD11");
        Klient k2 = new Klient(200000,"Janusz", "Zielonoskory", "123455678954321", "AA22");
        //System.out.println(k1);
        accountVault.addClient(k1);
        accountVault.addClient(k2);


        TransferReceipt n2 = transferOut.MakeATransfer("AA22", 1000);
        System.out.println(n2.getStatus());
        transferIn.MakeATransfer("fdssfd", 10000).printReceipt();
        //nie wypłaci wiecej niz ma
        transferOut.MakeATransfer("AA22",100000000);
        clientData.Show("QD11");
        clientData.Show("AA22");
    }

}
