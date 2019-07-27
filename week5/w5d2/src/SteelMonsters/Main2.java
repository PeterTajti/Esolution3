package SteelMonsters;
public class Main2 {

  public static void main(String[] args) {

    Army myArmy = new Army (5);

    Tank Panther = new Tank ("Panther", 500, 75);
    Tank Tiger = new Tank ("Tiger", 750, 88);
    Tank KingTiger = new Tank ("KingTiger", 850, 90);
    Tank Lion = new Tank ("Lion", 750, 75);
    Tank Leopard = new Tank ("Leopard", 600, 90);

    myArmy.addTank(Panther);
    myArmy.addTank(Tiger);
    myArmy.addTank(KingTiger);
    myArmy.addTank(Lion);
    myArmy.addTank(Leopard);

    myArmy.printTankList();

    System.out.println("\n"+"The sum of the tanks HP is: " + myArmy.sumOfHealthpoints());
    System.out.println("\n"+"The average HP of the tanks is: " + myArmy.averageHealthpoints());

    myArmy.enemyAirStrike();
    myArmy.printTankList();
  }
}
