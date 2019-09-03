package com.sqlpractice.foodshop.controllers;

import com.sqlpractice.foodshop.models.ShopItem;
import com.sqlpractice.foodshop.repositories.ShopItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class PriceController {

  private ShopItemRepository shopItemRepository;

  @Autowired
  public PriceController(ShopItemRepository shopItemRepository) {
    this.shopItemRepository = shopItemRepository;
  }

  @PostMapping("/priceincreaseplus10")
  public String pricePlusTen(@RequestParam("priceincreaseplus10") String button, Model model) {
    List<ShopItem> l = shopItemRepository.findAll();
    for (int i = 0; i < l.size(); i++) {
      l.get(i).setPrice(l.get(i).getPrice() + 10);
      shopItemRepository.save(l.get(i));
    }
    model.addAttribute("items", shopItemRepository.findAll());
    return "redirect:/";
  }

  @PostMapping("/priceincreaseplus100")
  public String pricePlusHundred(@RequestParam("priceincreaseplus100") String button, Model model) {
    List<ShopItem> l = shopItemRepository.findAll();
    for (int i = 0; i < l.size(); i++) {
      l.get(i).setPrice(l.get(i).getPrice() + 100);
      shopItemRepository.save(l.get(i));
    }
    model.addAttribute("items", shopItemRepository.findAll());
    return "redirect:/";
  }

  @PostMapping("/pricedecrease10")
  public String priceMinusTen(@RequestParam("pricedecrease10") String button, Model model) {
    List<ShopItem> l = shopItemRepository.findAll();
    for (int i = 0; i < l.size(); i++) {
      l.get(i).setPrice(l.get(i).getPrice() - 10);
      shopItemRepository.save(l.get(i));
    }
    model.addAttribute("items", shopItemRepository.findAll());
    return "redirect:/";
  }

  @PostMapping("/pricedecrease100")
  public String priceMinusHundred(@RequestParam("pricedecrease100") String button, Model model) {
    List<ShopItem> l = shopItemRepository.findAll();
    for (int i = 0; i < l.size(); i++) {
      l.get(i).setPrice(l.get(i).getPrice() - 100);
      shopItemRepository.save(l.get(i));
    }
    model.addAttribute("items", shopItemRepository.findAll());
    return "redirect:/";
  }

}
