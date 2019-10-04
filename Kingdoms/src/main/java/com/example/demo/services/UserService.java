package com.example.demo.services;

import com.example.demo.models.User;

import java.util.List;

public interface UserService {

    User findUserByName (String name);
    User save (User user);
    User findUserByUserPassword (String password);
    User findUserByUserId (Long id);
    void saveNote (Long userId, String description);
    List<User> findAll();

    void deleteUser (Long userId);
}
