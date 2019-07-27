package SteelMonsters;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Army {
  int armySize;
  List<Tank> listOfTanks = new ArrayList<>();

  Army (int armySize) {
    this.armySize = armySize;
  }

  public void addTank (Tank tank) {
    if (this.armySize > this.listOfTanks.size()) {
      this.listOfTanks.add(tank);
      } else {
      System.out.println("The army is full, cant add more tanks into it.");
      }

    }

    public void printTankList () {
      for (Tank tank : this.listOfTanks  ) {
        System.out.println(tank.name + " has " + tank.healthPoints + " healthpoints and " + tank.firePower + " firepower.");
      }
    }

    public int sumOfHealthpoints () {

      int sumOfHp = 0;

      for (Tank tank : this.listOfTanks) {
        sumOfHp += tank.healthPoints;
      }
      return sumOfHp;
    }

    public double averageHealthpoints () {
      double avgHp = 0;
      avgHp = sumOfHealthpoints() / listOfTanks.size();
      return avgHp;
    }

    public void enemyAirStrike () {
      System.out.println("\n" + "*** The enemy airstrike damaged all tanks, each of them lost 600 HP and 10 firepower. ***");

      if (this.listOfTanks.size() > 0) {

      for (int i = 0; i < listOfTanks.size(); i++) {      //600 sebzés mindegyik tankra
        this.listOfTanks.get(i).healthPoints -= 600;
        this.listOfTanks.get(i).firePower -= 10;
      }

        for (int i = 0; i < listOfTanks.size(); i++) {
          if (this.listOfTanks.get(i).healthPoints <= 0) {
            System.out.println(this.listOfTanks.get(i).name + " is destroyed.");
            this.listOfTanks.remove(i);
          }
        }
      } else {
        System.out.println("There is no tank to bomb.");
      }
    }
}
