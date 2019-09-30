package InheritancePractice_Week4.GardenApp;

public class Plants {

  int waterneed;
  int currentWaterLevel;
  String color;
  String type;
  double absorbation;
  boolean needsWater;


  public void isNeedWater() {

    if (currentWaterLevel < waterneed) {
      needsWater = true;
    }

  }


  public void status() {

    if (currentWaterLevel < waterneed) {
      System.out.println("The " + color + " " + type + " need water");
    } else {
      System.out.println("The " + color + " " + type + "doesnt need water");

    }

  }
}


