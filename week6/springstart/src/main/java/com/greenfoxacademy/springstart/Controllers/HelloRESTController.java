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

import java.util.concurrent.atomic.AtomicLong;

@RestController

public class HelloRESTController {

  AtomicLong counter1 = new AtomicLong();

  @RequestMapping(value = "/greeting")
  public Greeting Greeting(@RequestParam(value = "name") String name) {

    counter1.getAndIncrement();

    Greeting greeting1 = new Greeting(counter1.get(), "Hello, " + name + " !");
    return greeting1;
  }


}

// incrementAndGet() // Atomically increments by one the current value.