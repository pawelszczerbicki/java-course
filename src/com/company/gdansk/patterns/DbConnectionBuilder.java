package com.company.gdansk.patterns;

public class DbConnectionBuilder {
    private String url;
    private String login;
    private String password;
    private String mode;
    private int port;

    public DbConnectionBuilder url(String url){
        this.url = url;
        return this;
    }

    public DbConnectionBuilder login(String login){
        this.login = login;
        return this;
    }

    public DbConnectionBuilder password(String password){
        this.password = password;
        return this;
    }

    public DbConnectionBuilder mode(String mode){
        this.password = password;
        return this;
    }

    public DbConnectionBuilder port(int port){
        this.port = port;
        return this;
    }

    public DbConnection build(){
        DbConnection connection = new DbConnection();
        connection.setLogin(login);
        connection.setPassword(password);
        connection.setUrl(url);
        connection.setPort(port);
        connection.setMode(mode);
        return connection;
    }
}
