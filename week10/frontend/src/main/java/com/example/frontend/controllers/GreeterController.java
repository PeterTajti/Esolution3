package com.example.frontend.controllers;

import com.example.frontend.models.MyError;
import com.example.frontend.models.MyGreetingMsg;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreeterController {

  @GetMapping("/greeter")
  public ResponseEntity greeter(@RequestParam(required = false) String name,
                                @RequestParam(required = false) String title) {


    if (name == null && title == null) {
      MyError er = new MyError();
      er.setError("Please provide a name and a title!");
      return ResponseEntity.status(200).body(er);
    }

    if (name == null) {
      MyError er = new MyError();
      er.setError("Please provide a name!");
      return ResponseEntity.status(200).body(er);
    }


    if (title == null) {
      MyError er = new MyError();
      er.setError("Please provide a title!");
      return ResponseEntity.status(200).body(er);
    }

    MyGreetingMsg myGreetingMsg = new MyGreetingMsg(name, title);
    return ResponseEntity.status(200).body(myGreetingMsg);
  }
}



