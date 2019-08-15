package com.myfoxclub.myfox.models;

import java.util.ArrayList;
import java.util.List;

public class Fox {

  private String name;
  List<Trick> listOfTricks;
  private String food;
  private String drink;



  public Fox(String name, String food, String drink) {
    this.name = name;
    listOfTricks = new ArrayList<>();
    this.food = food;
    this.drink = drink;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<Trick> getListOfTricks() {
    return listOfTricks;
  }

  public void setListOfTricks(List<Trick> listOfTricks) {
    this.listOfTricks = listOfTricks;
  }

  public String getFood() {
    return food;
  }

  public void setFood(String food) {
    this.food = food;
  }

  public String getDrink() {
    return drink;
  }

  public void setDrink(String drink) {
    this.drink = drink;
  }
}
