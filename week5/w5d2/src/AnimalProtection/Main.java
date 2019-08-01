package AnimalProtection;

public class Main {

  public static void main(String[] args) {

  AnimalShelter myShelter = new AnimalShelter();

    myShelter.rescue(new Cat (false));
    myShelter.rescue(new Dog(false));
    myShelter.rescue(new Parrot(false));

    myShelter.addAdopter("John");
    myShelter.addAdopter("Jack");
    myShelter.addAdopter("Tom");

    myShelter.heal();

    System.out.println(myShelter);
  }

}
