package InheritancePractice_Week4.AircraftCarrier;

public class F35 extends Aircrafts {

  public F35() {

    maxAmmo = 12;
    baseDamage = 50;
    type = "F35";
    priority = true;
    missingAmmo = maxAmmo - currentAmmunition;
    damageDealt = missingAmmo * baseDamage;

  }
}
