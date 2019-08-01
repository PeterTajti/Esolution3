package AnimalProtection;

public class Dog extends Animal {

   Dog (boolean isHealthy) {

     this.name = getClass().getSimpleName();
     this.isHealty = isHealthy;
     this.healCost = 1+(int)(Math.random()*8);

   }

}
