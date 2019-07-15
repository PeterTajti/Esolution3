package GardenApp;

public class Plant {

    String color;
    double waterAmount;
    double waterLimitValue;

    public Plant (double waterAmount, String color) {
        this.color = color;
        this.waterAmount = waterAmount;

    }

    public Plant () {}

    public boolean needWater ( ) {
        return waterAmount < waterLimitValue;
    }
}
