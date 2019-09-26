package com.example.unirestpractice.repositories;

import com.example.unirestpractice.models.MovieContainer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieResultRepository extends CrudRepository <MovieContainer, Long> {
}
