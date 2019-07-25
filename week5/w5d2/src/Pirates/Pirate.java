//A pirate has a name, an amount of gold and health points, the default value of which is 10.

//A pirate might be a captain and may have a wooden leg.

//You must create the following methods:

//if a pirate is a captain:
//work() which increases the amount of gold possessed by that pirate by 10 and decrease the HP by 5.
//party() which increases the HP by 10.

//if the pirate is not a captain:
//work() which increases the amount of gold by 1 and decreases the HP by 1.
//party() which increases the HP by 1.

//toString() method:

//if the pirate has a wooden leg, then the string that is returned by the function must look like this:
//Hello, I'm Jack. I have a wooden leg and 20 golds.
//If not:
//Hello, I'm Jack. I still have my real legs and 20 golds.

package Pirates;

public class Pirate {

    String name;
    int gold;
    int hitpoints;
    boolean hasWoodenLeg;

    public Pirate (String name, int gold) {
        this.name = name;
        this.gold = gold;
        this.hitpoints = 10;
        this.hasWoodenLeg = false;
    }

    public void work () {
        this.gold++;
        this.hitpoints--;
    }

    public void party () {
        this.hitpoints++;
    }

    public void setHasWoodenLeg () {
        hasWoodenLeg = true;
    }


    @Override
    public String toString (){
        String result = " ";
        if (hasWoodenLeg) {
            result = "Hello, i am " + this.name + ". I have wooden leg and " + this.gold + " gold.";
        } else {
            result = "Hello, I'm " + this.name + ". I still have my real legs and " + this.gold + " golds.";
        }
        return result;
    }

}
