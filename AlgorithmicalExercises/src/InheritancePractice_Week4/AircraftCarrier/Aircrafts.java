package InheritancePractice_Week4.AircraftCarrier;

public abstract class Aircrafts {

  int currentAmmunition;
  int maxAmmo;
  int baseDamage;
  int damageDealt;
  String type;
  boolean priority;
  int missingAmmo;

  public Aircrafts() {
    currentAmmunition = 0;


  }

  public int fight() {

    damageDealt = this.missingAmmo * this.baseDamage;
    currentAmmunition = 0;


    return damageDealt;
  }

  public int refill(int ammoToRefill) {

    if (currentAmmunition < maxAmmo) {

      ammoToRefill -= missingAmmo;
      currentAmmunition = maxAmmo;

    }

    return ammoToRefill;

  }

  public String getType() {

    return type;

  }

  public String getStatus() {

    System.out.println("Type " + type + ", ammo " + currentAmmunition + ", Base damage " + baseDamage + ", All damage " + damageDealt);
    return "Type " + type + ", ammo " + currentAmmunition + ", Base damage " + baseDamage + ", All damage " + damageDealt;

  }

  public boolean isPriority() {
    if (this.priority) {
      System.out.println("true");
      return true;
    }
    System.out.println("false");
    return false;
  }


}
