package com.w8d4exer2.exercise2.controllers;

import com.w8d4exer2.exercise2.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.stream.Collectors;


@Controller
@RequestMapping("/todo")
public class TodoController {

  TodoRepository todoRepository;

  @Autowired
  public TodoController(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }

  @GetMapping({"", "/list"})
  public String list(Model model) {
    model.addAttribute("todos", todoRepository.findAll());
    return "todolist";
  }

  @RequestMapping(value = "/")
  public String isActive(Model model, @RequestParam(value = "isActive", required = false) boolean isActive) {

    if (isActive) {
      model.addAttribute("todos", todoRepository.findAllByIsDone(false));

    } else {
      model.addAttribute("todos", todoRepository.findAll());
    }

    return "todolist";
  }

}


