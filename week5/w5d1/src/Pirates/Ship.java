package Pirates;

import java.util.ArrayList;

public class Ship {
    String shipName;
    ArrayList<Pirate> pirates;

    public Ship(String shipName) {
        this.shipName = shipName;
        pirates = new ArrayList<>();
    }

    public void addPirate(Pirate pirate){
        pirates.add(pirate);
    }


    public ArrayList<Pirate> getPoorPirates(){
        ArrayList<Pirate> poorPirates = new ArrayList<>();
        for (int i = 0; i < pirates.size(); i++) {
            if(pirates.get(i).woodenLeg == true && pirates.get(i).gold < 15) {
                poorPirates.add(pirates.get(i));
            }
        }
        return poorPirates;
    }

    public int getGold(){
        int sum = 0;
        for (int i = 0; i < pirates.size(); i++) {
            sum += pirates.get(i).gold;
        }
        return sum;
    }

    public void lastDayOnTheShip(){
        for (Pirate pirate: pirates) {
            if(pirate instanceof Captain) {
                pirate.party();
            } else if (pirate instanceof CrewMember){
                pirate.party();
            }
        }
    }

    public void prepareForBattle(){
        for (int i = 0; i < 5; i++) {
            for (Pirate pirate: pirates) {
                if(pirate instanceof Captain) {
                    pirate.work();
                } else if (pirate instanceof CrewMember){
                    pirate.work();
                }
            }
        }
        for (Pirate pirate: pirates) {
            if(pirate instanceof Captain) {
                pirate.party();
            } else if (pirate instanceof CrewMember){
                pirate.party();
            }
        }

    }

}