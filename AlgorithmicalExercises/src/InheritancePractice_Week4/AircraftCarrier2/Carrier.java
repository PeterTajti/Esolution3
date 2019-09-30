package InheritancePractice_Week4.AircraftCarrier2;

import java.util.ArrayList;

public class Carrier {

  ArrayList<Aircrafts> listOfPlanes = new ArrayList<>();
  int storeOfAmmo;
  int hP;

  public Carrier(int storeOfAmmo, int hP) {

    this.storeOfAmmo = storeOfAmmo;
    this.hP = hP;

  }

  public void add(Aircrafts aircrafts) {

    listOfPlanes.add(aircrafts);
  }

  public void fill(Aircrafts aircrafts) {
    if (storeOfAmmo != 0) {
      for (int i = 0; i < listOfPlanes.size(); i++) {
        listOfPlanes.get(i).refill(storeOfAmmo);
        storeOfAmmo -= aircrafts.missingAmmo;
      }
    }
  }
  public void fight(Carrier enemyCarrier) {
    for (int i = 0; i < listOfPlanes.size(); i++ ) {
      listOfPlanes.get(i).fight();
      enemyCarrier.hP-=listOfPlanes.get(i).damageDealt;

    }

  }
}
