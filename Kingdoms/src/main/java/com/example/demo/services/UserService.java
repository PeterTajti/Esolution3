package com.example.demo.services;

import com.example.demo.models.User;

public interface UserService {

    User findUserByName (String name);
    User save (User user);
    User findUserByUserPassword (String password);

}
