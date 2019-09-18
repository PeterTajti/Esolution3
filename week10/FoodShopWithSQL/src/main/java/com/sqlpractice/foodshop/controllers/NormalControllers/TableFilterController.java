package com.sqlpractice.foodshop.controllers;

import com.sqlpractice.foodshop.models.ShopItem;
import com.sqlpractice.foodshop.repositories.ShopItemRepository;
import com.sqlpractice.foodshop.services.ShopItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Comparator;
import java.util.stream.Collectors;

@Controller
public class TableFilterController {

  private ShopItemService shopItemService;

  @Autowired
  public TableFilterController(ShopItemService shopItemService) {
    this.shopItemService = shopItemService;
  }



  @RequestMapping(value = "/least-calories")
  public String lessKcalFirst(Model model) {
    model.addAttribute("items", shopItemService.findAll().stream()
            .sorted((Comparator.comparingDouble(ShopItem::getCalories)))
            .collect(Collectors.toList()));

    return "index";
  }

  @RequestMapping(value = "/most-calories")
  public String mostKcalFirst(Model model) {
    model.addAttribute("items", shopItemService.findAll().stream()

            .sorted((Comparator.comparingDouble(ShopItem::getCalories).reversed()))
            .collect(Collectors.toList()));

    return "index";
  }

  @RequestMapping(value = "/average-calories")
  public String averageKcal(Model model) {
    double averageCalories = shopItemService.findAll().stream()
            .mapToDouble(item -> item.getCalories())
            .average()
            .getAsDouble();
    model.addAttribute("averageKcal", averageCalories);

    return "index";
  }

  @RequestMapping(value = "/least-kcal-available")
  public String lessKcalAvailable(Model model) {
    model.addAttribute("items", shopItemService.findAll().stream()

            .filter(item -> item.getQuantity() > 0)
            .min(Comparator.comparingDouble(ShopItem::getCalories)).get());

    return "index";
  }

  @RequestMapping(value = "/cheapest")
  public String cheapestFirst(Model model) {
    model.addAttribute("items", shopItemService.findAll().stream()

            .sorted((Comparator.comparingDouble(ShopItem::getPrice)))
            .collect(Collectors.toList()));

    return "index";
  }

  @RequestMapping(value = "/most-expensive")
  public String mostExpensiveFirst(Model model) {
    model.addAttribute("items", shopItemService.findAll().stream()

            .sorted((Comparator.comparingDouble(ShopItem::getPrice).reversed()))
            .collect(Collectors.toList()));

    return "index";
  }

  @RequestMapping(value = "/most-expensive-available")
  public String mostExpensiveAvailable(Model model) {
    model.addAttribute("items", shopItemService.findAll().stream()

            .filter(item -> item.getQuantity() > 0)
            .max(Comparator.comparingDouble(ShopItem::getPrice)).get());

    return "index";
  }

  @RequestMapping(value = "/average-price")
  public String averagePrice(Model model) {
    double averagePrice = shopItemService.findAll().stream()
            .mapToDouble(item -> item.getPrice())
            .average()
            .getAsDouble();
    model.addAttribute("averagePrice", averagePrice);

    return "index";
  }

  @RequestMapping(value = "/less-quantity")
  public String lessQuantityFirst(Model model) {
    model.addAttribute("items", shopItemService.findAll().stream()

            .sorted((Comparator.comparingDouble(ShopItem::getQuantity)))
            .collect(Collectors.toList()));

    return "index";
  }

  @RequestMapping(value = "/most-quantity")
  public String mostQuantityFirst(Model model) {
    model.addAttribute("items", shopItemService.findAll().stream()

            .sorted((Comparator.comparingDouble(ShopItem::getQuantity).reversed()))
            .collect(Collectors.toList()));

    return "index";
  }

  @RequestMapping(value = "/average-quantity")
  public String averageQuantity(Model model) {
    double averageQuantity = shopItemService.findAll().stream()
            .mapToDouble(item -> item.getQuantity())
            .average()
            .getAsDouble();
    model.addAttribute("averageQuantity", averageQuantity);

    return "index";
  }

  @RequestMapping(value = "/only-available")
  public String onlyAvailable(Model model) {
    model.addAttribute("items", shopItemService.findAll().stream()
            .filter(item -> item.getQuantity() > 0)
            .collect(Collectors.toList()));
    return "index";
  }

  @RequestMapping(value = "/preservatives")
  public String preservatives (Model model) {
    model.addAttribute("items", shopItemService.findAll().stream()
    .filter(item -> item.isContainsPreservatives()==true)
    .collect(Collectors.toList()));
 return "index";
  }

  @RequestMapping(value = "/preservativeFree")
  public String preservativeFree (Model model) {
    model.addAttribute("items", shopItemService.findAll().stream()
            .filter(item -> item.isContainsPreservatives()==false)
            .collect(Collectors.toList()));
    return "index";
  }

}
