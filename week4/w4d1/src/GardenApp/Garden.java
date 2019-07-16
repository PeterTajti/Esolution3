package GardenApp;
import java.util.ArrayList;

public class Garden {

    String name;

    ArrayList<Plant> myGarden;

    public Garden (String name) {
        this.name = name;
        myGarden = new ArrayList<>();
    }

    void addPlant (Plant plantx) {
        myGarden.add(plantx);
    }

    public void gardenInfo () {

        for (int k = 0; k < myGarden.size(); k++) {

            if (myGarden.get(k).needWater() == true) {
                System.out.println(myGarden.get(k) + " need water");


            } else {
                System.out.println(myGarden.get(k) + " doesnt need water");

            }

        }
        System.out.println("");
    }

    public int numberOfThirstyPlants () {

        int thirstyPlants = 0;

        for (int j = 0; j < myGarden.size(); j++) {
            if (myGarden.get(j).needWater() == true) {
                thirstyPlants++;
            }
        }

        return thirstyPlants;
    }

    public void watering (double waterIn) {

        double waterPerPlant = waterIn / numberOfThirstyPlants();

        for (int i = 0; i < myGarden.size(); i++){

             if (myGarden.get(i).needWater() == true) {


        myGarden.get(i).watering(waterPerPlant);

            }
        }
    }






}
