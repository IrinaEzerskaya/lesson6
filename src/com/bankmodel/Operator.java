package com.bankmodel;

// Класс операциониста банка
public class Operator extends BaseClass {

    String name;

    /**
     * Конструктор класса
     * При создании необходимо передать параметры
     *
     * @param name    - имя оператора
     */

    public Operator(String name) {
        this.name = name;
    }

    public void displayName() {
        System.out.printf("Имя оператора: %s \n", name);
    }

    public void setOperatorID(int OperatorID) {
        this.number = OperatorID;
    }

}
