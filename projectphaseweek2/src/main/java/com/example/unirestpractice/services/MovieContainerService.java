package com.example.unirestpractice.services;

import com.example.unirestpractice.models.Movie;
import com.example.unirestpractice.models.MovieContainer;

import java.util.ArrayList;

public interface MovieContainerService {

MovieContainer saveMovieContainer (int page, ArrayList<Movie> result, int total_pages);



}
