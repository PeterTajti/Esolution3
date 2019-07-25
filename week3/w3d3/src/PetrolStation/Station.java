package PetrolStation;
public class Station {

    int stationGasAmount= 50;

    void refill (Car x){
        this.stationGasAmount = stationGasAmount - 10;
        x.gasAmount = x.gasAmount + 10;
    }

}
