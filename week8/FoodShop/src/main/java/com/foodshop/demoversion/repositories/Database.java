package com.foodshop.demoversion.repositories;

import com.foodshop.demoversion.models.ShopItem;

import java.util.ArrayList;
import java.util.List;

public class Database {

    List<ShopItem> shopItems;

    public Database() {
        shopItems = new ArrayList<>();
        fillList();
    }


    ShopItem ShopItem1 = new ShopItem("Hamburger", "Roll with 16gr beef and vegetables.", 300, 800, 10);
    ShopItem ShopItem2 = new ShopItem("Pizza", "32cm pizza on tomato basis with cheese and ham. ", 600, 1200, 3);
    ShopItem ShopItem3 = new ShopItem("Gyros", "Chicken meat with vegetables and yoghurt sauce in pita.", 250, 700, 5);

    public List<ShopItem> getShopItems() {
        return shopItems;
    }

    public void fillList () {
        shopItems.add(ShopItem1);
        shopItems.add(ShopItem2);
        shopItems.add(ShopItem3);
    }

    public void addItem (ShopItem shopItem){
        this.shopItems.add(new ShopItem(shopItem.getName(), shopItem.getDescription(), shopItem.getCalories(), shopItem.getPrice(), shopItem.getQuantity()));
    }

    public void setShopItems(List<ShopItem> shopItems) {
        this.shopItems = shopItems;
    }
}
