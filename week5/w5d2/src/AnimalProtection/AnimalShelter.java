package AnimalProtection;

import java.util.ArrayList;

public class AnimalShelter {

  int budget = 50;
  int healedAnimals = 0;

  ArrayList<Animal> animals = new ArrayList<>();
  ArrayList<String> potentionalAdopters = new ArrayList<>();

  public int rescue (Animal animal) {

    animals.add(animal);
    return animals.size();
  }

  //kell egy int healedAnimals???

  public int heal () {
    for (int i = 0; i < animals.size(); i++) {
      if ((animals.get(i).isHealty == false) && (animals.get(i).healCost <= budget)) {
        animals.get(i).isHealty = true;
        this.budget = this.budget - animals.get(i).healCost;
        healedAnimals++;
        break;    // ide kell a break ???
      }
    } return healedAnimals;
  }

  public void addAdopter (String string){
    potentionalAdopters.add(string);
  }

  public void findNewOwner (){
    for (int i = 0; i < animals.size(); i++) {
      if (animals.get(i).isAdoptable() == true) {
        animals.remove(i);
        potentionalAdopters.remove(0);
      } break;  // ide kell a break ???
    }
  }

  public int earnDonation (int amount){
    this.budget = this.budget + amount;
    return budget;

  }

  //ez sincs kész

  @Override
  public String toString(){
    return ("Budget: " + this.budget + " Euro" + "\n" +
            "There are " + animals.size() + " animal(s) and " + potentionalAdopters.size() + " potential adopter(s)"

            //<name> is not healthy (<heal cost>€), and not adoptable
            //<name> is healthy, and adoptable
            );
    }
  }

