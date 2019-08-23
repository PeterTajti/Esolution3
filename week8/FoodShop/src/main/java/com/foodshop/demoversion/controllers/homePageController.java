package com.foodshop.demoversion.controllers;

import com.foodshop.demoversion.models.ShopItem;
import com.foodshop.demoversion.repositories.Database;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class homePageController {

    Database myDatabase = new Database();

    @GetMapping("/home")
    public String homePage(Model model) {

        model.addAttribute("items", myDatabase.getShopItems());

//        public String homePage(Model model, @ModelAttribute(name="shopitem") ShopItem shopItem) {
//        List<ShopItem> shopItems = myDatabase.getShopItems();
//        model.addAttribute("items", shopItems);

        return "index";
    }

    @PostMapping("/search")
    public String getText(@RequestParam("keyword") String keyword, Model model){
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


    @PostMapping("/shopitem/add")
    public String addItem(@ModelAttribute(name="shopitem") ShopItem shopItem) {
        System.out.println(shopItem.getName() + " " + shopItem.getDescription() + " " + shopItem.getCalories() + " " + shopItem.getPrice() + " " + shopItem.getQuantity());
        myDatabase.addItem(shopItem);
        return "redirect:/home";
    }

}
