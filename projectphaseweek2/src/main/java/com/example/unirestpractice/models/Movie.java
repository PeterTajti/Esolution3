package com.example.unirestpractice.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="movies")
public class Movie {

  @Id
  @GeneratedValue
  private Long id;

//  private String poster_path;
  private boolean adult;
//  private String overview;
  private String release_date;
//  private int[] genre_ids;
//  private int id;
//  private String original_title;
//  private String original_language;
  private String title;
//  private String backdrop_path;
  private int popularity;
//  private int vote_count;
//  private boolean video;
//  private double vote_average;
//  private int total_results;
//  private int total_pages;

  public Movie() {
  }



  public Movie(String title, int popularity) {
    this.title = title;
    this.popularity = popularity;
  }

  public Movie(String release_date, String title, int popularity) {
    this.release_date = release_date;
    this.title = title;
    this.popularity = popularity;
  }

  public Movie(boolean adult, String release_date, String title, int popularity) {
    this.adult = adult;
    this.release_date = release_date;
    this.title = title;
    this.popularity = popularity;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  //  public Movie(String poster_path, boolean adult, String overview, String release_date, int[] genre_ids, String original_title, String original_language, String title, String backdrop_path, int popularity, int vote_count, boolean video, double vote_average, int total_results, int total_pages) {
//    this.poster_path = poster_path;
//    this.adult = adult;
//    this.overview = overview;
//    this.release_date = release_date;
//    this.genre_ids = genre_ids;
//    this.original_title = original_title;
//    this.original_language = original_language;
//    this.title = title;
//    this.backdrop_path = backdrop_path;
//    this.popularity = popularity;
//    this.vote_count = vote_count;
//    this.video = video;
//    this.vote_average = vote_average;
//    this.total_results = total_results;
//    this.total_pages = total_pages;
//  }

//  public String getPoster_path() {
//    return poster_path;
//  }
//
//  public void setPoster_path(String poster_path) {
//    this.poster_path = poster_path;
//  }
//
  public boolean isAdult() {
    return adult;
  }

  public void setAdult(boolean adult) {
    this.adult = adult;
  }
//
//  public String getOverview() {
//    return overview;
//  }
//
//  public void setOverview(String overview) {
//    this.overview = overview;
//  }
//
  public String getRelease_date() {
    return release_date;
  }

  public void setRelease_date(String release_date) {
    this.release_date = release_date;
  }
//
//  public int[] getGenre_ids() {
//    return genre_ids;
//  }
//
//  public void setGenre_ids(int[] genre_ids) {
//    this.genre_ids = genre_ids;
//  }
//
//  public int getId() {
//    return id;
//  }
//
//  public void setId(int id) {
//    this.id = id;
//  }
//
//  public String getOriginal_title() {
//    return original_title;
//  }
//
//  public void setOriginal_title(String original_title) {
//    this.original_title = original_title;
//  }
//
//  public String getOriginal_language() {
//    return original_language;
//  }
//
//  public void setOriginal_language(String original_language) {
//    this.original_language = original_language;
//  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

//  public String getBackdrop_path() {
//    return backdrop_path;
//  }
//
//  public void setBackdrop_path(String backdrop_path) {
//    this.backdrop_path = backdrop_path;
//  }

  public int getPopularity() {
    return popularity;
  }

  public void setPopularity(int popularity) {
    this.popularity = popularity;
  }

//  public int getVote_count() {
//    return vote_count;
//  }
//
//  public void setVote_count(int vote_count) {
//    this.vote_count = vote_count;
//  }
//
//  public boolean isVideo() {
//    return video;
//  }
//
//  public void setVideo(boolean video) {
//    this.video = video;
//  }
//
//  public double getVote_average() {
//    return vote_average;
//  }
//
//  public void setVote_average(double vote_average) {
//    this.vote_average = vote_average;
//  }
//
//  public int getTotal_results() {
//    return total_results;
//  }
//
//  public void setTotal_results(int total_results) {
//    this.total_results = total_results;
//  }
//
//  public int getTotal_pages() {
//    return total_pages;
//  }
//
//  public void setTotal_pages(int total_pages) {
//    this.total_pages = total_pages;
//  }
}
