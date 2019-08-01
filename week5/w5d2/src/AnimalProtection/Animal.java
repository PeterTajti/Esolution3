package AnimalProtection;

public class Animal {

  String name;
  String ownerName;
  boolean isHealty;
  boolean Adoptable;
  int healCost;

  Animal() {}

  public void heal() {
    this.isHealty = true;
  }

  public boolean isAdoptable() {
    if (this.isHealty == true) {
      this.Adoptable = true;

    } else {
      System.out.println("Sick animal cannot be adopted.");
    }
    return Adoptable;
  }

  @Override
  public String toString() {
    if (this.isHealty == false) {
      return this.name + " is not healthy" + " < " +
              this.healCost + " €> " + "is not adoptable.";
    } else {
      return this.name + " is healthy" + " is adoptable";
    }
  }
}






