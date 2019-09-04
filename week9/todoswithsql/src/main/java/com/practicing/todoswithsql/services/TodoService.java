package com.practicing.todoswithsql.services;

import com.practicing.todoswithsql.models.Todo;

import java.util.List;


public interface TodoService {

  List<Todo> findAll();

  List<Todo> findAllByUrgent(boolean urgent);

  List<Todo> findAllByDone(boolean done);

  Todo findById(long id);

  void save (Todo todo);

  void deleteById (long id);
//
//void save (Todo todo);
//
//void deleteById(long id);

}
