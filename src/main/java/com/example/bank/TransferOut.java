package com.example.bank;

import org.springframework.stereotype.Service;

@Service
public class TransferOut {
    private final AccountVault accountVault;
    private TransferReceipt transferReceipt;

    TransferReceipt MakeATransfer(String klientId, double value){
        Klient k = accountVault.findClientById(klientId);
        if(k!=null){
            double newBalance = k.getBalance() - value;
            if(value > k.getBalance()){
                this.transferReceipt = new TransferReceipt(value, k.getBalance(), STATUS.DECLINED);
            }
            else {
                k.setBalance(newBalance);
                this.transferReceipt = new TransferReceipt(value, k.getBalance(), STATUS.ACCEPTED);
            }

        } else{
            this.transferReceipt = new TransferReceipt(0,0,STATUS.DECLINED);
        }

        return this.transferReceipt;
    }
    TransferOut(AccountVault accountVault){
        this.accountVault= accountVault;
    }

}
