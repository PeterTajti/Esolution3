package Pirates;

public class Pirate {

    String name;
    int amountOfGold;
    int healthPoints;
    private boolean isCaptain;
    boolean hasWoodenLeg;

    Pirate (String name, boolean hasWoodenLeg) {
        healthPoints = 10;
        this.name=name;
        this.hasWoodenLeg=hasWoodenLeg;
    }

    boolean getIsCaptain () {
        return isCaptain;
    }

    void work () {
        if (isCaptain == true) {
            amountOfGold += 10;
            healthPoints -=5;
        } else {
            amountOfGold +=1;
            healthPoints -=1;
        }
    }

    void party () {
        if (isCaptain == true) {
            healthPoints += 10;
        } else {
            healthPoints += 1;
        }
    }

    //minden classnak van beépített toStringje, amit printelésnél használ, de újra akarom fogalmazni
    //akkor overrideolom a metódust

    @Override
    public String toString () {
        if (hasWoodenLeg) {
        return "Hello, I am " + name + ". I have wooden leg and " + amountOfGold + " golds";
    } else {
        return "Hello, I am " + name + ". I still have my leg and " + amountOfGold + " golds";
        }
    }
}
