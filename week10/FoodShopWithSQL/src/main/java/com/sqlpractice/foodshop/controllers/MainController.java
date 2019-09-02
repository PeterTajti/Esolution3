package com.sqlpractice.foodshop.controllers;
import com.sqlpractice.foodshop.models.ShopItem;
import com.sqlpractice.foodshop.repositories.ShopItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.Comparator;
import java.util.stream.Collectors;

@Controller
public class MainController {

  private ShopItemRepository shopItemRepository;

  @Autowired
  public MainController(ShopItemRepository shopItemRepository) {
    this.shopItemRepository = shopItemRepository;
  }

  @RequestMapping(value="")
  public String homePage(Model model){
    model.addAttribute("items", shopItemRepository.findAll());
    return "index";
  }

  @PostMapping("/add")
  public String addItem(@ModelAttribute(name = "shopitem") ShopItem shopItem) {
    System.out.println(shopItem.getName() + " " + shopItem.getDescription() + " " + shopItem.getCalories() + " " + shopItem.getPrice() + " " + shopItem.getQuantity());
    shopItemRepository.save(shopItem);
    return "redirect:/";
  }

  @GetMapping("/{id}/delete")
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

  @RequestMapping(value = "/least-calories")
  public String lessKcalFirst(Model model) {
    model.addAttribute("items", shopItemRepository.findAll().stream()
            .sorted((Comparator.comparingDouble(ShopItem::getCalories)))
            .collect(Collectors.toList()));

    return "index";
  }

  @RequestMapping(value = "/most-calories")
  public String mostKcalFirst(Model model) {
    model.addAttribute("items", shopItemRepository.findAll().stream()

            .sorted((Comparator.comparingDouble(ShopItem::getCalories).reversed()))
            .collect(Collectors.toList()));

    return "index";
  }

  @RequestMapping(value = "/average-calories")
  public String averageKcal(Model model) {
    double averageCalories = shopItemRepository.findAll().stream()
            .mapToDouble(item -> item.getCalories())
            .average()
            .getAsDouble();
    model.addAttribute("averageKcal", averageCalories);

    return "index";
  }

  @RequestMapping(value = "/least-kcal-available")
  public String lessKcalAvailable(Model model) {
    model.addAttribute("items", shopItemRepository.findAll().stream()

            .filter(item -> item.getQuantity() > 0)
            .min(Comparator.comparingDouble(ShopItem::getCalories)).get());

    return "index";
  }

  @PostMapping("/search")
  public String getText(@RequestParam("keyword") String keyword, Model model) {
    model.addAttribute("items", shopItemRepository.findAll().stream()
            .filter(shopItem -> shopItem.getName().toLowerCase().contains(keyword) || shopItem.getDescription().toLowerCase().contains(keyword))
            .collect(Collectors.toList()));
    return "index";
  }

}
