package PetrolStation;

public class PetrolStation {

    public static void main (String [] args) {

        Car car1 = new Car();
        Station station1 = new Station();

        station1.refill(car1);
        System.out.println(car1.gasAmount);

    }

}
