package GardenApp;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Garden myGarden = new Garden ("myGarden");

    Flower yellow = new Flower("yellow",00.00);
        myGarden.addPlant(yellow);
    Flower blue = new Flower("blue", 00.00);
        myGarden.addPlant(blue);
    Tree purple = new Tree ("purple", 00.00);
        myGarden.addPlant(purple);
    Tree orange = new Tree ("orange", 00.00);
        myGarden.addPlant(orange);

        System.out.println("The garden what i created contains " + myGarden.myGarden.size()+ " plants. ");
        System.out.println("");

        myGarden.gardenInfo();

        System.out.println("watering with 40");
        myGarden.watering(40);
        myGarden.gardenInfo();

        System.out.println("watering with 70");
        myGarden.watering(70);
        myGarden.gardenInfo();

    }
}
