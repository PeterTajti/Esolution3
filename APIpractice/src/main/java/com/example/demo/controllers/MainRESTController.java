package com.example.demo.controllers;

import com.example.demo.models.*;
import com.example.demo.services.UntilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class MainRESTController {

  private UntilService untilService;

  @Autowired
  public MainRESTController(UntilService untilService) {
    this.untilService = untilService;
  }

  @GetMapping("/doubling")
  public ResponseEntity doubling(@RequestParam(required = false) Integer input) {

    if (input == null) {

      MyErrorMsg em = new MyErrorMsg("Please provide an input!");
      return ResponseEntity.status(200).body(em);
    } else {
      MyNumber num = new MyNumber(input);
      return ResponseEntity.status(200).body(num);
    }
  }

  @GetMapping("/greeter")
  public ResponseEntity greeter(@RequestParam(required = false) String name,
                                @RequestParam(required = false) String title) {

    if (name == null && title == null) {
      MyErrorMsg em = new MyErrorMsg("Please provide a name and a title!");
      return ResponseEntity.status(200).body(em);
    }
    if (name == null) {
      MyErrorMsg em = new MyErrorMsg("Please provide a name!");
      return ResponseEntity.status(200).body(em);
    }
    if (title == null) {
      MyErrorMsg em = new MyErrorMsg("Please provide a title!");
      return ResponseEntity.status(200).body(em);
    } else {
      MyGreetingMsg mg = new MyGreetingMsg(name, title);
      return ResponseEntity.status(200).body(mg);
    }
  }


  @GetMapping("/appenda/{appendable}")
  public ResponseEntity appender(@PathVariable(required = false) String appendable) {

    if (appendable == null) {
      return ResponseEntity.status(404).body("");
//vagy      return ResponseEntity.status(404).build();
    } else {
      AppendedWord aw = new AppendedWord(appendable);
      return ResponseEntity.status(200).body(aw);

    }
  }


  @PostMapping("/dountil/{action}")
  public ResponseEntity doUntil(@PathVariable(required = false) String action,
                                @RequestBody Until until) {
//a  @RequestBody Until until itt létrehoz egy objectet, az untilNumber-je pedig a postmanban beírt szám lesz

    if (until == null) {
      MyErrorMsg em = new MyErrorMsg("Please provide a number!");
      return ResponseEntity.status(200).body(em);

    }

    if (action.equals("sum")) {
      return ResponseEntity.status(200).body(untilService.sum(until));
    }

    if (action.equals("factor")) {

      return ResponseEntity.status(200).body(untilService.factorial(until));
    }
    return null;
  }


}
