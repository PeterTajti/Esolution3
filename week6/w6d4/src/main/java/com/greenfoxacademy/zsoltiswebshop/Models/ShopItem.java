package com.greenfoxacademy.zsoltiswebshop.Models;

public class ShopItem {

  String name;
  String description;
  double price;
  int quantityOfStock;

  public ShopItem(String name, String description, double price, int quantityOfStock) {
    this.name = name;
    this.description = description;
    this.price = price;
    this.quantityOfStock = quantityOfStock;
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

  public double getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public int getQuantityOfStock() {
    return quantityOfStock;
  }

  public void setQuantityOfStock(int quantityOfStock) {
    this.quantityOfStock = quantityOfStock;
  }
}

//It can list the items in a nice table

//It contains basic links for filtering:
//List only available
//Order by the cheapest first
//List only those what contain "nike" in the name or description
//Show the average of the stock
//Show the most expensive available item's name
