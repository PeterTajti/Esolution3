package com.example.frontend.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

public class MainController {

  @GetMapping("")
  public String homePage() {
    return "index";
  }



}
