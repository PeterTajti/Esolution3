package com.example.frontend.models;

public class MyError {

  private String error;

  public MyError() {
    error = "please provide an input!";
  }


  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }



}
