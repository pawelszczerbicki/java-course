package com.company.gdansk.patterns;

public class DbConnectionBuilderAlter {
private DbConnection connection = new DbConnection();

    public DbConnectionBuilderAlter url(String url){
        connection.setUrl(url);
        return this;
    }

    public DbConnectionBuilderAlter login(String login){
        connection.setLogin(login);
        return this;
    }

    public DbConnectionBuilderAlter password(String password){
        connection.setPassword(password);
        return this;
    }

    public DbConnectionBuilderAlter mode(String mode){
        connection.setMode(mode);
        return this;
    }

    public DbConnectionBuilderAlter port(int port){
        connection.setPort(port);
        return this;
    }

    public DbConnection build(){
        return connection;
    }
}
