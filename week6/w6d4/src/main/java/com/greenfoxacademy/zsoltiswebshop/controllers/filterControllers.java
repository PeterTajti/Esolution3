package com.greenfoxacademy.zsoltiswebshop.controllers;

import com.greenfoxacademy.zsoltiswebshop.Models.Table;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class filterControllers {
  Table myTable = new Table();

  @GetMapping("")
  public String homepage () {
    return "index";
  }


}
