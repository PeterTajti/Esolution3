package TestExam1.Pirates;

public class Pirate {

  //A pirate has a name, an amount of gold and health points, the default value of which is 10.
  //A pirate might be a captain and may have a wooden leg.
  String name;
  int gold = 10;
  int health = 10;
  boolean isCaptain;
  boolean hasWoodenLeg;

  public Pirate(String name, boolean isCaptain, boolean hasWoodenLeg) {

    //A pirate has a name, an amount of gold and health points, the default value of which is 10.
    //A pirate might be a captain and may have a wooden leg.
    //Amik nincsenek specifikálva azokat majd a példányosítás során kell megadni.
    this.name = name;
    this.isCaptain = isCaptain;
    this.hasWoodenLeg = hasWoodenLeg;

  }

  public Pirate(boolean isCaptain) {

    this.isCaptain = isCaptain;

  }

  public Pirate() {


  }

  public void work() {

    if (this.isCaptain) {

      gold += 10;
      health -= 5;

    } else {

      gold += 1;
      health -= 1;

    }

  }

  public void party() {

    if (this.isCaptain) {

      health += 10;

    } else {

      health += 1;

    }

  }

  public String toString() {

    String pirateStatus;

    if (this.hasWoodenLeg) {

      pirateStatus = "Hello, I'm " + this.name + " . I have a wooden leg and " + this.gold + " golds.";

    } else {

      pirateStatus = "Hello, I'm " + this.name + " . I still have my real legs and " + this.gold + " golds.";

    }

    System.out.println(pirateStatus);
    return pirateStatus;
  }

}
