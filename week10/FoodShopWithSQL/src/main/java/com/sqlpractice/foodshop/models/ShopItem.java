package com.sqlpractice.foodshop.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="shopitems")
public class ShopItem {

 @Id
@GeneratedValue
 private Integer id;
  private String name;
  private String description;
  private int calories;
  private int price;
  private int quantity;
  private boolean containsPreservatives;


  public ShopItem(){}

  public ShopItem(String name, String description, int calories, int price, int quantity) {
    this.name = name;
    this.description = description;
    this.calories = calories;
    this.price = price;
    this.quantity = quantity;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public int getCalories() {
    return calories;
  }

  public void setCalories(int calories) {
    this.calories = calories;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  public boolean isContainsPreservatives() {
    return containsPreservatives;
  }

  public void setContainsPreservatives(boolean containsPreservatives) {
    this.containsPreservatives = containsPreservatives;
  }



}
