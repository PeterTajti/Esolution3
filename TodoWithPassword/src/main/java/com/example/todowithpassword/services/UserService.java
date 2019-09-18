package com.example.todowithpassword.services;

import com.example.todowithpassword.models.User;

public interface UserService {

  User findUserByName (String name);
  User findUserByUserId (Long id);
  User findUserByUserPassword (String password);
  User save (User user);

  void saveTodo (Long userId, String description);
}
