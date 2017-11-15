package com.company.gdansk.patterns;

public class DbConnectionFactory {

    public DbConnection create(String url) {
           DbConnection con = new DbConnection();
           con.setUrl(url);
           return con;
    }

    public DbConnection create(String url, int port) {
          return create(url).setPort(port);
    }

}
