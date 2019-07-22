package Pirates;

public class Pirate {
    String name;
    int gold;
    int healthPoints;
    boolean woodenLeg;



    public Pirate(String name, int gold) {
        this.name = name;
        this.gold = gold;
        this.healthPoints = 10;
        this.woodenLeg = false;
    }

    public void work(){
        this.gold += 1;
        this.healthPoints -= 1;
    }

    public void party(){
        this.healthPoints += 1;
    }

    public void hasWoodenLeg(){
        woodenLeg = true;
    }


    @Override
    public String toString(){
        String result = " ";
        if(woodenLeg){
            result = "Hello, I'm " + this.name + ". I have a wooden leg and " + this.gold + " golds.";
        } else {
            result = "Hello, I'm " + this.name + ". I still have my real legs and " + this.gold + " golds.";
        }
        return result;
    }


}