package com.company.gdansk.patterns;

public class DbConnection {
    private String url;
    private String login;
    private String password;
    private String mode;
    private int port;

    public DbConnection setUrl(String url) {
        this.url = url;
        return this;
    }

    public DbConnection setLogin(String login) {
        this.login = login;
        return this;
    }

    public DbConnection setPassword(String password) {
        this.password = password;
        return this;
    }

    public DbConnection setMode(String mode) {
        this.mode = mode;
        return this;
    }

    public DbConnection setPort(int port) {
        this.port = port;
        return this;
    }
}
