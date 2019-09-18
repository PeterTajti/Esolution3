package com.example.todowithpassword.repositories;

import com.example.todowithpassword.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

  User findByUserName(String name);

  User findUserById(long id);

  User findByUserPassword(String password);


}
