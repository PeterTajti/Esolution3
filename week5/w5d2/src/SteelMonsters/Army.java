package SteelMonsters;

import java.util.ArrayList;
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
          if (this.listOfTanks.size() > 0) {

          }
    }
}

// Student stupidest;
//
//        if (this.listOfStudents.size() > 0) {
//            stupidest = this.listOfStudents.get(0);
//            for (Student i : this.listOfStudents) {
//                if (i.knowledge < stupidest.knowledge) {
//                    stupidest = i;
//                }
//            }
//
//            this.listOfStudents.remove(stupidest);
//            System.out.println("We removed " + stupidest.name + " because he had the smallest knowledge. It was only " + stupidest.knowledge +"\n" );
//        } else {
//            System.out.println("there is no student to remove");
//        }

