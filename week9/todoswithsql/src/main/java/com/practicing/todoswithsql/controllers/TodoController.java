package com.practicing.todoswithsql.controllers;

import com.practicing.todoswithsql.models.Todo;
import com.practicing.todoswithsql.repositories.TodoRepository;
import com.practicing.todoswithsql.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/todo")
public class TodoController {

  TodoService todoService;

  @Autowired
  public TodoController(TodoService todoService) {
    this.todoService = todoService;
  }

  @GetMapping("/list")
  public String list(Model model){
    model.addAttribute("todos", todoService.findAll());
    model.addAttribute("urgenttodos", todoService.findAllByUrgent(true));
    model.addAttribute("donetodos", todoService.findAllByDone(true));
    return "todolist";
      }

  @GetMapping("/add")
  public String renderAddTodo(Model model){
    model.addAttribute("todo", new Todo());
    return "addtodo";
  }

  @PostMapping("/add")
  public String addTodo(@ModelAttribute Todo newTodo){
    if(newTodo.getTitle() != null && newTodo.getTitle() != ""){
      todoService.save(newTodo);
    }
    return "redirect:/todo/list";
  }

  @GetMapping("/{id}/delete")
  public String deleting(@PathVariable("id") long id){
    todoService.deleteById(id);
    return "redirect:/todo/list";
  }

  @GetMapping("/{id}/edit")
  public String renderingEdit(@PathVariable("id") long id, Model model){
    model.addAttribute("todo", todoService.findById(id));
    model.addAttribute("id", id);
    return "edittodo";
  }

  @PostMapping("/{id}/edit")
  public String editing(@PathVariable("id") long id, @ModelAttribute Todo editedTodo){
    editedTodo.setId(id);
    todoService.save(editedTodo);
    return "redirect:/todo/list";
  }


//  @GetMapping("/")
//  public String filter(Model model, @RequestParam(value = "isActive", required = false)boolean status){
//    if(status) {
//      model.addAttribute("todos", todoRepository.findAllByDone(!status));
//    } else {
//      model.addAttribute("todos", todoRepository.findAll());
//    }
//
//    return "todolist";
//  }

}
