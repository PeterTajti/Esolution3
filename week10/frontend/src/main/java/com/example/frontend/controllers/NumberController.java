package com.example.frontend.controllers;

import com.example.frontend.models.MyNumber;
import com.example.frontend.models.MyError;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NumberController {

  @GetMapping("/doubling")
  public ResponseEntity doublingTheInput(@RequestParam (required = false)Integer input) {
    if (input != null) {
      MyNumber n = new MyNumber(input);
      return ResponseEntity.status(200).body(n);
    } else {
      MyError er = new MyError();
      return ResponseEntity.status(200).body(er);
    }


  }
}
