package com.foodshop.demoversion.controllers;

import com.foodshop.demoversion.models.ShopItem;
import com.foodshop.demoversion.repositories.Database;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Comparator;
import java.util.stream.Collectors;

@Controller
public class homePageController {

  Database myDatabase = new Database();

  @RequestMapping(value = {"", "/", "/home"})
  public String homePage(Model model) {

    model.addAttribute("items", myDatabase.getShopItems());
    return "index";
  }

  @PostMapping("/search")
  public String getText(@RequestParam("keyword") String keyword, Model model) {
    model.addAttribute("items", myDatabase.getShopItems().stream()
            .filter(shopItem -> shopItem.getName().toLowerCase().contains(keyword) || shopItem.getDescription().toLowerCase().contains(keyword))
            .collect(Collectors.toList()));
    return "index";
  }

  @RequestMapping(value = "/cheapest")
  public String cheapestFirst(Model model) {
    model.addAttribute("items", myDatabase.getShopItems().stream()

            .sorted((Comparator.comparingDouble(ShopItem::getPrice)))
            .collect(Collectors.toList()));

    return "index";
  }

  @RequestMapping(value = "/less-kcal")
  public String lessKcalFirst(Model model) {
    model.addAttribute("items", myDatabase.getShopItems().stream()

            .sorted((Comparator.comparingDouble(ShopItem::getCalories)))
            .collect(Collectors.toList()));

    return "index";
  }

  @RequestMapping(value = "/most-kcal")
  public String mostKcalFirst(Model model) {
    model.addAttribute("items", myDatabase.getShopItems().stream()

            .sorted((Comparator.comparingDouble(ShopItem::getCalories).reversed()))
            .collect(Collectors.toList()));

    return "index";
  }

  @RequestMapping(value = "/average-kcal")
  public String averageKcal(Model model) {
    double averageCalories = myDatabase.getShopItems().stream()
            .mapToDouble(item -> item.getCalories())
            .average()
            .getAsDouble();
    model.addAttribute("averageKcal", averageCalories);

    return "index";
  }

  @RequestMapping(value = "/less-kcal-available")
  public String lessKcalAvailable(Model model) {
    model.addAttribute("items", myDatabase.getShopItems().stream()

            .filter(item -> item.getQuantity() > 0)
            .min(Comparator.comparingDouble(ShopItem::getCalories)).get());

    return "index";
  }


  @RequestMapping(value = "/most-expensive")
  public String mostExpensiveFirst(Model model) {
    model.addAttribute("items", myDatabase.getShopItems().stream()

            .sorted((Comparator.comparingDouble(ShopItem::getPrice).reversed()))
            .collect(Collectors.toList()));

    return "index";
  }

  @RequestMapping(value = "/only-available")
  public String onlyAvailable(Model model) {
    model.addAttribute("items", myDatabase.getShopItems().stream()
            .filter(item -> item.getQuantity() > 0)
            .collect(Collectors.toList()));
    return "index";
  }

  @RequestMapping(value = "/most-expensive-available")
  public String mostExpensiveAvailable(Model model) {
    model.addAttribute("items", myDatabase.getShopItems().stream()

            .filter(item -> item.getQuantity() > 0)
            .max(Comparator.comparingDouble(ShopItem::getPrice)).get());

    return "index";
  }

  @RequestMapping(value = "/average-price")
  public String averagePrice(Model model) {
    double averagePrice = myDatabase.getShopItems().stream()
            .mapToDouble(item -> item.getPrice())
            .average()
            .getAsDouble();
    model.addAttribute("averagePrice", averagePrice);

    return "index";
  }

  @RequestMapping(value = "/less-quantity")
  public String lessQuantityFirst(Model model) {
    model.addAttribute("items", myDatabase.getShopItems().stream()

            .sorted((Comparator.comparingDouble(ShopItem::getQuantity)))
            .collect(Collectors.toList()));

    return "index";
  }

  @RequestMapping(value = "/most-quantity")
  public String mostQuantityFirst(Model model) {
    model.addAttribute("items", myDatabase.getShopItems().stream()

            .sorted((Comparator.comparingDouble(ShopItem::getQuantity).reversed()))
            .collect(Collectors.toList()));

    return "index";
  }

  @RequestMapping(value = "/average-quantity")
  public String averageQuantity(Model model) {
    double averageQuantity = myDatabase.getShopItems().stream()
            .mapToDouble(item -> item.getQuantity())
            .average()
            .getAsDouble();
    model.addAttribute("averageQuantity", averageQuantity);

    return "index";
  }

