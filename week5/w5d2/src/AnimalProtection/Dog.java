package AnimalProtection;

public class Dog extends Animal {

   Dog (boolean isHealthy) {

     this.isHealty = isHealthy;
     int healCost = 1+(int)(Math.random()*8);

   }

}
