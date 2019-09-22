package com.example.ferrilataexam.repositories;

import com.example.ferrilataexam.models.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PizzaRepository extends CrudRepository <Order, Long> {
}
