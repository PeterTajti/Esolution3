package com.greenfoxacademy.springstart.Controllers;

public class Greeting {


  long greetCoount;
  String content;


  public String getContent() {
    return content;
  }

  public long getGreetCoount() {
    return greetCoount;
  }

  public Greeting(long greetCoount, String content) {
    this.greetCoount = greetCoount;
    this.content = content;
  }
}

