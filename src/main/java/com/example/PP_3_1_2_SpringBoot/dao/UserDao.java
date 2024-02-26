package com.example.PP_3_1_2_SpringBoot.dao;

import com.example.PP_3_1_2_SpringBoot.model.User;

import java.util.List;

public interface UserDao {

    void save (User user);

    List<User> getAllUsers();

    User getUser(Long id);

    void deleteUser (Long id);
}
