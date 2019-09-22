package com.example.demo.services;

import com.example.demo.models.User;
import com.example.demo.repositories.UserRepository;
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
}
