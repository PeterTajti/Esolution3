package com.myfoxclub.myfox.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

  @GetMapping("/")
  public String home(@RequestParam(name = "name") String name, Model model){
    model.addAttribute("name", name);
    return "index";
  }

  @GetMapping("/login")
  public String login(){
    return "login";
  }

  @PostMapping("/login")
  public String login2 (@RequestParam("name") String name) {
    return "redirect:/?name=" + name;
  }


}
