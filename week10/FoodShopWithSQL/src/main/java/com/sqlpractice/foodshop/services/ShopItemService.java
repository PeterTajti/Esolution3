package com.sqlpractice.foodshop.services;

import com.sqlpractice.foodshop.models.ShopItem;

import java.util.List;

public interface ShopItemService {

  List<ShopItem> findAll();


  void save (ShopItem shopItem);

  void deleteById (Integer id);

  ShopItem findById(int id);



}
