

package GardenApp;
import java.util.ArrayList;

public class Garden {

    ArrayList<Plant> myGarden;

    void addPlant (Plant plantx) {
        myGarden.add(plantx);
    }

    void watering (double waterIn) {

        for (int i = 0; i < myGarden.size(); i++){

            if (myGarden.get(i).needWater() == true) {

                myGarden.get(i).waterAmount += waterIn;
                // to be continued ///
            }
        }
    }

    void int splittingWater (double waterIn) {

        int numberOfThirstyPLants;

        for (int j = 0; j < myGarden.size (); j++) {

            if (myGarden.get(j).needWater() == true) {
                numberOfThirstyPlants += 1;
            }
        }

        return numberOfThirstyPLants;
    }




}
