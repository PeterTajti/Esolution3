package GardenApp;

public class Plant {

    String color;
    double waterLevel;
    double waterLimitValue;
    double waterAbsorbtion;

    public Plant (String color, double waterLevel, double waterLimitValue) {
        this.color = color;
        this.waterLevel = waterLevel;
        this.waterLimitValue = waterLimitValue;
    }

    public Plant () {}

    public boolean needWater ( ) {
        return waterLevel < waterLimitValue;
    }


    public void watering (double waterIn) {
        waterLevel = waterLevel + (waterIn * waterAbsorbtion);
    }

}

