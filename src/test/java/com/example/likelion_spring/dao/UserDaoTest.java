package com.example.likelion_spring.dao;

import com.example.likelion_spring.domain.User;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class UserDaoTest {

    @Test
    void addName() throws SQLException, ClassNotFoundException {
        UserDao userDao = new UserDao();
        User user = new User();
        user.setId("0");
        user.setName("jaewon");
        user.setPassword("1234");

        userDao.add(user);
    }

}