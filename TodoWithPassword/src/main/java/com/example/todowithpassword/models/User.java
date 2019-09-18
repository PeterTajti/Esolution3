package com.example.todowithpassword.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "users")
public class User {

  @Id
  @GeneratedValue
  private Long id;
  private String userName;
  private String userPassword;

  @OneToMany(cascade = CascadeType.ALL, mappedBy = "owner")
  private List<Todo> todos;

  public User () {}

  public User(String name, String userPassword) {
    this.userName = name;
    this.userPassword = userPassword;
    this.todos = new ArrayList<>();
  }

  public User(String userName, String userPassword, List<Todo> todos) {
    this.userName = userName;
    this.userPassword = userPassword;
    this.todos = todos;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getUserPassword() {
    return userPassword;
  }

  public void setUserPassword(String userPassword) {
    this.userPassword = userPassword;
  }

  public List<Todo> getTodos() {
    return todos;
  }

  public void setTodos(List<Todo> todos) {
    this.todos = todos;
  }

  public void addTodo(Todo todo) {
    this.todos.add(todo);
    todo.setOwner(this);
  }
}
