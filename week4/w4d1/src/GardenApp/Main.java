package GardenApp;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

    ArrayList<Plant> myGarden = new ArrayList<>();

    Flower yellow = new Flower("yellow", 0);
        myGarden.add(yellow);
    Flower blue = new Flower("blue", 0);
        myGarden.add(blue);
    Tree purple = new Tree ("purple", 0);
        myGarden.add(purple);
    Tree orange = new Tree ("orange", 0);
        myGarden.add(orange);

        System.out.println(myGarden.size());
    }



}
