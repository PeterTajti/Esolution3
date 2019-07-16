package GardenApp;

public class Tree extends Plant {

    public Tree (String color, double waterLevel) {

        this.color = color;
        this.waterLevel = waterLevel;

        waterLimitValue = 10;
        waterAbsorbtion = 0.4;
    }

    @Override
    public String toString (){
        return color + " tree";
    }

}
