package com.example.frontend.models;

public class MyGreetingMsg {

  private String welcome_message;

 public MyGreetingMsg (String name, String title) {
   welcome_message = "Oh, hi there " + name + ", my dear " + title + "!";
 }

  public String getWelcome_message() {
    return welcome_message;
  }

  public void setWelcome_message(String welcome_message) {
    this.welcome_message = welcome_message;
  }
}
