package AircraftCarrier;

public class Main {
  public static void main(String[] args) {


    F16 alfa = new F16();
    F16 bravo = new F16();
    F16 charlie = new F16();
    F35 delta = new F35();
    F35 echo = new F35();
    F35 foxtrot = new F35();
    F16 golf = new F16();

    AircraftCarrier Yorktown = new AircraftCarrier(1500, 5000);
    AircraftCarrier Akagi = new AircraftCarrier(1200, 5500);

    Yorktown.add(alfa);
    Yorktown.aircrafts.add(echo);
    Yorktown.aircrafts.add(foxtrot);
    Yorktown.aircrafts.add(charlie);
    Akagi.aircrafts.add(bravo);
    Akagi.aircrafts.add(delta);
    Akagi.aircrafts.add(golf);

    Yorktown.fill();
    Akagi.fill();

    Yorktown.fight(Akagi);
    Yorktown.fill();
    Yorktown.fight(Akagi);
    Akagi.fill();
    Akagi.fight(Yorktown);
    Yorktown.fill();
    Yorktown.fight(Akagi);
    Akagi.fill();
    Yorktown.fill();

    System.out.println(Yorktown.getStatus());
    System.out.println(Akagi.getStatus());

  }
}

