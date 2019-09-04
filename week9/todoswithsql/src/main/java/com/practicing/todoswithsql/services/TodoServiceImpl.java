package com.practicing.todoswithsql.services;

import com.practicing.todoswithsql.models.Todo;
import com.practicing.todoswithsql.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoServiceImpl implements TodoService{

  TodoRepository todoRepository;

  @Autowired
  public TodoServiceImpl(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }

  @Override
  public List<Todo> findAll() {
    return todoRepository.findAll();
  }

  @Override
  public List<Todo> findAllByUrgent(boolean urgent) {
    return todoRepository.findAllByUrgent(urgent);
  }

  @Override
  public List<Todo> findAllByDone(boolean done) {
    return todoRepository.findAllByDone(done);
  }

  @Override
  public Todo findById(long id) {
    List<Todo> resultList = todoRepository.findById(id);
    if (resultList.size() > 0) {
      return resultList.get(0);
    }
    return new Todo();
  }

  @Override
  public void save(Todo todo) {
    todoRepository.save(todo);
  }

  @Override
  public void deleteById(long id) {
    todoRepository.deleteById(id);
  }
}



