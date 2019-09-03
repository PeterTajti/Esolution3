package com.sqlpractice.foodshop.controllers;

import com.sqlpractice.foodshop.models.ShopItem;
import com.sqlpractice.foodshop.repositories.ShopItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class DataController {

  private ShopItemRepository shopItemRepository;

  @Autowired
  public DataController(ShopItemRepository shopItemRepository) {
    this.shopItemRepository = shopItemRepository;
  }

  @PostMapping("/add")
  public String addItem(@ModelAttribute(name = "shopitem") ShopItem shopItem) {
    System.out.println(shopItem.getName() + " " + shopItem.getDescription() + " " + shopItem.getCalories() + " " + shopItem.getPrice() + " " + shopItem.getQuantity());
    shopItemRepository.save(shopItem);
    return "redirect:/";
  }


  @GetMapping("/{id}/delete")
  public String renderingDelete(@PathVariable("id") Integer id){
    return "deleteShopItem";
  }

  @PostMapping("/{id}/delete")
  public String deleting(@PathVariable("id") Integer id){
    shopItemRepository.deleteById(id);
    return "redirect:/";
  }

  @GetMapping("/{id}/edit")
  public String renderingEdit(@PathVariable("id") Integer id, Model model){
    model.addAttribute("item", shopItemRepository.findById(id));
    model.addAttribute("id", id);
    return "editShopItem";
  }


  @PostMapping("/{id}/edit")
  public String editing(@PathVariable("id") Integer id, @ModelAttribute ShopItem editedShopItem){
    shopItemRepository.save(editedShopItem);
    return "redirect:/";
  }
}
