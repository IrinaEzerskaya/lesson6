package com.bankmodel;

// Класс расчетного счета клиента
public class Account extends BaseClass {

    private String account_num;
    public int client_id;

    public Account(int client_id) {
        this.client_id = client_id;
    }

    public void getAccount() {
        System.out.printf("Расчетный счет клиента: %s \n", this.account_num);
    }

    public void setAccount(String account_num) {
        this.account_num = account_num;
    }

}
