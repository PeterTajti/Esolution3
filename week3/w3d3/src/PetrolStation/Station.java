package PetrolStation;

public class Station {

    int gasAmount;

    //refill(car) -> decreases the gasAmount by the capacity of the car and increases the cars gasAmount

    void refill (Car car1){
        this.gasAmount -= car1.capacity;
        car1.gasAmount += gasAmount;
    }

}
