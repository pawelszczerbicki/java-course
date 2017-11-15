package com.company.gdansk.patterns;

public class BuilderMain {
    public static void main(String[] args) {
        DbConnection connection = new DbConnection()
                .setPort(22)
                .setPassword("pwd")
                .setLogin("login");

        DbConnection con2 = new DbConnectionBuilder()
                .password("pwd")
                .port(22)
                .login("logon")
                .build();


    }
}
