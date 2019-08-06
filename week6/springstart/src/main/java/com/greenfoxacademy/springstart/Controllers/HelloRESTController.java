//@PostMapping("/cats")
//  public String addCat(@RequestParam(value = "name") String name,
//                       @RequestParam(value = "color", required = false) String color) {
//    if (color == null) {
//      color = "unkown";
//    }
//
//    Cat cat = new Cat(name, color);
//    cats.add(cat);
//    return cat + " is added to the list";
//  }

package com.greenfoxacademy.springstart.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloRESTController {

  @RequestMapping(value = "/greeting")
  public Greeting Greeting (@RequestParam(value = "name") String name) {
    Greeting greeting1 = new Greeting(1, "Hello, " + name + " !");
    return greeting1;
  }



}
