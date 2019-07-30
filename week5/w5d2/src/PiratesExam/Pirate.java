//Create a Pirate class. While you can add other fields and methods, you must have these methods:-
//
//drinkSomeRum() - intoxicates the Pirate some
//howsItGoingMate() - when called, the Pirate replies, if drinkSomeRun was called:-
//0 to 4 times, "Pour me anudder!"
//else, "Arghh, I'ma Pirate. How d'ya d'ink its goin?", the pirate passes out and sleeps it off.
//If you manage to get this far, then you can try to do the following.
//
//die() - this kills off the pirate, in which case, drinkSomeRum, etc. just result in he's dead.
//brawl(x) - where pirate fights another pirate (if that other pirate is alive) and there's a 1/3 chance, 1 dies, the other dies or they both pass out.

package PiratesExam;

public class Pirate {


  int alcoholLevel = 0;
  boolean isAlive = true;

  Pirate() {
  }

  public void drinkSomeRum() {
    if (this.isAlive == true) {
      this.alcoholLevel++;
    }
    if (this.isAlive == false) {
      System.out.println("This pirate is dead, cannot drink more.");
    }
  }

  public void getAlcoholLevel() {
    System.out.println("The alcohol levels is " + this.alcoholLevel + ".");
  }

  public void howsItGoingMate() {
    if (this.alcoholLevel <= 4) {
      System.out.println("Pour me anudder!" + "\n");
    } else {
      System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?" + "\n");
    }
  }

  public void die() {
    isAlive = false;
  }



  public void aliveChecker() {
    if (this.isAlive == true) {
      System.out.println("This pirate is alive.");
    } else {
      System.out.println("This pirate is dead.");
    }

  }


  public void brawl(Pirate targetPirate) {

    if (targetPirate.isAlive == true) {

      int brawlNumber;
      brawlNumber = (int) (Math.random() * 3);

      if (brawlNumber == 0) {this.die();}
      if (brawlNumber == 1) {targetPirate.die();}
      if (brawlNumber == 2) {
        this.die();
        targetPirate.die();
      }

    } else {
      System.out.println("The targeted pirate is dead, it cannot be attacked.");
    }

  }

}


