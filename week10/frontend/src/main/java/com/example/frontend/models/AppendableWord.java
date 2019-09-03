package com.example.frontend.models;

public class AppendableWord {
  private String appended;

  public AppendableWord(String appendThis) {
    appended = appendThis + "a";
  }

  public String getAppended() {
    return appended;
  }

  public void setAppended(String appended) {
    this.appended = appended;
  }
}
