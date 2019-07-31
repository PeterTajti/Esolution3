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
    if (this.isHealty = true) {

    } else {
      System.out.println("Sick animal cannot be adopted.");
    }
    return Adoptable;
  }

  @Override
  public String toString() {
    if (this.isHealty == false) {
      return(this.name + " is healthy? --->" + this.isHealty + " < " +
              this.healCost + " > " + " and adpotable? --->" + this.isAdoptable());
    } else {
      return(this.name + "is healthy? --->" + this.isHealty + " and adpotable? --->" + this.isAdoptable());
    }
  }
}






