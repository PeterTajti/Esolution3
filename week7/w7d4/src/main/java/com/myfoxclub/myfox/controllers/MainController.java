package com.myfoxclub.myfox.controllers;

import com.myfoxclub.myfox.models.Fox;
import com.myfoxclub.myfox.models.FoxPack;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

  @GetMapping("/")
  public String home(@RequestParam(name = "name") String name, Model model) {

    String route = "login";
    model.addAttribute("nameNotUsed", "You have provided a name that has not been used before, add it as a new one!");

    FoxPack myFoxPack = new FoxPack();
    for (int i = 0; i < myFoxPack.getFoxList().size(); i++) {
      Fox foxTemp = myFoxPack.getFoxList().get(i);
      if (foxTemp.getName().equals(name)) {
        model.addAttribute("fox", foxTemp);
        route = "index";
      }
    }

    return route;
  }

  @GetMapping("/login")
  public String login(Model model) {
    model.addAttribute("nameNotUsed", null);
    return "login";
  }

  @PostMapping("/login")
  public String login2(@RequestParam("name") String name) {
    return "redirect:/?name=" + name;
  }

  @GetMapping("/nutritionstore")
  public String nutritionStore() {
    return "nutritionStore";
  }

}
