package SteelMonsters;
public class Main {
  public static void main(String[] args) {

    Tank Panther = new Tank ("Panther", 500, 75);
    Tank Tiger = new Tank ("Tiger", 750, 88);

      Panther.attack(Tiger, 3);
      Panther.getStats();
      Tiger.getStats();

      Panther.repair(3);
      Panther.upgradeWeapon(3);

      Panther.getStats();
      Tiger.getStats();

      Panther.attack(Tiger, 6);

  }
}


