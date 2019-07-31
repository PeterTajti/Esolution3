package AnimalProtection;

public class Main {

  public static void main(String[] args) {

  Animal cat = new Cat (false);
  Animal dog = new Dog (false);
  Animal parrot = new Parrot(true);


  AnimalShelter myShelter = new AnimalShelter();

    myShelter.rescue(cat);
    myShelter.rescue(dog);
    myShelter.rescue(parrot);

    myShelter.addAdopter("John");
    myShelter.addAdopter("Jack");
    myShelter.addAdopter("Tom");
    myShelter.addAdopter("Cathy");

    myShelter.earnDonation(25);



    myShelter.findNewOwner();

    // nem megy !!!
    //myShelter.heal();

    System.out.println(myShelter);
  }

}
