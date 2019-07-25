//Create a Farm class
//it has list of Animals
//it has slots which defines the number of free places for animals
//breed() -> creates a new animal if there's place for it
//slaughter() -> removes the least hungry animal

package Farm;

public class Main {

    public static void main(String[] args) {

        Farm myFarm = new Farm (5);

        Animal dog = new Animal ("dog");
        Animal cow = new Animal ("cow");
        Animal pig = new Animal ("pig");
        pig.play(); //ezzel megnöveljük az éhségét 1-vel és így kilóg majd a sorból

        myFarm.addAnimal(dog);
        myFarm.addAnimal(cow);
        myFarm.addAnimal(pig);
        myFarm.addAnimal(new Animal ("cat"));
        myFarm.printList();

        myFarm.breed();
        myFarm.breed();
        myFarm.printList();

        myFarm.slaughter();
        myFarm.printList();



    }

}
