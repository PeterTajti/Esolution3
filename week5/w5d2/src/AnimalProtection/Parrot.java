package AnimalProtection;

public class Parrot extends Animal {

   Parrot (boolean isHealthy) {

     this.isHealty = isHealthy;
     int healCost = 4+(int)(Math.random()*7);
   }

}
