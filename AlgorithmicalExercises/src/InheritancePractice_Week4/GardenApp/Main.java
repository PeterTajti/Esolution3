package InheritancePractice_Week4.GardenApp;

public class Main {
  public static void main(String[] args) {

    Flowers flowers1 = new Flowers("blue", 2);
    flowers1.status();
    Flowers flowers2 = new Flowers("red", 5);
    flowers2.status();
    Garden garden = new Garden();
    garden.add(flowers1);
    garden.add(flowers2);
//
//    garden.watering(10);
//
//    garden.gardenStatus();

  }
}
