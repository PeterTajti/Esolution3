package spring.webrestaurant.Models;

public class Fox {

  private String name;
  private String description;
  private String color;
  private String food;
  private int value;
  private int quantity;
  private String foxPicture;

  public Fox(String name, String description, String color, String food, int value, int quantity, String foxPicture) {
    this.name = name;
    this.description = description;
    this.color = color;
    this.food = food;
    this.value = value;
    this.quantity = quantity;
    this.foxPicture = foxPicture;
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

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String getFood() {
    return food;
  }

  public void setFood(String food) {
    this.food = food;
  }

  public int getValue() {
    return value;
  }

  public void setValue(int value) {
    this.value = value;
  }

  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  public String getFoxPicture() {
    return foxPicture;
  }

  public void setFoxPicture(String foxPicture) {
    this.foxPicture = foxPicture;
  }
}
