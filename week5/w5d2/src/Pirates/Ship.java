package Pirates;

import java.util.ArrayList;

public class Ship {
    ArrayList<Pirate> pirateList;

    public Ship() {
        this.pirateList = new ArrayList<>();
    }

    public void addPirate(Pirate p) {
        boolean hasAlreadyACaptain = this.checkCaptain();

        if ((!hasAlreadyACaptain) || (!(p instanceof Captain))) {
            this.pirateList.add(p);
        } else {
            System.out.println("Can't add this Captain, this ship already has a Captain!");
        }
    }

    public boolean checkCaptain() {
        boolean result = false;

        if (this.pirateList.size() < 1) {
            return result;
        }

        for (Pirate i : this.pirateList) {
            if (i instanceof Captain) {
                result = true;
            }
        }

        return result;
    }

    public ArrayList<String> getPoorPirates() {
        ArrayList<String> poorPirates = new ArrayList<>();

        if (this.pirateList.size() < 1) {
            return poorPirates;
        }

        for (Pirate i : this.pirateList) {
            if ((i.gold < 15) && (i.hasWoodenLeg)) {
                poorPirates.add(i.name);
            }
        }

        return poorPirates;
    }

    public int getGolds() {
        int golds = 0;

        for (Pirate i : this.pirateList) {
            golds += i.gold;
        }

        return golds;
    }

    public void lastDayOnTheShip() {
        for (Pirate i : this.pirateList) {
            i.party();
        }
    }

    public void prepareForBattle() {
        for (Pirate i : this.pirateList) {
            for (int j = 0; j < 5; j++) {
                i.work();
            }
        }
        this.lastDayOnTheShip();
    }
}
