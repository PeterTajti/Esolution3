package AnimalProtection;

public class Parrot extends Animal {

   Parrot (boolean isHealthy) {

     this.name = getClass().getSimpleName();
     this.isHealty = isHealthy;
     this.healCost = 4+(int)(Math.random()*7);
   }

}
