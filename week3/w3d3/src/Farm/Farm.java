package Farm;
import java.util.ArrayList;
import java.util.List;

public class Farm {

    int farmSlots;
    ArrayList<Animal> listOfAnimals = new ArrayList<>();
    boolean hasAnimals;


    public Farm (int farmSlots) {
        this.farmSlots = farmSlots;
        hasAnimals = true;
    }

    public void addAnimal (Animal a) {
       if (this.farmSlots > this.listOfAnimals.size()) {
           this.listOfAnimals.add(a);
       } else {
           System.out.println("The farm is full");
       }
    }

    public void breed () {
        if (this.farmSlots > this.listOfAnimals.size()) {
            String newName = new String();
            newName = newName + listOfAnimals.get(listOfAnimals.size() - 1).name + "'s clone";

            Animal newAnimal = new Animal("newAnimalName");
            newAnimal.name = newName;

            this.listOfAnimals.add(newAnimal);
        }else {
            System.out.println("The farm is full, cant createmore animals");
        }
    }

    public void slaughter () {
        Animal hungriest;

        if (this.listOfAnimals.size() > 0) {
            hungriest = this.listOfAnimals.get(0);
            for (Animal i : this.listOfAnimals) {
                if (i.getHunger() > hungriest.getHunger()) {
                    hungriest = i;
                }
            }
            this.listOfAnimals.remove(hungriest);
            System.out.println("we slaughtered " + hungriest.name);
        } else {
            System.out.println("there is no animal to slaughter");
        }

    }

    public void printList () {
        for (Animal i : this.listOfAnimals) {
            System.out.println(i.name);
        }
        System.out.println();
    }

}
