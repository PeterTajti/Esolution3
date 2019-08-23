package com.w8d4exer2.exercise2.repositories;


import com.w8d4exer2.exercise2.models.Todo;
import org.springframework.data.repository.CrudRepository;

//@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {



}
