package com.example.securitytokenpractice.controllers;

import com.example.securitytokenpractice.models.ApplicationUser;
import com.example.securitytokenpractice.services.ApplicationUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RESTmainController {

  private ApplicationUserService userService;

  @Autowired
  public RESTmainController(ApplicationUserService userService) {
    this.userService = userService;
  }

  @PostMapping ("/adduser")
  public ResponseEntity addUser (@RequestBody ApplicationUser user) {

    return ResponseEntity.status(200).body(userService.saveUser(user));
  }

  @GetMapping ("/hello")
  public String greeting () {
    return "hello";
  }

}
