package com.example.demo.models;

public class AppendedWord {

  public String appended;

  public AppendedWord(String appendThis) {
    this.appended = appendThis + "a";
  }

  public String getAppended() {
    return appended;
  }

  public void setAppended(String appended) {
    this.appended = appended;
  }
}
