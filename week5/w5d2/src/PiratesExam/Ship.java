package PiratesExam;
import java.util.ArrayList;

public class Ship {

  ArrayList<Pirate> crew = new ArrayList<>();

  Ship() {
  }

  public void fillShip() {

    crew.add(new Captain());

    int rndCrewNumber = (int) (Math.random() * 10 + 10);
    for (int i = 0; i < rndCrewNumber; i++) {
      crew.add(new Pirate());
    }
  }


  public void shipInfo() {

    int livingPirateCounter = 0;

    for (int i = 0; i < crew.size(); i++) {
      if (crew.get(i).isAlive == true) {
        livingPirateCounter++;
      }
    }
      System.out.println("The ship has " + crew.size() + " pirates on board. " + "The number of the alive pirates is " +
              livingPirateCounter + ". The captain's alcohol level is " +
              crew.get(0).alcoholLevel + ". Is he passed out? ---> " + crew.get(0).isPassedOut);

  }
}

