package PiratesExam;

public class Main {

  public static void main(String[] args) {

    Pirate pirate1 = new Pirate ("pirate1");
    Pirate pirate2 = new Pirate ("pirate2");
    Pirate pirate3 = new Pirate ("pirate3");

   pirate1.drinkSomeRum();
    pirate1.drinkSomeRum();
    pirate1.drinkSomeRum();
    pirate1.drinkSomeRum();
    pirate1.getAlcoholLevel();
    pirate1.howsItGoingMate();

    pirate1.drinkSomeRum();
    pirate1.getAlcoholLevel();
    pirate1.howsItGoingMate();

    pirate1.die();
    pirate1.drinkSomeRum();
    pirate1.aliveChecker();

    pirate2.brawl(pirate3);

    Ship ship1 = new Ship();
    ship1.fillShip();
    ship1.getCrewNumber();
  }

}
