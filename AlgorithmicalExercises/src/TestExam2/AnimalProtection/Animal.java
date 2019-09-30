package TestExam2.AnimalProtection;

public class Animal {

  int healthCost;
  String ownersName;
  String animalName;
  boolean isHealthy;
  boolean isAdoptable;


  public Animal() {

  }

  public Animal(String animalName, boolean isHealthy) {

    this.animalName = animalName;
    this.isHealthy = isHealthy;

  }



  public void heal() {

    this.isHealthy = true;

  }

  public boolean isAdpoted() {

    if (!this.isHealthy) {

      return false;
    }

    return true;
  }

  public String toString() {

    String animalStatus;

    if (!this.isHealthy) {

      animalStatus = this.animalName + " is not healthy " + this.healthCost + " and not adoptable";

    } else {

      animalStatus = this.animalName + " is healthy and not adoptable";
    }

    return animalStatus;
  }
}
