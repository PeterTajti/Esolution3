package com.foodshop.demoversion.models;

public class ShopItem {


    private String name;
    private String description;
    private int calories;
    private int price;
    private int quantity;

    public ShopItem(String name, String description, int calories, int price, int quantity) {
        this.name = name;
        this.description = description;
        this.calories = calories;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}
