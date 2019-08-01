package AnimalProtection;

public class Cat extends Animal {

  Cat (boolean isHealthy){

    this.name = getClass().getSimpleName();
    this.isHealty = isHealthy;
    this.healCost = (int)(Math.random()*7);
  }




}
