package com.greenfoxacademy.zsoltiswebshop.controllers;

import com.greenfoxacademy.zsoltiswebshop.Models.ShopItem;
import com.greenfoxacademy.zsoltiswebshop.Models.Table;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Comparator;
import java.util.stream.Collectors;

@Controller

public class filterControllers {
  Table myTable = new Table();

  //ez adja a nyitó oldalt
//  @GetMapping("")
//  public String homepage() {
//    return "index";
//  }

  @RequestMapping(value = "/home")
  public String homePage(Model model) {
    model.addAttribute("items", myTable.getListOfShopItems());
    //a model (beépített class-ja a springnen/thymeleafnek) olyan mint egy hashmap, a kulcsa az items, a value pedig egy lista
    return "index";
  }

  @RequestMapping(value = "/only-available")
  public String onlyAvailable(Model model) {
    model.addAttribute("items", myTable.getListOfShopItems().stream()
            .filter(item -> item.getQuantityOfStock() > 0)
            .collect(Collectors.toList()));
    return "index";
  }

  @RequestMapping(value = "/cheapest-first")
  public String cheapestFirst(Model model) {
    model.addAttribute("items", myTable.getListOfShopItems().stream()

            .sorted((Comparator.comparingDouble(ShopItem::getPrice)))
            .collect(Collectors.toList()));

    return "index";
  }

  @RequestMapping(value = "/contains-nike")
  public String containsNike(Model model) {
    model.addAttribute("items", myTable.getListOfShopItems().stream()

            .filter(shopItem -> shopItem.getName().toLowerCase().contains("nike") ||
                    shopItem.getDescription().toLowerCase().contains("nike"))
            .collect(Collectors.toList()));

    return "index";
  }


  //  Itt attributeName-nek "average"-t adunk meg
  @RequestMapping(value = "/average-stock")
  public String averageStock(Model model) {
    model.addAttribute("average", myTable.getListOfShopItems().stream()

            .mapToDouble(item -> item.getQuantityOfStock())
            .average()
            .getAsDouble());

    return "index";
  }

  @RequestMapping(value = "/most-expensive-available")
  public String mostExpensiveAvailable(Model model) {
    model.addAttribute("items", myTable.getListOfShopItems().stream()

            .filter(item -> item.getQuantityOfStock() > 0)
            .max(Comparator.comparingDouble(ShopItem::getPrice)).get());

    return "index";
  }


}
