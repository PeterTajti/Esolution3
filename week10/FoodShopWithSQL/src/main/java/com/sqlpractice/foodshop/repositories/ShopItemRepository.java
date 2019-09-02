package com.sqlpractice.foodshop.repositories;

import com.sqlpractice.foodshop.models.ShopItem;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShopItemRepository extends CrudRepository<ShopItem, Integer> {

  List<ShopItem> findAll();

}
