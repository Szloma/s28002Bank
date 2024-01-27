package com.example.bank;

import org.springframework.stereotype.Service;

@Service
public class TransferIn {
    private final AccountVault accountVault;
    private TransferReceipt transferReceipt;
    TransferReceipt MakeATransfer(String klientId, double value){
        Klient k = accountVault.findClientById(klientId);
        if(k!=null){
            double newBalance = k.getBalance() + value;
            k.setBalance(newBalance);
            this.transferReceipt = new TransferReceipt(value, newBalance, STATUS.ACCEPTED);
        }else{
            this.transferReceipt = new TransferReceipt(0,0,STATUS.DECLINED);
        }

        return this.transferReceipt;
    }
    TransferIn(AccountVault accountVault){
        this.accountVault= accountVault;
    }

}
