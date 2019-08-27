package com.sqlpractice.foodshop.controllers;

import com.sqlpractice.foodshop.repositories.ShopItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

  ShopItemRepository shopItemRepository;

  @Autowired
  public MainController(ShopItemRepository shopItemRepository) {
    this.shopItemRepository = shopItemRepository;
  }

  @RequestMapping(value="")
  public String homePage(Model model){
    model.addAttribute("items", shopItemRepository.findAll());
    return "index";
  }

}
