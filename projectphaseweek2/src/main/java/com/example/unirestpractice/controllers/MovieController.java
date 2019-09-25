package com.example.unirestpractice.controllers;

import com.example.unirestpractice.models.Movie;
import com.example.unirestpractice.models.MovieContainer;
import com.example.unirestpractice.repositories.MovieResultRepository;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class MovieController {

  private MovieResultRepository movieResultRepository;

  @GetMapping("/movie/top_rated")
  public ResponseEntity getTheBestFilms() throws UnirestException {
    HttpResponse<JsonNode> response = Unirest.get("https://api.themoviedb.org/3/movie/top_rated?api_key=961edffe7e966d465fba93ebb6568cd1&language=en-US&page=1")
            .asJson();
    return ResponseEntity.status(200).body(response.getBody().toString());
  }


  @GetMapping("/movie/top_rated/pageandtotalpage")
  public ResponseEntity getTitleAndPopularity() throws UnirestException {

    //itt nem írjuk végig a https címet, hanem hozzáadjuk az api_key értékét egy .queryStringgel
    HttpResponse<JsonNode> response = Unirest.get("https://api.themoviedb.org/3/movie/top_rated")
            .queryString("api_key", "961edffe7e966d465fba93ebb6568cd1")
            .asJson();

    JSONObject obj = response.getBody().getObject();

    MovieContainer MovieContainer1 = new MovieContainer();

    //optInt integerként értelmezi(? amiitt elvileg 1 ugye)
    MovieContainer1.setPage(obj.optInt("page"));
    MovieContainer1.setTotal_pages(obj.optInt("total_pages"));

    JSONArray users = obj.getJSONArray("results");
    ArrayList<Movie> results = new ArrayList<>();

    for (int i = 0, maxi = users.length(); i < maxi; i++) {
      results.add(toResultsByAdultAndTitleAndPopAndRelease((JSONObject) users.get(i)));
    }
    MovieContainer1.setResult(results);

    return ResponseEntity.status(200).body(MovieContainer1);

  }

  private Movie toResultsByAdultAndTitleAndPopAndRelease(JSONObject object) {
    return new Movie(object.getBoolean("adult"),object.getString("title"), object.getString("release_date"), object.getInt("popularity"));
  }

}






