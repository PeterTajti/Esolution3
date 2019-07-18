package AircraftCarrier;

public class Aircraft {

    int maxAmmo;
    int actAmmo = 0;
    int baseDamage;
    String type;
    boolean isPriority;

    public Aircraft() {
    }

    public String getType(){
        return this.type;
    }

    public boolean isPriority(){
        return this.isPriority;
    }

    public int fight () {
        int dmg = this.actAmmo * this.baseDamage;
        this.actAmmo = 0;
        return dmg;
    }

    public void getStatus (){
        System.out.println("Type: " + this.type + ", Ammo: " + this.actAmmo + ", Base Damage: " + this.baseDamage +
                ", All Damage: " + (this.actAmmo * this.baseDamage));
    }

    public int refill (int ammoCount) {
        int missing = this.maxAmmo - this.actAmmo;
        int taken = 0;
        if (missing <= ammoCount) {
            taken = missing;
            this.actAmmo = this.maxAmmo;
        } else {
            taken = ammoCount;
            this.actAmmo += taken;
        }
        ammoCount -= taken;
        return ammoCount;
    }
}