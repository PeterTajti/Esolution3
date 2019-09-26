package com.example.unirestpractice.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.ArrayList;

@Entity
public class MovieContainer {

  @JsonIgnore
  @Id
  @GeneratedValue
  private long id;
  private int page;
  private ArrayList<Movie> result;
  private int total_results;
  private int total_pages;



  public MovieContainer(int page, ArrayList<Movie> result, int total_results, int total_pages) {
    this.page = page;
    this.result = result;
    this.total_results = total_results;
    this.total_pages = total_pages;
  }


  public MovieContainer(int page, ArrayList<Movie> result,int total_pages ) {
    this.page = page;
    this.result = result;
    this.total_pages = total_pages;
  }

  public MovieContainer() {}

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public int getPage() {
    return page;
  }

  public void setPage(int page) {
    this.page = page;
  }

  public ArrayList<Movie> getResult() {
    return result;
  }

  public void setResult(ArrayList<Movie> result) {
    this.result = result;
  }

  public int getTotal_results() {
    return total_results;
  }

  public void setTotal_results(int total_results) {
    this.total_results = total_results;
  }

  public int getTotal_pages() {
    return total_pages;
  }

  public void setTotal_pages(int total_pages) {
    this.total_pages = total_pages;
  }
}
