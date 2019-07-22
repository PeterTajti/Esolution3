package Pirates;

public class Main {

    public static void main(String[] args) {

        Ship myShip = new Ship("Black Pearl");

        Pirate jack = new Captain("Jack", 20);
        Pirate tom = new CrewMember("Tom", 10);

        myShip.addPirate(jack);
        myShip.addPirate(tom);



    }
}