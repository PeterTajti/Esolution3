package com.example.listingtodosh2.repositories;

import com.example.listingtodosh2.models.ToDo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//@Repository
public interface TodoRepository extends CrudRepository<ToDo, Long> {



}
