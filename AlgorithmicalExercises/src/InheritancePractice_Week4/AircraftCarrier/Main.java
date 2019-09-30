package InheritancePractice_Week4.AircraftCarrier;

public class Main {
  public static void main(String[] args) {

    Carrier carrier = new Carrier();
    F16 f16 = new F16();
    F35 f35 = new F35();
    f16.refill(30);
    f16.getStatus();
    f16.isPriority();
    f35.refill(30);
    f35.getStatus();
    f35.isPriority();
    f16.fight();
    f35.fight();
    carrier.add(f16);
    carrier.add(f35);
    carrier.fill();
    carrier.fight(carrier);
    carrier.getTotalDamage();
    carrier.getStatus();


  }
}
