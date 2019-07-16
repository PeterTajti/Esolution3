package GardenApp;

public class Flower extends Plant {

    public Flower (String color, double waterLevel) {

        this.color = color;
        this.waterLevel = waterLevel;

        waterLimitValue = 5;
        waterAbsorbtion = 0.75;

    }

    @Override
    public String toString (){
        return color + " flower";
    }

}
