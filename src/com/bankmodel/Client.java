package com.bankmodel;

// Класс клиента банка
public class Client extends BaseClass {

    String name;
    protected int age;
    public String address;
    private String phone;

    /**
     * Конструктор класса
     * При создании необходимо передать параметры
     *
     * @param name    - имя клиента
     * @param age     - возраст
     * @param address - адрес клиента
     * @param phone   - телефон клиента
     */

    public Client(String name, int age, String address, String phone) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.phone = phone;
    }

    public void displayName() {
        System.out.printf("Имя клиента: %s \n", name);
    }

    void displayAge() {
        System.out.printf("Возраст: %d \n", age);
    }

    private void displayAddress() {
        System.out.printf("Адрес: %s \n", address);
    }

    protected void displayPhone() {
        System.out.printf("Телефон: %s \n", phone);
    }

    public void setClientID(int clientID) {
        this.number = clientID;
    }

}
