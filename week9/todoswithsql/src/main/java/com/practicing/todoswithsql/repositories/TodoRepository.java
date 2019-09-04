package com.practicing.todoswithsql.repositories;


import com.practicing.todoswithsql.models.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {

  List<Todo> findAll();

  List<Todo> findAllByUrgent(boolean urgent);

  List<Todo> findAllByDone(boolean done);

  List<Todo> findById(long id);


  //List<Todo> findAllByDone(boolean isActive);

}

