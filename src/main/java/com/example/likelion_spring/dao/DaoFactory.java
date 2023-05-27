package com.example.likelion_spring.dao;

public class DaoFactory {

    public UserDao userDao() {

        return new UserDao(new NConnectionMaker());
    }
}
