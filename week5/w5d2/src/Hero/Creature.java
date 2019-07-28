package Hero;

public class Creature {

  String name;
  double healthPoints;
  double attackPower;
  double defense;

  Creature (String name, double healthPoints, double attackPower, double defense) {
    this.name = name;
    this.healthPoints = healthPoints;
    this.attackPower = (attackPower / 100 * 90) + ((int)(Math.random() *10 ));
    this.defense = defense;
  }

  public void attack (Creature targetCreatureName) {

      if (this.healthPoints <= 0) {
        System.out.println("No more attacks! " + this.name + " is dead!");
              }

      if (targetCreatureName.healthPoints <= 0) {
        System.out.println("No more attacks! " + targetCreatureName.name + " is dead!");
      }


      targetCreatureName.healthPoints = targetCreatureName.healthPoints - (this.attackPower - targetCreatureName.defense);
      this.healthPoints = this.healthPoints - (targetCreatureName.attackPower - this.defense);


    System.out.println(this.name + " attacked " + targetCreatureName.name + " for " + this.attackPower + " damage. " +
            targetCreatureName.name + " has " + targetCreatureName.healthPoints + " left.");

    System.out.println(targetCreatureName.name + " attacked " + this.name + " for " + targetCreatureName.attackPower + " damage. " +
            this.name + " has " + this.healthPoints + " left.");



  }




}
