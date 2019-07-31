package AnimalProtection;

import java.util.ArrayList;

public class AnimalShelter {

  int budget = 50;
  int healedAnimals = 0;

  ArrayList<Animal> animals = new ArrayList<>();
  ArrayList<String> adopters = new ArrayList<>();

  //It must have a method named rescue this method takes an Animal as parameter
  //and add the animal to the shelter's list and return the size of the list

  public int rescue (Animal animal) {

    animals.add(animal);
    return animals.size();
  }

  //It must have a method named heal this method heals the first not healthy Animal
  //if it is possible by budget, returns the amount of healed animals(0 or 1)

  public int heal () {
    for (int i = 0; i < animals.size(); i++) {
      if ((animals.get(i).isHealty == false) && (animals.get(i).healCost <= budget)) {
        animals.get(i).isHealty = true;
        budget = budget - animals.get(i).healCost;
        healedAnimals++;
      }
    } return healedAnimals;
  }



  //ha a lista első eleme beteg

}
