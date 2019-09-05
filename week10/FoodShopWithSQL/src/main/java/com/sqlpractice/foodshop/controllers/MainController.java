package com.sqlpractice.foodshop.controllers;
import com.sqlpractice.foodshop.models.ShopItem;
import com.sqlpractice.foodshop.repositories.ShopItemRepository;
import com.sqlpractice.foodshop.services.ShopItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.Comparator;
import java.util.stream.Collectors;

@Controller
public class MainController {

  private ShopItemService shopItemService;

  @Autowired
  public MainController(ShopItemService shopItemService) {
    this.shopItemService = shopItemService;
  }

  @RequestMapping(value="")
  public String homePage(Model model){
    model.addAttribute("items", shopItemService.findAll());
    return "index";
  }





}
