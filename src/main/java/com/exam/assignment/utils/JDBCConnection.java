package com.exam.assignment.utils;

import java.sql.*;

public class JDBCConnection {
    private String url = "jdbc:mysql://localhost:3306/java_hw?autoReconnect=true&useSSL=false";
    private String username ="root";
    private String password ="";
    Connection connection;

    public JDBCConnection() {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void setUrl(String url) {
        this.url = url;
        try {
            connection = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public Connection getConnection() {
        return connection;
    }
    public void closeConnection()  {
        try {
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
