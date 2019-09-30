package TestExam2.AnimalProtection;

public class Cat extends Animal {

  public Cat() {

    healthCost = ((int) (Math.random() * 6));
    animalName = "Csiky";

  }

  public Cat(String animalName, boolean isHealthy) {

    super(animalName, isHealthy);

  }

}
