package org.example;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args){
        Account account1 = new Account( " Raul" , "Barcelona", new BigDecimal(5000), " 123", Hold.DELINQUENCY );
        Map<String,Account>estado =new HashMap<>();
        estado.put(account1.getAccountNumber(), account1);
        System.out.println(estado.get(account1.getAccountNumber()));
    }
}