package com.greenfoxacademy.zsoltiswebshop.Models;

import java.util.ArrayList;
import java.util.List;

public class Table {

  List<ShopItem> listOfShopItems;



  public Table() {
    listOfShopItems = new ArrayList<>(); //itt létrehozom a leendő Table üres listát a konstruktorral
    fillList();
  }

  ShopItem item1 = new ShopItem("Running shoes", "Nike running shoes for every daysport", 1000.0, 5 );
  ShopItem item2 = new ShopItem("Printer", "Some HP printer that will print pages", 3000.0, 2);
  ShopItem item3 = new ShopItem("Coca cola", "0.5l standard coke", 25.0, 0);
  ShopItem item4 = new ShopItem("Wokin", "Chicken with fried rice and WOKIN sauce", 119.0, 100);
  ShopItem item5 = new ShopItem("T-shirt", "Blue with a corgi on a bike", 300.0, 1);

  public List<ShopItem> getListOfShopItems() {
    return listOfShopItems;
  }

  public void fillList () {
    listOfShopItems.add(item1);
    listOfShopItems.add(item2);
    listOfShopItems.add(item3);
    listOfShopItems.add(item4);
    listOfShopItems.add(item5);



  }

}
