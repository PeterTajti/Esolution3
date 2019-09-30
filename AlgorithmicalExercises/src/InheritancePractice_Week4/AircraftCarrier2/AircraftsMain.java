package InheritancePractice_Week4.AircraftCarrier2;

public class AircraftsMain {
  public static void main(String[] args) {

    Carrier carrier = new Carrier(200,3000);
    F16 f161 = new F16();
    carrier.add(f161);
    f161.fight();
    carrier.fight(carrier);
    carrier.fill(f161);
    ;

  }
}
