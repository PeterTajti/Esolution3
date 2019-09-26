package com.example.unirestpractice.services;

import com.example.unirestpractice.repositories.MovieResultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieResultServiceImpl implements MovieResultService {

  private MovieResultRepository movieResultRepository;

  @Autowired
  public MovieResultServiceImpl(MovieResultRepository movieResultRepository) {
    this.movieResultRepository = movieResultRepository;
  }
}
