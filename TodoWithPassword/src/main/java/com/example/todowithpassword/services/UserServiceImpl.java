package com.example.todowithpassword.services;

import com.example.todowithpassword.models.Todo;
import com.example.todowithpassword.models.User;
import com.example.todowithpassword.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

  private UserRepository userRepository;

  @Autowired
  public UserServiceImpl(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  @Override
  public User findUserByName(String name) {
    return userRepository.findByUserName(name);
  }

  @Override
  public User save(User user) {
    return userRepository.save(user);
  }

  @Override
  public User findUserByUserPassword(String password) {
    return userRepository.findByUserPassword(password);
  }

  @Override
  public User findUserByUserId(Long id) {
    return userRepository.findById(id).get();
  }

  @Override
  public void saveTodo(Long userId, String description) {
  User user = userRepository.findUserById(userId);
  Todo todo = new Todo (description);
  user.addTodo(todo);
  userRepository.save(user);
  }

}
