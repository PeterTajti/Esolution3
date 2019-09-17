package com.sqlpractice.foodshop.controllers.RestController;

import com.sqlpractice.foodshop.services.ShopItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestMainController {

  private ShopItemService shopItemService;

  @Autowired
  public RestMainController(ShopItemService shopItemService) {
    this.shopItemService = shopItemService;
  }

  @GetMapping("/api/items")
  public ResponseEntity getAllItem() {
    return ResponseEntity.status(200).body(shopItemService.findAll());
  }

  @GetMapping("/api/{itemId}")
  public ResponseEntity getItemStats(@PathVariable("itemId") Integer id) {
    return ResponseEntity.status(200).body(shopItemService.findById(id));
  }

  @GetMapping("/api/baditems")
  public ResponseEntity getUnhealtyItems(@RequestParam("type") String type) {
    if (shopItemService.isTypeOK(type)) {
      return ResponseEntity.status(200).body(shopItemService.findBadItemsWith400kcal(type));
    }
    return ResponseEntity.status(400).body("No items found by these conditions.");
  }

}
