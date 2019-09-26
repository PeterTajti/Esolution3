package com.example.unirestpractice.services;

import com.example.unirestpractice.models.Movie;
import com.example.unirestpractice.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieServiceImpl implements MovieService {

  private MovieRepository movieRepository;

  @Autowired
  public MovieServiceImpl(MovieRepository movieRepository) {
    this.movieRepository = movieRepository;
  }

  @Override
  public void saveMovie(Movie movie) {
    movieRepository.save(movie);
  }
}
