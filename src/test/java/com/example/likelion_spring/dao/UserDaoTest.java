package com.example.likelion_spring.dao;

import com.example.likelion_spring.domain.User;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static org.assertj.core.api.Assertions.*;
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

    @Test
    void getName() throws SQLException, ClassNotFoundException {
        UserDao userDao = new UserDao();
        User result = userDao.get("0");

        System.out.println(result.getId());
        System.out.println(result.getName());

        assertThat(result.getId()).isEqualTo("0");
    }

}