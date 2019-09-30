package InheritancePractice_Week4.AircraftCarrier;

import java.util.ArrayList;

public class Carrier {

  ArrayList<Aircrafts> listOfAircrafts = new ArrayList<>();

  int storeOfAmmo;
  int healthPoints;
  int totalDamage = 0;

  public Carrier() {

    this.storeOfAmmo = 300;
    this.healthPoints = 2000;

  }

  public void add(Aircrafts aircrafts) {

    listOfAircrafts.add(aircrafts);

  }

  public String fill() {

    if (storeOfAmmo != 0) {
      for (int i = 0; i < listOfAircrafts.size(); i++) {
        if (listOfAircrafts.get(i).currentAmmunition != listOfAircrafts.get(i).maxAmmo) {

          listOfAircrafts.get(i).refill(storeOfAmmo);
          storeOfAmmo -= listOfAircrafts.get(i).currentAmmunition;

        }

      }


    } else {


      return "ammo store is empty";
    }

    return "the planes are loaded";
  }


  public void fight(Carrier carrier) {

    for (int i = 0; i < listOfAircrafts.size(); i++) {

      carrier.healthPoints -= listOfAircrafts.get(i).missingAmmo * listOfAircrafts.get(i).baseDamage;
      listOfAircrafts.get(i).currentAmmunition = 0;


    }

  }

  public void getTotalDamage() {

    for (int i = 0; i < listOfAircrafts.size(); i++) {

      totalDamage += listOfAircrafts.get(i).damageDealt;


    }
  }

  public String getStatus() {

    if (healthPoints > 0) {
      for (int i = 0; i < listOfAircrafts.size(); i++) {

        System.out.println(healthPoints + " " + listOfAircrafts.size() + " " + storeOfAmmo + " " + totalDamage);

      }


    } else {

      return "Its dead Jim";
    }
    return healthPoints + " " + listOfAircrafts.size() + " " + storeOfAmmo + " " + totalDamage;
  }


}
