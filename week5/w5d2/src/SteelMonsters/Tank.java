package SteelMonsters;

public class Tank {

  String name;
  int healthPoints;
  int firePower;

  Tank (String name, int healthPoints, int firePower) {
    this.name = name;
    this.healthPoints = healthPoints;
    this.firePower = firePower;
  }

  public void getStats () {
    System.out.println(this.name + "'s stats: " + this.healthPoints + " healthpoints " + " & " + this.firePower + " firepower.");
  }

  public void repair (int numberOfRepairs) {
    for (int j = 0; j < numberOfRepairs; j++) {
      this.healthPoints += 100;
      }
    System.out.println("\n" + "We repaired " + this.name + " for " + (numberOfRepairs) + "*100" + " healthpoints");
  }

  public void upgradeWeapon (int numberOfUpgrades) {
    for (int i = 0; i < numberOfUpgrades; i++) {
      this.firePower +=5;
    }
    System.out.println("\n" + "We upgraded " + this.name + " for " + (numberOfUpgrades) + "*5" + " firepower" + "\n");
  }

  public void attack (Tank targetTankName, int numberOfAttacks) {

    for (int i = 1; i < numberOfAttacks+1; i++) {

      if (this.healthPoints <= 0) {
        System.out.println("No more attacks! " + this.name + " has been destroyed!");
      }

      if (targetTankName.healthPoints <= 0) {
        System.out.println("No more attacks! " + targetTankName.name + " has been destroyed!");
      }

      targetTankName.healthPoints -= this.firePower;
      this.healthPoints -= targetTankName.firePower;

      System.out.println("*** This is the " + (i) + "." + " attack. ***" + "\n" +
              this.name + " attacked " + targetTankName.name + ". \n" +
              targetTankName.name + " suffered " + this.firePower + " damage, and it has " +
              targetTankName.healthPoints +
              " healthpoints left.");

      System.out.println(
              targetTankName.name + " counterattacked " + this.name + ". \n" +
              this.name + " suffered " + targetTankName.firePower + " damage, and it has " +
                      this.healthPoints + " healthpoints left." + "\n" + " ");

      if (this.healthPoints <= 0) {
        System.out.println("\n" + this.name + " is destroyed! " + "\n" + targetTankName.name + " survived the battle.");
        break;
      }

      if (targetTankName.healthPoints <= 0) {
        System.out.println("\n" + targetTankName.name + " is destroyed! " + " \n" + this.name + " survived the battle.");
        break;
      }
    }
  }
}

// sufferDamage (tankra megírni, ezt lehet majd haszhnálni pl. aknára is

// isAlive
