package com.sqlpractice.foodshop.services;

import com.sqlpractice.foodshop.models.ShopItem;
import com.sqlpractice.foodshop.repositories.ShopItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
}
