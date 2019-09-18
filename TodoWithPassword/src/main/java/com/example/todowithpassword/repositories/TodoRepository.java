package com.example.todowithpassword.repositories;

import com.example.todowithpassword.models.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends CrudRepository <Todo, Long> {
}
