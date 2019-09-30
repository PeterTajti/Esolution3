package TestExam1.Pirates;

public class Main {

  public static void main(String[] args) {

    Ship ship = new Ship();

    Pirate pirate1 = new Pirate("Jack", true, true);
    Pirate pirate2 = new Pirate("Joe", false, false);
    Pirate pirate3 = new Pirate("Jil", true, false);

    pirate1.toString();
    pirate2.toString();
    pirate3.toString();
    ship.addingToTheList(pirate1);
    ship.addingToTheList(pirate2);
    ship.getPoorPirates();
    ship.getGold();
    ship.lastDayOnTheShip();
    ship.prepareForBattle();
    ship.getGold();

  }

}