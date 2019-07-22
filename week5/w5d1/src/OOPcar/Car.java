package OOPcar;

public class Car {

    String name;
    String brand;
    String model;
    String age;
    int maxSpeed;
    int maxFuel;
    int currentFuel = 100;

    public void travel () {
        currentFuel = currentFuel-10;
    }

    public void status () {
        System.out.println("This is the" + name + "'s current fuel level: " + currentFuel );
    }



    public void fueling () {}

}