  @PostMapping("/priceincreaseplus10")
  public String pricePlusTen(@RequestParam("priceincreaseplus10") String button, Model model) {
    for (int i = 0; i < myDatabase.getShopItems().size(); i++) {
      myDatabase.getShopItems().get(i).setPrice(myDatabase.getShopItems().get(i).getPrice() + 10);
    }
    model.addAttribute("shopitems", myDatabase.getShopItems());
    return "redirect:/home";
  }

  @PostMapping("/priceincreaseplus100")
  public String pricePlusHundred(@RequestParam("priceincreaseplus100") String button, Model model) {
    for (int i = 0; i < myDatabase.getShopItems().size(); i++) {
      myDatabase.getShopItems().get(i).setPrice(myDatabase.getShopItems().get(i).getPrice() + 100);
    }
    model.addAttribute("shopitems", myDatabase.getShopItems());
    return "redirect:/home";
  }

  @PostMapping("/pricedecrease10")
  public String priceMinusTen(@RequestParam("pricedecrease10") String button, Model model) {
    for (int i = 0; i < myDatabase.getShopItems().size(); i++) {
      myDatabase.getShopItems().get(i).setPrice(myDatabase.getShopItems().get(i).getPrice() - 10);
    }
    model.addAttribute("shopitems", myDatabase.getShopItems());
    return "redirect:/home";
  }

  @PostMapping("/pricedecrease100")
  public String priceMinusHundred(@RequestParam("pricedecrease100") String button, Model model) {
    for (int i = 0; i < myDatabase.getShopItems().size(); i++) {
      myDatabase.getShopItems().get(i).setPrice(myDatabase.getShopItems().get(i).getPrice() - 100);
    }
    model.addAttribute("shopitems", myDatabase.getShopItems());
    return "redirect:/home";
  }

  @PostMapping("/changePrice")
  public String changePrice(@RequestParam("button") String chosenButton, @RequestParam("item") String chosenName, @RequestParam("amoutOfPriceChange") int amoutOfPriceChange, Model model) {

    System.out.println(chosenButton);
    System.out.println(chosenName);
    System.out.println(amoutOfPriceChange);

    for (int i = 0; i < myDatabase.getShopItems().size(); i++) {
      if (myDatabase.getShopItems().get(i).getName().equals(chosenName) && chosenButton.equals("higherprice")) {
        myDatabase.getShopItems().get(i).setPrice(myDatabase.getShopItems().get(i).getPrice() + amoutOfPriceChange);
      } else if (myDatabase.getShopItems().get(i).getName().equals(chosenName) && chosenButton.equals("lowerprice")) {
        myDatabase.getShopItems().get(i).setPrice(myDatabase.getShopItems().get(i).getPrice() - amoutOfPriceChange);
      }
    }
    model.addAttribute("items", myDatabase.getShopItems());

    return "redirect:/home";
  }

  @PostMapping("/changeQuantity")
  public String changeQuantity(@RequestParam("button") String chosenButton, @RequestParam("item") String chosenName, @RequestParam("amoutOfQuantityChange") int amoutOfQuantityChange, Model model) {

    for (int i = 0; i < myDatabase.getShopItems().size(); i++) {
      if (myDatabase.getShopItems().get(i).getName().equals(chosenName) && chosenButton.equals("higherquantity")) {
        myDatabase.getShopItems().get(i).setQuantity(myDatabase.getShopItems().get(i).getQuantity() + amoutOfQuantityChange);
      } else if (myDatabase.getShopItems().get(i).getName().equals(chosenName) && chosenButton.equals("lowerquantity")) {
        myDatabase.getShopItems().get(i).setQuantity(myDatabase.getShopItems().get(i).getQuantity() - amoutOfQuantityChange);
      }
    }
    model.addAttribute("items", myDatabase.getShopItems());

    return "redirect:/home";
  }



  @PostMapping("/deleteShopitem")
  public String deleteShopitem(@RequestParam("button") String chosenButton, @RequestParam("item") String chosenName, Model model) {

    for (int i = 0; i < myDatabase.getShopItems().size(); i++) {
      if (myDatabase.getShopItems().get(i).getName().equals(chosenName) && chosenButton.equals("deleteItem")) {
        myDatabase.getShopItems().remove(i);
      }
    }
    model.addAttribute("items", myDatabase.getShopItems());
    return "redirect:/home";
  }


  @PostMapping("/shopitem/add")
  public String addItem(@ModelAttribute(name = "shopitem") ShopItem shopItem) {
    System.out.println(shopItem.getName() + " " + shopItem.getDescription() + " " + shopItem.getCalories() + " " + shopItem.getPrice() + " " + shopItem.getQuantity());
    myDatabase.addItem(shopItem);
    return "redirect:/home";
  }

}
