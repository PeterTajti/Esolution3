package com.example.todowithpassword.controllers;

import com.example.todowithpassword.models.Message;
import com.example.todowithpassword.models.User;
import com.example.todowithpassword.services.TodoService;
import com.example.todowithpassword.services.UserService;
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
  private TodoService todoService;

  @Autowired
  public MainController(UserService userService, TodoService todoService) {
    this.userService = userService;
    this.todoService = todoService;
  }

  @GetMapping("/")
  public String renderLoginPage() {
    return "index";
  }

  @PostMapping("/")
  public String loggingIn(String userName, String userPassword,
                          Model model) {
    if (userService.findUserByName(userName).equals(userService.findUserByUserPassword(userPassword))) {
      User tempUser = userService.findUserByName(userName);
      return "redirect:/userdata/" + tempUser.getId();
    } else {
      model.addAttribute("errormessage", new Message("Wrong data...").getMsgText());
      return "index";
    }
  }

  @GetMapping("/userdata/{userId}")
  public String userInfo(@PathVariable(value = "userId") Long id, Model model) {
    if (userService.findUserByUserId(id) != null) {
      model.addAttribute("user", userService.findUserByUserId(id));
      return "userdata";
    } else {
      return "errorpage";
    }
  }

  @GetMapping("/register")
  public String renderRegpage() {
    return "register";

  }

  @PostMapping("/register")
  public String registerUser(@RequestParam("userName") String userName,
                             @RequestParam("userPassword") String userPassword,
                             @RequestParam("userPassword2") String userPassword2,
                             Model model) {
    if (userService.findUserByName(userName) != null) {
      model.addAttribute("errormessage", new Message("This name is already in use!").getMsgText());
      return "register";
    }
    if (userService.findUserByName(userName) == null && userPassword.equals(userPassword2)) {
      userService.save(new User(userName, userPassword));
      model.addAttribute("successmessage", new Message("New account registered! " + userName
              + " will have this password: " + userPassword).getMsgText());
    }
    return "register";

  }

  @PostMapping("/addtodo")
  public String addTodo(@RequestParam String description, @RequestParam Long userId) {
    userService.saveTodo(userId, description);
    return "redirect:/userdata/" + userId;
  }

}
