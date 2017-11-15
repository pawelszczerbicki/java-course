package com.company.gdansk.thread.bankaccount;

public class Account {
    private int value = 1;

    public int getValue() {
        return value;
    }

    public void add() {
        value = value + 1;
    }

    public void withdraw() {
        value = value - 1;
    }

}
