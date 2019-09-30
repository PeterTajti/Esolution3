package InheritancePractice_Week4.AircraftCarrier;

public class F16 extends Aircrafts {

  public F16() {

    maxAmmo = 8;
    baseDamage = 30;
    type = "F16";
    priority = false;
    missingAmmo = maxAmmo - currentAmmunition;
    damageDealt = missingAmmo * baseDamage;


  }

}
