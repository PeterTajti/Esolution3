package com.example.unirestpractice.controllers;

import com.example.unirestpractice.models.Movie;
import com.example.unirestpractice.models.MovieContainer;
import com.example.unirestpractice.services.MovieContainerService;
import com.example.unirestpractice.services.MovieService;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class MovieController {

  private MovieContainerService movieContainerService;
  private MovieService movieService;

  @Autowired
  public MovieController(MovieContainerService movieContainerService, MovieService movieService) {
    this.movieContainerService = movieContainerService;
    this.movieService = movieService;
  }

  @GetMapping("/movie/top_rated")
  public ResponseEntity getTheBestFilms() throws UnirestException {
    HttpResponse<JsonNode> response = Unirest.get("https://api.themoviedb.org/3/movie/top_rated?api_key=961edffe7e966d465fba93ebb6568cd1&language=en-US&page=1")
            .asJson();
    return ResponseEntity.status(200).body(response.getBody().toString());
  }


  @GetMapping("/movie/top_rated/pageandtotalpage")
  public ResponseEntity getTitleAndPopularity() throws UnirestException {


    HttpResponse<JsonNode> response = Unirest.get("https://api.themoviedb.org/3/movie/top_rated")       //itt nem írjuk végig a https címet, hanem hozzáadjuk az api_key értékét egy .queryStringgel
            .queryString("api_key", "961edffe7e966d465fba93ebb6568cd1")
            .asJson();

    JSONObject obj = response.getBody().getObject();

    MovieContainer MovieContainer1 = new MovieContainer();


    MovieContainer1.setPage(obj.optInt("page"));      //optInt integerként értelmezi(? ami itt elvileg 1 ugye)
    MovieContainer1.setTotal_pages(obj.optInt("total_pages"));

    JSONArray users = obj.getJSONArray("results");

    ArrayList<Movie> results = new ArrayList<>();

    for (int i = 0, maxi = users.length(); i < maxi; i++) {

      Movie movie = toResultsByAdultAndTitleAndPopAndRelease((JSONObject) users.get(i));

      results.add(movie);
      movieService.saveMovie(movie);

    }

    MovieContainer1.setResult(results);

    return ResponseEntity.status(200).body(MovieContainer1);
  }


  private Movie toResultsByAdultAndTitleAndPopAndRelease(JSONObject object) {
    return new Movie(object.getBoolean("adult"), object.getString("title"), object.getString("release_date"), object.getInt("popularity"));
  }


}






