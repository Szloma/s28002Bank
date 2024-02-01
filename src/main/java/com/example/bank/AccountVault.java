package com.example.bank;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


@Component
public class AccountVault {
    private final List<Klient> ListaKont = new ArrayList<>();

    public void addClient (Klient client)
    {
        ListaKont.add((client));
    }
    public Klient findClientById( String Id){
        for(Klient i : ListaKont){
            if(Objects.equals(i.getID(), Id)){
                return i;
            }

        }
        return null;

    }

}
