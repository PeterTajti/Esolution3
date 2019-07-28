package Hero;

public class Main {

  public static void main(String[] args) {

    Creature MyHero = new Creature("MyHero", 1000, 100, 10 );
    Creature skeleton = new Creature("Skeleton", 250, 50, 10);

    MyHero.attack(skeleton);




  }

}
