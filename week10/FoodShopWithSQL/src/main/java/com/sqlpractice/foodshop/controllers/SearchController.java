package com.sqlpractice.foodshop.controllers;

import com.sqlpractice.foodshop.repositories.ShopItemRepository;
import com.sqlpractice.foodshop.services.ShopItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.stream.Collectors;

@Controller
public class SearchController {

  private ShopItemService shopItemService;

  @Autowired
  public SearchController(ShopItemService shopItemService) {
    this.shopItemService = shopItemService;
  }

  @PostMapping("/search")
  public String getText(@RequestParam("keyword") String keyword, Model model) {
    model.addAttribute("items", shopItemService.findAll().stream()
            .filter(shopItem -> shopItem.getName().toLowerCase().contains(keyword) || shopItem.getDescription().toLowerCase().contains(keyword))
            .collect(Collectors.toList()));
    return "index";
  }
}
