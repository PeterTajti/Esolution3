package com.example.demo.services;

import com.example.demo.models.Note;
import com.example.demo.models.User;
import com.example.demo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
    public void saveNote(Long userId, String description) {
        User user = userRepository.findUserById(userId);
        Note note = new Note (description);
        user.addNote(note);
        userRepository.save(user);
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }
}
