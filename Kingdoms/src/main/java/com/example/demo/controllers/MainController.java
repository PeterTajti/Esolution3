package com.example.demo.controllers;

import com.example.demo.models.Message;
import com.example.demo.models.User;
import com.example.demo.services.NoteService;
import com.example.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

  private UserService userService;
  private NoteService noteService;

  @Autowired
  public MainController(UserService userService, NoteService noteService) {
    this.userService = userService;
    this.noteService = noteService;
  }

  @GetMapping("/")
  public String renderMainPage() {
    return "index";
  }

  @GetMapping("/register")
  public String renderRegisterPage() {
    return "register";
  }

  @PostMapping("/register")
  public String saveNewUser(@RequestParam("userName") String userName,
                            @RequestParam("userPassword") String userPassword,
                            @RequestParam("userPassword2") String userPassword2,
                            @RequestParam("avatar") String avatar,
                            Model model) {
    if (userService.findUserByName(userName) != null) {
      model.addAttribute("errormessage", new Message("This name is already in use!").getMsgText());
      return "register";
    }
    if (userService.findUserByName(userName) == null && userPassword.equals(userPassword2)) {
      userService.save(new User(userName, userPassword, avatar));
      model.addAttribute("successmessage", new Message("New account registered! " + userName
              + " will have this password: " + userPassword).getMsgText());

    }
    return "register";
  }

  @GetMapping("/login")
  public String renderLoginPage(Model model) {
    model.addAttribute("users", userService.findAll());
    return "login";
  }

  @PostMapping("/login")
  public String loggingin(@RequestParam("userName") String userName,
                          @RequestParam("userPassword") String userPassword,
                          Model model) {

    if (userService.findUserByName(userName).equals(userService.findUserByUserPassword(userPassword))) {
      User tempUser = userService.findUserByName(userName);
      return "redirect:/userdata/" + tempUser.getId();
    } else {
      model.addAttribute("errormessage", new Message("Wrong username or password").getMsgText());
      return "login";
    }

  }

  @GetMapping("/userdata/{userId}")
  public String userStats(@PathVariable("userId") Long id, Model model) {
    if (userService.findUserByUserId(id) != null) {
      model.addAttribute("user", userService.findUserByUserId(id));
      return "userdata";
    } else {
      return "errorpage";
    }
  }

  @PostMapping("/addnote")
  public String addNote(@RequestParam String description, @RequestParam Long userId) {
    userService.saveNote(userId, description);
    return "redirect:/userdata/" + userId;
  }

}
