package com.example.likelion_spring.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SimpleConnectionMaker {
    public Connection makeConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection c = DriverManager.getConnection(
                "jdbc:mysql://ec2-3-36-129-194.ap-northeast-2.compute.amazonaws.com/springbook", "root", "password");
        return c;
    }
}
