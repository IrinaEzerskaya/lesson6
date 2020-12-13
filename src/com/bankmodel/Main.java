package com.bankmodel;

public class Main {

    public static void main(String[] args) {

        Client bankClient = new Client("Иван Петров", 35, "Москва, Тверская-Ямская 1", "+7 900 000 00 00");

        bankClient.setClientID(1);
        bankClient.displayAge();

        Account clientAccount = new Account(1);
        clientAccount.setAccount("40817810099910004312");
        clientAccount.getAccount();

        Operator bankOperator = new Operator("Ирина Львовна");
        bankOperator.setOperatorID(112);
        bankOperator.displayName();

    }

}
