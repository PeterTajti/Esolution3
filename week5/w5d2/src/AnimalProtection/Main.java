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



    //cat.isAdoptable();


    // nem megy !!!

    myShelter.heal();
//    myShelter.heal();
//    myShelter.heal();

    //myShelter.findNewOwner();
    //myShelter.findNewOwner();

    //myShelter.earnDonation(25);
    System.out.println(myShelter);
  }

}
