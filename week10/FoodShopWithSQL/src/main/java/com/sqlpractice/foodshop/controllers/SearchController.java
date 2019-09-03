package com.sqlpractice.foodshop.controllers;

import com.sqlpractice.foodshop.repositories.ShopItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.stream.Collectors;

@Controller
public class SearchController {

  private ShopItemRepository shopItemRepository;

  @Autowired
  public SearchController(ShopItemRepository shopItemRepository) {
    this.shopItemRepository = shopItemRepository;
  }

  @PostMapping("/search")
  public String getText(@RequestParam("keyword") String keyword, Model model) {
    model.addAttribute("items", shopItemRepository.findAll().stream()
            .filter(shopItem -> shopItem.getName().toLowerCase().contains(keyword) || shopItem.getDescription().toLowerCase().contains(keyword))
            .collect(Collectors.toList()));
    return "index";
  }
}
