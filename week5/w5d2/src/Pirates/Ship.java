package Pirates;

import java.util.ArrayList;
import java.util.List;

public class Ship {
    List<Pirate> listOfPirates = new ArrayList<>();

    //nem látja hogy captain.e mert private a field)

    void recruitPirate (Pirate p) {
       boolean hasCaptain = false;

        for (Pirate x: listOfPirates) {
           if (x.getIsCaptain()){
               hasCaptain = true;
           }
       }

        if (hasCaptain == true && p.getIsCaptain() == true){
            return;
        } else {
            listOfPirates.add(p);
        }
    }

    List<String> getPoorPirates () {
        List<String> poorPirates = new ArrayList<>();

        for (int i = 0; i < listOfPirates.size(); i++) {
            if (listOfPirates.get(i).hasWoodenLeg
                    && listOfPirates.get(i).amountOfGold < 15) {
                poorPirates.add(listOfPirates.get(i).name);
            }

        }

        return poorPirates;
    }


    int getGold () {
        int sum = 0;
        for (Pirate p : listOfPirates) {
            sum += p.amountOfGold;
        }
        return sum;
    }


    void lastDayOnTheShip () {
        for (Pirate p : listOfPirates) {
            p.party();
        }
    }

    void prepareForBattle () {

        for (int i = 0; i < 5 ; i++) {
            for (Pirate p : listOfPirates) {
                p.work();
            }
        }
        lastDayOnTheShip();

    }

}
