package Cycle;

public class Bicycle  extends Cycle {


    int weight = 20;
    String brand = "twoWheeled";

    int getWeight (){
        return weight;
    }

    void getInfo () {
        System.out.println(brand + "  " + getWeight());
    }

}
