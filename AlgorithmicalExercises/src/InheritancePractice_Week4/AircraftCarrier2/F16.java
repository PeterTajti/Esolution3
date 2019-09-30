package InheritancePractice_Week4.AircraftCarrier2;

public class F16 extends Aircrafts {

  public F16() {

    maxAmmo = 8;
    baseDamage = 30;
    priority = false;
    type = "F16";
    missingAmmo = maxAmmo - currentAmmo;
    damageDealt = missingAmmo * baseDamage;


  }
}
