package com.example.unirestpractice.repositories;

import com.example.unirestpractice.models.Movie;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends CrudRepository <Movie, Long> {
}
