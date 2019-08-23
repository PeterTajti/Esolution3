package com.w8d4exer2.exercise2.repositories;
import com.w8d4exer2.exercise2.models.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

//@Repository   (ha rárakom és vmi hiba van, akkor az intelliJ tudni fogja hogy a repoban a hiba)
public interface TodoRepository extends CrudRepository<Todo, Long> {

List<Todo> findAllByIsDone (boolean isItDone);

}
