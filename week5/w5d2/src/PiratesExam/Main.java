package PiratesExam;

public class Main {

  public static void main(String[] args) {

    Pirate pirate1 = new Pirate ();

    Pirate pirate2 = new Pirate ();
    Pirate pirate3 = new Pirate ();

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

  }

}
