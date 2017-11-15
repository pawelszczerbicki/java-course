package com.company.gdansk.hash;

public class BankUser {
    private String name = "";
    private String surname;
    private String pesel= "";
    private String login = "";
    private int age;

    public BankUser() {
    }

    public BankUser(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return surname;
    }

    @Override
    public boolean equals(Object o) {
        BankUser b = (BankUser) o;
        return b.login.equals(login)
                && name.equals(b.name)
                && surname.equals(b.surname)
                && pesel.equals(b.pesel);
    }

    @Override
    public int hashCode() {
        return name.hashCode() +
                surname.hashCode() +
                pesel.hashCode() +
                login.hashCode();
    }
}
