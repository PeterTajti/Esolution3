package com.example.frontend.controllers;


import com.example.frontend.models.AppendableWord;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.xml.ws.Response;

@RestController
public class AppendAController {

  @GetMapping("/appenda/{appendable}")
  public ResponseEntity appendIt(@PathVariable(required = false) String appendable) {
    if (appendable == null) {
      return ResponseEntity.status(404).body(null);
    } else {
      AppendableWord aw = new AppendableWord(appendable);
      return ResponseEntity.status(200).body(aw);
    }
  }
}