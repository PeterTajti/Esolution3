package TestExam2.AnimalProtection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Shelter {

  int budget;
  int adoptedMoney;
  String adopterName;
  List<Animal> animalsList = new ArrayList<Animal>();
  List<String> adoptersList = new ArrayList<>();
  HashMap<String, String> animalOwnerPair = new HashMap<>();

  public Shelter(List animalsList, List adoptersLists) {

    budget = 50;
    this.animalsList = animalsList;
    this.adoptersList = adoptersLists;

  }

  public int rescue(Animal animal) {

    animalsList.add(animal);

    return animalsList.size();
  }

  public int heal() {

    for (int i = 0; i < animalsList.size(); i++) {

      if (!animalsList.get(i).isHealthy && animalsList.get(i).healthCost <= budget) {

        animalsList.get(i).heal();
        budget -= animalsList.get(i).healthCost;
        return 1;

      }

    }

    return 0;
  }

  public void addAdpoter(String adopterName) {

    adoptersList.add(adopterName);

  }


  //  public void findNewOwner() {
//
//    for (int i = 0; i < animalsList.size(); i++) {
//      for (int j = 0; j < adoptersList.size(); j++) {
//
//      }
//    }
//
//
//  }
  public int earnDonation(int adoptedMoney) {

    budget += adoptedMoney;
    return budget;

  }

  public String toString() {

    String shelterStatus = "Budget: " + budget + "$" +"\n" + "There are " + animalsList.size()+ " animal(s) and " + adoptersList.size()+ " potential adpoter(s)";

    return shelterStatus;


  }
}
