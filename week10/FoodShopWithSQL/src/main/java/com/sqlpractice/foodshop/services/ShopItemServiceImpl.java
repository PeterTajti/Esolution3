package com.sqlpractice.foodshop.services;

import com.sqlpractice.foodshop.models.ShopItem;
import com.sqlpractice.foodshop.repositories.ShopItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ShopItemServiceImpl implements ShopItemService {

  ShopItemRepository shopItemRepository;

  @Autowired
  public ShopItemServiceImpl(ShopItemRepository shopItemRepository) {
    this.shopItemRepository = shopItemRepository;
  }

  @Override
  public List<ShopItem> findAll() {
    return shopItemRepository.findAll();
  }

  @Override
  public void save(ShopItem shopItem) {
    shopItemRepository.save(shopItem);
  }

  @Override
  public void deleteById(Integer id) {
    shopItemRepository.deleteById(id);
  }

  @Override
  public ShopItem findById(int id) {
    List<ShopItem> resultList = shopItemRepository.findById(id);
    if (resultList.size() > 0) {
      return resultList.get(0);
    }
    return new ShopItem();
  }

  @Override
  public boolean isTypeOK(String type) {
    boolean isTypeEquals = false;
    if (type.equals("fatty") || type.equals("carbohidratebomb")) {
      isTypeEquals = true;
    }
    return isTypeEquals;
  }


  @Override
  public List<ShopItem> findBadItemsWith400kcal(String type) {
    if (type.equals("fatty") || type.equals("carbohidratebomb")) {
      return shopItemRepository.findAll().stream()
              .filter(item -> item.getCalories() == 400)
              .collect(Collectors.toList());
    }

    return null;
  }
}
