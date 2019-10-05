package com.example.demo.controllers;

import com.example.demo.services.NoteService;
import com.example.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MenuController {

  private UserService userService;
  private NoteService noteService;

  @Autowired
  public MenuController(UserService userService, NoteService noteService) {
    this.userService = userService;
    this.noteService = noteService;
  }

  @GetMapping("/newspage")
  public String newspage(){
    return "newspage";
  }

  @GetMapping("/forumpage")
  public String forumpage(){
    return "forumpage";
  }

  @GetMapping("/gamepage")
  public String gamepage(){
    return "gamepage";
  }

  @GetMapping("/patchnotespage")
  public String patchnotespage(){
    return "patchnotespage";
  }

  @GetMapping("/contactspage")
  public String contactspage(){
    return "contactspage";
  }

}
