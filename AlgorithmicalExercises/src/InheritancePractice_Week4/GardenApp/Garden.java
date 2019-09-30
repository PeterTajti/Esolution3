package InheritancePractice_Week4.GardenApp;

import java.util.ArrayList;

public class Garden {

  ArrayList<Plants> garden = new ArrayList<>();

  int amountOfWater;


  public Garden() {

    amountOfWater = 100;

  }

  public void add(Plants plants) {
    garden.add(plants);

  }

//  public void watering(int wateringAmount) {
//    int plantsWhoNeedsWater = 0;
//
//    for (int i = 0; i < garden.size(); i++) {
//      if (plants.needsWater = true) {
//
//        plantsWhoNeedsWater++;
//      }
//
//
//    }
//
//    for (int j = 0; j < garden.size(); j++) {
//
//      if (plants.needsWater = true) {
//
//        plants.currentWaterLevel += (wateringAmount / plantsWhoNeedsWater) * plants.absorbation;
//        amountOfWater -= wateringAmount;
//
//      }
//
//    }
//
//  }
//  public void gardenStatus() {
//    System.out.println(garden.size());
//  }
}
