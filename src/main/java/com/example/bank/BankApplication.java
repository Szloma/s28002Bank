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


    }

}
