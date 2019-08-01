package Pirates;

public class Main {

    public static void main(String[] args) {

        Pirate John = new Pirate("John", true);    //létrehozzuk John-t
        Pirate Jack = new Pirate("Jack", false);
        Pirate Tom = new Pirate("Tom", false);
        Pirate Edward = new Pirate("Edward", false);
        Pirate Steven = new Pirate("Steven", false);


        John.promoteCaptain();  //kinevezzük kapitánynak
        John.work();    //megdolgoztatjuk John-t. Mivel már kapitány, nem 1 hanem 10 aranyat kap
        System.out.println(John);

        Ship renegade = new Ship("Renegade");
        renegade.recruitPirate(John);
        renegade.recruitPirate(Jack);
        renegade.recruitPirate(Tom);
        renegade.recruitPirate(Edward);
        renegade.recruitPirate(Steven);

        renegade.prepareForBattle();
        renegade.getGold();
    }
}
