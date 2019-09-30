package InheritancePractice_Week4.AircraftCarrier2;

public abstract class Aircrafts {

  int maxAmmo;
  int baseDamage;
  int currentAmmo;
  int damageDealt;
  int missingAmmo;
  String type;
  boolean priority;


  public Aircrafts() {

    this.missingAmmo = maxAmmo - currentAmmo;

  }

  public int fight() {

    this.currentAmmo = 0;

    return damageDealt;
  }

  public int refill(int ammoToRefill) {
    this.currentAmmo = maxAmmo;
    ammoToRefill -= missingAmmo;


    System.out.println(ammoToRefill);
    return ammoToRefill;
  }

  public String getType() {

    return this.type;
  }

  public String getStatus() {

    return "Type " + this.type + " , Ammo: " + this.currentAmmo + ", Base Damage: " + this.baseDamage + ", All Damage: " + this.damageDealt + ".";
  }

  public boolean isPriority() {
    if (this.priority) {
      return true;
    }
    return false;
  }
}
