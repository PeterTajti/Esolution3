package TestExam1.Pirates;

import java.util.ArrayList;
import java.util.List;

public class Ship {

  //It should have a list of pirates.
  List<Pirate> listOfPirates = new ArrayList<>();

  //You must be able to add new pirates to the ship. It must have only one captain!
  public void addingToTheList(Pirate pirate) {

    if (this.listOfPirates.size() > 0) {

      listOfPirates.add(new Pirate());

    } else {

      this.listOfPirates.add(new Pirate(true));

    }

  }

  public List<String> getPoorPirates() {

    List<String> poorPiratesList = new ArrayList<>();

    if (new Pirate().hasWoodenLeg = true && new Pirate().gold < 15) {

      poorPiratesList.add(new Pirate().name);

    }

    return poorPiratesList;
  }

  public int getGold() {

    int sumGold = 0;

    for (int i = 0; i < this.listOfPirates.size(); i++) {

      sumGold += this.listOfPirates.get(i).gold;


    }

    return sumGold;
  }

  public void lastDayOnTheShip() {

    for (int j = 0; j < listOfPirates.size(); j++) {

      listOfPirates.get(j).party();

    }

  }

  public void prepareForBattle() {

    for (int k = 0; k < 5; k++) {

      for (int l = 0; l < listOfPirates.size(); l++) {

        listOfPirates.get(l).work();

      }

    }

    lastDayOnTheShip();


  }

}
