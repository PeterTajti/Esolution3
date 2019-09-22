package com.example.demo.repositories;

import com.example.demo.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository <User, Long> {

    User findByUserName(String name);
    User findByUserPassword (String password);
    User findUserById(long id);
    List<User> findAll();

}
