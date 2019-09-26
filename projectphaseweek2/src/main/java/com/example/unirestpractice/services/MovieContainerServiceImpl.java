package com.example.unirestpractice.services;

import com.example.unirestpractice.models.Movie;
import com.example.unirestpractice.models.MovieContainer;
import com.example.unirestpractice.repositories.MovieContainerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class MovieContainerServiceImpl implements MovieContainerService {

  private MovieContainerRepository movieContainerRepository;

  @Autowired
  public MovieContainerServiceImpl(MovieContainerRepository movieResultRepository) {
    this.movieContainerRepository = movieResultRepository;
  }


  @Override
  public MovieContainer saveMovieContainer(int page, ArrayList<Movie> result, int total_pages) {
    return movieContainerRepository.save(new MovieContainer(page, result, total_pages));
  }


}
